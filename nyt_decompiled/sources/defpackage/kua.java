package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class kua {
    private final jua a;
    private final ap4 b;
    private final a79 c = new a79();

    public kua(jua juaVar) {
        Context context;
        this.a = juaVar;
        ap4 ap4Var = null;
        try {
            context = (Context) fc5.Q1(juaVar.zzh());
        } catch (RemoteException | NullPointerException e) {
            fgb.e("", e);
            context = null;
        }
        if (context != null) {
            ap4 ap4Var2 = new ap4(context);
            try {
                if (true == this.a.c0(fc5.l3(ap4Var2))) {
                    ap4Var = ap4Var2;
                }
            } catch (RemoteException e2) {
                fgb.e("", e2);
            }
        }
        this.b = ap4Var;
    }

    public final jua a() {
        return this.a;
    }

    public final String b() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }
}
