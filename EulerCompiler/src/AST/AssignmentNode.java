package AST;

import visitors.*;

public class AssignmentNode extends ASTNode {

    public AssignmentNode(ASTNode parentNode) {
        super(parentNode);
        terminatesNormally = true;
    }

    public AssignmentNode(ASTNode parentNode, String id) {
        this(parentNode);
        this.children.add(new IdentificationNode(this, id)) ;

    }

    public AssignmentNode(ASTNode parent, String id, String valIndex, ASTNode child) {
        this(parent);
        this.children.add(new IdentificationNode(this, id));
        this.children.add(new SubscriptingNode(this, valIndex));
    }



    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}