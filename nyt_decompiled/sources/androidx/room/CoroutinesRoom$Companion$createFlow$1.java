package androidx.room;

import androidx.room.d;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q01;
import defpackage.ww8;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$createFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ FlowCollector<Object> $$this$flow;
        final /* synthetic */ Callable<Object> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        @fc1(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01141 extends SuspendLambda implements gt2 {
            final /* synthetic */ Callable<Object> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ a $observer;
            final /* synthetic */ Channel<ww8> $observerChannel;
            final /* synthetic */ Channel<Object> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01141(RoomDatabase roomDatabase, a aVar, Channel channel, Callable callable, Channel channel2, by0 by0Var) {
                super(2, by0Var);
                this.$db = roomDatabase;
                this.$observer = aVar;
                this.$observerChannel = channel;
                this.$callable = callable;
                this.$resultChannel = channel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new C01141(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, by0Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x003d, B:14:0x004b, B:16:0x0053, B:25:0x0025, B:27:0x0037), top: B:2:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:8:0x0015). Please report as a decompilation issue!!! */
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
                    goto L3d
                L17:
                    r7 = move-exception
                    goto L77
                L19:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L21:
                    java.lang.Object r1 = r6.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L17
                    goto L4b
                L29:
                    kotlin.f.b(r7)
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.d r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r1 = r6.$observer
                    r7.c(r1)
                    kotlinx.coroutines.channels.Channel<ww8> r7 = r6.$observerChannel     // Catch: java.lang.Throwable -> L17
                    kotlinx.coroutines.channels.ChannelIterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L17
                L3d:
                    r6.L$0 = r7     // Catch: java.lang.Throwable -> L17
                    r6.label = r3     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r1 = r7.hasNext(r6)     // Catch: java.lang.Throwable -> L17
                    if (r1 != r0) goto L48
                    return r0
                L48:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L4b:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
                    if (r7 == 0) goto L69
                    r1.next()     // Catch: java.lang.Throwable -> L17
                    java.util.concurrent.Callable<java.lang.Object> r7 = r6.$callable     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L17
                    kotlinx.coroutines.channels.Channel<java.lang.Object> r4 = r6.$resultChannel     // Catch: java.lang.Throwable -> L17
                    r6.L$0 = r1     // Catch: java.lang.Throwable -> L17
                    r6.label = r2     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r7 = r4.send(r7, r6)     // Catch: java.lang.Throwable -> L17
                    if (r7 != r0) goto L15
                    return r0
                L69:
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.d r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r6 = r6.$observer
                    r7.p(r6)
                    ww8 r6 = defpackage.ww8.a
                    return r6
                L77:
                    androidx.room.RoomDatabase r0 = r6.$db
                    androidx.room.d r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a r6 = r6.$observer
                    r0.p(r6)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C01141.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((C01141) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        public static final class a extends d.c {
            final /* synthetic */ Channel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, Channel channel) {
                super(strArr);
                this.b = channel;
            }

            @Override // androidx.room.d.c
            public void c(Set set) {
                this.b.mo129trySendJP2dKIU(ww8.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, RoomDatabase roomDatabase, FlowCollector flowCollector, String[] strArr, Callable callable, by0 by0Var) {
            super(2, by0Var);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = flowCollector;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.c b;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                a aVar = new a(this.$tableNames, Channel$default);
                Channel$default.mo129trySendJP2dKIU(ww8.a);
                i iVar = (i) coroutineScope.getCoroutineContext().get(i.c);
                if (iVar == null || (b = iVar.c()) == null) {
                    b = this.$inTransaction ? q01.b(this.$db) : q01.a(this.$db);
                }
                Channel Channel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, b, null, new C01141(this.$db, aVar, Channel$default, this.$callable, Channel$default2, null), 2, null);
                FlowCollector<Object> flowCollector = this.$$this$flow;
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, Channel$default2, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable callable, by0 by0Var) {
        super(2, by0Var);
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, by0Var);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, (FlowCollector) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
