package androidx.paging;

import defpackage.bj3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPageEventFlow$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<PageEvent> $src;
    int label;
    final /* synthetic */ CachedPageEventFlow this$0;

    /* renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ CachedPageEventFlow a;

        AnonymousClass1(CachedPageEventFlow cachedPageEventFlow) {
            this.a = cachedPageEventFlow;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.bj3 r6, defpackage.by0 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.f.b(r7)
                goto L6b
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.L$1
                r6 = r5
                bj3 r6 = (defpackage.bj3) r6
                java.lang.Object r5 = r0.L$0
                androidx.paging.CachedPageEventFlow$job$1$1 r5 = (androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1) r5
                kotlin.f.b(r7)
                goto L57
            L41:
                kotlin.f.b(r7)
                androidx.paging.CachedPageEventFlow r7 = r5.a
                kotlinx.coroutines.flow.MutableSharedFlow r7 = androidx.paging.CachedPageEventFlow.b(r7)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = r7.emit(r6, r0)
                if (r7 != r1) goto L57
                return r1
            L57:
                androidx.paging.CachedPageEventFlow r5 = r5.a
                androidx.paging.FlattenedPageController r5 = androidx.paging.CachedPageEventFlow.c(r5)
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r5 = r5.c(r6, r0)
                if (r5 != r1) goto L6b
                return r1
            L6b:
                ww8 r5 = defpackage.ww8.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1.emit(bj3, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$job$1(Flow flow, CachedPageEventFlow cachedPageEventFlow, by0 by0Var) {
        super(2, by0Var);
        this.$src = flow;
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Flow<bj3> withIndex = FlowKt.withIndex(this.$src);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (withIndex.collect(anonymousClass1, this) == h) {
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
        return ((CachedPageEventFlow$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
