package kotlinx.coroutines.reactive;

import defpackage.bk3;
import defpackage.by0;
import defpackage.g86;
import defpackage.ss2;
import defpackage.ww8;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes5.dex */
public final class ChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:15:0x0066, B:17:0x006e, B:33:0x007b), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:15:0x0066, B:17:0x006e, B:33:0x007b), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collect(defpackage.g86 r6, defpackage.ss2 r7, defpackage.by0<? super defpackage.ww8> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.reactive.ChannelKt$collect$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = (kotlinx.coroutines.reactive.ChannelKt$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = new kotlinx.coroutines.reactive.ChannelKt$collect$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            ss2 r2 = (defpackage.ss2) r2
            kotlin.f.b(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L66
        L3a:
            r6 = move-exception
            goto L90
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.f.b(r8)
            r8 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = toChannel$default(r6, r8, r3, r4)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8c
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L89
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L89
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L89
            r0.label = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L78
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L78
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L78
            r8 = r0
            r0 = r2
            goto L53
        L78:
            r6 = move-exception
            r7 = r0
            goto L90
        L7b:
            ww8 r6 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L78
            defpackage.bk3.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r4)
            defpackage.bk3.a(r3)
            ww8 r6 = defpackage.ww8.a
            return r6
        L89:
            r6 = move-exception
            r7 = r8
            goto L90
        L8c:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            defpackage.bk3.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            defpackage.bk3.a(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ChannelKt.collect(g86, ss2, by0):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(g86 g86Var, ss2 ss2Var, by0<? super ww8> by0Var) {
        ReceiveChannel channel$default = toChannel$default(g86Var, 0, 1, null);
        try {
            ChannelIterator it2 = channel$default.iterator();
            while (true) {
                bk3.c(3);
                bk3.c(0);
                Object hasNext = it2.hasNext(null);
                bk3.c(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    ww8 ww8Var = ww8.a;
                    bk3.b(1);
                    ChannelsKt.cancelConsumed(channel$default, null);
                    bk3.a(1);
                    return ww8.a;
                }
                ss2Var.invoke(it2.next());
            }
        } finally {
        }
    }

    public static final /* synthetic */ ReceiveChannel openSubscription(g86 g86Var, int i) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i);
        g86Var.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel openSubscription$default(g86 g86Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return openSubscription(g86Var, i);
    }

    public static final <T> ReceiveChannel<T> toChannel(g86 g86Var, int i) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i);
        g86Var.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel toChannel$default(g86 g86Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return toChannel(g86Var, i);
    }
}
