package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onButtonPressed$1", f = "SubauthLoginViewModel.kt", l = {1142, 1144}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onButtonPressed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $executeFunction;
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onButtonPressed$1(SubauthLoginViewModel subauthLoginViewModel, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
        this.$executeFunction = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onButtonPressed$1(this.this$0, this.$executeFunction, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r6)
            goto L79
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            kotlin.f.b(r6)
            goto L4d
        L1e:
            kotlin.f.b(r6)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r6)
            java.lang.Boolean r1 = defpackage.cc0.a(r3)
            r6.setValue(r1)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            boolean r6 = r6.j0()
            if (r6 == 0) goto L58
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            com.nytimes.subauth.ui.models.SubauthUiParams r6 = r6.Z()
            boolean r6 = r6.d()
            if (r6 == 0) goto L4d
            r5.label = r3
            r3 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L4d
            return r0
        L4d:
            ss2 r6 = r5.$executeFunction
            r5.label = r2
            java.lang.Object r5 = r6.invoke(r5)
            if (r5 != r0) goto L79
            return r0
        L58:
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.s(r6)
            r0 = 0
            java.lang.Boolean r0 = defpackage.cc0.a(r0)
            r6.setValue(r0)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.t(r6)
            com.nytimes.subauth.ui.login.SubauthLoginViewModel r5 = r5.this$0
            dr2 r5 = com.nytimes.subauth.ui.login.SubauthLoginViewModel.l(r5)
            na4$b r5 = r5.g()
            r6.setValue(r5)
        L79:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.login.SubauthLoginViewModel$onButtonPressed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$onButtonPressed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
