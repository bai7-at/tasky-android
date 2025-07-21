package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ns7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    @fc1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ ns7 $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot this$0;

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 implements FlowCollector {
            final /* synthetic */ ns7 a;

            AnonymousClass1(ns7 ns7Var) {
                this.a = ns7Var;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(androidx.paging.PageEvent r5, defpackage.by0 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.f.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    goto L3f
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.f.b(r6)
                    ns7 r4 = r4.a     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    java.lang.Object r4 = r4.send(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    if (r4 != r1) goto L3f
                    return r1
                L3f:
                    ww8 r4 = defpackage.ww8.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1.emit(androidx.paging.PageEvent, by0):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PageFetcherSnapshot pageFetcherSnapshot, ns7 ns7Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = ns7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$$this$cancelableChannelFlow, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Channel channel;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                channel = this.this$0.j;
                Flow consumeAsFlow = FlowKt.consumeAsFlow(channel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (consumeAsFlow.collect(anonymousClass1, this) == h) {
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
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        final /* synthetic */ Channel<ww8> $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot this$0;

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3$a */
        static final class a implements FlowCollector {
            final /* synthetic */ Channel a;

            a(Channel channel) {
                this.a = channel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ww8 ww8Var, by0 by0Var) {
                this.a.mo129trySendJP2dKIU(ww8Var);
                return ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PageFetcherSnapshot pageFetcherSnapshot, Channel channel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass3(this.this$0, this.$retryChannel, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow flow;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                flow = this.this$0.d;
                a aVar = new a(this.$retryChannel);
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
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
            return ((AnonymousClass3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements gt2 {
        final /* synthetic */ Channel<ww8> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot this$0;

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        static final class AnonymousClass1 implements FlowCollector {
            final /* synthetic */ PageFetcherSnapshot a;
            final /* synthetic */ CoroutineScope b;

            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            AnonymousClass1(PageFetcherSnapshot pageFetcherSnapshot, CoroutineScope coroutineScope) {
                this.a = pageFetcherSnapshot;
                this.b = coroutineScope;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0385  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0389  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0118  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0366 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0367  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0309  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0324  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x02d8  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x02cf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0278  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x01ee  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x026a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x051e  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x04eb  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x04e3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x04e4  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x048e  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0492  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0471 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0472  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0419  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0434  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x03e7  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x03de A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x03df  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v100 */
            /* JADX WARN: Type inference failed for: r12v101 */
            /* JADX WARN: Type inference failed for: r12v14, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v41, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v72, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v94 */
            /* JADX WARN: Type inference failed for: r12v95 */
            /* JADX WARN: Type inference failed for: r12v97 */
            /* JADX WARN: Type inference failed for: r12v98 */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(defpackage.ww8 r13, defpackage.by0 r14) {
                /*
                    Method dump skipped, instructions count: 1370
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.emit(ww8, by0):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Channel channel, PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
            super(2, by0Var);
            this.$retryChannel = channel;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$retryChannel, this.this$0, by0Var);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow consumeAsFlow = FlowKt.consumeAsFlow(this.$retryChannel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope);
                this.label = 1;
                if (consumeAsFlow.collect(anonymousClass1, this) == h) {
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
            return ((AnonymousClass4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ns7 ns7Var, by0 by0Var) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(ns7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, by0Var);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
