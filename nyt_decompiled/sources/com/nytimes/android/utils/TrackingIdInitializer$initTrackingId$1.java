package com.nytimes.android.utils;

import android.app.Application;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.ya;
import defpackage.z58;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.TrackingIdInitializer$initTrackingId$1", f = "TrackingIdInitializer.kt", l = {21, 23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TrackingIdInitializer$initTrackingId$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ TrackingIdInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingIdInitializer$initTrackingId$1(TrackingIdInitializer trackingIdInitializer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = trackingIdInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TrackingIdInitializer$initTrackingId$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ya yaVar;
        Application application;
        ya yaVar2;
        z58 z58Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            yaVar = this.this$0.c;
            yaVar.b("unknown-agent-id");
            NYTLogger.s(new Exception("Error while getting identifier.", e));
        }
        if (i == 0) {
            f.b(obj);
            AnalyticsTrackingIdRetriever analyticsTrackingIdRetriever = AnalyticsTrackingIdRetriever.a;
            application = this.this$0.a;
            this.label = 1;
            obj = analyticsTrackingIdRetriever.b(application, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        String str = (String) obj;
        yaVar2 = this.this$0.c;
        yaVar2.b(str);
        z58Var = this.this$0.d;
        this.label = 2;
        if (z58Var.A(str, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TrackingIdInitializer$initTrackingId$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
