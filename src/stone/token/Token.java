package stone.token;

import stone.StoneException;

public abstract class Token {
    public static final Token EOF = new Token(-1) {};
    public static final String EOL = "\\n";
    private int lineNumber;

    public Token(int line) {
        lineNumber = line;
    }
    public int getLineNumber() { return lineNumber; }
    public boolean isIdentifier() { return false; } // 識別子(ex. 変数名、関数名、クラス名)
    public boolean isNumber() { return false; } // 整数リテラル
    public boolean isString() { return false; } // 文字列リテラル
    public int getNumber() { throw new StoneException("not number token"); }
    public String getText() { return ""; }
}
