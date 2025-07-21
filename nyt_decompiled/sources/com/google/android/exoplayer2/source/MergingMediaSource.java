package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.MultimapBuilder;
import defpackage.ob;
import defpackage.rg1;
import defpackage.sq8;
import defpackage.tx4;
import defpackage.ur;
import defpackage.us0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MergingMediaSource extends c {
    private static final w0 B = new w0.c().d("MergingMediaSource").a();
    private final boolean k;
    private final boolean l;
    private final o[] m;
    private final g2[] n;
    private final ArrayList r;
    private final us0 s;
    private final Map t;
    private final tx4 u;
    private int w;
    private long[][] x;
    private IllegalMergeException y;

    public static final class IllegalMergeException extends IOException {
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    private static final class a extends j {
        private final long[] g;
        private final long[] h;

        public a(g2 g2Var, Map map) {
            super(g2Var);
            int u = g2Var.u();
            this.h = new long[g2Var.u()];
            g2.d dVar = new g2.d();
            for (int i = 0; i < u; i++) {
                this.h[i] = g2Var.s(i, dVar).n;
            }
            int n = g2Var.n();
            this.g = new long[n];
            g2.b bVar = new g2.b();
            for (int i2 = 0; i2 < n; i2++) {
                g2Var.l(i2, bVar, true);
                long longValue = ((Long) ur.e((Long) map.get(bVar.b))).longValue();
                long[] jArr = this.g;
                longValue = longValue == Long.MIN_VALUE ? bVar.d : longValue;
                jArr[i2] = longValue;
                long j = bVar.d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.h;
                    int i3 = bVar.c;
                    jArr2[i3] = jArr2[i3] - (j - longValue);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.d = this.g[i];
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            long j2;
            super.t(i, dVar, j);
            long j3 = this.h[i];
            dVar.n = j3;
            if (j3 != -9223372036854775807L) {
                long j4 = dVar.m;
                if (j4 != -9223372036854775807L) {
                    j2 = Math.min(j4, j3);
                    dVar.m = j2;
                    return dVar;
                }
            }
            j2 = dVar.m;
            dVar.m = j2;
            return dVar;
        }
    }

    public MergingMediaSource(o... oVarArr) {
        this(false, oVarArr);
    }

    private void M() {
        g2.b bVar = new g2.b();
        for (int i = 0; i < this.w; i++) {
            long j = -this.n[0].k(i, bVar).s();
            int i2 = 1;
            while (true) {
                g2[] g2VarArr = this.n;
                if (i2 < g2VarArr.length) {
                    this.x[i][i2] = j - (-g2VarArr[i2].k(i, bVar).s());
                    i2++;
                }
            }
        }
    }

    private void P() {
        g2[] g2VarArr;
        g2.b bVar = new g2.b();
        for (int i = 0; i < this.w; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                g2VarArr = this.n;
                if (i2 >= g2VarArr.length) {
                    break;
                }
                long o = g2VarArr[i2].k(i, bVar).o();
                if (o != -9223372036854775807L) {
                    long j2 = o + this.x[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object r = g2VarArr[0].r(i);
            this.t.put(r, Long.valueOf(j));
            Iterator it2 = this.u.get(r).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).w(0L, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        super.B(sq8Var);
        for (int i = 0; i < this.m.length; i++) {
            K(Integer.valueOf(i), this.m[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void D() {
        super.D();
        Arrays.fill(this.n, (Object) null);
        this.w = -1;
        this.y = null;
        this.r.clear();
        Collections.addAll(this.r, this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public o.b F(Integer num, o.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void I(Integer num, o oVar, g2 g2Var) {
        if (this.y != null) {
            return;
        }
        if (this.w == -1) {
            this.w = g2Var.n();
        } else if (g2Var.n() != this.w) {
            this.y = new IllegalMergeException(0);
            return;
        }
        if (this.x.length == 0) {
            this.x = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.w, this.n.length);
        }
        this.r.remove(oVar);
        this.n[num.intValue()] = g2Var;
        if (this.r.isEmpty()) {
            if (this.k) {
                M();
            }
            g2 g2Var2 = this.n[0];
            if (this.l) {
                P();
                g2Var2 = new a(g2Var2, this.t);
            }
            C(g2Var2);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        o[] oVarArr = this.m;
        return oVarArr.length > 0 ? oVarArr[0].f() : B;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        int length = this.m.length;
        n[] nVarArr = new n[length];
        int g = this.n[0].g(bVar.a);
        for (int i = 0; i < length; i++) {
            nVarArr[i] = this.m[i].g(bVar.c(this.n[i].r(g)), obVar, j - this.x[g][i]);
        }
        r rVar = new r(this.s, this.x[g], nVarArr);
        if (!this.l) {
            return rVar;
        }
        b bVar2 = new b(rVar, true, 0L, ((Long) ur.e((Long) this.t.get(bVar.a))).longValue());
        this.u.put(bVar.a, bVar2);
        return bVar2;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        if (this.l) {
            b bVar = (b) nVar;
            Iterator it2 = this.u.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((b) entry.getValue()).equals(bVar)) {
                    this.u.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            nVar = bVar.a;
        }
        r rVar = (r) nVar;
        int i = 0;
        while (true) {
            o[] oVarArr = this.m;
            if (i >= oVarArr.length) {
                return;
            }
            oVarArr[i].h(rVar.a(i));
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void p() {
        IllegalMergeException illegalMergeException = this.y;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.p();
    }

    public MergingMediaSource(boolean z, o... oVarArr) {
        this(z, false, oVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, o... oVarArr) {
        this(z, z2, new rg1(), oVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, us0 us0Var, o... oVarArr) {
        this.k = z;
        this.l = z2;
        this.m = oVarArr;
        this.s = us0Var;
        this.r = new ArrayList(Arrays.asList(oVarArr));
        this.w = -1;
        this.n = new g2[oVarArr.length];
        this.x = new long[0][];
        this.t = new HashMap();
        this.u = MultimapBuilder.a().a().e();
    }
}
