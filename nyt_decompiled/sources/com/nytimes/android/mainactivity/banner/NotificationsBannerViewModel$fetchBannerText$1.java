package com.nytimes.android.mainactivity.banner;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel$fetchBannerText$1", f = "NotificationsBannerViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsBannerViewModel$fetchBannerText$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ NotificationsBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsBannerViewModel$fetchBannerText$1(NotificationsBannerViewModel notificationsBannerViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = notificationsBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsBannerViewModel$fetchBannerText$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        FeedStore feedStore;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                feedStore = this.this$0.a;
                this.label = 1;
                obj = FeedStore.d(feedStore, false, this, 1, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            mutableStateFlow2 = this.this$0.e;
            mutableStateFlow2.setValue(((LatestFeed) obj).getNotificationsBannerMessaging());
            mutableStateFlow3 = this.this$0.i;
            mutableStateFlow3.setValue(new u14.c(cc0.a(true)));
        } catch (Exception e) {
            mutableStateFlow = this.this$0.i;
            mutableStateFlow.setValue(new u14.a(e));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsBannerViewModel$fetchBannerText$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
