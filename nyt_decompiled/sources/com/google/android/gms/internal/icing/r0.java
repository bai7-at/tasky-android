package com.google.android.gms.internal.icing;

import defpackage.i4d;

/* loaded from: classes3.dex */
final class r0 implements y0 {
    private final i4d a;
    private final d1 b;
    private final boolean c;
    private final t d;

    private r0(d1 d1Var, t tVar, i4d i4dVar) {
        this.b = d1Var;
        this.c = tVar.a(i4dVar);
        this.d = tVar;
        this.a = i4dVar;
    }

    static r0 f(d1 d1Var, t tVar, i4d i4dVar) {
        return new r0(d1Var, tVar, i4dVar);
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void a(Object obj) {
        this.b.c(obj);
        this.d.c(obj);
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final int b(Object obj) {
        d1 d1Var = this.b;
        int e = d1Var.e(d1Var.b(obj));
        if (!this.c) {
            return e;
        }
        this.d.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void c(Object obj, s sVar) {
        this.d.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final void d(Object obj, Object obj2) {
        a1.f(this.b, obj, obj2);
        if (this.c) {
            a1.e(this.d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final boolean e(Object obj, Object obj2) {
        if (!this.b.b(obj).equals(this.b.b(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.b(obj);
        this.d.b(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final int zzb(Object obj) {
        int hashCode = this.b.b(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.y0
    public final boolean zzf(Object obj) {
        this.d.b(obj);
        throw null;
    }
}
