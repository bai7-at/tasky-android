package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzeir;

/* loaded from: classes3.dex */
final class hfd implements m8c {
    boolean a = false;
    final /* synthetic */ j9d b;
    final /* synthetic */ ugb c;
    final /* synthetic */ ifd d;

    hfd(ifd ifdVar, j9d j9dVar, ugb ugbVar) {
        this.b = j9dVar;
        this.c = ugbVar;
        this.d = ifdVar;
    }

    private final synchronized void b(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) pla.c().a(mpa.s5)).booleanValue()) {
            i = 3;
        }
        this.c.d(new zzeir(i, zzeVar));
    }

    @Override // defpackage.m8c
    public final synchronized void a(int i, String str) {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (str == null) {
                str = ifd.e(this.b.a, i);
            }
            b(new zze(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.m8c
    public final synchronized void h0(zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(zzeVar);
    }

    @Override // defpackage.m8c
    public final synchronized void zza(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(new zze(i, ifd.e(this.b.a, i), "undefined", null, null));
    }

    @Override // defpackage.m8c
    public final synchronized void zzd() {
        this.c.c(null);
    }
}
