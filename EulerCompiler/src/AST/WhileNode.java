package AST;

import visitors.*;

public class WhileNode extends StatementNode {
    public WhileNode(ASTNode parentNode) {
        super(parentNode);
    }

    public WhileNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}