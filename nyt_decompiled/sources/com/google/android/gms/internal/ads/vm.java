package com.google.android.gms.internal.ads;

import defpackage.acd;
import defpackage.hib;
import defpackage.kgf;
import defpackage.l8f;
import defpackage.wff;
import defpackage.xdf;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
final class vm implements xdf {
    private final kgf a;
    private final l8f b;
    private wff c;
    private xdf d;
    private boolean e = true;
    private boolean f;

    public vm(l8f l8fVar, acd acdVar) {
        this.b = l8fVar;
        this.a = new kgf(acdVar);
    }

    public final long a(boolean z) {
        wff wffVar = this.c;
        if (wffVar == null || wffVar.q() || (!this.c.i() && (z || this.c.j()))) {
            this.e = true;
            if (this.f) {
                this.a.b();
            }
        } else {
            xdf xdfVar = this.d;
            xdfVar.getClass();
            long zza = xdfVar.zza();
            if (this.e) {
                if (zza < this.a.zza()) {
                    this.a.c();
                } else {
                    this.e = false;
                    if (this.f) {
                        this.a.b();
                    }
                }
            }
            this.a.a(zza);
            hib zzc = xdfVar.zzc();
            if (!zzc.equals(this.a.zzc())) {
                this.a.e(zzc);
                this.b.a(zzc);
            }
        }
        if (this.e) {
            return this.a.zza();
        }
        xdf xdfVar2 = this.d;
        xdfVar2.getClass();
        return xdfVar2.zza();
    }

    public final void b(wff wffVar) {
        if (wffVar == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public final void c(wff wffVar) {
        xdf xdfVar;
        xdf zzk = wffVar.zzk();
        if (zzk == null || zzk == (xdfVar = this.d)) {
            return;
        }
        if (xdfVar != null) {
            throw zziz.d(new IllegalStateException("Multiple renderer media clocks enabled."), NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        }
        this.d = zzk;
        this.c = wffVar;
        zzk.e(this.a.zzc());
    }

    public final void d(long j) {
        this.a.a(j);
    }

    @Override // defpackage.xdf
    public final void e(hib hibVar) {
        xdf xdfVar = this.d;
        if (xdfVar != null) {
            xdfVar.e(hibVar);
            hibVar = this.d.zzc();
        }
        this.a.e(hibVar);
    }

    public final void f() {
        this.f = true;
        this.a.b();
    }

    public final void g() {
        this.f = false;
        this.a.c();
    }

    @Override // defpackage.xdf
    public final long zza() {
        throw null;
    }

    @Override // defpackage.xdf
    public final hib zzc() {
        xdf xdfVar = this.d;
        return xdfVar != null ? xdfVar.zzc() : this.a.zzc();
    }

    @Override // defpackage.xdf
    public final boolean zzj() {
        if (this.e) {
            return false;
        }
        xdf xdfVar = this.d;
        xdfVar.getClass();
        return xdfVar.zzj();
    }
}
