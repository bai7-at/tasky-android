package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
final class mwf implements ServiceConnection {
    final /* synthetic */ txf a;

    /* synthetic */ mwf(txf txfVar, tuf tufVar) {
        this.a = txfVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n6f n6fVar;
        n6fVar = this.a.b;
        n6fVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        txf txfVar = this.a;
        txfVar.c().post(new rof(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n6f n6fVar;
        n6fVar = this.a.b;
        n6fVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        txf txfVar = this.a;
        txfVar.c().post(new csf(this));
    }
}
