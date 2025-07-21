package defpackage;

import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;

/* loaded from: classes.dex */
public final class ii8 extends e60 {
    private final TextFieldValue j;
    private final bj8 k;

    public ii8(TextFieldValue textFieldValue, id5 id5Var, bj8 bj8Var, oj8 oj8Var) {
        super(textFieldValue.e(), textFieldValue.g(), bj8Var != null ? bj8Var.f() : null, id5Var, oj8Var, null);
        this.j = textFieldValue;
        this.k = bj8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a0(defpackage.bj8 r6, int r7) {
        /*
            r5 = this;
            cz3 r0 = r6.c()
            if (r0 == 0) goto L15
            cz3 r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            kt6 r2 = defpackage.cz3.C(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            kt6$a r0 = defpackage.kt6.e
            kt6 r2 = r0.a()
        L1b:
            id5 r0 = r5.p()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.j
            long r3 = r1.g()
            int r1 = androidx.compose.ui.text.i.i(r3)
            int r0 = r0.b(r1)
            aj8 r1 = r6.f()
            kt6 r0 = r1.e(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = defpackage.zt7.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            id5 r5 = r5.p()
            aj8 r6 = r6.f()
            long r0 = defpackage.hd5.a(r1, r0)
            int r6 = r6.x(r0)
            int r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.a0(bj8, int):int");
    }

    public final List Y(ss2 ss2Var) {
        if (!i.h(u())) {
            return kotlin.collections.i.o(new kp0("", 0), new zl7(i.l(u()), i.l(u())));
        }
        fy1 fy1Var = (fy1) ss2Var.invoke(this);
        if (fy1Var != null) {
            return kotlin.collections.i.e(fy1Var);
        }
        return null;
    }

    public final TextFieldValue Z() {
        return TextFieldValue.c(this.j, e(), u(), null, 4, null);
    }

    public final ii8 b0() {
        bj8 bj8Var;
        if (w().length() > 0 && (bj8Var = this.k) != null) {
            T(a0(bj8Var, 1));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final ii8 c0() {
        bj8 bj8Var;
        if (w().length() > 0 && (bj8Var = this.k) != null) {
            T(a0(bj8Var, -1));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
