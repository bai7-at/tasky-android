package com.nytimes.xwords.hybrid;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wu2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.xwords.hybrid.GamesHybridManager$updateHybridConfig$1", f = "GamesHybridManager.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesHybridManager$updateHybridConfig$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ wu2 $hybridConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesHybridManager$updateHybridConfig$1(wu2 wu2Var, by0 by0Var) {
        super(2, by0Var);
        this.$hybridConfig = wu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GamesHybridManager$updateHybridConfig$1(this.$hybridConfig, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = GamesHybridManager.c;
            wu2 wu2Var = this.$hybridConfig;
            this.label = 1;
            if (mutableSharedFlow.emit(wu2Var, this) == h) {
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
        return ((GamesHybridManager$updateHybridConfig$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
