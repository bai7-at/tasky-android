package com.nytimes.android.dailyfive.ui;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.gt2;
import defpackage.p81;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.dailyfive.ui.DailyFiveViewModel$refresh$1", f = "DailyFiveViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveViewModel$refresh$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DailyFiveViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveViewModel$refresh$1(DailyFiveViewModel dailyFiveViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dailyFiveViewModel;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DownloadState downloadState, by0 by0Var) {
        return ((DailyFiveViewModel$refresh$1) create(downloadState, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DailyFiveViewModel$refresh$1 dailyFiveViewModel$refresh$1 = new DailyFiveViewModel$refresh$1(this.this$0, by0Var);
        dailyFiveViewModel$refresh$1.L$0 = obj;
        return dailyFiveViewModel$refresh$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p81 o;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DownloadState downloadState = (DownloadState) this.L$0;
        fy4 j = this.this$0.j();
        DailyFiveViewModel dailyFiveViewModel = this.this$0;
        Object f = j.f();
        zq3.e(f);
        p81 p81Var = (p81) f;
        zq3.e(p81Var);
        o = dailyFiveViewModel.o(p81Var, downloadState);
        j.p(o);
        return ww8.a;
    }
}
