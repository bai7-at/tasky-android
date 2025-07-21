package com.google.android.gms.internal.measurement;

import defpackage.cef;
import defpackage.lh4;

/* loaded from: classes3.dex */
final class a3 implements h3 {
    private final cef a;
    private final l3 b;
    private final boolean c;
    private final d2 d;

    private a3(l3 l3Var, d2 d2Var, cef cefVar) {
        this.b = l3Var;
        this.c = d2Var.c(cefVar);
        this.d = d2Var;
        this.a = cefVar;
    }

    static a3 e(l3 l3Var, d2 d2Var, cef cefVar) {
        return new a3(l3Var, d2Var, cefVar);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean a(Object obj, Object obj2) {
        if (!this.b.c(obj).equals(this.b.c(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(obj);
        this.d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean b(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void c(Object obj, x3 x3Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void d(Object obj, byte[] bArr, int i, int i2, s1 s1Var) {
        j2 j2Var = (j2) obj;
        if (j2Var.zzc == m3.c()) {
            j2Var.zzc = m3.e();
        }
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final int zza(Object obj) {
        l3 l3Var = this.b;
        int b = l3Var.b(l3Var.c(obj));
        if (!this.c) {
            return b;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final int zzb(Object obj) {
        int hashCode = this.b.c(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final Object zze() {
        return this.a.P().m0();
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void zzf(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final void zzg(Object obj, Object obj2) {
        j3.f(this.b, obj, obj2);
        if (this.c) {
            j3.e(this.d, obj, obj2);
        }
    }
}
