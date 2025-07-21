package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q2e {
    private static q2e d;
    private final Context a;
    private final tnb b;
    private final AtomicReference c = new AtomicReference();

    q2e(Context context, tnb tnbVar) {
        this.a = context;
        this.b = tnbVar;
    }

    static tnb a(Context context) {
        try {
            return pmb.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            fgb.e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static q2e d(Context context) {
        synchronized (q2e.class) {
            try {
                q2e q2eVar = d;
                if (q2eVar != null) {
                    return q2eVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) xra.b.e()).longValue();
                tnb tnbVar = null;
                if (longValue > 0 && longValue <= 240304702) {
                    tnbVar = a(applicationContext);
                }
                q2e q2eVar2 = new q2e(applicationContext, tnbVar);
                d = q2eVar2;
                return q2eVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final zzen g() {
        tnb tnbVar = this.b;
        if (tnbVar != null) {
            try {
                return tnbVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final h3b b() {
        return (h3b) this.c.get();
    }

    public final zzcei c(int i, boolean z, int i2) {
        zzen g;
        dyf.r();
        boolean d2 = wxf.d(this.a);
        zzcei zzceiVar = new zzcei(240304000, i2, true, d2);
        return (((Boolean) xra.c.e()).booleanValue() && (g = g()) != null) ? new zzcei(240304000, g.zza(), true, d2) : zzceiVar;
    }

    public final String e() {
        zzen g = g();
        if (g != null) {
            return g.t0();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.h3b r3) {
        /*
            r2 = this;
            cra r0 = defpackage.xra.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            tnb r0 = r2.b
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            h3b r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r2.c
            if (r0 == 0) goto L1e
            r3 = r0
        L1e:
            defpackage.p2e.a(r2, r1, r3)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r2 = r2.c
            defpackage.p2e.a(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2e.f(h3b):void");
    }
}
