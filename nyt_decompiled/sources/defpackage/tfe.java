package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
final class tfe implements ServiceConnection {
    final /* synthetic */ ufe a;

    /* synthetic */ tfe(ufe ufeVar, sfe sfeVar) {
        this.a = ufeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gfe gfeVar;
        gfeVar = this.a.b;
        gfeVar.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new qfe(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gfe gfeVar;
        gfeVar = this.a.b;
        gfeVar.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new rfe(this));
    }
}
