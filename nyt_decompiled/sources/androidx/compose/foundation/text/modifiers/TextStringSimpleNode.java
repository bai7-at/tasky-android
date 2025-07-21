package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.c;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.aj8;
import defpackage.cv1;
import defpackage.dg4;
import defpackage.dh8;
import defpackage.dk8;
import defpackage.do0;
import defpackage.du7;
import defpackage.dv1;
import defpackage.ej7;
import defpackage.fd5;
import defpackage.fj7;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.gv1;
import defpackage.hn3;
import defpackage.io5;
import defpackage.jj7;
import defpackage.jo7;
import defpackage.kj8;
import defpackage.kt6;
import defpackage.lj7;
import defpackage.mo5;
import defpackage.nn0;
import defpackage.nt6;
import defpackage.ph0;
import defpackage.ph8;
import defpackage.q44;
import defpackage.qf2;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.qz3;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yc0;
import defpackage.yd3;
import defpackage.yq3;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zz3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.c implements c, cv1, ej7 {
    private Map B;
    private mo5 H;
    private ss2 L;
    private final sy4 M;
    private String n;
    private j r;
    private e.b s;
    private int t;
    private boolean u;
    private int w;
    private int x;
    private do0 y;

    public /* synthetic */ TextStringSimpleNode(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3, do0 do0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jVar, bVar, i, z, i2, i3, do0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2() {
        q2(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mo5 m2() {
        if (this.H == null) {
            this.H = new mo5(this.n, this.r, this.s, this.t, this.u, this.w, this.x, null);
        }
        mo5 mo5Var = this.H;
        zq3.e(mo5Var);
        return mo5Var;
    }

    private final mo5 n2(fm1 fm1Var) {
        mo5 a2;
        a o2 = o2();
        if (o2 != null && o2.c() && (a2 = o2.a()) != null) {
            a2.m(fm1Var);
            return a2;
        }
        mo5 m2 = m2();
        m2.m(fm1Var);
        return m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a o2() {
        return (a) this.M.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p2(String str) {
        ww8 ww8Var;
        a o2 = o2();
        if (o2 == null) {
            a aVar = new a(this.n, str, false, null, 12, null);
            mo5 mo5Var = new mo5(str, this.r, this.s, this.t, this.u, this.w, this.x, null);
            mo5Var.m(m2().a());
            aVar.d(mo5Var);
            q2(aVar);
            return true;
        }
        if (zq3.c(str, o2.b())) {
            return false;
        }
        o2.f(str);
        mo5 a2 = o2.a();
        if (a2 != null) {
            a2.p(str, this.r, this.s, this.t, this.u, this.w, this.x);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        return ww8Var != null;
    }

    private final void q2(a aVar) {
        this.M.setValue(aVar);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        mo5 n2 = n2(fVar);
        boolean h = n2.h(j, fVar.getLayoutDirection());
        n2.d();
        io5 e = n2.e();
        zq3.e(e);
        long c = n2.c();
        if (h) {
            qz3.a(this);
            Map map = this.B;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AlignmentLineKt.a(), Integer.valueOf(dg4.d(e.g())));
            map.put(AlignmentLineKt.b(), Integer.valueOf(dg4.d(e.v())));
            this.B = map;
        }
        final l W = qg4Var.W(zz3.d(fv0.b, hn3.g(c), hn3.f(c)));
        int g = hn3.g(c);
        int f = hn3.f(c);
        Map map2 = this.B;
        zq3.e(map2);
        return fVar.P(g, f, map2, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        });
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return n2(yq3Var).k(yq3Var.getLayoutDirection());
    }

    public final void l2(boolean z, boolean z2, boolean z3) {
        if (L1()) {
            if (z2 || (z && this.L != null)) {
                fj7.b(this);
            }
            if (z2 || z3) {
                m2().p(this.n, this.r, this.s, this.t, this.u, this.w, this.x);
                qz3.b(this);
                dv1.a(this);
            }
            if (z) {
                dv1.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return n2(yq3Var).f(i, yq3Var.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return n2(yq3Var).f(i, yq3Var.getLayoutDirection());
    }

    public final boolean r2(do0 do0Var, j jVar) {
        boolean c = zq3.c(do0Var, this.y);
        this.y = do0Var;
        return (c && jVar.J(this.r)) ? false : true;
    }

    public final boolean s2(j jVar, int i, int i2, boolean z, e.b bVar, int i3) {
        boolean z2 = !this.r.K(jVar);
        this.r = jVar;
        if (this.x != i) {
            this.x = i;
            z2 = true;
        }
        if (this.w != i2) {
            this.w = i2;
            z2 = true;
        }
        if (this.u != z) {
            this.u = z;
            z2 = true;
        }
        if (!zq3.c(this.s, bVar)) {
            this.s = bVar;
            z2 = true;
        }
        if (kj8.e(this.t, i3)) {
            return z2;
        }
        this.t = i3;
        return true;
    }

    public final boolean t2(String str) {
        if (zq3.c(this.n, str)) {
            return false;
        }
        this.n = str;
        k2();
        return true;
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return n2(yq3Var).j(yq3Var.getLayoutDirection());
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        ss2 ss2Var = this.L;
        if (ss2Var == null) {
            ss2Var = new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(List list) {
                    mo5 m2;
                    j jVar;
                    do0 do0Var;
                    j O;
                    m2 = TextStringSimpleNode.this.m2();
                    jVar = TextStringSimpleNode.this.r;
                    do0Var = TextStringSimpleNode.this.y;
                    O = jVar.O((r58 & 1) != 0 ? nn0.b.g() : do0Var != null ? do0Var.a() : nn0.b.g(), (r58 & 2) != 0 ? dk8.b.a() : 0L, (r58 & 4) != 0 ? null : null, (r58 & 8) != 0 ? null : null, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : null, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? dk8.b.a() : 0L, (r58 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.g() : 0L, (r58 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : null, (r58 & 8192) != 0 ? null : null, (r58 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (r58 & 32768) != 0 ? dh8.b.g() : 0, (r58 & 65536) != 0 ? uh8.b.f() : 0, (r58 & 131072) != 0 ? dk8.b.a() : 0L, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & Constants.MB) != 0 ? q44.b.b() : 0, (r58 & 2097152) != 0 ? yd3.b.c() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                    aj8 o = m2.o(O);
                    if (o != null) {
                        list.add(o);
                    } else {
                        o = null;
                    }
                    return Boolean.valueOf(o != null);
                }
            };
            this.L = ss2Var;
        }
        jj7.b0(lj7Var, new androidx.compose.ui.text.a(this.n, null, null, 6, null));
        a o2 = o2();
        if (o2 != null) {
            jj7.Z(lj7Var, o2.c());
            jj7.f0(lj7Var, new androidx.compose.ui.text.a(o2.b(), null, null, 6, null));
        }
        jj7.h0(lj7Var, null, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(a aVar) {
                TextStringSimpleNode.this.p2(aVar.j());
                fj7.b(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        jj7.m0(lj7Var, null, new ss2() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            {
                super(1);
            }

            public final Boolean b(boolean z) {
                TextStringSimpleNode.a o22;
                TextStringSimpleNode.a o23;
                o22 = TextStringSimpleNode.this.o2();
                if (o22 == null) {
                    return Boolean.FALSE;
                }
                o23 = TextStringSimpleNode.this.o2();
                if (o23 != null) {
                    o23.e(z);
                }
                fj7.b(TextStringSimpleNode.this);
                qz3.b(TextStringSimpleNode.this);
                dv1.a(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Boolean) obj).booleanValue());
            }
        }, 1, null);
        jj7.d(lj7Var, null, new qs2() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                TextStringSimpleNode.this.k2();
                fj7.b(TextStringSimpleNode.this);
                qz3.b(TextStringSimpleNode.this);
                dv1.a(TextStringSimpleNode.this);
                return Boolean.TRUE;
            }
        }, 1, null);
        jj7.q(lj7Var, null, ss2Var, 1, null);
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        if (L1()) {
            io5 e = m2().e();
            if (e == null) {
                throw new IllegalArgumentException("no paragraph");
            }
            ph0 c = yv0Var.i1().c();
            boolean b = m2().b();
            if (b) {
                kt6 b2 = nt6.b(fd5.b.c(), du7.a(hn3.g(m2().c()), hn3.f(m2().c())));
                c.t();
                ph0.h(c, b2, 0, 2, null);
            }
            try {
                ph8 E = this.r.E();
                if (E == null) {
                    E = ph8.b.c();
                }
                ph8 ph8Var = E;
                jo7 B = this.r.B();
                if (B == null) {
                    B = jo7.d.a();
                }
                jo7 jo7Var = B;
                gv1 m = this.r.m();
                if (m == null) {
                    m = qf2.a;
                }
                gv1 gv1Var = m;
                yc0 k = this.r.k();
                if (k != null) {
                    io5.t(e, c, k, this.r.h(), jo7Var, ph8Var, gv1Var, 0, 64, null);
                } else {
                    do0 do0Var = this.y;
                    long a2 = do0Var != null ? do0Var.a() : nn0.b.g();
                    nn0.a aVar = nn0.b;
                    if (a2 == aVar.g()) {
                        a2 = this.r.l() != aVar.g() ? this.r.l() : aVar.a();
                    }
                    io5.h(e, c, a2, jo7Var, ph8Var, gv1Var, 0, 32, null);
                }
                if (b) {
                    c.k();
                }
            } catch (Throwable th) {
                if (b) {
                    c.k();
                }
                throw th;
            }
        }
    }

    private TextStringSimpleNode(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3, do0 do0Var) {
        this.n = str;
        this.r = jVar;
        this.s = bVar;
        this.t = i;
        this.u = z;
        this.w = i2;
        this.x = i3;
        this.y = do0Var;
        this.M = b0.e(null, null, 2, null);
    }

    public static final class a {
        private final String a;
        private String b;
        private boolean c;
        private mo5 d;

        public a(String str, String str2, boolean z, mo5 mo5Var) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = mo5Var;
        }

        public final mo5 a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(mo5 mo5Var) {
            this.d = mo5Var;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && this.c == aVar.c && zq3.c(this.d, aVar.d);
        }

        public final void f(String str) {
            this.b = str;
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
            mo5 mo5Var = this.d;
            return hashCode + (mo5Var == null ? 0 : mo5Var.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }

        public /* synthetic */ a(String str, String str2, boolean z, mo5 mo5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : mo5Var);
        }
    }
}
