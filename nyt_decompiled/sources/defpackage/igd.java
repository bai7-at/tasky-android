package defpackage;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class igd {
    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private final msc b;

    public igd(msc mscVar) {
        this.b = mscVar;
    }

    public final o5b a(String str) {
        if (this.a.containsKey(str)) {
            return (o5b) this.a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.a.put(str, this.b.b(str));
        } catch (RemoteException e) {
            fgb.e("Couldn't create RTB adapter : ", e);
        }
    }
}
