package com.nytimes.subauth.ui.purr.privacysettings;

import com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsSnackbarState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1", f = "PrivacySettingsViewModel.kt", l = {82, 88, 91, 101, 104}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrivacySettingsViewModel$optOutCCPA$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ PrivacySettingsViewModel this$0;

    @fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$1", f = "PrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ boolean $isLoggedIn;
        int label;
        final /* synthetic */ PrivacySettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, PrivacySettingsViewModel privacySettingsViewModel, by0 by0Var) {
            super(2, by0Var);
            this.$isLoggedIn = z;
            this.this$0 = privacySettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$isLoggedIn, this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            if (this.$isLoggedIn) {
                mutableStateFlow2 = this.this$0.r;
                mutableStateFlow2.setValue(PrivacySettingsSnackbarState.CCPA_REGI);
            } else {
                mutableStateFlow = this.this$0.r;
                mutableStateFlow.setValue(PrivacySettingsSnackbarState.CCPA_ANON);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsViewModel$optOutCCPA$1(PrivacySettingsViewModel privacySettingsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = privacySettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PrivacySettingsViewModel$optOutCCPA$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 == r7) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L26
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L21:
            kotlin.f.b(r9)
            goto L9d
        L26:
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L9d
        L2b:
            r9 = move-exception
            goto L87
        L2d:
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L67
        L31:
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L5a
        L35:
            kotlin.f.b(r9)
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r9 = r8.this$0
            h55 r9 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.g(r9)
            boolean r9 = r9.a()
            if (r9 == 0) goto L92
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r9 = r8.this$0     // Catch: java.lang.Exception -> L2b
            kotlinx.coroutines.CoroutineDispatcher r9 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.e(r9)     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$response$1 r1 = new com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$response$1     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r2 = r8.this$0     // Catch: java.lang.Exception -> L2b
            r1.<init>(r2, r6)     // Catch: java.lang.Exception -> L2b
            r8.label = r7     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L5a
            return r0
        L5a:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r9 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r9     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r1 = r8.this$0     // Catch: java.lang.Exception -> L2b
            r8.label = r5     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.r(r1, r9, r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L67
            return r0
        L67:
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r9 = r8.this$0     // Catch: java.lang.Exception -> L2b
            com.nytimes.android.subauth.core.api.client.NYTUser r9 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.i(r9)     // Catch: java.lang.Exception -> L2b
            boolean r9 = r9.r()     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r1 = r8.this$0     // Catch: java.lang.Exception -> L2b
            kotlinx.coroutines.CoroutineDispatcher r1 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.f(r1)     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$1 r2 = new com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1$1     // Catch: java.lang.Exception -> L2b
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r5 = r8.this$0     // Catch: java.lang.Exception -> L2b
            r2.<init>(r9, r5, r6)     // Catch: java.lang.Exception -> L2b
            r8.label = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r1, r2, r8)     // Catch: java.lang.Exception -> L2b
            if (r8 != r0) goto L9d
            return r0
        L87:
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r1 = r8.this$0
            r8.label = r3
            java.lang.Object r8 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.p(r1, r9, r8)
            if (r8 != r0) goto L9d
            return r0
        L92:
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r9 = r8.this$0
            r8.label = r2
            java.lang.Object r8 = com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.p(r9, r6, r8)
            if (r8 != r0) goto L9d
            return r0
        L9d:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$optOutCCPA$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PrivacySettingsViewModel$optOutCCPA$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
