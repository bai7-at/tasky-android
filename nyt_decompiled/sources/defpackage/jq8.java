package defpackage;

import com.google.android.exoplayer2.h2;

/* loaded from: classes2.dex */
public final class jq8 {
    public final int a;
    public final cx6[] b;
    public final q72[] c;
    public final h2 d;
    public final Object e;

    public jq8(cx6[] cx6VarArr, q72[] q72VarArr, h2 h2Var, Object obj) {
        this.b = cx6VarArr;
        this.c = (q72[]) q72VarArr.clone();
        this.d = h2Var;
        this.e = obj;
        this.a = cx6VarArr.length;
    }

    public boolean a(jq8 jq8Var) {
        if (jq8Var == null || jq8Var.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!b(jq8Var, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(jq8 jq8Var, int i) {
        return jq8Var != null && z19.c(this.b[i], jq8Var.b[i]) && z19.c(this.c[i], jq8Var.c[i]);
    }

    public boolean c(int i) {
        return this.b[i] != null;
    }
}
