package com.nytimes.subauth.ui.login;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i77;
import defpackage.na4;
import defpackage.p54;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$forceOneTapAccountReadyFlow$1", f = "SubauthLoginViewModel.kt", l = {1218}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$forceOneTapAccountReadyFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $isRegisterFlow;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$forceOneTapAccountReadyFlow$1(SubauthLoginViewModel subauthLoginViewModel, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$isRegisterFlow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$forceOneTapAccountReadyFlow$1(this.this$0, this.$isRegisterFlow, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NYTUser nYTUser;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.u = this.$isRegisterFlow ? new p54.f(i77.b.b) : new p54.e(i77.b.b);
            SubauthLoginViewModel subauthLoginViewModel = this.this$0;
            nYTUser = subauthLoginViewModel.a;
            String d = nYTUser.d();
            if (d == null) {
                d = "";
            }
            na4.g gVar = na4.g.a;
            boolean z = this.$isRegisterFlow;
            this.label = 1;
            if (subauthLoginViewModel.K0(d, gVar, z, this) == h) {
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
        return ((SubauthLoginViewModel$forceOneTapAccountReadyFlow$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
