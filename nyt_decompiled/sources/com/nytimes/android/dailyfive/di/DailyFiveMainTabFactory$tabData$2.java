package com.nytimes.android.dailyfive.di;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory$tabData$2", f = "DailyFiveMainTabFactory.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveMainTabFactory$tabData$2 extends SuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    DailyFiveMainTabFactory$tabData$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a aVar, LottieComposition lottieComposition, by0 by0Var) {
        DailyFiveMainTabFactory$tabData$2 dailyFiveMainTabFactory$tabData$2 = new DailyFiveMainTabFactory$tabData$2(by0Var);
        dailyFiveMainTabFactory$tabData$2.L$0 = aVar;
        dailyFiveMainTabFactory$tabData$2.L$1 = lottieComposition;
        return dailyFiveMainTabFactory$tabData$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a aVar = (a) this.L$0;
            LottieComposition lottieComposition = (LottieComposition) this.L$1;
            this.L$0 = null;
            this.label = 1;
            if (a.C0136a.a(aVar, lottieComposition, 0, 1, false, 0.0f, null, 0.0f, false, null, false, false, this, 2042, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
