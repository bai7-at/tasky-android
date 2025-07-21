package com.google.android.gms.internal.measurement;

import defpackage.cef;
import defpackage.daf;
import defpackage.r7f;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class i2 extends r7f {
    private final j2 a;
    protected j2 b;
    protected boolean c = false;

    protected i2(j2 j2Var) {
        this.a = j2Var;
        this.b = (j2) j2Var.q(4, null, null);
    }

    private static final void e(j2 j2Var, j2 j2Var2) {
        e3.a().b(j2Var.getClass()).zzg(j2Var, j2Var2);
    }

    @Override // defpackage.eef
    public final /* synthetic */ cef a() {
        return this.a;
    }

    @Override // defpackage.r7f
    protected final /* synthetic */ r7f b(p1 p1Var) {
        g((j2) p1Var);
        return this;
    }

    @Override // defpackage.r7f
    public final /* bridge */ /* synthetic */ r7f c(byte[] bArr, int i, int i2) {
        h(bArr, 0, i2, daf.a());
        return this;
    }

    @Override // defpackage.r7f
    public final /* bridge */ /* synthetic */ r7f d(byte[] bArr, int i, int i2, daf dafVar) {
        h(bArr, 0, i2, dafVar);
        return this;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final i2 clone() {
        i2 i2Var = (i2) this.a.q(5, null, null);
        i2Var.g(m0());
        return i2Var;
    }

    public final i2 g(j2 j2Var) {
        if (this.c) {
            l();
            this.c = false;
        }
        e(this.b, j2Var);
        return this;
    }

    public final i2 h(byte[] bArr, int i, int i2, daf dafVar) {
        if (this.c) {
            l();
            this.c = false;
        }
        try {
            e3.a().b(this.b.getClass()).d(this.b, bArr, 0, i2, new s1(dafVar));
            return this;
        } catch (zzkm e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkm.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r2 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.j2 i() {
        /*
            r4 = this;
            com.google.android.gms.internal.measurement.j2 r4 = r4.m0()
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.q(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto L13
            goto L30
        L13:
            if (r2 == 0) goto L31
            com.google.android.gms.internal.measurement.e3 r2 = com.google.android.gms.internal.measurement.e3.a()
            java.lang.Class r3 = r4.getClass()
            com.google.android.gms.internal.measurement.h3 r2 = r2.b(r3)
            boolean r2 = r2.b(r4)
            if (r0 == r2) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r4
        L2a:
            r3 = 2
            r4.q(r3, r0, r1)
            if (r2 == 0) goto L31
        L30:
            return r4
        L31:
            com.google.android.gms.internal.measurement.zzmk r0 = new com.google.android.gms.internal.measurement.zzmk
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i2.i():com.google.android.gms.internal.measurement.j2");
    }

    @Override // defpackage.zdf
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j2 m0() {
        if (this.c) {
            return this.b;
        }
        j2 j2Var = this.b;
        e3.a().b(j2Var.getClass()).zzf(j2Var);
        this.c = true;
        return this.b;
    }

    protected void l() {
        j2 j2Var = (j2) this.b.q(4, null, null);
        e(j2Var, this.b);
        this.b = j2Var;
    }
}
