package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.cc0;
import defpackage.e15;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.na4;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3", f = "SubauthLoginViewModel.kt", l = {925, 930, 936}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $isFromRegistration;
    final /* synthetic */ na4 $loginState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3(SubauthLoginViewModel subauthLoginViewModel, na4 na4Var, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$loginState = na4Var;
        this.$isFromRegistration = z;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(e15 e15Var, by0 by0Var) {
        return ((SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3) create(e15Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3 subauthLoginViewModel$handleAppSetupAtEndOfLIRE$3 = new SubauthLoginViewModel$handleAppSetupAtEndOfLIRE$3(this.this$0, this.$loginState, this.$isFromRegistration, by0Var);
        subauthLoginViewModel$handleAppSetupAtEndOfLIRE$3.L$0 = obj;
        return subauthLoginViewModel$handleAppSetupAtEndOfLIRE$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object c0;
        Object c02;
        Object d0;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            e15 e15Var = (e15) this.L$0;
            ul8.a.z("SUBAUTH").a("Handle App Setup at end of LIRE: " + e15Var, new Object[0]);
            if (zq3.c(e15Var, e15.d.a) ? true : zq3.c(e15Var, e15.e.a)) {
                SubauthLoginViewModel subauthLoginViewModel = this.this$0;
                na4 na4Var = this.$loginState;
                this.label = 1;
                d0 = subauthLoginViewModel.d0(na4Var, this);
                if (d0 == h) {
                    return h;
                }
            } else if (zq3.c(e15Var, e15.b.a)) {
                SubauthLoginViewModel subauthLoginViewModel2 = this.this$0;
                boolean z = this.$isFromRegistration;
                this.label = 2;
                c02 = subauthLoginViewModel2.c0("Missing NYT-S Cookie", z, this);
                if (c02 == h) {
                    return h;
                }
            } else if (e15Var instanceof e15.a) {
                SubauthLoginViewModel subauthLoginViewModel3 = this.this$0;
                String a = ((e15.a) e15Var).a();
                boolean z2 = this.$isFromRegistration;
                this.label = 3;
                c0 = subauthLoginViewModel3.c0(a, z2, this);
                if (c0 == h) {
                    return h;
                }
            } else if (e15Var instanceof e15.c) {
                mutableStateFlow = this.this$0.x;
                mutableStateFlow.setValue(cc0.a(true));
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
