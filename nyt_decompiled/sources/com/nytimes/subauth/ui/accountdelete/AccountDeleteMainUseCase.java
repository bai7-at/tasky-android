package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import com.nytimes.subauth.ui.accountdelete.a;
import defpackage.by0;
import defpackage.o98;
import defpackage.zq3;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public class AccountDeleteMainUseCase implements a {
    private final o98 a;

    public AccountDeleteMainUseCase(o98 o98Var) {
        zq3.h(o98Var, "subauthUser");
        this.a = o98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase r13, kotlinx.coroutines.flow.MutableStateFlow r14, defpackage.by0 r15) {
        /*
            boolean r0 = r15 instanceof com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase$requestDelete$1
            if (r0 == 0) goto L13
            r0 = r15
            com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase$requestDelete$1 r0 = (com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase$requestDelete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase$requestDelete$1 r0 = new com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase$requestDelete$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r13 = r0.L$1
            r14 = r13
            kotlinx.coroutines.flow.MutableStateFlow r14 = (kotlinx.coroutines.flow.MutableStateFlow) r14
            java.lang.Object r13 = r0.L$0
            com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase r13 = (com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase) r13
            kotlin.f.b(r15)
        L31:
            r2 = r14
            r12 = r15
            r15 = r13
            r13 = r12
            goto L69
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            kotlin.f.b(r15)
        L41:
            java.lang.Object r15 = r14.getValue()
            r4 = r15
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$a r4 = (com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel.a) r4
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$AccountDeleteDialogState r6 = com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel.AccountDeleteDialogState.NONE
            r9 = 9
            r10 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$a r2 = com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel.a.c(r4, r5, r6, r7, r8, r9, r10)
            boolean r15 = r14.compareAndSet(r15, r2)
            if (r15 == 0) goto L41
            o98 r15 = r13.a
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.q(r0)
            if (r15 != r1) goto L31
            return r1
        L69:
            r4 = r13
            com.nytimes.android.subauth.core.auth.models.a r4 = (com.nytimes.android.subauth.core.auth.models.a) r4
        L6c:
            java.lang.Object r13 = r2.getValue()
            r5 = r13
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$a r5 = (com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel.a) r5
            r10 = 11
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$a r14 = com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel.a.c(r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r2.compareAndSet(r13, r14)
            if (r13 == 0) goto L6c
            com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$AccountDeleteDialogState r13 = r15.c(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase.d(com.nytimes.subauth.ui.accountdelete.AccountDeleteMainUseCase, kotlinx.coroutines.flow.MutableStateFlow, by0):java.lang.Object");
    }

    @Override // com.nytimes.subauth.ui.accountdelete.a
    public void a(DeleteAccountStatusOverride deleteAccountStatusOverride) {
        a.C0448a.b(this, deleteAccountStatusOverride);
    }

    @Override // com.nytimes.subauth.ui.accountdelete.a
    public Object b(MutableStateFlow mutableStateFlow, by0 by0Var) {
        return d(this, mutableStateFlow, by0Var);
    }

    public AccountDeleteViewModel.AccountDeleteDialogState c(com.nytimes.android.subauth.core.auth.models.a aVar) {
        return a.C0448a.a(this, aVar);
    }
}
