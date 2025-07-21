package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.bd8;
import defpackage.by1;
import defpackage.cy4;
import defpackage.dg4;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.gm5;
import defpackage.hm5;
import defpackage.hn3;
import defpackage.in3;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ow7;
import defpackage.ph0;
import defpackage.ss2;
import defpackage.tx5;
import defpackage.wd;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zt7;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements hm5 {
    private final gm5 a;
    private fd5 b;
    private final EdgeEffect c;
    private final EdgeEffect d;
    private final EdgeEffect e;
    private final EdgeEffect f;
    private final List g;
    private final EdgeEffect h;
    private final EdgeEffect i;
    private final EdgeEffect j;
    private final EdgeEffect k;
    private int l;
    private final cy4 m;
    private boolean n;
    private boolean o;
    private long p;
    private final ss2 q;
    private tx5 r;
    private final Modifier s;

    public AndroidEdgeEffectOverscrollEffect(Context context, gm5 gm5Var) {
        Modifier modifier;
        this.a = gm5Var;
        by1 by1Var = by1.a;
        EdgeEffect a = by1Var.a(context, null);
        this.c = a;
        EdgeEffect a2 = by1Var.a(context, null);
        this.d = a2;
        EdgeEffect a3 = by1Var.a(context, null);
        this.e = a3;
        EdgeEffect a4 = by1Var.a(context, null);
        this.f = a4;
        List o = kotlin.collections.i.o(a3, a, a4, a2);
        this.g = o;
        this.h = by1Var.a(context, null);
        this.i = by1Var.a(context, null);
        this.j = by1Var.a(context, null);
        this.k = by1Var.a(context, null);
        int size = o.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) o.get(i)).setColor(wn0.k(this.a.b()));
        }
        this.l = -1;
        this.m = ow7.a(0);
        this.n = true;
        this.p = zt7.b.b();
        ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            public final void b(long j) {
                long j2;
                EdgeEffect edgeEffect;
                EdgeEffect edgeEffect2;
                EdgeEffect edgeEffect3;
                EdgeEffect edgeEffect4;
                EdgeEffect edgeEffect5;
                EdgeEffect edgeEffect6;
                EdgeEffect edgeEffect7;
                EdgeEffect edgeEffect8;
                long c = in3.c(j);
                j2 = AndroidEdgeEffectOverscrollEffect.this.p;
                boolean f = zt7.f(c, j2);
                AndroidEdgeEffectOverscrollEffect.this.p = in3.c(j);
                if (!f) {
                    edgeEffect = AndroidEdgeEffectOverscrollEffect.this.c;
                    edgeEffect.setSize(hn3.g(j), hn3.f(j));
                    edgeEffect2 = AndroidEdgeEffectOverscrollEffect.this.d;
                    edgeEffect2.setSize(hn3.g(j), hn3.f(j));
                    edgeEffect3 = AndroidEdgeEffectOverscrollEffect.this.e;
                    edgeEffect3.setSize(hn3.f(j), hn3.g(j));
                    edgeEffect4 = AndroidEdgeEffectOverscrollEffect.this.f;
                    edgeEffect4.setSize(hn3.f(j), hn3.g(j));
                    edgeEffect5 = AndroidEdgeEffectOverscrollEffect.this.h;
                    edgeEffect5.setSize(hn3.g(j), hn3.f(j));
                    edgeEffect6 = AndroidEdgeEffectOverscrollEffect.this.i;
                    edgeEffect6.setSize(hn3.g(j), hn3.f(j));
                    edgeEffect7 = AndroidEdgeEffectOverscrollEffect.this.j;
                    edgeEffect7.setSize(hn3.f(j), hn3.g(j));
                    edgeEffect8 = AndroidEdgeEffectOverscrollEffect.this.k;
                    edgeEffect8.setSize(hn3.f(j), hn3.g(j));
                }
                if (f) {
                    return;
                }
                AndroidEdgeEffectOverscrollEffect.this.A();
                AndroidEdgeEffectOverscrollEffect.this.t();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((hn3) obj).j());
                return ww8.a;
            }
        };
        this.q = ss2Var;
        Modifier.a aVar = Modifier.a;
        modifier = AndroidOverscroll_androidKt.a;
        this.s = OnRemeasuredModifierKt.a(bd8.c(aVar.h(modifier), ww8.a, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), ss2Var).h(new e(this, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (this.n && this.l == z()) {
            G(z() + 1);
        }
    }

    private final float B(long j, long j2) {
        float o = fd5.o(j2) / zt7.i(this.p);
        float p = fd5.p(j) / zt7.g(this.p);
        by1 by1Var = by1.a;
        return by1Var.b(this.d) == 0.0f ? (-by1Var.d(this.d, -p, 1 - o)) * zt7.g(this.p) : fd5.p(j);
    }

    private final float C(long j, long j2) {
        float p = fd5.p(j2) / zt7.g(this.p);
        float o = fd5.o(j) / zt7.i(this.p);
        by1 by1Var = by1.a;
        return by1Var.b(this.e) == 0.0f ? by1Var.d(this.e, o, 1 - p) * zt7.i(this.p) : fd5.o(j);
    }

    private final float D(long j, long j2) {
        float p = fd5.p(j2) / zt7.g(this.p);
        float o = fd5.o(j) / zt7.i(this.p);
        by1 by1Var = by1.a;
        return by1Var.b(this.f) == 0.0f ? (-by1Var.d(this.f, -o, p)) * zt7.i(this.p) : fd5.o(j);
    }

    private final float E(long j, long j2) {
        float o = fd5.o(j2) / zt7.i(this.p);
        float p = fd5.p(j) / zt7.g(this.p);
        by1 by1Var = by1.a;
        return by1Var.b(this.c) == 0.0f ? by1Var.d(this.c, p, o) * zt7.g(this.p) : fd5.p(j);
    }

    private final boolean F(long j) {
        boolean z;
        if (this.e.isFinished() || fd5.o(j) >= 0.0f) {
            z = false;
        } else {
            by1.a.e(this.e, fd5.o(j));
            z = this.e.isFinished();
        }
        if (!this.f.isFinished() && fd5.o(j) > 0.0f) {
            by1.a.e(this.f, fd5.o(j));
            z = z || this.f.isFinished();
        }
        if (!this.c.isFinished() && fd5.p(j) < 0.0f) {
            by1.a.e(this.c, fd5.p(j));
            z = z || this.c.isFinished();
        }
        if (this.d.isFinished() || fd5.p(j) <= 0.0f) {
            return z;
        }
        by1.a.e(this.d, fd5.p(j));
        return z || this.d.isFinished();
    }

    private final void G(int i) {
        this.m.f(i);
    }

    private final boolean H() {
        boolean z;
        long b = du7.b(this.p);
        by1 by1Var = by1.a;
        if (by1Var.b(this.e) == 0.0f) {
            z = false;
        } else {
            C(fd5.b.c(), b);
            z = true;
        }
        if (by1Var.b(this.f) != 0.0f) {
            D(fd5.b.c(), b);
            z = true;
        }
        if (by1Var.b(this.c) != 0.0f) {
            E(fd5.b.c(), b);
            z = true;
        }
        if (by1Var.b(this.d) == 0.0f) {
            return z;
        }
        B(fd5.b.c(), b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        List list = this.g;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            A();
        }
    }

    private final boolean u(fv1 fv1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-zt7.i(this.p), (-zt7.g(this.p)) + fv1Var.f1(this.a.a().a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean v(fv1 fv1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-zt7.g(this.p), fv1Var.f1(this.a.a().b(fv1Var.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean x(fv1 fv1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int d = dg4.d(zt7.i(this.p));
        float c = this.a.a().c(fv1Var.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-d) + fv1Var.f1(c));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean y(fv1 fv1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, fv1Var.f1(this.a.a().d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final int z() {
        return this.m.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.hm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r14, defpackage.gt2 r16, defpackage.by0 r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.a(long, gt2, by0):java.lang.Object");
    }

    @Override // defpackage.hm5
    public boolean b() {
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(by1.a.b((EdgeEffect) list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hm5
    public Modifier c() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    @Override // defpackage.hm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(long r18, int r20, defpackage.ss2 r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.d(long, int, ss2):long");
    }

    public final void w(fv1 fv1Var) {
        boolean z;
        if (zt7.k(this.p)) {
            return;
        }
        ph0 c = fv1Var.i1().c();
        this.l = z();
        Canvas d = wd.d(c);
        by1 by1Var = by1.a;
        if (by1Var.b(this.j) != 0.0f) {
            x(fv1Var, this.j, d);
            this.j.finish();
        }
        if (this.e.isFinished()) {
            z = false;
        } else {
            z = v(fv1Var, this.e, d);
            by1Var.d(this.j, by1Var.b(this.e), 0.0f);
        }
        if (by1Var.b(this.h) != 0.0f) {
            u(fv1Var, this.h, d);
            this.h.finish();
        }
        if (!this.c.isFinished()) {
            z = y(fv1Var, this.c, d) || z;
            by1Var.d(this.h, by1Var.b(this.c), 0.0f);
        }
        if (by1Var.b(this.k) != 0.0f) {
            v(fv1Var, this.k, d);
            this.k.finish();
        }
        if (!this.f.isFinished()) {
            z = x(fv1Var, this.f, d) || z;
            by1Var.d(this.k, by1Var.b(this.f), 0.0f);
        }
        if (by1Var.b(this.i) != 0.0f) {
            y(fv1Var, this.i, d);
            this.i.finish();
        }
        if (!this.d.isFinished()) {
            boolean z2 = u(fv1Var, this.d, d) || z;
            by1Var.d(this.i, by1Var.b(this.d), 0.0f);
            z = z2;
        }
        if (z) {
            A();
        }
    }
}
