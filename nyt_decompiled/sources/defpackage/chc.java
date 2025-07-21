package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.h;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class chc {
    private final iic a;
    private final wlb b;

    public chc(iic iicVar, wlb wlbVar) {
        this.a = iicVar;
        this.b = wlbVar;
    }

    public static final tfc h(c7e c7eVar) {
        return new tfc(c7eVar, pgb.f);
    }

    public static final tfc i(oic oicVar) {
        return new tfc(oicVar, pgb.f);
    }

    public final View a() {
        wlb wlbVar = this.b;
        if (wlbVar == null) {
            return null;
        }
        return wlbVar.A();
    }

    public final View b() {
        wlb wlbVar = this.b;
        if (wlbVar != null) {
            return wlbVar.A();
        }
        return null;
    }

    public final wlb c() {
        return this.b;
    }

    public final tfc d(Executor executor) {
        final wlb wlbVar = this.b;
        return new tfc(new ecc() { // from class: bhc
            @Override // defpackage.ecc
            public final void zza() {
                h u;
                wlb wlbVar2 = wlb.this;
                if (wlbVar2 == null || (u = wlbVar2.u()) == null) {
                    return;
                }
                u.zzb();
            }
        }, executor);
    }

    public final iic e() {
        return this.a;
    }

    public Set f(t4c t4cVar) {
        return Collections.singleton(new tfc(t4cVar, pgb.f));
    }

    public Set g(t4c t4cVar) {
        return Collections.singleton(new tfc(t4cVar, pgb.f));
    }
}
