package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.p15;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class s6b extends p15.a {
    private final List a = new ArrayList();
    private String b;

    public s6b(fta ftaVar) {
        try {
            this.b = ftaVar.zzg();
        } catch (RemoteException e) {
            fgb.e("", e);
            this.b = "";
        }
        try {
            for (Object obj : ftaVar.zzh()) {
                mta w6 = obj instanceof IBinder ? lta.w6((IBinder) obj) : null;
                if (w6 != null) {
                    this.a.add(new y6b(w6));
                }
            }
        } catch (RemoteException e2) {
            fgb.e("", e2);
        }
    }
}
