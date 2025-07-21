package androidx.compose.foundation.text;

import androidx.compose.runtime.b0;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ao5;
import defpackage.bj8;
import defpackage.bu1;
import defpackage.cz3;
import defpackage.ex7;
import defpackage.fm1;
import defpackage.ft6;
import defpackage.kj8;
import defpackage.nw3;
import defpackage.rh8;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.th8;
import defpackage.uf;
import defpackage.ul2;
import defpackage.vi8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class TextFieldState {
    private rh8 a;
    private final ft6 b;
    private final ex7 c;
    private final EditProcessor d = new EditProcessor();
    private vi8 e;
    private final sy4 f;
    private final sy4 g;
    private cz3 h;
    private final sy4 i;
    private androidx.compose.ui.text.a j;
    private final sy4 k;
    private final sy4 l;
    private final sy4 m;
    private final sy4 n;
    private final sy4 o;
    private boolean p;
    private final sy4 q;
    private final nw3 r;
    private ss2 s;
    private final ss2 t;
    private final ss2 u;
    private final ao5 v;

    public TextFieldState(rh8 rh8Var, ft6 ft6Var, ex7 ex7Var) {
        this.a = rh8Var;
        this.b = ft6Var;
        this.c = ex7Var;
        Boolean bool = Boolean.FALSE;
        this.f = b0.e(bool, null, 2, null);
        this.g = b0.e(bu1.d(bu1.g(0)), null, 2, null);
        this.i = b0.e(null, null, 2, null);
        this.k = b0.e(HandleState.None, null, 2, null);
        this.l = b0.e(bool, null, 2, null);
        this.m = b0.e(bool, null, 2, null);
        this.n = b0.e(bool, null, 2, null);
        this.o = b0.e(bool, null, 2, null);
        this.p = true;
        this.q = b0.e(Boolean.TRUE, null, 2, null);
        this.r = new nw3(ex7Var);
        this.s = new ss2() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            public final void b(TextFieldValue textFieldValue) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((TextFieldValue) obj);
                return ww8.a;
            }
        };
        this.t = new ss2() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            {
                super(1);
            }

            public final void b(TextFieldValue textFieldValue) {
                ss2 ss2Var;
                String h = textFieldValue.h();
                androidx.compose.ui.text.a t = TextFieldState.this.t();
                if (!zq3.c(h, t != null ? t.j() : null)) {
                    TextFieldState.this.w(HandleState.None);
                }
                ss2Var = TextFieldState.this.s;
                ss2Var.invoke(textFieldValue);
                TextFieldState.this.m().invalidate();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((TextFieldValue) obj);
                return ww8.a;
            }
        };
        this.u = new ss2() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            public final void b(int i) {
                nw3 nw3Var;
                nw3Var = TextFieldState.this.r;
                nw3Var.d(i);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((androidx.compose.ui.text.input.a) obj).o());
                return ww8.a;
            }
        };
        this.v = uf.a();
    }

    public final void A(cz3 cz3Var) {
        this.h = cz3Var;
    }

    public final void B(bj8 bj8Var) {
        this.i.setValue(bj8Var);
        this.p = false;
    }

    public final void C(float f) {
        this.g.setValue(bu1.d(f));
    }

    public final void D(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    public final void E(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void F(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    public final void G(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void H(androidx.compose.ui.text.a aVar, androidx.compose.ui.text.a aVar2, j jVar, boolean z, fm1 fm1Var, e.b bVar, ss2 ss2Var, b bVar2, ul2 ul2Var, long j) {
        rh8 b;
        this.s = ss2Var;
        this.v.k(j);
        nw3 nw3Var = this.r;
        nw3Var.f(bVar2);
        nw3Var.e(ul2Var);
        this.j = aVar;
        b = th8.b(this.a, aVar2, jVar, fm1Var, bVar, (r23 & 32) != 0 ? true : z, (r23 & 64) != 0 ? kj8.a.a() : 0, (r23 & 128) != 0 ? Integer.MAX_VALUE : 0, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? 1 : 0, i.l());
        if (this.a != b) {
            this.p = true;
        }
        this.a = b;
    }

    public final HandleState c() {
        return (HandleState) this.k.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final vi8 e() {
        return this.e;
    }

    public final ex7 f() {
        return this.c;
    }

    public final cz3 g() {
        cz3 cz3Var = this.h;
        if (cz3Var == null || !cz3Var.m()) {
            return null;
        }
        return cz3Var;
    }

    public final bj8 h() {
        return (bj8) this.i.getValue();
    }

    public final float i() {
        return ((bu1) this.g.getValue()).n();
    }

    public final ss2 j() {
        return this.u;
    }

    public final ss2 k() {
        return this.t;
    }

    public final EditProcessor l() {
        return this.d;
    }

    public final ft6 m() {
        return this.b;
    }

    public final ao5 n() {
        return this.v;
    }

    public final boolean o() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final rh8 s() {
        return this.a;
    }

    public final androidx.compose.ui.text.a t() {
        return this.j;
    }

    public final boolean u() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final boolean v() {
        return this.p;
    }

    public final void w(HandleState handleState) {
        this.k.setValue(handleState);
    }

    public final void x(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void y(boolean z) {
        this.q.setValue(Boolean.valueOf(z));
    }

    public final void z(vi8 vi8Var) {
        this.e = vi8Var;
    }
}
