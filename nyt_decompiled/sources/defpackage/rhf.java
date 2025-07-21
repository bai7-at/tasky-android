package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* loaded from: classes3.dex */
final class rhf extends s8f {
    final /* synthetic */ txf b;

    rhf(txf txfVar) {
        this.b = txfVar;
    }

    @Override // defpackage.s8f
    public final void a() {
        IInterface iInterface;
        n6f n6fVar;
        Context context;
        ServiceConnection serviceConnection;
        txf txfVar = this.b;
        iInterface = txfVar.m;
        if (iInterface != null) {
            n6fVar = txfVar.b;
            n6fVar.d("Unbind from service.", new Object[0]);
            txf txfVar2 = this.b;
            context = txfVar2.a;
            serviceConnection = txfVar2.l;
            context.unbindService(serviceConnection);
            this.b.g = false;
            this.b.m = null;
            this.b.l = null;
        }
        this.b.t();
    }
}
