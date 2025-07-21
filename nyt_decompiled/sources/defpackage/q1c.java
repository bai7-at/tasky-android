package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class q1c {
    private final String a;
    private final m0c b;

    public q1c(m0c m0cVar) {
        String str;
        this.b = m0cVar;
        try {
            str = m0cVar.zze();
        } catch (RemoteException e) {
            fgb.e("", e);
            str = null;
        }
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
