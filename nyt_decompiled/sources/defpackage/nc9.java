package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.oc9;
import defpackage.r38;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class nc9 extends r38 {
    private a n;
    private int o;
    private boolean p;
    private oc9.c q;
    private oc9.a r;

    static final class a {
        public final oc9.c a;
        public final oc9.a b;
        public final byte[] c;
        public final oc9.b[] d;
        public final int e;

        public a(oc9.c cVar, oc9.a aVar, byte[] bArr, oc9.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    nc9() {
    }

    static void n(yo5 yo5Var, long j) {
        if (yo5Var.b() < yo5Var.g() + 4) {
            yo5Var.R(Arrays.copyOf(yo5Var.e(), yo5Var.g() + 4));
        } else {
            yo5Var.T(yo5Var.g() + 4);
        }
        byte[] e = yo5Var.e();
        e[yo5Var.g() - 4] = (byte) (j & 255);
        e[yo5Var.g() - 3] = (byte) ((j >>> 8) & 255);
        e[yo5Var.g() - 2] = (byte) ((j >>> 16) & 255);
        e[yo5Var.g() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int o(byte b, a aVar) {
        return !aVar.d[p(b, aVar.e, 1)].a ? aVar.a.g : aVar.a.h;
    }

    static int p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean r(yo5 yo5Var) {
        try {
            return oc9.m(1, yo5Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.r38
    protected void e(long j) {
        super.e(j);
        this.p = j != 0;
        oc9.c cVar = this.q;
        this.o = cVar != null ? cVar.g : 0;
    }

    @Override // defpackage.r38
    protected long f(yo5 yo5Var) {
        if ((yo5Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int o = o(yo5Var.e()[0], (a) ur.i(this.n));
        long j = this.p ? (this.o + o) / 4 : 0;
        n(yo5Var, j);
        this.p = true;
        this.o = o;
        return j;
    }

    @Override // defpackage.r38
    protected boolean i(yo5 yo5Var, long j, r38.b bVar) {
        if (this.n != null) {
            ur.e(bVar.a);
            return false;
        }
        a q = q(yo5Var);
        this.n = q;
        if (q == null) {
            return true;
        }
        oc9.c cVar = q.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.j);
        arrayList.add(q.c);
        bVar.a = new t0.b().g0("audio/vorbis").I(cVar.e).b0(cVar.d).J(cVar.b).h0(cVar.c).V(arrayList).Z(oc9.c(ImmutableList.u(q.b.b))).G();
        return true;
    }

    @Override // defpackage.r38
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    a q(yo5 yo5Var) {
        oc9.c cVar = this.q;
        if (cVar == null) {
            this.q = oc9.j(yo5Var);
            return null;
        }
        oc9.a aVar = this.r;
        if (aVar == null) {
            this.r = oc9.h(yo5Var);
            return null;
        }
        byte[] bArr = new byte[yo5Var.g()];
        System.arraycopy(yo5Var.e(), 0, bArr, 0, yo5Var.g());
        return new a(cVar, aVar, bArr, oc9.k(yo5Var, cVar.b), oc9.a(r4.length - 1));
    }
}
