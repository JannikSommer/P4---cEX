package AST;

import visitors.IVisitor;
import symbolTable.typeDescriptors.NumberTypeDescriptor;

public class NumberDeclarationNode extends DeclarationNode {

    public NumberDeclarationNode(ASTNode parent) {
        super(parent);
        type = new NumberTypeDescriptor();
    }

    public NumberDeclarationNode(ASTNode parent, String name, ASTNode expression) {
        super(parent, name, expression);
        type = new NumberTypeDescriptor();
        children.get(0).type = type;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
