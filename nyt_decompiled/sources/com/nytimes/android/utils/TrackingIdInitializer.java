package com.nytimes.android.utils;

import android.app.Application;
import defpackage.ya;
import defpackage.z58;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class TrackingIdInitializer {
    private final Application a;
    private final CoroutineScope b;
    private final ya c;
    private final z58 d;

    public TrackingIdInitializer(Application application, CoroutineScope coroutineScope, ya yaVar, z58 z58Var) {
        zq3.h(application, "app");
        zq3.h(coroutineScope, "applicationScope");
        zq3.h(yaVar, "agentIdWrapper");
        zq3.h(z58Var, "subauthClient");
        this.a = application;
        this.b = coroutineScope;
        this.c = yaVar;
        this.d = z58Var;
    }

    public final void d() {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new TrackingIdInitializer$initTrackingId$1(this, null), 3, null);
    }
}
