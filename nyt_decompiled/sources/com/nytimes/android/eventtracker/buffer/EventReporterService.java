package com.nytimes.android.eventtracker.buffer;

import android.app.IntentService;
import android.content.Intent;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.clock.Clock;
import defpackage.k42;

/* loaded from: classes4.dex */
public final class EventReporterService extends IntentService {
    public EventReporterService() {
        super("EventReporterService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        k42.a.e(Clock.a.b());
        EventTracker.a.c();
    }
}
