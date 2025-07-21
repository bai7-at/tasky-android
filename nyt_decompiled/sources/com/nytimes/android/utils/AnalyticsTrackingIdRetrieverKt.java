package com.nytimes.android.utils;

import android.app.Application;
import defpackage.zq3;
import io.reactivex.Single;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public abstract class AnalyticsTrackingIdRetrieverKt {
    public static final Single a(Application application) {
        zq3.h(application, "<this>");
        return RxSingleKt.rxSingle$default(null, new AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1(application, null), 1, null);
    }
}
