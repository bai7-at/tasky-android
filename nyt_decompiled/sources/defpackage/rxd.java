package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class rxd {
    public static void a(AtomicReference atomicReference, qxd qxdVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            qxdVar.zza(obj);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            fgb.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
