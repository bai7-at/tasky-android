package defpackage;

import androidx.compose.runtime.b0;

/* loaded from: classes.dex */
public final class pt7 extends jv4 {
    private final gv4 a;
    private final sy4 b;

    public pt7(gv4 gv4Var) {
        super(null);
        this.a = gv4Var;
        this.b = b0.e(null, null, 2, null);
    }

    private final Object c() {
        return this.b.getValue();
    }

    private final void e(Object obj) {
        this.b.setValue(obj);
    }

    @Override // defpackage.jv4
    public boolean a(gv4 gv4Var) {
        return gv4Var == this.a;
    }

    @Override // defpackage.jv4
    public Object b(gv4 gv4Var) {
        if (gv4Var != this.a) {
            throw new IllegalStateException("Check failed.");
        }
        Object c = c();
        if (c == null) {
            return null;
        }
        return c;
    }

    public void d(gv4 gv4Var, Object obj) {
        if (gv4Var != this.a) {
            throw new IllegalStateException("Check failed.");
        }
        e(obj);
    }
}
