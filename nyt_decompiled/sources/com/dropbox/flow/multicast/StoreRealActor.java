package com.dropbox.flow.multicast;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.v1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes2.dex */
public abstract class StoreRealActor {
    private final SendChannel a;
    private final CompletableDeferred b;
    private volatile Object c;
    public static final a d = new a(null);
    private static final Object f = new Object();
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(StoreRealActor.class, Object.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES);

    @fc1(c = "com.dropbox.flow.multicast.StoreRealActor$1", f = "StoreRealActor.kt", l = {42, 48}, m = "invokeSuspend")
    /* renamed from: com.dropbox.flow.multicast.StoreRealActor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ActorScope actorScope, by0 by0Var) {
            return ((AnonymousClass1) create(actorScope, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = StoreRealActor.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x0038, B:14:0x0046, B:16:0x004e, B:18:0x005a, B:20:0x0060, B:28:0x0025, B:30:0x0030), top: B:2:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:8:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L17
            L15:
                r7 = r1
                goto L38
            L17:
                r7 = move-exception
                goto L75
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L46
            L29:
                kotlin.f.b(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ActorScope r7 = (kotlinx.coroutines.channels.ActorScope) r7
                kotlinx.coroutines.channels.Channel r7 = r7.getChannel()     // Catch: java.lang.Throwable -> L17
                kotlinx.coroutines.channels.ChannelIterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L17
            L38:
                r6.L$0 = r7     // Catch: java.lang.Throwable -> L17
                r6.label = r3     // Catch: java.lang.Throwable -> L17
                java.lang.Object r1 = r7.hasNext(r6)     // Catch: java.lang.Throwable -> L17
                if (r1 != r0) goto L43
                return r0
            L43:
                r5 = r1
                r1 = r7
                r7 = r5
            L46:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r7 == 0) goto L6d
                java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L17
                com.dropbox.flow.multicast.StoreRealActor$a r4 = com.dropbox.flow.multicast.StoreRealActor.d     // Catch: java.lang.Throwable -> L17
                java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L17
                if (r7 != r4) goto L60
                com.dropbox.flow.multicast.StoreRealActor r7 = com.dropbox.flow.multicast.StoreRealActor.this     // Catch: java.lang.Throwable -> L17
                com.dropbox.flow.multicast.StoreRealActor.a(r7)     // Catch: java.lang.Throwable -> L17
                goto L6d
            L60:
                com.dropbox.flow.multicast.StoreRealActor r4 = com.dropbox.flow.multicast.StoreRealActor.this     // Catch: java.lang.Throwable -> L17
                r6.L$0 = r1     // Catch: java.lang.Throwable -> L17
                r6.label = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r7 = r4.e(r7, r6)     // Catch: java.lang.Throwable -> L17
                if (r7 != r0) goto L15
                return r0
            L6d:
                com.dropbox.flow.multicast.StoreRealActor r6 = com.dropbox.flow.multicast.StoreRealActor.this
                com.dropbox.flow.multicast.StoreRealActor.a(r6)
                ww8 r6 = defpackage.ww8.a
                return r6
            L75:
                com.dropbox.flow.multicast.StoreRealActor r6 = com.dropbox.flow.multicast.StoreRealActor.this
                com.dropbox.flow.multicast.StoreRealActor.a(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.StoreRealActor.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a() {
            return StoreRealActor.f;
        }

        private a() {
        }
    }

    public StoreRealActor(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        this.b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.c = Boolean.FALSE;
        this.a = ActorKt.actor$default(coroutineScope, null, 0, null, null, new AnonymousClass1(null), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (v1.a(e, this, Boolean.FALSE, Boolean.TRUE)) {
            try {
                f();
            } finally {
                SendChannel.DefaultImpls.close$default(this.a, null, 1, null);
                this.b.complete(ww8.a);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(1:25))|19|(1:21)|12|13))|27|6|7|(0)(0)|19|(0)|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.dropbox.flow.multicast.StoreRealActor$close$1
            if (r0 == 0) goto L13
            r0 = r6
            com.dropbox.flow.multicast.StoreRealActor$close$1 r0 = (com.dropbox.flow.multicast.StoreRealActor$close$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dropbox.flow.multicast.StoreRealActor$close$1 r0 = new com.dropbox.flow.multicast.StoreRealActor$close$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.dropbox.flow.multicast.StoreRealActor r5 = (com.dropbox.flow.multicast.StoreRealActor) r5
            kotlin.f.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            goto L4e
        L3c:
            kotlin.f.b(r6)
            kotlinx.coroutines.channels.SendChannel r6 = r5.a     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            java.lang.Object r2 = com.dropbox.flow.multicast.StoreRealActor.f     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            r0.L$0 = r5     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            r0.label = r4     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            java.lang.Object r6 = r6.send(r2, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            if (r6 != r1) goto L4e
            return r1
        L4e:
            kotlinx.coroutines.CompletableDeferred r5 = r5.b     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            r6 = 0
            r0.L$0 = r6     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            java.lang.Object r5 = r5.await(r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L5c
            if (r5 != r1) goto L5c
            return r1
        L5c:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.StoreRealActor.c(by0):java.lang.Object");
    }

    public abstract Object e(Object obj, by0 by0Var);

    public void f() {
    }

    public final Object g(Object obj, by0 by0Var) {
        Object send = this.a.send(obj, by0Var);
        return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
    }
}
