package stone.ast;

import java.util.List;

public class IfStmnt extends ASTList {
    public IfStmnt(List<ASTree> list) {
        super(list);
    }
    public ASTree condition() {
        return child(0);
    }
    public ASTree thenBlock() {
        return child(1);
    }
    public ASTree elseBlock() {
        // 子ノードの数でelseBlockがあるが判定
        return numChildren() > 2 ? child(2) : null;
    }
    public String toString() {
        return "(if " + condition() + " " + thenBlock() + " else " + elseBlock() + ")";
    }
}
