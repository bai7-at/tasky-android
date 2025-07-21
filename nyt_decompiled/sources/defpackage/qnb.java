package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class qnb extends BroadcastReceiver {
    final /* synthetic */ xob a;

    qnb(xob xobVar) {
        this.a = xobVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.e(context, intent);
    }
}
