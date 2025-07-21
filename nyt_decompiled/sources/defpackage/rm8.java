package defpackage;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class rm8 {
    private final SparseArray a = new SparseArray();

    public qm8 a(int i) {
        qm8 qm8Var = (qm8) this.a.get(i);
        if (qm8Var != null) {
            return qm8Var;
        }
        qm8 qm8Var2 = new qm8(9223372036854775806L);
        this.a.put(i, qm8Var2);
        return qm8Var2;
    }

    public void b() {
        this.a.clear();
    }
}
