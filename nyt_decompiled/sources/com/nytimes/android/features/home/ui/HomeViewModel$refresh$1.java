package com.nytimes.android.features.home.ui;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.z93;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.home.ui.HomeViewModel$refresh$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeViewModel$refresh$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$refresh$1(HomeViewModel homeViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeViewModel;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DownloadState downloadState, by0 by0Var) {
        return ((HomeViewModel$refresh$1) create(downloadState, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        HomeViewModel$refresh$1 homeViewModel$refresh$1 = new HomeViewModel$refresh$1(this.this$0, by0Var);
        homeViewModel$refresh$1.L$0 = obj;
        return homeViewModel$refresh$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z93 o;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DownloadState downloadState = (DownloadState) this.L$0;
        fy4 k = this.this$0.k();
        HomeViewModel homeViewModel = this.this$0;
        Object f = k.f();
        zq3.e(f);
        z93 z93Var = (z93) f;
        zq3.e(z93Var);
        o = homeViewModel.o(z93Var, downloadState);
        k.p(o);
        return ww8.a;
    }
}
