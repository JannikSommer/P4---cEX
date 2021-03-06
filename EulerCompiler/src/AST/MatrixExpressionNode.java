package AST;

import symbolTable.typeDescriptors.MatrixTypeDescriptor;
import visitors.IVisitor;

public class MatrixExpressionNode extends ASTNode {

    public MatrixExpressionNode(ASTNode parent, String mtxExpr) {
        super(parent);
        getMatrixElements(mtxExpr);
        type = new MatrixTypeDescriptor(children.size(),        // Number of rows
                                        getNumberOfColumns());  // Number of columns
        parent.type = type;
    }

    public int getNumberOfColumns() {
        int result = 0;
        for (ASTNode row : children) {
            if(row.children.size() > result) {
                result = row.children.size();
            }
        }
        return result;
    }

    private void getMatrixElements(String mtxExpr) {
        String delimiters = "[{;}]+";
        String[] tokens = mtxExpr.split(delimiters);
        for (String str : tokens) {
            if (!str.equals("")) {
                this.children.add(new VectorExpressionNode(this, str));
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) { visitor.visit(this); }
}
