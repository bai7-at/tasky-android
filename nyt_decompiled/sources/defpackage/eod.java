package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class eod implements gqd {
    private final kke a;
    private final Context b;
    private final Set c;

    public eod(kke kkeVar, Context context, Set set) {
        this.a = kkeVar;
        this.b = context;
        this.c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ defpackage.fod a() {
        /*
            r2 = this;
            zoa r0 = defpackage.mpa.U4
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            zoa r0 = defpackage.mpa.c5
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r2.c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r2 = r2.b
            fod r0 = new fod
            b9d r1 = defpackage.dyf.a()
            java.lang.String r2 = r1.h(r2)
            r0.<init>(r2)
            return r0
        L56:
            fod r2 = new fod
            r0 = 0
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eod.a():fod");
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 27;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: dod
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eod.this.a();
            }
        });
    }
}
