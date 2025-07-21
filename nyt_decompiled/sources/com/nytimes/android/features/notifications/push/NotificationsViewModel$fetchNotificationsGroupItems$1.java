package com.nytimes.android.features.notifications.push;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.NotificationsGroup;
import com.nytimes.android.features.notifications.push.b;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.notifications.push.NotificationsViewModel$fetchNotificationsGroupItems$1", f = "NotificationsViewModel.kt", l = {64, MdtaMetadataEntry.TYPE_INDICATOR_INT32, 76}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$fetchNotificationsGroupItems$1 extends SuspendLambda implements gt2 {
    Object L$0;
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
        MutableSharedFlow mutableSharedFlow;
        Exception exc;
        FeedStore feedStore;
        MutableStateFlow mutableStateFlow;
        List n;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            mutableSharedFlow = this.this$0.h;
            b.a aVar = b.a.a;
            this.L$0 = e;
            this.label = 3;
            if (mutableSharedFlow.emit(aVar, this) == h) {
                return h;
            }
            exc = e;
        }
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
                if (i == 2) {
                    f.b(obj);
                    return ww8.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (Exception) this.L$0;
                f.b(obj);
                NYTLogger.h(exc);
                return ww8.a;
            }
            f.b(obj);
        }
        List<NotificationsGroup> notificationsGroups = ((LatestFeed) obj).pushMessaging().getNotificationsGroups();
        if (notificationsGroups == null) {
            throw new IllegalStateException("No groups available");
        }
        mutableStateFlow = this.this$0.f;
        List<NotificationsGroup> list = notificationsGroups;
        NotificationsViewModel notificationsViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (NotificationsGroup notificationsGroup : list) {
            String title = notificationsGroup.getTitle();
            n = notificationsViewModel.n(notificationsGroup.getChannels());
            arrayList.add(new NotificationsGroupItems(title, n));
        }
        this.label = 2;
        if (mutableStateFlow.emit(arrayList, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsViewModel$fetchNotificationsGroupItems$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
