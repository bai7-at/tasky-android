package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class drd implements gqd {
    private final Context a;
    private final ScheduledExecutorService b;
    private final Executor c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final bfb g;

    drd(bfb bfbVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.g = bfbVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executor;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        defpackage.dyf.q().w(r7, "AdIdInfoSignalSource.getPaidV1");
        r0 = new defpackage.mde();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.S2)).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.R2)).booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r1 = defpackage.pde.k(r7.a);
        java.util.Objects.requireNonNull(r8);
        r2 = r8.getId();
        java.util.Objects.requireNonNull(r2);
        r0 = r1.j(r2, r7.a.getPackageName(), ((java.lang.Long) defpackage.pla.c().a(defpackage.mpa.Y2)).longValue(), r7.f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ defpackage.erd a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            mde r0 = new mde
            r0.<init>()
            boolean r1 = r7.e
            if (r1 != 0) goto L1b
            zoa r1 = defpackage.mpa.R2
            kpa r2 = defpackage.pla.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.e
            if (r1 == 0) goto L6d
            zoa r1 = defpackage.mpa.S2
            kpa r2 = defpackage.pla.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6d
        L31:
            android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L5e
            pde r1 = defpackage.pde.k(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r8.getId()     // Catch: java.lang.Throwable -> L5e
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L5e
            android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.Throwable -> L5e
            zoa r0 = defpackage.mpa.Y2     // Catch: java.lang.Throwable -> L5e
            kpa r4 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L5e
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r7.f     // Catch: java.lang.Throwable -> L5e
            mde r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L5e
            goto L6d
        L5e:
            r7 = move-exception
            java.lang.String r0 = "AdIdInfoSignalSource.getPaidV1"
            kfb r1 = defpackage.dyf.q()
            r1.w(r7, r0)
            mde r0 = new mde
            r0.<init>()
        L6d:
            erd r7 = new erd
            r1 = 0
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.a(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):erd");
    }

    final /* synthetic */ erd b(Throwable th) {
        kia.b();
        ContentResolver contentResolver = this.a.getContentResolver();
        return new erd(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new mde());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 40;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if (!((Boolean) pla.c().a(mpa.U0)).booleanValue()) {
            return zb.g(new Exception("Did not ad Ad ID into query param."));
        }
        return zb.e((vb) zb.o(zb.m(vb.C(this.g.a(this.a, this.d)), new gge() { // from class: brd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return drd.this.a((AdvertisingIdClient.Info) obj);
            }
        }, this.c), ((Long) pla.c().a(mpa.V0)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new gge() { // from class: crd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return drd.this.b((Throwable) obj);
            }
        }, this.c);
    }
}
