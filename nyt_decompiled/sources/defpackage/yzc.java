package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
final class yzc extends BroadcastReceiver {
    final /* synthetic */ a1d a;

    yzc(a1d a1dVar) {
        this.a = a1dVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.h();
    }
}
