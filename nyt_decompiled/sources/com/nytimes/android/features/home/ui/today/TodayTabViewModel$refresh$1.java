package com.nytimes.android.features.home.ui.today;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.bn8;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.home.ui.today.TodayTabViewModel$refresh$1", f = "TodayTabViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TodayTabViewModel$refresh$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TodayTabViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TodayTabViewModel$refresh$1(TodayTabViewModel todayTabViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = todayTabViewModel;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DownloadState downloadState, by0 by0Var) {
        return ((TodayTabViewModel$refresh$1) create(downloadState, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TodayTabViewModel$refresh$1 todayTabViewModel$refresh$1 = new TodayTabViewModel$refresh$1(this.this$0, by0Var);
        todayTabViewModel$refresh$1.L$0 = obj;
        return todayTabViewModel$refresh$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        bn8 bn8Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DownloadState downloadState = (DownloadState) this.L$0;
        if (!downloadState.b()) {
            bn8Var = this.this$0.c;
            bn8Var.b();
        }
        mutableStateFlow = this.this$0.e;
        mutableStateFlow.setValue(downloadState);
        return ww8.a;
    }
}
