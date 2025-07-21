package com.nytimes.android.features.home.domain;

import com.nytimes.android.features.home.data.HomeCacheManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.home.domain.HomeUseCase$parallelStore$2", f = "HomeUseCase.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeUseCase$parallelStore$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ HomeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeUseCase$parallelStore$2(HomeUseCase homeUseCase, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeUseCase;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, by0 by0Var) {
        return ((HomeUseCase$parallelStore$2) create(str, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeUseCase$parallelStore$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeCacheManager homeCacheManager;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            homeCacheManager = this.this$0.b;
            this.label = 1;
            obj = homeCacheManager.f(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
