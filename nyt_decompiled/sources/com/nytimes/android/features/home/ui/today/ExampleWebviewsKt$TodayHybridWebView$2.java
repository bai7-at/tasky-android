package com.nytimes.android.features.home.ui.today;

import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.b27;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.of9;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$2", f = "ExampleWebviews.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ExampleWebviewsKt$TodayHybridWebView$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ b27 $entryPoint;
    final /* synthetic */ qs2 $isCurrentPage;
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ HybridWebView $webView;
    int label;

    @fc1(c = "com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$2$1", f = "ExampleWebviews.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ qs2 $isCurrentPage;
        final /* synthetic */ fe4 $mainTabState;
        final /* synthetic */ HybridWebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(qs2 qs2Var, fe4 fe4Var, HybridWebView hybridWebView, by0 by0Var) {
            super(2, by0Var);
            this.$isCurrentPage = qs2Var;
            this.$mainTabState = fe4Var;
            this.$webView = hybridWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$isCurrentPage, this.$mainTabState, this.$webView, by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(ww8 ww8Var, by0 by0Var) {
            return ((AnonymousClass1) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            if (((Boolean) this.$isCurrentPage.mo865invoke()).booleanValue()) {
                this.$mainTabState.e().j(0.0f);
                of9.b(this.$webView, 0, 1, null);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExampleWebviewsKt$TodayHybridWebView$2(b27 b27Var, HybridWebView hybridWebView, fe4 fe4Var, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = b27Var;
        this.$webView = hybridWebView;
        this.$mainTabState = fe4Var;
        this.$isCurrentPage = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ExampleWebviewsKt$TodayHybridWebView$2(this.$entryPoint, this.$webView, this.$mainTabState, this.$isCurrentPage, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.$entryPoint.q0().a(this.$webView);
            Flow a = this.$mainTabState.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isCurrentPage, this.$mainTabState, this.$webView, null);
            this.label = 1;
            if (FlowKt.collectLatest(a, anonymousClass1, this) == h) {
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
        return ((ExampleWebviewsKt$TodayHybridWebView$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
