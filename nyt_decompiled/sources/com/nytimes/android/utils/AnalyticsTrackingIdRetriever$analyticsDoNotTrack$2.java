package com.nytimes.android.utils;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2", f = "AnalyticsTrackingIdRetriever.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Application $application;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2(Application application, by0 by0Var) {
        super(2, by0Var);
        this.$application = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2(this.$application, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            z = AdvertisingIdClient.getAdvertisingIdInfo(this.$application).isLimitAdTrackingEnabled();
        } catch (Throwable th) {
            NYTLogger.g("Error obtaining advertising do-not-track, returning false", th);
            z = false;
        }
        return cc0.a(z);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
