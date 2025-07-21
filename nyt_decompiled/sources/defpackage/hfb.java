package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class hfb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ kfb a;

    hfb(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.o;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.o;
        atomicBoolean.set(false);
    }
}
