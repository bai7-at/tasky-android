package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.o98;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.MainActivity$onCreateActivity$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainActivity$onCreateActivity$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onCreateActivity$1(MainActivity mainActivity, by0<? super MainActivity$onCreateActivity$1> by0Var) {
        super(2, by0Var);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        MainActivity$onCreateActivity$1 mainActivity$onCreateActivity$1 = new MainActivity$onCreateActivity$1(this.this$0, by0Var);
        mainActivity$onCreateActivity$1.L$0 = obj;
        return mainActivity$onCreateActivity$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(o98.b bVar, by0<? super ww8> by0Var) {
        return ((MainActivity$onCreateActivity$1) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.this$0.getForcedLogoutAlert().displayForcedLogoutAlert(((o98.b) this.L$0).a());
        return ww8.a;
    }
}
