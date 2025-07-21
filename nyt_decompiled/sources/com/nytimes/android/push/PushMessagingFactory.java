package com.nytimes.android.push;

import android.app.Application;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.utils.AppPreferences;
import defpackage.a15;
import defpackage.r82;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PushMessagingFactory {
    public static final a Companion = new a(null);
    private final Application a;
    private final r82 b;
    private final a15 c;
    private final String d;
    private final FeedStore e;
    private final AppPreferences f;
    private final com.nytimes.android.internal.pushmessaging.model.a g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PushMessagingFactory(Application application, r82 r82Var, a15 a15Var, String str, FeedStore feedStore, AppPreferences appPreferences, com.nytimes.android.internal.pushmessaging.model.a aVar) {
        zq3.h(application, "app");
        zq3.h(r82Var, "fcmTokenProvider");
        zq3.h(a15Var, "nytUserProvider");
        zq3.h(str, "appVersion");
        zq3.h(feedStore, "feedStore");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(aVar, "environment");
        this.a = application;
        this.b = r82Var;
        this.c = a15Var;
        this.d = str;
        this.e = feedStore;
        this.f = appPreferences;
        this.g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.nytimes.android.internal.pushmessaging.model.Subscription, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.PushMessagingFactory.b(by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, com.nytimes.android.internal.pushmessaging.PushMessaging$a] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, com.nytimes.android.internal.pushmessaging.PushMessaging$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.PushMessagingFactory.c(by0):java.lang.Object");
    }
}
