package com.nytimes.android.mainactivity;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import defpackage.yz3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.mainactivity.MainBottomNavUi$setupBanner$6", f = "MainBottomNavUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainBottomNavUi$setupBanner$6 extends SuspendLambda implements gt2 {
    final /* synthetic */ yz3 $bannerBinding;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainBottomNavUi$setupBanner$6(yz3 yz3Var, by0 by0Var) {
        super(2, by0Var);
        this.$bannerBinding = yz3Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(u14 u14Var, by0 by0Var) {
        return ((MainBottomNavUi$setupBanner$6) create(u14Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MainBottomNavUi$setupBanner$6 mainBottomNavUi$setupBanner$6 = new MainBottomNavUi$setupBanner$6(this.$bannerBinding, by0Var);
        mainBottomNavUi$setupBanner$6.L$0 = obj;
        return mainBottomNavUi$setupBanner$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        u14 u14Var = (u14) this.L$0;
        if (u14Var instanceof u14.a) {
            this.$bannerBinding.getRoot().setVisibility(8);
        } else if (!(u14Var instanceof u14.c)) {
            boolean z = u14Var instanceof u14.b;
        }
        return ww8.a;
    }
}
