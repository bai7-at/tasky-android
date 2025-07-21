package com.nytimes.android.mainactivity.banner;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel$subscribeToChannel$1", f = "NotificationsBannerViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsBannerViewModel$subscribeToChannel$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $channelName;
    int label;
    final /* synthetic */ NotificationsBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsBannerViewModel$subscribeToChannel$1(String str, NotificationsBannerViewModel notificationsBannerViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$channelName = str;
        this.this$0 = notificationsBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsBannerViewModel$subscribeToChannel$1(this.$channelName, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        CoroutineDispatcher coroutineDispatcher;
        MutableStateFlow mutableStateFlow2;
        Object h = a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            NYTLogger.h(e);
            mutableStateFlow = this.this$0.g;
            mutableStateFlow.setValue(new u14.a(e));
        }
        if (i == 0) {
            f.b(obj);
            String str = this.$channelName;
            if (str != null) {
                NotificationsBannerViewModel notificationsBannerViewModel = this.this$0;
                Set d = b0.d(str);
                coroutineDispatcher = notificationsBannerViewModel.d;
                NotificationsBannerViewModel$subscribeToChannel$1$1$1 notificationsBannerViewModel$subscribeToChannel$1$1$1 = new NotificationsBannerViewModel$subscribeToChannel$1$1$1(notificationsBannerViewModel, d, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, notificationsBannerViewModel$subscribeToChannel$1$1$1, this);
                if (obj == h) {
                    return h;
                }
            }
            mutableStateFlow2 = this.this$0.g;
            mutableStateFlow2.setValue(new u14.c(cc0.a(true)));
            this.this$0.r();
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow2 = this.this$0.g;
        mutableStateFlow2.setValue(new u14.c(cc0.a(true)));
        this.this$0.r();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsBannerViewModel$subscribeToChannel$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
