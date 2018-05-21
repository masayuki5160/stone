package stone;

// TODO ASTreeを実装したらコメント削除
// import stone.ast.ASTree;

public class StoneException extends RuntimeException {
    public StoneException(String m) { super(m); }

    // TODO ASTreeを実装したらコメント削除
//    public StoneException(String m, ASTree t) {
//        super(m + " " + t.location());
//    }
}
