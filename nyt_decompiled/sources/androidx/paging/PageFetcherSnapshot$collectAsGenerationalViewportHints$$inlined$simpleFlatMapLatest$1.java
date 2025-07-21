package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.d;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.kx2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 98}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(by0 by0Var, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, by0Var);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        final int intValue;
        PageFetcherSnapshotState.a aVar;
        Mutex mutex;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        HintHandler hintHandler;
        Flow flow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                flowCollector = (FlowCollector) this.L$0;
                intValue = ((Number) this.L$1).intValue();
                aVar = this.this$0.k;
                mutex = aVar.b;
                this.L$0 = flowCollector;
                this.L$1 = aVar;
                this.L$2 = mutex;
                this.I$0 = intValue;
                this.label = 1;
                if (mutex.lock(null, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
                intValue = this.I$0;
                mutex = (Mutex) this.L$2;
                aVar = (PageFetcherSnapshotState.a) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                kotlin.f.b(obj);
            }
            pageFetcherSnapshotState = aVar.c;
            d a = pageFetcherSnapshotState.p().a(this.$loadType$inlined);
            d.c.a aVar2 = d.c.b;
            if (zq3.c(a, aVar2.a())) {
                flow = FlowKt.flowOf((Object[]) new kx2[0]);
            } else {
                if (!(pageFetcherSnapshotState.p().a(this.$loadType$inlined) instanceof d.a)) {
                    pageFetcherSnapshotState.p().c(this.$loadType$inlined, aVar2.b());
                }
                ww8 ww8Var = ww8.a;
                mutex.unlock(null);
                hintHandler = this.this$0.h;
                final Flow drop = FlowKt.drop(hintHandler.c(this.$loadType$inlined), intValue == 0 ? 0 : 1);
                flow = new Flow() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1

                    /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements FlowCollector {
                        final /* synthetic */ FlowCollector a;
                        final /* synthetic */ int b;

                        @fc1(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
                        /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(by0 by0Var) {
                                super(by0Var);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= RecyclerView.UNDEFINED_DURATION;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, int i) {
                            this.a = flowCollector;
                            this.b = i;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1 r0 = (androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1 r0 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.f.b(r6)
                                goto L48
                            L29:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L31:
                                kotlin.f.b(r6)
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                                androidx.paging.s r5 = (androidx.paging.s) r5
                                kx2 r2 = new kx2
                                int r4 = r4.b
                                r2.<init>(r4, r5)
                                r0.label = r3
                                java.lang.Object r4 = r6.emit(r2, r0)
                                if (r4 != r1) goto L48
                                return r1
                            L48:
                                ww8 r4 = defpackage.ww8.a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector2, by0 by0Var) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector2, intValue), by0Var);
                        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
                    }
                };
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (FlowKt.emitAll(flowCollector, flow, this) == h) {
                return h;
            }
            return ww8.a;
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(by0Var, this.this$0, this.$loadType$inlined);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = flowCollector;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = obj;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(ww8.a);
    }
}
