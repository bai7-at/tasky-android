package com.nytimes.android.libs.messagingarchitecture.core;

import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.libs.messagingarchitecture.db.MessageHistoryMigrator;
import com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater;
import com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher;
import defpackage.cb2;
import defpackage.er4;
import defpackage.qg0;
import defpackage.xr4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class MessageQueueUpdater {
    private final FeedStore a;
    private final er4 b;
    private final LocalOMAMessageFetcher c;
    private final qg0 d;
    private final MessageHistoryUpdater e;
    private final MessageHistoryMigrator f;
    private final xr4 g;
    private final cb2 h;
    private final MessagePreferencesStore i;
    private final boolean j;

    public MessageQueueUpdater(FeedStore feedStore, er4 er4Var, LocalOMAMessageFetcher localOMAMessageFetcher, qg0 qg0Var, MessageHistoryUpdater messageHistoryUpdater, MessageHistoryMigrator messageHistoryMigrator, xr4 xr4Var, cb2 cb2Var, MessagePreferencesStore messagePreferencesStore) {
        zq3.h(feedStore, "feedStore");
        zq3.h(er4Var, "messageFetcher");
        zq3.h(localOMAMessageFetcher, "localMessageFetcher");
        zq3.h(qg0Var, "cachedMessageHistoryDao");
        zq3.h(messageHistoryUpdater, "messageHistoryUpdater");
        zq3.h(messageHistoryMigrator, "messageHistoryMigrator");
        zq3.h(xr4Var, "messageQueue");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(messagePreferencesStore, "messagePreferences");
        this.a = feedStore;
        this.b = er4Var;
        this.c = localOMAMessageFetcher;
        this.d = qg0Var;
        this.e = messageHistoryUpdater;
        this.f = messageHistoryMigrator;
        this.g = xr4Var;
        this.h = cb2Var;
        this.i = messagePreferencesStore;
        this.j = cb2Var.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.by0 r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater.d(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r7) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater.e(by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:14)(2:11|12))(3:18|19|(2:21|(1:23))(2:24|(1:26)))|15|16))|29|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r5, "Failed to update message list.", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004f -> B:15:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater$updateQueue$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater$updateQueue$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater$updateQueue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater$updateQueue$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater$updateQueue$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L28
            if (r2 != r3) goto L2e
        L28:
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L2c
            goto L57
        L2c:
            r5 = move-exception
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.f.b(r6)
            boolean r6 = r5.j     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L46
            r0.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r5.e(r0)     // Catch: java.lang.Exception -> L2c
            if (r5 != r1) goto L57
            return r1
        L46:
            r0.label = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r5.d(r0)     // Catch: java.lang.Exception -> L2c
            if (r5 != r1) goto L57
            return r1
        L4f:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "Failed to update message list."
            com.nytimes.android.logging.NYTLogger.i(r5, r0, r6)
        L57:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater.c(by0):java.lang.Object");
    }
}
