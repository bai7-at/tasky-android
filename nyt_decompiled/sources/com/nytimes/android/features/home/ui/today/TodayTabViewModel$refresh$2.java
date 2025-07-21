package com.nytimes.android.features.home.ui.today;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.logging.NYTLogger;
import defpackage.bn8;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.home.ui.today.TodayTabViewModel$refresh$2", f = "TodayTabViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TodayTabViewModel$refresh$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TodayTabViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TodayTabViewModel$refresh$2(TodayTabViewModel todayTabViewModel, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = todayTabViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bn8 bn8Var;
        MutableStateFlow mutableStateFlow;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Throwable th = (Throwable) this.L$0;
        NYTLogger.h(th);
        bn8Var = this.this$0.c;
        bn8Var.b();
        mutableStateFlow = this.this$0.e;
        mutableStateFlow.setValue(new DownloadState.a(th));
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        TodayTabViewModel$refresh$2 todayTabViewModel$refresh$2 = new TodayTabViewModel$refresh$2(this.this$0, by0Var);
        todayTabViewModel$refresh$2.L$0 = th;
        return todayTabViewModel$refresh$2.invokeSuspend(ww8.a);
    }
}
