package defpackage;

import com.google.android.gms.internal.ads.zzgpl;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ste {
    private static final ste b = (ste) zzgpl.a(new ave() { // from class: qte
        @Override // defpackage.ave
        public final Object zza() {
            ste steVar = new ste();
            steVar.h(new vse(bte.class, lue.class, new wse() { // from class: rte
                @Override // defpackage.wse
                public final sue a(ble bleVar, dme dmeVar) {
                    return ((bte) bleVar).a(dmeVar);
                }
            }));
            return steVar;
        }
    });
    private final AtomicReference a = new AtomicReference(new zue(new tue(), null));

    public static ste d() {
        return b;
    }

    public final ble a(sue sueVar, dme dmeVar) {
        return ((zue) this.a.get()).a(sueVar, dmeVar);
    }

    public final ble b(lue lueVar, dme dmeVar) {
        return !((zue) this.a.get()).i(lueVar) ? new bte(lueVar, dmeVar) : a(lueVar, dmeVar);
    }

    public final ple c(sue sueVar) {
        return ((zue) this.a.get()).b(sueVar);
    }

    public final sue e(ble bleVar, Class cls, dme dmeVar) {
        return ((zue) this.a.get()).c(bleVar, cls, dmeVar);
    }

    public final sue f(ple pleVar, Class cls) {
        return ((zue) this.a.get()).d(pleVar, cls);
    }

    public final synchronized void g(use useVar) {
        tue tueVar = new tue((zue) this.a.get());
        tueVar.a(useVar);
        this.a.set(new zue(tueVar, null));
    }

    public final synchronized void h(yse yseVar) {
        tue tueVar = new tue((zue) this.a.get());
        tueVar.b(yseVar);
        this.a.set(new zue(tueVar, null));
    }

    public final synchronized void i(wte wteVar) {
        tue tueVar = new tue((zue) this.a.get());
        tueVar.c(wteVar);
        this.a.set(new zue(tueVar, null));
    }

    public final synchronized void j(aue aueVar) {
        tue tueVar = new tue((zue) this.a.get());
        tueVar.d(aueVar);
        this.a.set(new zue(tueVar, null));
    }

    public final boolean k(sue sueVar) {
        return ((zue) this.a.get()).j(sueVar);
    }
}
