package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class adb extends q17 {
    private final String a;
    private final ccb b;
    private final Context c;
    private final ycb d = new ycb();

    public adb(Context context, String str) {
        this.a = str;
        this.c = context.getApplicationContext();
        this.b = kia.a().m(context, str, new d3b());
    }

    @Override // defpackage.q17
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

    @Override // defpackage.q17
    public final void c(Activity activity, bg5 bg5Var) {
        this.d.w6(bg5Var);
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

    public final void d(xvc xvcVar, r17 r17Var) {
        try {
            ccb ccbVar = this.b;
            if (ccbVar != null) {
                ccbVar.K1(sof.a.a(this.c, xvcVar), new zcb(r17Var, this));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }
}
