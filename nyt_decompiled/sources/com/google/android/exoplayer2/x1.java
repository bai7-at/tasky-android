package com.google.android.exoplayer2;

import com.google.android.exoplayer2.g2;
import defpackage.qr7;
import defpackage.z19;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class x1 extends com.google.android.exoplayer2.a {
    private final int i;
    private final int j;
    private final int[] k;
    private final int[] l;
    private final g2[] m;
    private final Object[] n;
    private final HashMap r;

    class a extends com.google.android.exoplayer2.source.j {
        private final g2.d g;

        a(g2 g2Var) {
            super(g2Var);
            this.g = new g2.d();
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            g2.b l = super.l(i, bVar, z);
            if (super.s(l.c, this.g).i()) {
                l.y(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, com.google.android.exoplayer2.source.ads.a.g, true);
            } else {
                l.f = true;
            }
            return l;
        }
    }

    public x1(Collection collection, qr7 qr7Var) {
        this(L(collection), M(collection), qr7Var);
    }

    private static g2[] L(Collection collection) {
        g2[] g2VarArr = new g2[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            g2VarArr[i] = ((c1) it2.next()).b();
            i++;
        }
        return g2VarArr;
    }

    private static Object[] M(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            objArr[i] = ((c1) it2.next()).a();
            i++;
        }
        return objArr;
    }

    @Override // com.google.android.exoplayer2.a
    protected Object C(int i) {
        return this.n[i];
    }

    @Override // com.google.android.exoplayer2.a
    protected int E(int i) {
        return this.k[i];
    }

    @Override // com.google.android.exoplayer2.a
    protected int F(int i) {
        return this.l[i];
    }

    @Override // com.google.android.exoplayer2.a
    protected g2 I(int i) {
        return this.m[i];
    }

    public x1 J(qr7 qr7Var) {
        g2[] g2VarArr = new g2[this.m.length];
        int i = 0;
        while (true) {
            g2[] g2VarArr2 = this.m;
            if (i >= g2VarArr2.length) {
                return new x1(g2VarArr, this.n, qr7Var);
            }
            g2VarArr[i] = new a(g2VarArr2[i]);
            i++;
        }
    }

    List K() {
        return Arrays.asList(this.m);
    }

    @Override // com.google.android.exoplayer2.g2
    public int n() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.g2
    public int u() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.a
    protected int x(Object obj) {
        Integer num = (Integer) this.r.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    protected int y(int i) {
        return z19.h(this.k, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected int z(int i) {
        return z19.h(this.l, i + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private x1(g2[] g2VarArr, Object[] objArr, qr7 qr7Var) {
        super(false, qr7Var);
        int i = 0;
        int length = g2VarArr.length;
        this.m = g2VarArr;
        this.k = new int[length];
        this.l = new int[length];
        this.n = objArr;
        this.r = new HashMap();
        int length2 = g2VarArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            g2 g2Var = g2VarArr[i];
            this.m[i4] = g2Var;
            this.l[i4] = i2;
            this.k[i4] = i3;
            i2 += g2Var.u();
            i3 += this.m[i4].n();
            this.r.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.i = i2;
        this.j = i3;
    }
}
