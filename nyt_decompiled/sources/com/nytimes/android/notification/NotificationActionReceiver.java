package com.nytimes.android.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.x25;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NotificationActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        NotificationParsingJobService.Companion.a(context, intent);
        x25.a(context);
    }
}
