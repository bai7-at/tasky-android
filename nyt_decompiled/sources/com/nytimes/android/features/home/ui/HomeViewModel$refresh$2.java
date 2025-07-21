package com.nytimes.android.features.home.ui;

import com.nytimes.android.designsystem.uiview.ProgressVisibility;
import com.nytimes.android.features.home.ui.b;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.it2;
import defpackage.ww8;
import defpackage.z93;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.home.ui.HomeViewModel$refresh$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeViewModel$refresh$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$refresh$2(HomeViewModel homeViewModel, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.h((Throwable) this.L$0);
        fy4 k = this.this$0.k();
        Object f = k.f();
        zq3.e(f);
        z93 z93Var = (z93) f;
        zq3.e(z93Var);
        k.p(z93.b(z93Var, null, ProgressVisibility.INVISIBLE, 1, null));
        this.this$0.i().p(b.C0286b.a);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        HomeViewModel$refresh$2 homeViewModel$refresh$2 = new HomeViewModel$refresh$2(this.this$0, by0Var);
        homeViewModel$refresh$2.L$0 = th;
        return homeViewModel$refresh$2.invokeSuspend(ww8.a);
    }
}
