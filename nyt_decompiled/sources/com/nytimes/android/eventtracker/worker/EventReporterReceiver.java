package com.nytimes.android.eventtracker.worker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.buffer.EventReporterService;
import defpackage.ul8;

/* loaded from: classes4.dex */
public final class EventReporterReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ul8.a.z("ET2").t("EventReporterReceiver, starting EventReporter", new Object[0]);
        try {
            Intent intent2 = new Intent(context, (Class<?>) EventReporterService.class);
            if (context != null) {
                context.startService(intent2);
            }
        } catch (Exception e) {
            ul8.a.z("ET2").f(e, "Start EventReporterService failed", new Object[0]);
            EventTracker.a.f();
        }
    }
}
