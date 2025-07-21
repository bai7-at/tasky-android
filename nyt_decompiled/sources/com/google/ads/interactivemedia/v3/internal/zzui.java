package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Future;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
abstract class zzui extends zzuo {
    private static final Logger zza = Logger.getLogger(zzui.class.getName());
    private zzsk zzc;

    zzui(zzsk zzskVar, boolean z, boolean z2) {
        super(zzskVar.size());
        this.zzc = zzskVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    protected final String zza() {
        zzsk zzskVar = this.zzc;
        return zzskVar != null ? "futures=".concat(zzskVar.toString()) : super.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    protected final void zzb() {
        zzsk zzskVar = this.zzc;
        zzr(1);
        if ((zzskVar != null) && isCancelled()) {
            boolean zzo = zzo();
            zztx listIterator = ((zzso) zzskVar).listIterator(0);
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(zzo);
            }
        }
    }

    abstract void zzp();

    final void zzq() {
        zzsk zzskVar = this.zzc;
        zzskVar.getClass();
        if (zzskVar.isEmpty()) {
            zzp();
            return;
        }
        final zzsk zzskVar2 = null;
        Runnable runnable = new Runnable(zzskVar2) { // from class: com.google.ads.interactivemedia.v3.internal.zzuh
            @Override // java.lang.Runnable
            public final void run() {
                zzui zzuiVar = zzui.this;
                int zzt = zzuiVar.zzt();
                zzrm.zzh(zzt >= 0, "Less than 0 remaining futures");
                if (zzt == 0) {
                    zzuiVar.zzv();
                    zzuiVar.zzp();
                    zzuiVar.zzr(2);
                }
            }
        };
        zztx listIterator = ((zzso) this.zzc).listIterator(0);
        while (listIterator.hasNext()) {
            ((zzvq) listIterator.next()).zzm(runnable, zzus.INSTANCE);
        }
    }

    void zzr(int i) {
        this.zzc = null;
    }
}
