package com.nytimes.android.composable;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.composable.MainBottomNavigationKt$MainIcon$2$1$1", f = "MainBottomNavigation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainBottomNavigationKt$MainIcon$2$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Integer $numberOfUpdates;
    final /* synthetic */ ss2 $sendUpdateBadgeImpression;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainBottomNavigationKt$MainIcon$2$1$1(ss2 ss2Var, Integer num, by0 by0Var) {
        super(2, by0Var);
        this.$sendUpdateBadgeImpression = ss2Var;
        this.$numberOfUpdates = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MainBottomNavigationKt$MainIcon$2$1$1(this.$sendUpdateBadgeImpression, this.$numberOfUpdates, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$sendUpdateBadgeImpression.invoke(String.valueOf(this.$numberOfUpdates));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MainBottomNavigationKt$MainIcon$2$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
