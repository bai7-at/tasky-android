package com.nytimes.android.fragment.article.hybrid;

import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.la5;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SubscriptionStatusCommand extends mc0 {
    private final FeedStore b;
    private final la5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionStatusCommand(FeedStore feedStore, la5 la5Var) {
        super("subscriptionStatus");
        zq3.h(feedStore, "feedStore");
        zq3.h(la5Var, "notificationsHelper");
        this.b = feedStore;
        this.c = la5Var;
    }

    private final Object c(nc0 nc0Var) {
        return nc0Var.f().get("tag");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x0058, B:14:0x0064, B:15:0x006a, B:17:0x0070, B:21:0x0082, B:23:0x0086, B:28:0x00a1, B:29:0x00bc, B:33:0x0041), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r6, int r7, defpackage.nc0 r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r6 = r9 instanceof com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand$run$1
            if (r6 == 0) goto L13
            r6 = r9
            com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand$run$1 r6 = (com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand$run$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L18
        L13:
            com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand$run$1 r6 = new com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand$run$1
            r6.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 != r4) goto L36
            int r7 = r6.I$0
            java.lang.Object r5 = r6.L$1
            java.lang.Object r6 = r6.L$0
            com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand r6 = (com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand) r6
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L33
            goto L58
        L33:
            r5 = move-exception
            goto Lbd
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            kotlin.f.b(r9)
            java.lang.Object r8 = r5.c(r8)     // Catch: java.lang.Exception -> L33
            com.nytimes.android.latestfeed.feed.FeedStore r9 = r5.b     // Catch: java.lang.Exception -> L33
            r6.L$0 = r5     // Catch: java.lang.Exception -> L33
            r6.L$1 = r8     // Catch: java.lang.Exception -> L33
            r6.I$0 = r7     // Catch: java.lang.Exception -> L33
            r6.label = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = com.nytimes.android.latestfeed.feed.FeedStore.d(r9, r3, r6, r4, r2)     // Catch: java.lang.Exception -> L33
            if (r9 != r0) goto L56
            return r0
        L56:
            r6 = r5
            r5 = r8
        L58:
            com.nytimes.android.api.cms.LatestFeed r9 = (com.nytimes.android.api.cms.LatestFeed) r9     // Catch: java.lang.Exception -> L33
            com.nytimes.android.api.config.model.PushMessaging r8 = r9.pushMessaging()     // Catch: java.lang.Exception -> L33
            java.util.List r8 = r8.getAllChannels()     // Catch: java.lang.Exception -> L33
            if (r8 == 0) goto La1
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L33
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L33
        L6a:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L82
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> L33
            r0 = r9
            com.nytimes.android.api.config.model.Channel r0 = (com.nytimes.android.api.config.model.Channel) r0     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r0.getTag()     // Catch: java.lang.Exception -> L33
            boolean r0 = defpackage.zq3.c(r0, r5)     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto L6a
            r2 = r9
        L82:
            com.nytimes.android.api.config.model.Channel r2 = (com.nytimes.android.api.config.model.Channel) r2     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto La1
            la5 r5 = r6.c     // Catch: java.lang.Exception -> L33
            boolean r5 = r5.b(r2)     // Catch: java.lang.Exception -> L33
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion     // Catch: java.lang.Exception -> L33
            java.lang.String r8 = "subscribed"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L33
            kotlin.Pair r5 = defpackage.du8.a(r8, r5)     // Catch: java.lang.Exception -> L33
            java.util.Map r5 = kotlin.collections.t.f(r5)     // Catch: java.lang.Exception -> L33
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r5 = r6.c(r7, r5)     // Catch: java.lang.Exception -> L33
            goto Ld2
        La1:
            com.nytimes.android.fragment.article.hybrid.ChannelException r6 = new com.nytimes.android.fragment.article.hybrid.ChannelException     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r8.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r9 = "Channel tag: "
            r8.append(r9)     // Catch: java.lang.Exception -> L33
            r8.append(r5)     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = " is missing from FeedStore.pushMessaging.channels"
            r8.append(r5)     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Exception -> L33
            r6.<init>(r5)     // Catch: java.lang.Exception -> L33
            throw r6     // Catch: java.lang.Exception -> L33
        Lbd:
            com.nytimes.android.logging.NYTLogger.h(r5)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            java.lang.String r8 = r5.getMessage()
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            java.lang.String r5 = r5.toString()
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r5 = r6.a(r7, r8, r5)
        Ld2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
