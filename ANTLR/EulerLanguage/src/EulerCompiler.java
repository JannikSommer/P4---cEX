import ANTLR.*;
import AST.ASTNode;
import Visitors.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Paths;

public class EulerCompiler {

    public static void main(String[] args) {
        CharStream input = null;
        String InputFile = System.getProperty("user.dir") + "/EulerLanguage/src/kurt.txt";
        // String InputFile = System.getProperty("C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/src/kurt.txt");
        try {
            input = CharStreams.fromFileName(InputFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        ParseTree tree = parser.program();
        // System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);

    }
}