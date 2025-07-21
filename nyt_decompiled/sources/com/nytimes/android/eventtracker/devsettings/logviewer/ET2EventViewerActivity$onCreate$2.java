package com.nytimes.android.eventtracker.devsettings.logviewer;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qx1;
import defpackage.r42;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$2", f = "ET2EventViewerActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2EventViewerActivity$onCreate$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ET2EventViewerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ET2EventViewerActivity$onCreate$2(ET2EventViewerActivity eT2EventViewerActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eT2EventViewerActivity;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(r42.b bVar, by0 by0Var) {
        return ((ET2EventViewerActivity$onCreate$2) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ET2EventViewerActivity$onCreate$2 eT2EventViewerActivity$onCreate$2 = new ET2EventViewerActivity$onCreate$2(this.this$0, by0Var);
        eT2EventViewerActivity$onCreate$2.L$0 = obj;
        return eT2EventViewerActivity$onCreate$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qx1 qx1Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        r42.b bVar = (r42.b) this.L$0;
        qx1Var = this.this$0.e;
        if (qx1Var != null) {
            qx1Var.N(bVar);
        }
        return ww8.a;
    }
}
