package AST;

import symbolTable.typeDescriptors.ErrorTypeDescriptor;
import visitors.IVisitor;

public class ErrorNode extends ASTNode {


    public ErrorNode(ASTNode parentNode, String str) {
        super(parentNode);
        type = new ErrorTypeDescriptor(str);
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
