import java.util.List;

class Parser {
    private List<Token> tokens;
    private int position;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
        this.position = 0;
    }

    public void parse() {
        while (position < tokens.size()) {
            Token token = tokens.get(position);
            if (token.getType().equals("INT")) {
                System.out.println("Encontrado um número inteiro: " + token.getValue());
            } else if (token.getType().equals("PLUS")) {
                System.out.println("Encontrado o operador de adição");
            } else if (token.getType().equals("MINUS")) {
                System.out.println("Encontrado o operador de subtração");
            } else {
                System.out.println("Token desconhecido: " + token.getValue());
            }
            position++;
        }
    }
}
