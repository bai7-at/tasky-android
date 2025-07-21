package com.nytimes.android.entitlements.di;

import android.app.Application;
import com.nytimes.android.utils.AnalyticsTrackingIdRetriever;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.di.SubauthBridgeModule$provideSubauth$builder$3", f = "SubauthBridgeModule.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthBridgeModule$provideSubauth$builder$3 extends SuspendLambda implements ss2 {
    final /* synthetic */ Application $app;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthBridgeModule$provideSubauth$builder$3(Application application, by0 by0Var) {
        super(1, by0Var);
        this.$app = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthBridgeModule$provideSubauth$builder$3(this.$app, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthBridgeModule$provideSubauth$builder$3) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnalyticsTrackingIdRetriever analyticsTrackingIdRetriever = AnalyticsTrackingIdRetriever.a;
            Application application = this.$app;
            this.label = 1;
            obj = analyticsTrackingIdRetriever.a(application, this);
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
}
