package com.nytimes.android.dailyfive.ui;

import com.nytimes.android.dailyfive.ui.a;
import com.nytimes.android.designsystem.uiview.ProgressVisibility;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.it2;
import defpackage.p81;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.dailyfive.ui.DailyFiveViewModel$refresh$2", f = "DailyFiveViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveViewModel$refresh$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DailyFiveViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveViewModel$refresh$2(DailyFiveViewModel dailyFiveViewModel, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = dailyFiveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.h((Throwable) this.L$0);
        fy4 j = this.this$0.j();
        Object f = j.f();
        zq3.e(f);
        p81 p81Var = (p81) f;
        zq3.e(p81Var);
        j.p(p81.b(p81Var, null, ProgressVisibility.INVISIBLE, 1, null));
        this.this$0.i().p(a.c.a);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        DailyFiveViewModel$refresh$2 dailyFiveViewModel$refresh$2 = new DailyFiveViewModel$refresh$2(this.this$0, by0Var);
        dailyFiveViewModel$refresh$2.L$0 = th;
        return dailyFiveViewModel$refresh$2.invokeSuspend(ww8.a);
    }
}
