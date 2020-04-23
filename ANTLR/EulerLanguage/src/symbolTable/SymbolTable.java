package symbolTable;

import AST.*;
import symbolTable.attributes.*;
import java.util.*;


public class SymbolTable {
    private Hashtable<String, Attributes> symbols = new Hashtable<String, Attributes>();
    private ArrayList<ArrayList<Attributes>> scopes = new ArrayList<ArrayList<Attributes>>();
    private int depth = 0;


    public SymbolTable(ASTNode rootNode) {
        processNode(rootNode);
    }

    public void enterSymbol(String name, String type) {
        Attributes oldSym = retrieveSymbol(name);
        if(oldSym != null && oldSym.depth == depth) {
            // TODO: Add error. Duplicate declaration
        }
        Attributes newSym = new Attributes(name);

        // Add to scope display
        newSym.level = scopes.get(depth);
        newSym.depth = depth;
        scopes.get(depth).add(newSym);

        // Add to hashtable
        if(oldSym == null) {
            symbols.put(newSym.name, newSym);;
        } else {
            symbols.remove(oldSym.name);
            symbols.put(newSym.name, newSym);
            newSym.var = oldSym;
        }
    }

    public Attributes retrieveSymbol(String name) {
        return symbols.get(name);
    }

    public boolean declaredLocally(String name) {
        Attributes sym = retrieveSymbol(name);
        return sym != null && sym.depth == depth;
    }

    private void openScope() {
        depth++;
        if (scopes.size() - 1 < depth) {
            scopes.add(new ArrayList<Attributes>());
        }
    }

    private void closeScope() {
        Attributes prevSym = null;
        for (int i = 0; i < scopes.get(depth).size(); i++) {
            prevSym = scopes.get(depth).get(i).var;
            symbols.remove(scopes.get(depth).get(i).name);
            if(prevSym != null) {
                symbols.put(prevSym.name, prevSym);
            }
        }
        depth--;
    }

    private void processNode(ASTNode node) {
        switch (node.getType()) {
            case "CodeBlockNode":
                openScope();
            case "DeclarationNode":
                enterSymbol(((DeclarationNode)node).identifier, node.getType());
            case "ReferenceNode":
                if(retrieveSymbol(/* What node to use? */) == null) {
                    // TODO: Add error. Undeclared variable
                }
        }

        // Process children
        for(int i = 0; i < node.children.size(); i++) {
            processNode(node.children.get(i));
        }
        // Close scope
        if(node.getType().equals("CodeBlockNode")) {
            closeScope();
        }
    }

}
