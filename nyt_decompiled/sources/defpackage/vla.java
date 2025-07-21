package defpackage;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vla extends rm {
    private final zla a;
    private final String b;
    private final wla c = new wla();

    public vla(zla zlaVar, String str) {
        this.a = zlaVar;
        this.b = str;
    }

    @Override // defpackage.rm
    public final r07 a() {
        qkc qkcVar;
        try {
            qkcVar = this.a.zzf();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
            qkcVar = null;
        }
        return r07.e(qkcVar);
    }

    @Override // defpackage.rm
    public final void c(Activity activity) {
        try {
            this.a.q2(fc5.l3(activity), this.c);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }
}
