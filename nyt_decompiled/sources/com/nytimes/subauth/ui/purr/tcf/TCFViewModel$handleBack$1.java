package com.nytimes.subauth.ui.purr.tcf;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.om0;
import defpackage.q96;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$handleBack$1", f = "TCFViewModel.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$handleBack$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$handleBack$1(TCFViewModel tCFViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = tCFViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TCFViewModel$handleBack$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.c;
            q96.b.e eVar = new q96.b.e(om0.b.c);
            this.label = 1;
            if (mutableSharedFlow.emit(eVar, this) == h) {
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
        return ((TCFViewModel$handleBack$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
