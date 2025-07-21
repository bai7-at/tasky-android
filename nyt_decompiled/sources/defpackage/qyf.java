package defpackage;

import com.google.android.gms.internal.ads.ho;

/* loaded from: classes3.dex */
public final class qyf implements xzf, wzf {
    public final xzf a;
    private wzf b;
    private pyf[] c = new pyf[0];
    private long d = 0;
    long e;

    public qyf(xzf xzfVar, boolean z, long j, long j2) {
        this.a = xzfVar;
        this.e = j2;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean a(ho hoVar) {
        return this.a.a(hoVar);
    }

    @Override // defpackage.q2g
    public final /* bridge */ /* synthetic */ void b(r2g r2gVar) {
        wzf wzfVar = this.b;
        wzfVar.getClass();
        wzfVar.b(this);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final void c(long j) {
        this.a.c(j);
    }

    @Override // defpackage.wzf
    public final void d(xzf xzfVar) {
        wzf wzfVar = this.b;
        wzfVar.getClass();
        wzfVar.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // defpackage.xzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.o6g[] r15, boolean[] r16, defpackage.p2g[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            pyf[] r3 = new defpackage.pyf[r2]
            r0.c = r3
            p2g[] r2 = new defpackage.p2g[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            pyf[] r5 = r0.c
            r6 = r1[r4]
            pyf r6 = (defpackage.pyf) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            p2g r11 = r6.a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            xzf r4 = r0.a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.e(r5, r6, r7, r8, r9)
            boolean r6 = r14.h()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.d = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.e
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            defpackage.wad.f(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            pyf[] r6 = r0.c
            r6[r3] = r11
            goto L7d
        L6c:
            pyf[] r7 = r0.c
            r8 = r7[r3]
            if (r8 == 0) goto L76
            p2g r8 = r8.a
            if (r8 == r6) goto L7d
        L76:
            pyf r8 = new pyf
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            pyf[] r6 = r0.c
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyf.e(o6g[], boolean[], p2g[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r5) goto L17;
     */
    @Override // defpackage.xzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            pyf[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            xzf r0 = r5.a
            long r0 = r0.f(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L35
            r3 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 < 0) goto L36
            long r5 = r5.e
            r3 = -9223372036854775808
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L35
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L36
        L35:
            r2 = r7
        L36:
            defpackage.wad.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyf.f(long):long");
    }

    public final void g(long j, long j2) {
        this.e = j2;
    }

    final boolean h() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.xzf
    public final void i(long j, boolean z) {
        this.a.i(j, false);
    }

    @Override // defpackage.xzf
    public final long j(long j, ggf ggfVar) {
        if (j == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(ggfVar.a, j));
        long j2 = ggfVar.b;
        long j3 = this.e;
        long max2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (max != ggfVar.a || max2 != ggfVar.b) {
            ggfVar = new ggf(max, max2);
        }
        return this.a.j(j, ggfVar);
    }

    @Override // defpackage.xzf
    public final void l(wzf wzfVar, long j) {
        this.b = wzfVar;
        this.a.l(this, j);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzb() {
        long zzb = this.a.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.e;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzc() {
        long zzc = this.a.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.e;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.xzf
    public final long zzd() {
        if (h()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.a.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        wad.f(zzd2 >= 0);
        long j2 = this.e;
        wad.f(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    @Override // defpackage.xzf
    public final z2g zzh() {
        return this.a.zzh();
    }

    @Override // defpackage.xzf
    public final void zzk() {
        this.a.zzk();
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean zzp() {
        return this.a.zzp();
    }
}
