package com.nytimes.android.features.home.domain;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.w93;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.home.domain.HomeUseCase$retrieveData$2", f = "HomeUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeUseCase$retrieveData$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeUseCase$retrieveData$2(HomeUseCase homeUseCase, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeUseCase;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DownloadState downloadState, by0 by0Var) {
        return ((HomeUseCase$retrieveData$2) create(downloadState, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        HomeUseCase$retrieveData$2 homeUseCase$retrieveData$2 = new HomeUseCase$retrieveData$2(this.this$0, by0Var);
        homeUseCase$retrieveData$2.L$0 = obj;
        return homeUseCase$retrieveData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DownloadState downloadState = (DownloadState) this.L$0;
        bVar = this.this$0.e;
        w93.b(bVar, downloadState);
        return ww8.a;
    }
}
