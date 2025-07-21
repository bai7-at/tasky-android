package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.h94;
import defpackage.mj9;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = h94.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        h94.e().a(a, "Requesting diagnostics");
        try {
            mj9.g(context).c(c.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            h94.e().d(a, "WorkManager is not initialized", e);
        }
    }
}
