package com.nytimes.android.onboarding.compose.register;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.onboarding.compose.register.RegisterAccountViewModel$nextScreen$1", f = "RegisterAccountViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RegisterAccountViewModel$nextScreen$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ RegisterAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegisterAccountViewModel$nextScreen$1(RegisterAccountViewModel registerAccountViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = registerAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RegisterAccountViewModel$nextScreen$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        b bVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2SimpleScope = this.this$0.a;
            ET2PageScope.DefaultImpls.a(eT2SimpleScope, new e52.e(), new s42("continue", "not now", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
            bVar = this.this$0.b;
            c.d dVar = c.d.b;
            this.label = 1;
            if (bVar.d(dVar, this) == h) {
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
        return ((RegisterAccountViewModel$nextScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
