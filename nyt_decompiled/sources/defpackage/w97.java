package defpackage;

import androidx.lifecycle.n;

/* loaded from: classes4.dex */
public final class w97 {
    private t21 a;
    private n b;
    private final boolean c;

    w97(t21 t21Var) {
        this.c = t21Var == null;
        this.a = t21Var;
    }

    public void a() {
        this.a = null;
    }

    public boolean b() {
        return this.b == null && this.a == null;
    }

    public void c(t21 t21Var) {
        if (this.b != null) {
            return;
        }
        this.a = t21Var;
    }
}
