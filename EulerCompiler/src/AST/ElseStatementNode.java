package AST;

import visitors.*;

public class ElseStatementNode extends StatementNode {
    public ElseStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ElseStatementNode(ASTNode parentNode, ASTNode body) {
        this(parentNode);
        children.add(body);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}