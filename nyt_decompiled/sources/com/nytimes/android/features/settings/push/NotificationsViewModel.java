package com.nytimes.android.features.settings.push;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.PushClientManager;
import defpackage.fy4;
import defpackage.la5;
import defpackage.ot7;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class NotificationsViewModel extends q {
    private final FeedStore a;
    private final PushClientManager b;
    private final la5 c;
    private final CoroutineDispatcher d;
    private final fy4 e;
    private final ot7 f;
    private final fy4 g;
    private final fy4 h;

    public NotificationsViewModel(FeedStore feedStore, PushClientManager pushClientManager, la5 la5Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(feedStore, "feedStore");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(la5Var, "notificationsHelper");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = feedStore;
        this.b = pushClientManager;
        this.c = la5Var;
        this.d = coroutineDispatcher;
        this.e = new fy4(i.l());
        this.f = new ot7();
        fy4 fy4Var = new fy4();
        this.g = fy4Var;
        this.h = fy4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(List list) {
        ArrayList<Channel> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Channel) obj).isHidden()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        for (Channel channel : arrayList) {
            arrayList2.add(NotificationsChannel.Companion.a(channel, j() ? this.c.b(channel) : false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(NotificationsChannel notificationsChannel) {
        notificationsChannel.h(!notificationsChannel.g());
    }

    public final boolean j() {
        return this.c.a();
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new NotificationsViewModel$fetchNotificationsGroupItems$1(this, null), 3, null);
    }

    public final ot7 m() {
        return this.f;
    }

    public final fy4 n() {
        return this.e;
    }

    public final void o() {
        this.g.p(Boolean.valueOf(j()));
    }

    public final fy4 p() {
        return this.h;
    }

    public final void q(NotificationsChannel notificationsChannel, boolean z) {
        zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.d, null, new NotificationsViewModel$onSubscribeCheckChanged$1(notificationsChannel, z, this, null), 2, null);
    }
}
