package com.nytimes.subauth.ui.purr.tcf;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.om0;
import defpackage.q96;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$tcfAcceptAll$2", f = "TCFViewModel.kt", l = {ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$tcfAcceptAll$2 extends SuspendLambda implements gt2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$tcfAcceptAll$2(TCFViewModel tCFViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = tCFViewModel;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((TCFViewModel$tcfAcceptAll$2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TCFViewModel$tcfAcceptAll$2 tCFViewModel$tcfAcceptAll$2 = new TCFViewModel$tcfAcceptAll$2(this.this$0, by0Var);
        tCFViewModel$tcfAcceptAll$2.Z$0 = ((Boolean) obj).booleanValue();
        return tCFViewModel$tcfAcceptAll$2;
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
            q96.b.a aVar = new q96.b.a(z, om0.a.c);
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == h) {
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
