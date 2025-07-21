package com.nytimes.android.utils.composeutils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.PausingDispatcherKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1", f = "LifecycleUtils.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ Lifecycle $lifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1(Lifecycle lifecycle, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$lifecycle = lifecycle;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1(this.$lifecycle, this.$block, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Lifecycle lifecycle = this.$lifecycle;
            gt2 gt2Var = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.b(lifecycle, gt2Var, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
