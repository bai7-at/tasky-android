package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ifd implements g9d {
    private final i9d a;
    private final l9d b;
    private final s6 c;
    private final kke d;

    public ifd(s6 s6Var, kke kkeVar, i9d i9dVar, l9d l9dVar) {
        this.c = s6Var;
        this.d = kkeVar;
        this.b = l9dVar;
        this.a = i9dVar;
    }

    static final String e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        final j9d j9dVar;
        Iterator it2 = v0eVar.u.iterator();
        while (true) {
            if (!it2.hasNext()) {
                j9dVar = null;
                break;
            }
            try {
                j9dVar = this.a.a((String) it2.next(), v0eVar.w);
                break;
            } catch (zzfho unused) {
            }
        }
        if (j9dVar == null) {
            return zb.g(new zzelp("Unable to instantiate mediation adapter class."));
        }
        ugb ugbVar = new ugb();
        j9dVar.c.l3(new hfd(this, j9dVar, ugbVar));
        if (v0eVar.N) {
            Bundle bundle = g1eVar.a.a.d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        s6 s6Var = this.c;
        return m5e.d(new g5e() { // from class: ffd
            @Override // defpackage.g5e
            public final void zza() {
                ifd.this.d(g1eVar, v0eVar, j9dVar);
            }
        }, this.d, zzflg.ADAPTER_LOAD_AD_SYN, s6Var).b(zzflg.ADAPTER_LOAD_AD_ACK).d(ugbVar).b(zzflg.ADAPTER_WRAP_ADAPTER).e(new f5e() { // from class: gfd
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                return ifd.this.c(g1eVar, v0eVar, j9dVar, (Void) obj);
            }
        }).a();
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        return !v0eVar.u.isEmpty();
    }

    final /* synthetic */ Object c(g1e g1eVar, v0e v0eVar, j9d j9dVar, Void r4) {
        return this.b.a(g1eVar, v0eVar, j9dVar);
    }

    final /* synthetic */ void d(g1e g1eVar, v0e v0eVar, j9d j9dVar) {
        this.b.b(g1eVar, v0eVar, j9dVar);
    }
}
