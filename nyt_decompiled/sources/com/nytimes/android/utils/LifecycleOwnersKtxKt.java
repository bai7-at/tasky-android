package com.nytimes.android.utils;

import androidx.lifecycle.Lifecycle;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class LifecycleOwnersKtxKt {
    public static final Flow a(Lifecycle lifecycle) {
        zq3.h(lifecycle, "<this>");
        return FlowKt.callbackFlow(new LifecycleOwnersKtxKt$eventsAsFlow$1(lifecycle, null));
    }
}
