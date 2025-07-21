package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bj3;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

@fc1(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow this$0;

    @fc1(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(bj3 bj3Var, by0 by0Var) {
            return ((AnonymousClass1) create(bj3Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            return cc0.a(((bj3) this.L$0) != null);
        }
    }

    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 implements FlowCollector {
        final /* synthetic */ Ref$IntRef a;
        final /* synthetic */ FlowCollector b;

        AnonymousClass2(Ref$IntRef ref$IntRef, FlowCollector flowCollector) {
            this.a = ref$IntRef;
            this.b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.bj3 r5, defpackage.by0 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 r0 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r4 = r0.L$1
                r5 = r4
                bj3 r5 = (defpackage.bj3) r5
                java.lang.Object r4 = r0.L$0
                androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 r4 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2) r4
                kotlin.f.b(r6)
                goto L5d
            L32:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L3a:
                kotlin.f.b(r6)
                defpackage.zq3.e(r5)
                int r6 = r5.a()
                kotlin.jvm.internal.Ref$IntRef r2 = r4.a
                int r2 = r2.element
                if (r6 <= r2) goto L65
                kotlinx.coroutines.flow.FlowCollector r6 = r4.b
                java.lang.Object r2 = r5.b()
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L5d
                return r1
            L5d:
                kotlin.jvm.internal.Ref$IntRef r4 = r4.a
                int r5 = r5.a()
                r4.element = r5
            L65:
                ww8 r4 = defpackage.ww8.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2.emit(bj3, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, by0Var);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedFlow sharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = RecyclerView.UNDEFINED_DURATION;
            sharedFlow = this.this$0.c;
            Flow takeWhile = FlowKt.takeWhile(sharedFlow, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ref$IntRef, flowCollector);
            this.label = 1;
            if (takeWhile.collect(anonymousClass2, this) == h) {
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
        return ((CachedPageEventFlow$downstreamFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
