package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
final class tia extends BroadcastReceiver {
    final /* synthetic */ wia a;

    tia(wia wiaVar) {
        this.a = wiaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.l(3);
    }
}
