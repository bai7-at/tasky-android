package defpackage;

import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class q9c extends ldc implements t7c, c9c {
    private final v0e b;
    private final AtomicBoolean c;

    public q9c(Set set, v0e v0eVar) {
        super(set);
        this.c = new AtomicBoolean();
        this.b = v0eVar;
    }

    private final void zzb() {
        zzs zzsVar;
        if (((Boolean) pla.c().a(mpa.H7)).booleanValue() && this.c.compareAndSet(false, true) && (zzsVar = this.b.f0) != null && zzsVar.zza == 3) {
            G0(new kdc() { // from class: p9c
                @Override // defpackage.kdc
                public final void zza(Object obj) {
                    q9c.this.M0((s9c) obj);
                }
            });
        }
    }

    final /* synthetic */ void M0(s9c s9cVar) {
        s9cVar.a(this.b.f0);
    }

    @Override // defpackage.c9c
    public final void zzg() {
        if (this.b.b == 1) {
            zzb();
        }
    }

    @Override // defpackage.t7c
    public final void zzq() {
        int i = this.b.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
