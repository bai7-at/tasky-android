package com.nytimes.android.mainactivity.banner;

import android.content.SharedPreferences;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.push.PushClientManager;
import defpackage.u14;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class NotificationsBannerViewModel extends q {
    public static final a Companion = new a(null);
    public static final int k = 8;
    private final FeedStore a;
    private final PushClientManager b;
    private final SharedPreferences c;
    private final CoroutineDispatcher d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private final MutableStateFlow g;
    private final StateFlow h;
    private final MutableStateFlow i;
    private final StateFlow j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NotificationsBannerViewModel(FeedStore feedStore, PushClientManager pushClientManager, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(feedStore, "feedStore");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = feedStore;
        this.b = pushClientManager;
        this.c = sharedPreferences;
        this.d = coroutineDispatcher;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        u14.b bVar = u14.b.b;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bVar);
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bVar);
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        m();
    }

    private final void m() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new NotificationsBannerViewModel$fetchBannerText$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.c.edit().putBoolean("notificationsbanner.USER_IS_OR_WAS_SUBSCRIBED", true).apply();
    }

    public final StateFlow n() {
        return this.f;
    }

    public final StateFlow o() {
        return this.j;
    }

    public final StateFlow p() {
        return this.h;
    }

    public final void q() {
        this.c.edit().putBoolean("notificationsbanner.NOTIFICATIONS_BANNER_DISMISSED", true).apply();
    }

    public final void s(String str) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new NotificationsBannerViewModel$subscribeToChannel$1(str, this, null), 3, null);
    }
}
