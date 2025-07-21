package com.nytimes.android.features.notifications.push;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.android.push.PushClientManager;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.e52;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public abstract class NotificationsViewModel extends q {
    public static final a Companion = new a(null);
    public static final int k = 8;
    private final FeedStore a;
    private final ET2SimpleScope b;
    private final PushClientManager c;
    private final SharedPreferences d;
    private final CoroutineDispatcher e;
    private final MutableStateFlow f;
    private final StateFlow g;
    private final MutableSharedFlow h;
    private final Flow i;
    private boolean j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NotificationsViewModel(FeedStore feedStore, ET2SimpleScope eT2SimpleScope, PushClientManager pushClientManager, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(feedStore, "feedStore");
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = feedStore;
        this.b = eT2SimpleScope;
        this.c = pushClientManager;
        this.d = sharedPreferences;
        this.e = coroutineDispatcher;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(i.l());
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.h = MutableSharedFlow$default;
        this.i = FlowKt.distinctUntilChanged(FlowKt.asSharedFlow(MutableSharedFlow$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List n(List list) {
        ArrayList<Channel> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Channel) obj).isHidden()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        for (Channel channel : arrayList) {
            arrayList2.add(NotificationsChannel.Companion.a(channel, r(channel)));
        }
        return arrayList2;
    }

    private final NotificationsChannel v(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel) {
        notificationsChannel.h(!notificationsChannel.g());
        return y(notificationsGroupItems, notificationsChannel);
    }

    private final void w(String str, NotificationsGroupItems notificationsGroupItems) {
        for (NotificationsChannel notificationsChannel : notificationsGroupItems.d()) {
            String str2 = notificationsChannel.g() ? "toggle on" : "toggle off";
            ET2PageScope.DefaultImpls.a(this.b, new e52.e(), new s42(str2, notificationsChannel.e(), null, null, null, null, null, null, "push notifications", 252, null), new u32(null, str, str2, 1, null), null, 8, null);
        }
    }

    private final NotificationsChannel y(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel) {
        MutableStateFlow mutableStateFlow = this.f;
        Iterable<NotificationsGroupItems> iterable = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(i.w(iterable, 10));
        for (NotificationsGroupItems notificationsGroupItems2 : iterable) {
            if (zq3.c(notificationsGroupItems2.e(), notificationsGroupItems.e())) {
                notificationsGroupItems2 = u(notificationsGroupItems, notificationsChannel);
            }
            arrayList.add(notificationsGroupItems2);
        }
        mutableStateFlow.setValue(arrayList);
        return notificationsChannel;
    }

    public final Object l(qs2 qs2Var, qs2 qs2Var2, by0 by0Var) {
        Object collectLatest = FlowKt.collectLatest(this.i, new NotificationsViewModel$collectEvents$3(qs2Var, qs2Var2, this, null), by0Var);
        return collectLatest == kotlin.coroutines.intrinsics.a.h() ? collectLatest : ww8.a;
    }

    public final Job m(Activity activity, SnackbarUtil snackbarUtil) {
        Job launch$default;
        zq3.h(activity, "activity");
        zq3.h(snackbarUtil, "snackbarUtil");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), Dispatchers.getMain(), null, new NotificationsViewModel$collectEvents$1(this, snackbarUtil, activity, null), 2, null);
        return launch$default;
    }

    public final Job o(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z) {
        Job launch$default;
        zq3.h(notificationsGroupItems, "group");
        zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new NotificationsViewModel$emitCheckChanged$1(this, notificationsGroupItems, notificationsChannel, z, null), 3, null);
        return launch$default;
    }

    public final Job p() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.e, null, new NotificationsViewModel$fetchNotificationsGroupItems$1(this, null), 2, null);
        return launch$default;
    }

    public final StateFlow q() {
        return this.g;
    }

    public abstract boolean r(Channel channel);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: Exception -> 0x008d, TryCatch #1 {Exception -> 0x008d, blocks: (B:21:0x007d, B:23:0x0089, B:24:0x008f, B:25:0x00ae, B:37:0x006e), top: B:36:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[Catch: Exception -> 0x008d, TryCatch #1 {Exception -> 0x008d, blocks: (B:21:0x007d, B:23:0x0089, B:24:0x008f, B:25:0x00ae, B:37:0x006e), top: B:36:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.nytimes.android.push.NotificationsGroupItems r17, com.nytimes.android.push.NotificationsChannel r18, boolean r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.notifications.push.NotificationsViewModel.s(com.nytimes.android.push.NotificationsGroupItems, com.nytimes.android.push.NotificationsChannel, boolean, by0):java.lang.Object");
    }

    protected final Object t(NotificationsChannel notificationsChannel, boolean z, by0 by0Var) {
        Set d = b0.d(notificationsChannel.e());
        PushClientManager pushClientManager = this.c;
        return z ? pushClientManager.f(d, by0Var) : pushClientManager.g(d, by0Var);
    }

    public final NotificationsGroupItems u(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel) {
        zq3.h(notificationsGroupItems, "<this>");
        zq3.h(notificationsChannel, "newChannel");
        List<NotificationsChannel> d = notificationsGroupItems.d();
        ArrayList arrayList = new ArrayList(i.w(d, 10));
        for (NotificationsChannel notificationsChannel2 : d) {
            if (zq3.c(notificationsChannel2.c().getTag(), notificationsChannel.e())) {
                notificationsChannel2 = notificationsChannel;
            }
            arrayList.add(notificationsChannel2);
        }
        return NotificationsGroupItems.c(notificationsGroupItems, null, arrayList, 1, null);
    }

    public final void x(String str) {
        zq3.h(str, "pageType");
        Iterator it2 = ((Iterable) this.f.getValue()).iterator();
        while (it2.hasNext()) {
            w(str, (NotificationsGroupItems) it2.next());
        }
    }
}
