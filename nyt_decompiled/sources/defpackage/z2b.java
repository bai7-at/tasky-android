package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class z2b {
    private static z2b b;
    private final AtomicBoolean a = new AtomicBoolean(false);

    z2b() {
    }

    public static z2b a() {
        if (b == null) {
            b = new z2b();
        }
        return b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: y2b
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                mpa.a(context2);
                if (((Boolean) pla.c().a(mpa.t0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) pla.c().a(mpa.h0)).booleanValue());
                if (((Boolean) pla.c().a(mpa.o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((znb) igb.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new hgb() { // from class: x2b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.hgb
                        public final Object zza(Object obj) {
                            return ynb.w6(obj);
                        }
                    })).n6(fc5.l3(context2), new w2b(qm.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcef | NullPointerException e) {
                    fgb.i("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
