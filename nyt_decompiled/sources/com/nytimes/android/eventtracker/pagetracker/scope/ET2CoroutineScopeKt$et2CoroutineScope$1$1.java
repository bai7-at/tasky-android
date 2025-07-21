package com.nytimes.android.eventtracker.pagetracker.scope;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt$et2CoroutineScope$1$1", f = "ET2CoroutineScope.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2CoroutineScopeKt$et2CoroutineScope$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ ET2CoroutineScope $et2Scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ET2CoroutineScopeKt$et2CoroutineScope$1$1(gt2 gt2Var, ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        super(2, by0Var);
        this.$block = gt2Var;
        this.$et2Scope = eT2CoroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ET2CoroutineScopeKt$et2CoroutineScope$1$1(this.$block, this.$et2Scope, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gt2 gt2Var = this.$block;
            ET2CoroutineScope eT2CoroutineScope = this.$et2Scope;
            this.label = 1;
            if (gt2Var.invoke(eT2CoroutineScope, this) == h) {
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
        return ((ET2CoroutineScopeKt$et2CoroutineScope$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
