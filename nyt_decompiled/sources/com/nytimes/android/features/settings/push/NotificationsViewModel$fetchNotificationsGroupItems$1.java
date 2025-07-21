package com.nytimes.android.features.settings.push;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.NotificationsGroup;
import com.nytimes.android.features.settings.push.c;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.gt2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.push.NotificationsViewModel$fetchNotificationsGroupItems$1", f = "NotificationsViewModel.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$fetchNotificationsGroupItems$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$fetchNotificationsGroupItems$1(NotificationsViewModel notificationsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = notificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsViewModel$fetchNotificationsGroupItems$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeedStore feedStore;
        List<NotificationsGroup> notificationsGroups;
        List k;
        Object h = kotlin.coroutines.intrinsics.a.h();
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
            notificationsGroups = ((LatestFeed) obj).pushMessaging().getNotificationsGroups();
        } catch (Exception e) {
            this.this$0.m().p(c.a.a);
            NYTLogger.h(e);
        }
        if (notificationsGroups == null) {
            throw new IllegalStateException("No groups available");
        }
        fy4 n = this.this$0.n();
        List<NotificationsGroup> list = notificationsGroups;
        NotificationsViewModel notificationsViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (NotificationsGroup notificationsGroup : list) {
            String title = notificationsGroup.getTitle();
            k = notificationsViewModel.k(notificationsGroup.getChannels());
            arrayList.add(new NotificationsGroupItems(title, k));
        }
        n.p(arrayList);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsViewModel$fetchNotificationsGroupItems$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
