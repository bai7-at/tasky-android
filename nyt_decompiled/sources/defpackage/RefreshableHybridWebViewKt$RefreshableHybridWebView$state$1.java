package defpackage;

import defpackage.zq3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
/* synthetic */ class RefreshableHybridWebViewKt$RefreshableHybridWebView$state$1 extends AdaptedFunctionReference implements qs2 {
    final /* synthetic */ CoroutineScope $refreshScope;
    final /* synthetic */ sy4 $refreshing$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshableHybridWebViewKt$RefreshableHybridWebView$state$1(CoroutineScope coroutineScope, sy4 sy4Var) {
        super(0, zq3.a.class, "refresh", "RefreshableHybridWebView$refresh(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;", 8);
        this.$refreshScope = coroutineScope;
        this.$refreshing$delegate = sy4Var;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m8invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8invoke() {
        RefreshableHybridWebViewKt.d(this.$refreshScope, this.$refreshing$delegate);
    }
}
