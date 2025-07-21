package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$cachedStore$1", f = "CookingViewModel.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CookingViewModel$cachedStore$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ CookingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookingViewModel$cachedStore$1(CookingViewModel cookingViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = cookingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CookingViewModel$cachedStore$1(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((CookingViewModel$cachedStore$1) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CookingViewModel cookingViewModel = this.this$0;
            this.label = 1;
            obj = cookingViewModel.r(this);
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
