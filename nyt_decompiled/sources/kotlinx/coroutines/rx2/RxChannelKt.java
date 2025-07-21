package kotlinx.coroutines.rx2;

import defpackage.bk3;
import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes5.dex */
public final class RxChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collect(io.reactivex.MaybeSource<T> r5, defpackage.ss2 r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxChannelKt$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx2.RxChannelKt$collect$1 r0 = (kotlinx.coroutines.rx2.RxChannelKt$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxChannelKt$collect$1 r0 = new kotlinx.coroutines.rx2.RxChannelKt$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            ss2 r2 = (defpackage.ss2) r2
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L39
            r4 = r0
            r0 = r6
            r6 = r2
        L37:
            r2 = r4
            goto L64
        L39:
            r5 = move-exception
            goto L8f
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.f.b(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = toChannel(r5)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L8b
            r4 = r7
            r7 = r5
            r5 = r4
        L51:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L88
            r0.label = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L60
            return r1
        L60:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L37
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L76
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L79
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L76
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L76
            r7 = r0
            r0 = r2
            goto L51
        L76:
            r5 = move-exception
            r6 = r0
            goto L8f
        L79:
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L76
            defpackage.bk3.b(r3)
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            defpackage.bk3.a(r3)
            ww8 r5 = defpackage.ww8.a
            return r5
        L88:
            r5 = move-exception
            r6 = r7
            goto L8f
        L8b:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L8f:
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            defpackage.bk3.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            defpackage.bk3.a(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxChannelKt.collect(io.reactivex.MaybeSource, ss2, by0):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(MaybeSource<T> maybeSource, ss2 ss2Var, by0<? super ww8> by0Var) {
        ReceiveChannel channel = toChannel(maybeSource);
        try {
            ChannelIterator it2 = channel.iterator();
            while (true) {
                bk3.c(3);
                bk3.c(0);
                Object hasNext = it2.hasNext(null);
                bk3.c(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    ww8 ww8Var = ww8.a;
                    bk3.b(1);
                    ChannelsKt.cancelConsumed(channel, null);
                    bk3.a(1);
                    return ww8.a;
                }
                ss2Var.invoke(it2.next());
            }
        } finally {
        }
    }

    public static final /* synthetic */ ReceiveChannel openSubscription(ObservableSource observableSource) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        observableSource.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static final <T> ReceiveChannel<T> toChannel(MaybeSource<T> maybeSource) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        maybeSource.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static final /* synthetic */ ReceiveChannel openSubscription(MaybeSource maybeSource) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        maybeSource.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static final <T> ReceiveChannel<T> toChannel(ObservableSource<T> observableSource) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel();
        observableSource.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    private static final <T> Object collect$$forInline(ObservableSource<T> observableSource, ss2 ss2Var, by0<? super ww8> by0Var) {
        ReceiveChannel channel = toChannel(observableSource);
        try {
            ChannelIterator it2 = channel.iterator();
            while (true) {
                bk3.c(3);
                bk3.c(0);
                Object hasNext = it2.hasNext(null);
                bk3.c(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    ww8 ww8Var = ww8.a;
                    bk3.b(1);
                    ChannelsKt.cancelConsumed(channel, null);
                    bk3.a(1);
                    return ww8.a;
                }
                ss2Var.invoke(it2.next());
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collect(io.reactivex.ObservableSource<T> r5, defpackage.ss2 r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxChannelKt$collect$2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx2.RxChannelKt$collect$2 r0 = (kotlinx.coroutines.rx2.RxChannelKt$collect$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxChannelKt$collect$2 r0 = new kotlinx.coroutines.rx2.RxChannelKt$collect$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            ss2 r2 = (defpackage.ss2) r2
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L39
            r4 = r0
            r0 = r6
            r6 = r2
        L37:
            r2 = r4
            goto L64
        L39:
            r5 = move-exception
            goto L8f
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.f.b(r7)
            kotlinx.coroutines.channels.ReceiveChannel r5 = toChannel(r5)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L8b
            r4 = r7
            r7 = r5
            r5 = r4
        L51:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L88
            r0.label = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L60
            return r1
        L60:
            r4 = r0
            r0 = r7
            r7 = r2
            goto L37
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L76
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L79
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L76
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L76
            r7 = r0
            r0 = r2
            goto L51
        L76:
            r5 = move-exception
            r6 = r0
            goto L8f
        L79:
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L76
            defpackage.bk3.b(r3)
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            defpackage.bk3.a(r3)
            ww8 r5 = defpackage.ww8.a
            return r5
        L88:
            r5 = move-exception
            r6 = r7
            goto L8f
        L8b:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L8f:
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            defpackage.bk3.b(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            defpackage.bk3.a(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxChannelKt.collect(io.reactivex.ObservableSource, ss2, by0):java.lang.Object");
    }
}
