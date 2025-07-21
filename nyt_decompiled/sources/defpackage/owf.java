package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class owf extends BroadcastReceiver {
    final /* synthetic */ wxf a;

    /* synthetic */ owf(wxf wxfVar, vuf vufVar) {
        this.a = wxfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.e = false;
        }
    }
}
