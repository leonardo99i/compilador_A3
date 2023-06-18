import java.util.ArrayList;
import java.util.List;

class Lexer {
    private String input;
    private int position;

    public Lexer(String input) {
        this.input = input;
        this.position = 0;
    }

    public Token getNextToken() {
        if (position >= input.length()) {
            return new Token("EOF", "");
        }

        char currentChar = input.charAt(position);

        if (Character.isDigit(currentChar)) {
            String value = "";
            while (position < input.length() && Character.isDigit(input.charAt(position))) {
                value += input.charAt(position);
                position++;
            }
            return new Token("INT", value);
        }

        if (currentChar == '+') {
            position++;
            return new Token("PLUS", "+");
        }

        if (currentChar == '-') {
            position++;
            return new Token("MINUS", "-");
        }

        return new Token("UNKNOWN", Character.toString(currentChar));
    }
}
