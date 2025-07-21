package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
public final class xza extends u6 {
    private final Context a;
    private final sof b;
    private final q4b c;
    private final String d;
    private final d3b e;
    private fr2 f;

    public xza(Context context, String str) {
        d3b d3bVar = new d3b();
        this.e = d3bVar;
        this.a = context;
        this.d = str;
        this.b = sof.a;
        this.c = kia.a().e(context, new zzq(), str, d3bVar);
    }

    @Override // defpackage.vq3
    public final r07 a() {
        qkc qkcVar = null;
        try {
            q4b q4bVar = this.c;
            if (q4bVar != null) {
                qkcVar = q4bVar.zzk();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        return r07.e(qkcVar);
    }

    @Override // defpackage.vq3
    public final void c(fr2 fr2Var) {
        try {
            this.f = fr2Var;
            q4b q4bVar = this.c;
            if (q4bVar != null) {
                q4bVar.i4(new pma(fr2Var));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.vq3
    public final void d(boolean z) {
        try {
            q4b q4bVar = this.c;
            if (q4bVar != null) {
                q4bVar.I5(z);
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.vq3
    public final void e(Activity activity) {
        if (activity == null) {
            fgb.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            q4b q4bVar = this.c;
            if (q4bVar != null) {
                q4bVar.s5(fc5.l3(activity));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void f(xvc xvcVar, p6 p6Var) {
        try {
            q4b q4bVar = this.c;
            if (q4bVar != null) {
                q4bVar.B3(this.b.a(this.a, xvcVar), new y0f(p6Var, this));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            p6Var.a(new t64(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
