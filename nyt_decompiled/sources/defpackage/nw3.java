package defpackage;

import androidx.compose.foundation.text.b;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.text.input.a;

/* loaded from: classes.dex */
public final class nw3 implements ow3 {
    private final ex7 a;
    public b b;
    public ul2 c;

    public nw3(ex7 ex7Var) {
        this.a = ex7Var;
    }

    public void a(int i) {
        a.C0067a c0067a = a.b;
        if (a.l(i, c0067a.d())) {
            b().f(d.b.e());
            return;
        }
        if (a.l(i, c0067a.f())) {
            b().f(d.b.f());
            return;
        }
        if (!a.l(i, c0067a.b())) {
            if (a.l(i, c0067a.c()) ? true : a.l(i, c0067a.g()) ? true : a.l(i, c0067a.h()) ? true : a.l(i, c0067a.a())) {
                return;
            }
            a.l(i, c0067a.e());
        } else {
            ex7 ex7Var = this.a;
            if (ex7Var != null) {
                ex7Var.c();
            }
        }
    }

    public final ul2 b() {
        ul2 ul2Var = this.c;
        if (ul2Var != null) {
            return ul2Var;
        }
        zq3.z("focusManager");
        return null;
    }

    public final b c() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("keyboardActions");
        return null;
    }

    public final void d(int i) {
        ss2 ss2Var;
        a.C0067a c0067a = a.b;
        ww8 ww8Var = null;
        if (a.l(i, c0067a.b())) {
            ss2Var = c().b();
        } else if (a.l(i, c0067a.c())) {
            ss2Var = c().c();
        } else if (a.l(i, c0067a.d())) {
            ss2Var = c().d();
        } else if (a.l(i, c0067a.f())) {
            ss2Var = c().e();
        } else if (a.l(i, c0067a.g())) {
            ss2Var = c().f();
        } else if (a.l(i, c0067a.h())) {
            ss2Var = c().g();
        } else {
            if (!(a.l(i, c0067a.a()) ? true : a.l(i, c0067a.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            ss2Var = null;
        }
        if (ss2Var != null) {
            ss2Var.invoke(this);
            ww8Var = ww8.a;
        }
        if (ww8Var == null) {
            a(i);
        }
    }

    public final void e(ul2 ul2Var) {
        this.c = ul2Var;
    }

    public final void f(b bVar) {
        this.b = bVar;
    }
}
