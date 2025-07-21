package defpackage;

import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class l4e {
    private final e4e a;
    private final j64 b;
    private boolean c = false;
    private boolean d = false;

    public l4e(final i3e i3eVar, final d4e d4eVar, final e4e e4eVar) {
        this.a = e4eVar;
        this.b = zb.f(zb.n(d4eVar.b(e4eVar), new ake() { // from class: j4e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return l4e.this.b(d4eVar, i3eVar, e4eVar, (s3e) obj);
            }
        }, e4eVar.zzb()), Exception.class, new ake() { // from class: k4e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return l4e.this.c(d4eVar, (Exception) obj);
            }
        }, e4eVar.zzb());
    }

    public final synchronized j64 a(e4e e4eVar) {
        if (!this.d && !this.c && this.a.zza() != null && e4eVar.zza() != null && this.a.zza().equals(e4eVar.zza())) {
            this.c = true;
            return this.b;
        }
        return null;
    }

    final /* synthetic */ j64 b(d4e d4eVar, i3e i3eVar, e4e e4eVar, s3e s3eVar) {
        synchronized (this) {
            try {
                this.d = true;
                d4eVar.a(s3eVar);
                if (this.c) {
                    return zb.h(new c4e(s3eVar, e4eVar));
                }
                i3eVar.c(e4eVar.zza(), s3eVar);
                return zb.h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ j64 c(d4e d4eVar, Exception exc) {
        synchronized (this) {
            this.d = true;
            throw exc;
        }
    }

    public final synchronized void d(gke gkeVar) {
        zb.r(zb.n(this.b, new ake() { // from class: i4e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.i();
            }
        }, this.a.zzb()), gkeVar, this.a.zzb());
    }
}
