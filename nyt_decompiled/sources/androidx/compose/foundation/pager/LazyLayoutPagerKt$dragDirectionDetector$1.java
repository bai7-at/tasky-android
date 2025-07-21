package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@fc1(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyLayoutPagerKt$dragDirectionDetector$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagerState $state;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {275}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ fy5 $$this$pointerInput;
        final /* synthetic */ PagerState $state;
        int label;

        @fc1(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {277, 281}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00301 extends RestrictedSuspendLambda implements gt2 {
            final /* synthetic */ PagerState $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00301(PagerState pagerState, by0 by0Var) {
                super(2, by0Var);
                this.$state = pagerState;
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a30 a30Var, by0 by0Var) {
                return ((C00301) create(a30Var, by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C00301 c00301 = new C00301(this.$state, by0Var);
                c00301.L$0 = obj;
                return c00301;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0065 -> B:6:0x0068). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L27
                    if (r1 != r2) goto L1f
                    java.lang.Object r1 = r10.L$2
                    vx5 r1 = (defpackage.vx5) r1
                    java.lang.Object r4 = r10.L$1
                    vx5 r4 = (defpackage.vx5) r4
                    java.lang.Object r5 = r10.L$0
                    a30 r5 = (defpackage.a30) r5
                    kotlin.f.b(r11)
                    goto L68
                L1f:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L27:
                    java.lang.Object r1 = r10.L$0
                    a30 r1 = (defpackage.a30) r1
                    kotlin.f.b(r11)
                    goto L44
                L2f:
                    kotlin.f.b(r11)
                    java.lang.Object r11 = r10.L$0
                    r1 = r11
                    a30 r1 = (defpackage.a30) r1
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r10.L$0 = r1
                    r10.label = r4
                    java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.d(r1, r3, r11, r10)
                    if (r11 != r0) goto L44
                    return r0
                L44:
                    vx5 r11 = (defpackage.vx5) r11
                    androidx.compose.foundation.pager.PagerState r4 = r10.$state
                    fd5$a r5 = defpackage.fd5.b
                    long r5 = r5.c()
                    r4.l0(r5)
                    r4 = 0
                    r5 = r1
                    r1 = r4
                    r4 = r11
                L55:
                    if (r1 != 0) goto L91
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r10.L$0 = r5
                    r10.L$1 = r4
                    r10.L$2 = r1
                    r10.label = r2
                    java.lang.Object r11 = r5.E(r11, r10)
                    if (r11 != r0) goto L68
                    return r0
                L68:
                    androidx.compose.ui.input.pointer.c r11 = (androidx.compose.ui.input.pointer.c) r11
                    java.util.List r6 = r11.c()
                    int r7 = r6.size()
                    r8 = r3
                L73:
                    if (r8 >= r7) goto L85
                    java.lang.Object r9 = r6.get(r8)
                    vx5 r9 = (defpackage.vx5) r9
                    boolean r9 = defpackage.nx5.c(r9)
                    if (r9 != 0) goto L82
                    goto L55
                L82:
                    int r8 = r8 + 1
                    goto L73
                L85:
                    java.util.List r11 = r11.c()
                    java.lang.Object r11 = r11.get(r3)
                    r1 = r11
                    vx5 r1 = (defpackage.vx5) r1
                    goto L55
                L91:
                    androidx.compose.foundation.pager.PagerState r10 = r10.$state
                    long r0 = r1.i()
                    long r2 = r4.i()
                    long r0 = defpackage.fd5.s(r0, r2)
                    r10.l0(r0)
                    ww8 r10 = defpackage.ww8.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00301.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(fy5 fy5Var, PagerState pagerState, by0 by0Var) {
            super(2, by0Var);
            this.$$this$pointerInput = fy5Var;
            this.$state = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$state, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                fy5 fy5Var = this.$$this$pointerInput;
                C00301 c00301 = new C00301(this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.c(fy5Var, c00301, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutPagerKt$dragDirectionDetector$1(PagerState pagerState, by0 by0Var) {
        super(2, by0Var);
        this.$state = pagerState;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LazyLayoutPagerKt$dragDirectionDetector$1 lazyLayoutPagerKt$dragDirectionDetector$1 = new LazyLayoutPagerKt$dragDirectionDetector$1(this.$state, by0Var);
        lazyLayoutPagerKt$dragDirectionDetector$1.L$0 = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((fy5) this.L$0, this.$state, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
