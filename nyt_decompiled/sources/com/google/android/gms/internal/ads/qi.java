package com.google.android.gms.internal.ads;

import defpackage.lh4;
import defpackage.w1f;

/* loaded from: classes3.dex */
final class qi implements bj {
    private final w1f a;
    private final fj b;
    private final boolean c;
    private final qh d;

    private qi(fj fjVar, qh qhVar, w1f w1fVar) {
        this.b = fjVar;
        this.c = qhVar.h(w1fVar);
        this.d = qhVar;
        this.a = w1fVar;
    }

    static qi f(fj fjVar, qh qhVar, w1f w1fVar) {
        return new qi(fjVar, qhVar, w1fVar);
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final boolean a(Object obj, Object obj2) {
        fj fjVar = this.b;
        if (!fjVar.d(obj).equals(fjVar.d(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(obj);
        this.d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final boolean b(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void c(Object obj, byte[] bArr, int i, int i2, vg vgVar) {
        yh yhVar = (yh) obj;
        if (yhVar.zzc == gj.c()) {
            yhVar.zzc = gj.f();
        }
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void d(Object obj, xi xiVar, ph phVar) {
        boolean zzO;
        fj fjVar = this.b;
        Object c = fjVar.c(obj);
        qh qhVar = this.d;
        qhVar.b(obj);
        while (xiVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = xiVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object c2 = qhVar.c(phVar, this.a, zzd >>> 3);
                        if (c2 != null) {
                            qhVar.f(xiVar, c2, phVar, null);
                        } else {
                            zzO = fjVar.p(c, xiVar);
                        }
                    } else {
                        zzO = xiVar.zzO();
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    int i = 0;
                    Object obj2 = null;
                    zzgyl zzgylVar = null;
                    while (xiVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = xiVar.zzd();
                        if (zzd2 == 16) {
                            i = xiVar.zzj();
                            obj2 = qhVar.c(phVar, this.a, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                qhVar.f(xiVar, obj2, phVar, null);
                            } else {
                                zzgylVar = xiVar.zzp();
                            }
                        } else if (!xiVar.zzO()) {
                            break;
                        }
                    }
                    if (xiVar.zzd() != 12) {
                        throw zzhag.b();
                    }
                    if (zzgylVar != null) {
                        if (obj2 != null) {
                            qhVar.g(zzgylVar, obj2, phVar, null);
                        } else {
                            fjVar.k(c, i, zzgylVar);
                        }
                    }
                }
            } finally {
                fjVar.n(obj, c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void e(Object obj, mh mhVar) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final int zza(Object obj) {
        fj fjVar = this.b;
        int b = fjVar.b(fjVar.d(obj));
        if (!this.c) {
            return b;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final int zzb(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final Object zze() {
        w1f w1fVar = this.a;
        return w1fVar instanceof yh ? ((yh) w1fVar).n() : w1fVar.c().H0();
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzf(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzg(Object obj, Object obj2) {
        dj.x(this.b, obj, obj2);
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }
}
