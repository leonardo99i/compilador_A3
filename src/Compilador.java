import java.util.ArrayList;
import java.util.List;

public class Compilador {
    public static void main(String[] args) {
        //Código fictício para teste em uma linguagem fictícia
        String code = "DECLARE var1 = 5;\n" +
                "DECLARE var2 = 10;\n" +
                "IF var1 > var2 THEN\n" +

                "    OUTPUT \"var1 é maior que var2\";\n" +
                "ELSE\n" +
                "    OUTPUT \"var2 é maior ou igual a var1\";\n" +
                "ENDIF";

        // Passo 1: Análise léxica
        Lexer lexer = new Lexer(code);
        List<Token> tokens = new ArrayList<>();
        Token token = lexer.getNextToken();
        while (!token.getType().equals("EOF")) {
            tokens.add(token);
            token = lexer.getNextToken();
        }

        // Passo 2: Análise sintática
        Parser parser = new Parser(tokens);
        parser.parse();
    }
}
