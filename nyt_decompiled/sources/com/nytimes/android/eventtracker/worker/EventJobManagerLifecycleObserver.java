package com.nytimes.android.eventtracker.worker;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import com.nytimes.android.eventtracker.EventTracker;
import defpackage.c44;
import defpackage.d44;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class EventJobManagerLifecycleObserver implements c44 {
    @k(Lifecycle.Event.ON_PAUSE)
    public final void onPause(d44 d44Var) {
        zq3.h(d44Var, "source");
        EventTracker.a.a();
    }

    @k(Lifecycle.Event.ON_START)
    public final void onStart(d44 d44Var) {
        zq3.h(d44Var, "source");
        EventTracker.a.b();
    }
}
