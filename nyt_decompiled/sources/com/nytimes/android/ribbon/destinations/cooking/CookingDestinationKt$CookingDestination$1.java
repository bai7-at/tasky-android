package com.nytimes.android.ribbon.destinations.cooking;

import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.cooking.CookingDestinationKt$CookingDestination$1", f = "CookingDestination.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CookingDestinationKt$CookingDestination$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $defaultTabLoaded;
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ CookingViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingDestinationKt$CookingDestination$1(fm9 fm9Var, boolean z, CookingViewModel cookingViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$tracker = fm9Var;
        this.$defaultTabLoaded = z;
        this.$viewModel = cookingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CookingDestinationKt$CookingDestination$1(this.$tracker, this.$defaultTabLoaded, this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.n(RibbonConfig.COOKING.getId());
        }
        if (this.$defaultTabLoaded) {
            CookingViewModel.A(this.$viewModel, null, false, 3, null);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((CookingDestinationKt$CookingDestination$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
