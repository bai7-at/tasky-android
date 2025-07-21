package com.instacart.library.truetime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public class BootCompletedBroadcastReceiver extends BroadcastReceiver {
    private static final String a = "BootCompletedBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.b(a, "---- clearing TrueTime disk cache as we've detected a boot");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            d.d();
        }
    }
}
