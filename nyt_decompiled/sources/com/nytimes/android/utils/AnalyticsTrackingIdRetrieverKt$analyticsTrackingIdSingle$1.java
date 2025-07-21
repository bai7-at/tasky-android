package com.nytimes.android.utils;

import android.app.Application;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1", f = "AnalyticsTrackingIdRetriever.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Application $app;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1(Application application, by0 by0Var) {
        super(2, by0Var);
        this.$app = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1(this.$app, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnalyticsTrackingIdRetriever analyticsTrackingIdRetriever = AnalyticsTrackingIdRetriever.a;
            Application application = this.$app;
            this.label = 1;
            obj = analyticsTrackingIdRetriever.b(application, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnalyticsTrackingIdRetrieverKt$analyticsTrackingIdSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
