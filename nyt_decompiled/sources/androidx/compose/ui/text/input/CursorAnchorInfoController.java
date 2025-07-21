package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import defpackage.aj8;
import defpackage.al3;
import defpackage.d06;
import defpackage.id5;
import defpackage.kg4;
import defpackage.kt6;
import defpackage.o41;
import defpackage.rf;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    private final d06 a;
    private final al3 b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private TextFieldValue i;
    private aj8 j;
    private id5 k;
    private kt6 m;
    private kt6 n;
    private ss2 l = new ss2() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        public final void b(float[] fArr) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((kg4) obj).o());
            return ww8.a;
        }
    };
    private final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    private final float[] p = kg4.c(null, 1, null);
    private final Matrix q = new Matrix();

    public CursorAnchorInfoController(d06 d06Var, al3 al3Var) {
        this.a = d06Var;
        this.b = al3Var;
    }

    private final void c() {
        if (this.b.isActive()) {
            this.l.invoke(kg4.a(this.p));
            this.a.k(this.p);
            rf.a(this.q, this.p);
            al3 al3Var = this.b;
            CursorAnchorInfo.Builder builder = this.o;
            TextFieldValue textFieldValue = this.i;
            zq3.e(textFieldValue);
            id5 id5Var = this.k;
            zq3.e(id5Var);
            aj8 aj8Var = this.j;
            zq3.e(aj8Var);
            Matrix matrix = this.q;
            kt6 kt6Var = this.m;
            zq3.e(kt6Var);
            kt6 kt6Var2 = this.n;
            zq3.e(kt6Var2);
            al3Var.f(o41.b(builder, textFieldValue, id5Var, aj8Var, matrix, kt6Var, kt6Var2, this.e, this.f, this.g, this.h));
            this.d = false;
        }
    }

    public final void a() {
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = new ss2() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1
            public final void b(float[] fArr) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((kg4) obj).o());
                return ww8.a;
            }
        };
        this.m = null;
        this.n = null;
    }

    public final void b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        if (z) {
            this.d = true;
            if (this.i != null) {
                c();
            }
        }
        this.c = z2;
    }

    public final void d(TextFieldValue textFieldValue, id5 id5Var, aj8 aj8Var, ss2 ss2Var, kt6 kt6Var, kt6 kt6Var2) {
        this.i = textFieldValue;
        this.k = id5Var;
        this.j = aj8Var;
        this.l = ss2Var;
        this.m = kt6Var;
        this.n = kt6Var2;
        if (this.d || this.c) {
            c();
        }
    }
}
