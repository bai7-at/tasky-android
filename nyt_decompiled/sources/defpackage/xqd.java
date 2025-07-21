package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class xqd implements gqd {
    private final hie a;
    private final Context b;
    private final kke c;
    private final ScheduledExecutorService d;
    private final e9d e;
    private final s1e f;

    xqd(hie hieVar, Context context, kke kkeVar, ScheduledExecutorService scheduledExecutorService, e9d e9dVar, s1e s1eVar) {
        this.a = hieVar;
        this.b = context;
        this.c = kkeVar;
        this.d = scheduledExecutorService;
        this.e = e9dVar;
        this.f = s1eVar;
    }

    final /* synthetic */ j64 a(Throwable th) {
        k8b.c(this.b).b(th, "TopicsSignal.fetchTopicsSignal");
        return zb.h(th instanceof SecurityException ? new zqd("", 2, null) : th instanceof IllegalStateException ? new zqd("", 3, null) : th instanceof IllegalArgumentException ? new zqd("", 4, null) : th instanceof TimeoutException ? new zqd("", 5, null) : new zqd("", 0, null));
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.f.d.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // defpackage.gqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j64 zzb() {
        /*
            r5 = this;
            zoa r0 = defpackage.mpa.U9
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            hie r0 = r5.a
            boolean r0 = r0.B()
            if (r0 == 0) goto L74
            zoa r0 = defpackage.mpa.X9
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            s1e r0 = r5.f
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.d
            int r0 = r0.zzy
            if (r0 == r1) goto L74
        L3a:
            e9d r0 = r5.e
            r1 = 0
            j64 r0 = r0.a(r1)
            zoa r1 = defpackage.mpa.V9
            kpa r2 = defpackage.pla.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            j64 r0 = com.google.android.gms.internal.ads.zb.o(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.vb r0 = com.google.android.gms.internal.ads.vb.C(r0)
            kke r1 = r5.c
            vqd r2 = new defpackage.ake() { // from class: vqd
                static {
                    /*
                        vqd r0 = new vqd
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:vqd) vqd.a vqd
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vqd.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vqd.<init>():void");
                }

                @Override // defpackage.ake
                public final defpackage.j64 zza(java.lang.Object r5) {
                    /*
                        r4 = this;
                        az2 r5 = (defpackage.az2) r5
                        com.google.android.gms.internal.ads.uj r4 = com.google.android.gms.internal.ads.vj.L()
                        java.util.List r5 = r5.a()
                        java.util.Iterator r5 = r5.iterator()
                    Le:
                        boolean r0 = r5.hasNext()
                        if (r0 == 0) goto L3d
                        java.lang.Object r0 = r5.next()
                        zn8 r0 = (defpackage.zn8) r0
                        com.google.android.gms.internal.ads.sj r1 = com.google.android.gms.internal.ads.tj.L()
                        int r2 = r0.c()
                        r1.p(r2)
                        long r2 = r0.a()
                        r1.n(r2)
                        long r2 = r0.b()
                        r1.o(r2)
                        com.google.android.gms.internal.ads.yh r0 = r1.i()
                        com.google.android.gms.internal.ads.tj r0 = (com.google.android.gms.internal.ads.tj) r0
                        r4.n(r0)
                        goto Le
                    L3d:
                        com.google.android.gms.internal.ads.yh r4 = r4.i()
                        com.google.android.gms.internal.ads.vj r4 = (com.google.android.gms.internal.ads.vj) r4
                        byte[] r4 = r4.i()
                        r5 = 1
                        java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
                        zqd r0 = new zqd
                        r1 = 0
                        r0.<init>(r4, r5, r1)
                        j64 r4 = com.google.android.gms.internal.ads.zb.h(r0)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vqd.zza(java.lang.Object):j64");
                }
            }
            j64 r0 = com.google.android.gms.internal.ads.zb.n(r0, r2, r1)
            wqd r1 = new wqd
            r1.<init>()
            kke r5 = r5.c
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            j64 r5 = com.google.android.gms.internal.ads.zb.f(r0, r2, r1, r5)
            return r5
        L74:
            zqd r5 = new zqd
            r0 = -1
            r1 = 0
            java.lang.String r2 = ""
            r5.<init>(r2, r0, r1)
            j64 r5 = com.google.android.gms.internal.ads.zb.h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqd.zzb():j64");
    }
}
