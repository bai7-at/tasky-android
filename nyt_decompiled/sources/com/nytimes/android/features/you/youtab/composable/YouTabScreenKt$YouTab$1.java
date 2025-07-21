package com.nytimes.android.features.you.youtab.composable;

import com.nytimes.android.features.you.youtab.YouTabPreferencesStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.km9;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabScreenKt$YouTab$1", f = "YouTabScreen.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouTabScreenKt$YouTab$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ km9 $entryPoint;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouTabScreenKt$YouTab$1(km9 km9Var, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = km9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouTabScreenKt$YouTab$1(this.$entryPoint, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            YouTabPreferencesStore t = this.$entryPoint.t();
            this.label = 1;
            if (t.c(false, this) == h) {
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
        return ((YouTabScreenKt$YouTab$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
