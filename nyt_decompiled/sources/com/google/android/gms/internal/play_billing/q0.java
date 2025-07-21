package com.google.android.gms.internal.play_billing;

import defpackage.lh4;
import defpackage.sbc;

/* loaded from: classes3.dex */
final class q0 implements w0 {
    private final sbc a;
    private final a1 b;
    private final boolean c;
    private final s d;

    private q0(a1 a1Var, s sVar, sbc sbcVar) {
        this.b = a1Var;
        this.c = sVar.c(sbcVar);
        this.d = sVar;
        this.a = sbcVar;
    }

    static q0 e(a1 a1Var, s sVar, sbc sbcVar) {
        return new q0(a1Var, sVar, sbcVar);
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final boolean a(Object obj, Object obj2) {
        if (!this.b.d(obj).equals(this.b.d(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(obj);
        this.d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final boolean b(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void c(Object obj, m1 m1Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void d(Object obj, byte[] bArr, int i, int i2, e eVar) {
        z zVar = (z) obj;
        if (zVar.zzc == b1.c()) {
            zVar.zzc = b1.f();
        }
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final int zza(Object obj) {
        a1 a1Var = this.b;
        int b = a1Var.b(a1Var.d(obj));
        if (!this.c) {
            return b;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final int zzb(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final Object zze() {
        sbc sbcVar = this.a;
        return sbcVar instanceof z ? ((z) sbcVar).g() : sbcVar.zzk().zze();
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void zzf(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.w0
    public final void zzg(Object obj, Object obj2) {
        y0.b(this.b, obj, obj2);
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }
}
