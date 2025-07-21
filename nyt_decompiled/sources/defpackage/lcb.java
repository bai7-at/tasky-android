package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class lcb extends o17 {
    private final String a;
    private final ccb b;
    private final Context c;
    private final ycb d = new ycb();

    public lcb(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = kia.a().m(context, str, new d3b());
    }

    @Override // defpackage.o17
    public final r07 a() {
        qkc qkcVar = null;
        try {
            ccb ccbVar = this.b;
            if (ccbVar != null) {
                qkcVar = ccbVar.zzc();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
        return r07.e(qkcVar);
    }

    @Override // defpackage.o17
    public final void c(Activity activity, bg5 bg5Var) {
        this.d.w6(bg5Var);
        if (activity == null) {
            fgb.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ccb ccbVar = this.b;
            if (ccbVar != null) {
                ccbVar.i2(this.d);
                this.b.zzm(fc5.l3(activity));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void d(xvc xvcVar, p17 p17Var) {
        try {
            ccb ccbVar = this.b;
            if (ccbVar != null) {
                ccbVar.p1(sof.a.a(this.c, xvcVar), new vcb(p17Var, this));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }
}
