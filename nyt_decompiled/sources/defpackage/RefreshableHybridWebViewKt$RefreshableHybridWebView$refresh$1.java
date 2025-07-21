package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1", f = "RefreshableHybridWebView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $refreshing$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1(sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$refreshing$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1(this.$refreshing$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        RefreshableHybridWebViewKt.c(this.$refreshing$delegate, true);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
