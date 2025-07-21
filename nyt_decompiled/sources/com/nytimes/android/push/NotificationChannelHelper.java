package com.nytimes.android.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableSet;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.push.NotificationChannelHelper;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NotificationChannelHelper {
    public static final a Companion = new a(null);
    private final FeedStore a;
    private final Scheduler b;
    private final NotificationManager c;
    private final SharedPreferences d;
    private List e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NotificationChannelHelper(FeedStore feedStore, Scheduler scheduler, NotificationManager notificationManager, SharedPreferences sharedPreferences) {
        zq3.h(feedStore, "feedStore");
        zq3.h(scheduler, "schedulerIO");
        zq3.h(notificationManager, "notificationManager");
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = feedStore;
        this.b = scheduler;
        this.c = notificationManager;
        this.d = sharedPreferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h95
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                NotificationChannelHelper.r(NotificationChannelHelper.this, sharedPreferences2, str);
            }
        };
        this.f = onSharedPreferenceChangeListener;
        Observable subscribeOn = feedStore.stream().subscribeOn(scheduler);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.push.NotificationChannelHelper.1
            {
                super(1);
            }

            public final void b(LatestFeed latestFeed) {
                NotificationChannelHelper.this.s(latestFeed.pushMessaging().getAllChannels());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((LatestFeed) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: i95
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NotificationChannelHelper.e(ss2.this, obj);
            }
        };
        final AnonymousClass2 anonymousClass2 = new ss2() { // from class: com.nytimes.android.push.NotificationChannelHelper.2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Failed to get channels ", new Object[0]);
            }
        };
        subscribeOn.subscribe(consumer, new Consumer() { // from class: j95
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NotificationChannelHelper.f(ss2.this, obj);
            }
        });
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        if (sharedPreferences.getBoolean("didInitChannels", false)) {
            return;
        }
        i();
        t(q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void i() {
        NotificationManager notificationManager = this.c;
        notificationManager.deleteNotificationChannel("media-control");
        notificationManager.createNotificationChannel(m());
    }

    private final Observable j() {
        List list = this.e;
        if (list != null) {
            Observable just = Observable.just(list);
            zq3.e(just);
            return just;
        }
        Observable f = this.a.f();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.push.NotificationChannelHelper$getChannelList$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List invoke(LatestFeed latestFeed) {
                zq3.h(latestFeed, "appConfig");
                NotificationChannelHelper.this.s(latestFeed.pushMessaging().getAllChannels());
                return NotificationChannelHelper.this.l();
            }
        };
        Observable map = f.map(new Function() { // from class: k95
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List k;
                k = NotificationChannelHelper.k(ss2.this, obj);
                return k;
            }
        });
        zq3.e(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationChannel m() {
        return new NotificationChannel("media-control", "Media Control", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationChannel n(Channel channel) {
        NotificationChannel notificationChannel = new NotificationChannel(channel.getTag(), channel.getTitle(), 3);
        notificationChannel.setDescription(channel.getTagDescription());
        return notificationChannel;
    }

    private final Set q() {
        Collection collection;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collection stringSet = this.d.getStringSet("PUSH_SUBS", null);
        if (stringSet == null) {
            collection = ImmutableSet.y();
            zq3.g(collection, "of(...)");
        } else {
            collection = stringSet;
        }
        linkedHashSet.addAll(collection);
        linkedHashSet.add("media-control");
        return i.c1(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(NotificationChannelHelper notificationChannelHelper, SharedPreferences sharedPreferences, String str) {
        zq3.h(notificationChannelHelper, "this$0");
        if (zq3.c("PUSH_SUBS", str)) {
            notificationChannelHelper.t(notificationChannelHelper.q());
        }
    }

    private final void t(final Set set) {
        final List<NotificationChannel> notificationChannels = this.c.getNotificationChannels();
        Observable subscribeOn = j().subscribeOn(this.b);
        zq3.g(subscribeOn, "subscribeOn(...)");
        SubscribersKt.subscribeBy$default(subscribeOn, new ss2() { // from class: com.nytimes.android.push.NotificationChannelHelper$updateNotificationChannels$1
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.h(th, "it");
                NYTLogger.i(th, "error getting channel list", new Object[0]);
            }
        }, (qs2) null, new ss2() { // from class: com.nytimes.android.push.NotificationChannelHelper$updateNotificationChannels$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List list) {
                NotificationChannel m;
                NotificationChannel n;
                zq3.e(list);
                Set<String> set2 = set;
                ArrayList<Channel> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (set2.contains(((Channel) obj).getTag())) {
                        arrayList.add(obj);
                    }
                }
                NotificationChannelHelper notificationChannelHelper = NotificationChannelHelper.this;
                for (Channel channel : arrayList) {
                    NotificationManager o = notificationChannelHelper.o();
                    n = notificationChannelHelper.n(channel);
                    o.createNotificationChannel(n);
                }
                NotificationManager o2 = NotificationChannelHelper.this.o();
                m = NotificationChannelHelper.this.m();
                o2.createNotificationChannel(m);
                List<NotificationChannel> list2 = notificationChannels;
                zq3.g(list2, "$oldList");
                Set<String> set3 = set;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!set3.contains(((NotificationChannel) obj2).getId())) {
                        arrayList2.add(obj2);
                    }
                }
                NotificationChannelHelper notificationChannelHelper2 = NotificationChannelHelper.this;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    notificationChannelHelper2.o().deleteNotificationChannel(((NotificationChannel) it2.next()).getId());
                }
                NotificationChannelHelper.this.o().getNotificationChannels();
                if (NotificationChannelHelper.this.p().getBoolean("didInitChannels", false)) {
                    return;
                }
                SharedPreferences.Editor edit = NotificationChannelHelper.this.p().edit();
                edit.putBoolean("didInitChannels", true);
                edit.apply();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        }, 2, (Object) null);
    }

    public final List l() {
        return this.e;
    }

    public final NotificationManager o() {
        return this.c;
    }

    public final SharedPreferences p() {
        return this.d;
    }

    public final void s(List list) {
        this.e = list;
    }
}
