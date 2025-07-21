package com.nytimes.android.eventtracker.buffer;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import com.nytimes.android.eventtracker.worker.EventReporterReceiver;
import defpackage.c44;
import defpackage.d44;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class EventFlushLifecycleObserver implements c44 {
    private final Context a;

    public EventFlushLifecycleObserver(Context context) {
        zq3.h(context, "context");
        this.a = context;
    }

    @k(Lifecycle.Event.ON_PAUSE)
    public final void onPause(d44 d44Var) {
        zq3.h(d44Var, "source");
        Context context = this.a;
        Intent intent = new Intent();
        intent.setClass(this.a, EventReporterReceiver.class);
        context.sendBroadcast(intent);
    }
}
