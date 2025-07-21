package com.nytimes.subauth.ui.purr.tcf;

import com.comscore.streaming.ContentFeedType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q96;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$onFidesUpdated$6", f = "TCFViewModel.kt", l = {ContentFeedType.WEST_SD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$onFidesUpdated$6 extends SuspendLambda implements gt2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$onFidesUpdated$6(TCFViewModel tCFViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = tCFViewModel;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((TCFViewModel$onFidesUpdated$6) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TCFViewModel$onFidesUpdated$6 tCFViewModel$onFidesUpdated$6 = new TCFViewModel$onFidesUpdated$6(this.this$0, by0Var);
        tCFViewModel$onFidesUpdated$6.Z$0 = ((Boolean) obj).booleanValue();
        return tCFViewModel$onFidesUpdated$6;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            boolean z = this.Z$0;
            MutableSharedFlow mutableSharedFlow = this.this$0.c;
            q96.c cVar = new q96.c(z);
            this.label = 1;
            if (mutableSharedFlow.emit(cVar, this) == h) {
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
