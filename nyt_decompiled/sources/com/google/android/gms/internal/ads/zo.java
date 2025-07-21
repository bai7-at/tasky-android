package com.google.android.gms.internal.ads;

import defpackage.khe;
import defpackage.n1c;
import defpackage.p7f;
import defpackage.s2g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
final class zo extends p7f {
    public static final /* synthetic */ int o = 0;
    private final int h;
    private final int i;
    private final int[] j;
    private final int[] k;
    private final n1c[] l;
    private final Object[] m;
    private final HashMap n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zo(java.util.Collection r7, defpackage.s2g r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            n1c[] r0 = new defpackage.n1c[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.mo r4 = (com.google.android.gms.internal.ads.mo) r4
            int r5 = r3 + 1
            n1c r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.mo r3 = (com.google.android.gms.internal.ads.mo) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zo.<init>(java.util.Collection, s2g):void");
    }

    @Override // defpackage.n1c
    public final int b() {
        return this.i;
    }

    @Override // defpackage.n1c
    public final int c() {
        return this.h;
    }

    @Override // defpackage.p7f
    protected final int p(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.p7f
    protected final int q(int i) {
        return khe.q(this.j, i + 1, false, false);
    }

    @Override // defpackage.p7f
    protected final int r(int i) {
        return khe.q(this.k, i + 1, false, false);
    }

    @Override // defpackage.p7f
    protected final int s(int i) {
        return this.j[i];
    }

    @Override // defpackage.p7f
    protected final int t(int i) {
        return this.k[i];
    }

    @Override // defpackage.p7f
    protected final n1c u(int i) {
        return this.l[i];
    }

    @Override // defpackage.p7f
    protected final Object v(int i) {
        return this.m[i];
    }

    final List y() {
        return Arrays.asList(this.l);
    }

    public final zo z(s2g s2gVar) {
        n1c[] n1cVarArr = new n1c[this.l.length];
        int i = 0;
        while (true) {
            n1c[] n1cVarArr2 = this.l;
            if (i >= n1cVarArr2.length) {
                return new zo(n1cVarArr, this.m, s2gVar);
            }
            n1cVarArr[i] = new yo(this, n1cVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zo(n1c[] n1cVarArr, Object[] objArr, s2g s2gVar) {
        super(false, s2gVar);
        int i = 0;
        this.l = n1cVarArr;
        int length = n1cVarArr.length;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < n1cVarArr.length) {
            n1c n1cVar = n1cVarArr[i];
            this.l[i4] = n1cVar;
            this.k[i4] = i2;
            this.j[i4] = i3;
            i2 += n1cVar.c();
            i3 += this.l[i4].b();
            this.n.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.h = i2;
        this.i = i3;
    }
}
