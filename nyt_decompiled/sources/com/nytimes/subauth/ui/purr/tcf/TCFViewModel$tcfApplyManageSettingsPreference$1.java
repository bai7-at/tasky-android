package com.nytimes.subauth.ui.purr.tcf;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$tcfApplyManageSettingsPreference$1", f = "TCFViewModel.kt", l = {338, 340, 348}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$tcfApplyManageSettingsPreference$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $analyticsAction;
    final /* synthetic */ ss2 $applyPreferenceAction;
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$tcfApplyManageSettingsPreference$1(TCFViewModel tCFViewModel, ss2 ss2Var, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = tCFViewModel;
        this.$applyPreferenceAction = ss2Var;
        this.$analyticsAction = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TCFViewModel$tcfApplyManageSettingsPreference$1(this.this$0, this.$applyPreferenceAction, this.$analyticsAction, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:16:0x001f, B:17:0x005b, B:19:0x006d, B:20:0x0025, B:21:0x0044, B:23:0x004c, B:26:0x0075, B:27:0x007d, B:30:0x0034), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.f.b(r7)
            goto L98
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1f:
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L23
            goto L5b
        L23:
            r7 = move-exception
            goto L7e
        L25:
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L23
            goto L44
        L29:
            kotlin.f.b(r7)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            boolean r7 = r7.t()
            if (r7 == 0) goto Lb8
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.i(r7, r5)     // Catch: java.lang.Exception -> L23
            ss2 r7 = r6.$applyPreferenceAction     // Catch: java.lang.Exception -> L23
            r6.label = r5     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Exception -> L23
            if (r7 != r0) goto L44
            return r0
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L23
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L23
            if (r7 == 0) goto L75
            gt2 r7 = r6.$analyticsAction     // Catch: java.lang.Exception -> L23
            java.lang.Boolean r1 = defpackage.cc0.a(r5)     // Catch: java.lang.Exception -> L23
            r6.label = r3     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r7.invoke(r1, r6)     // Catch: java.lang.Exception -> L23
            if (r7 != r0) goto L5b
            return r0
        L5b:
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.i(r7, r4)     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.k(r7, r4)     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L23
            boolean r7 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.g(r7)     // Catch: java.lang.Exception -> L23
            if (r7 != 0) goto Ld2
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r1 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.TCFScreenValue.FINISH     // Catch: java.lang.Exception -> L23
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.l(r7, r1)     // Catch: java.lang.Exception -> L23
            goto Ld2
        L75:
            com.nytimes.subauth.ui.purr.tcf.TCFException r7 = new com.nytimes.subauth.ui.purr.tcf.TCFException     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "TCF apply preference failed"
            r5 = 0
            r7.<init>(r1, r5, r3, r5)     // Catch: java.lang.Exception -> L23
            throw r7     // Catch: java.lang.Exception -> L23
        L7e:
            ul8$b r1 = defpackage.ul8.a
            java.lang.String r3 = "PURR"
            ul8$c r1 = r1.z(r3)
            r1.e(r7)
            gt2 r7 = r6.$analyticsAction
            java.lang.Boolean r1 = defpackage.cc0.a(r4)
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L98
            return r0
        L98:
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.i(r7, r4)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            int r0 = defpackage.mm6.tcf_save_failure
            java.lang.Integer r0 = defpackage.cc0.c(r0)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.j(r7, r0)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            boolean r7 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.g(r7)
            if (r7 == 0) goto Ld2
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r6 = r6.this$0
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r7 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.TCFScreenValue.FINISH
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.l(r6, r7)
            goto Ld2
        Lb8:
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            int r0 = defpackage.mm6.purr_ui_error_device_offline
            java.lang.Integer r0 = defpackage.cc0.c(r0)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.j(r7, r0)
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r7 = r6.this$0
            boolean r7 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.g(r7)
            if (r7 == 0) goto Ld2
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel r6 = r6.this$0
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r7 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.TCFScreenValue.FINISH
            com.nytimes.subauth.ui.purr.tcf.TCFViewModel.l(r6, r7)
        Ld2:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$tcfApplyManageSettingsPreference$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TCFViewModel$tcfApplyManageSettingsPreference$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
