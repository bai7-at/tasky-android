package com.nytimes.android.ribbon.destinations.today;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.features.home.ui.today.TodayTabViewModel;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.cn8;
import defpackage.fc1;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.l93;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.today.TodayDestinationKt$TodayDestination$1", f = "TodayDestination.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TodayDestinationKt$TodayDestination$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ x08 $downloadState$delegate;
    final /* synthetic */ cn8 $todayTabTracing;
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ TodayTabViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TodayDestinationKt$TodayDestination$1(fm9 fm9Var, cn8 cn8Var, TodayTabViewModel todayTabViewModel, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$tracker = fm9Var;
        this.$todayTabTracing = cn8Var;
        this.$viewModel = todayTabViewModel;
        this.$downloadState$delegate = x08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TodayDestinationKt$TodayDestination$1(this.$tracker, this.$todayTabTracing, this.$viewModel, this.$downloadState$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DownloadState b;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.n(RibbonConfig.TODAY.getId());
        }
        cn8 cn8Var = this.$todayTabTracing;
        if (cn8Var != null) {
            cn8Var.i("TodayPanelStart");
        }
        TodayTabViewModel todayTabViewModel = this.$viewModel;
        b = TodayDestinationKt.b(this.$downloadState$delegate);
        todayTabViewModel.j(false, (l93) b.a());
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TodayDestinationKt$TodayDestination$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
