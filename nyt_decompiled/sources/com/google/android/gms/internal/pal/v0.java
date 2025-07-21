package com.google.android.gms.internal.pal;

import defpackage.ev9;
import defpackage.lh4;
import defpackage.zx9;

/* loaded from: classes3.dex */
final class v0 implements d1 {
    private final zx9 a;
    private final i1 b;
    private final boolean c;
    private final v d;

    private v0(i1 i1Var, v vVar, zx9 zx9Var) {
        this.b = i1Var;
        this.c = vVar.h(zx9Var);
        this.d = vVar;
        this.a = zx9Var;
    }

    static v0 d(i1 i1Var, v vVar, zx9 zx9Var) {
        return new v0(i1Var, vVar, zx9Var);
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void a(Object obj, byte[] bArr, int i, int i2, g gVar) {
        c0 c0Var = (c0) obj;
        if (c0Var.zzc == j1.c()) {
            c0Var.zzc = j1.e();
        }
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void b(Object obj, c1 c1Var, ev9 ev9Var) {
        boolean zzO;
        i1 i1Var = this.b;
        v vVar = this.d;
        Object c = i1Var.c(obj);
        vVar.b(obj);
        while (c1Var.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = c1Var.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object c2 = vVar.c(ev9Var, this.a, zzd >>> 3);
                        if (c2 != null) {
                            vVar.f(c1Var, c2, ev9Var, null);
                        } else {
                            zzO = i1Var.q(c, c1Var);
                        }
                    } else {
                        zzO = c1Var.zzO();
                    }
                    if (!zzO) {
                        i1Var.n(obj, c);
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj2 = null;
                    zzaby zzabyVar = null;
                    while (c1Var.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = c1Var.zzd();
                        if (zzd2 == 16) {
                            i = c1Var.zzj();
                            obj2 = vVar.c(ev9Var, this.a, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                vVar.f(c1Var, obj2, ev9Var, null);
                            } else {
                                zzabyVar = c1Var.zzp();
                            }
                        } else if (!c1Var.zzO()) {
                            break;
                        }
                    }
                    if (c1Var.zzd() != 12) {
                        throw zzadi.b();
                    }
                    if (zzabyVar != null) {
                        if (obj2 != null) {
                            vVar.g(zzabyVar, obj2, ev9Var, null);
                        } else {
                            i1Var.k(c, i, zzabyVar);
                        }
                    }
                }
            } catch (Throwable th) {
                i1Var.n(obj, c);
                throw th;
            }
        }
        i1Var.n(obj, c);
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void c(Object obj, v1 v1Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final int zza(Object obj) {
        i1 i1Var = this.b;
        int b = i1Var.b(i1Var.d(obj));
        if (!this.c) {
            return b;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final int zzb(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final Object zze() {
        return this.a.y().t0();
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void zzf(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final void zzg(Object obj, Object obj2) {
        f1.f(this.b, obj, obj2);
        if (this.c) {
            f1.e(this.d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.d1
    public final boolean zzk(Object obj, Object obj2) {
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

    @Override // com.google.android.gms.internal.pal.d1
    public final boolean zzl(Object obj) {
        this.d.a(obj);
        throw null;
    }
}
