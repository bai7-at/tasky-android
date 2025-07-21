package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccx;

/* loaded from: classes3.dex */
public final class f8b {
    private static oeb e;
    private final Context a;
    private final AdFormat b;
    private final xvc c;
    private final String d;

    public f8b(Context context, AdFormat adFormat, xvc xvcVar, String str) {
        this.a = context;
        this.b = adFormat;
        this.c = xvcVar;
        this.d = str;
    }

    public static oeb a(Context context) {
        oeb oebVar;
        synchronized (f8b.class) {
            try {
                if (e == null) {
                    e = kia.a().n(context, new d3b());
                }
                oebVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oebVar;
    }

    public final void b(jb6 jb6Var) {
        zzl a;
        oeb a2 = a(this.a);
        if (a2 == null) {
            jb6Var.a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.a;
        xvc xvcVar = this.c;
        ee3 l3 = fc5.l3(context);
        if (xvcVar == null) {
            a = new dff().a();
        } else {
            a = sof.a.a(this.a, xvcVar);
        }
        try {
            a2.p5(l3, new zzccx(this.d, this.b.name(), null, a), new e8b(this, jb6Var));
        } catch (RemoteException unused) {
            jb6Var.a("Internal Error.");
        }
    }
}
