package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import android.content.Intent;
import com.google.android.gms.common.api.ApiException;
import com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper;
import defpackage.by0;
import defpackage.h77;
import defpackage.og8;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class GoogleSignInHelper {
    private final GoogleSdkWrapper a;
    private final MutableSharedFlow b;

    public GoogleSignInHelper(GoogleSdkWrapper googleSdkWrapper) {
        zq3.h(googleSdkWrapper, "googleSdkWrapper");
        this.a = googleSdkWrapper;
        this.b = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.app.Activity r5, java.lang.String r6, defpackage.ss2 r7, defpackage.by0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$getSignInIntent$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$getSignInIntent$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$getSignInIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$getSignInIntent$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$getSignInIntent$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.L$2
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.L$1
            r5 = r4
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper r4 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper) r4
            kotlin.f.b(r8)
            goto L51
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.f.b(r8)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r8 = r7.invoke(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse r8 = (com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse) r8
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper r7 = r4.a
            com.nytimes.android.subauth.credentialmanager.models.LireSSOData r8 = r8.a()
            com.nytimes.android.subauth.credentialmanager.models.OAuthCredentials r8 = r8.a()
            java.lang.String r8 = r8.b()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = r7.i(r8, r6)
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper r4 = r4.a
            android.content.Intent r4 = r4.h(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper.c(android.app.Activity, java.lang.String, ss2, by0):java.lang.Object");
    }

    public final h77 b(Intent intent) {
        h77 aVar;
        Triple j = this.a.j(intent);
        og8 og8Var = (og8) j.a();
        String str = (String) j.b();
        Exception exc = (Exception) j.c();
        if (og8Var.q() && str != null) {
            ul8.a.z("SUBAUTH").a("SSO Success with server auth code: " + str, new Object[0]);
            return new h77.c(str);
        }
        if (!og8Var.p()) {
            ul8.a.z("SUBAUTH").d("Unknown SSO Exception", new Object[0]);
            return new h77.a("Unknown Signin Error", null);
        }
        if (!(exc instanceof ApiException)) {
            ul8.a.z("SUBAUTH").d("Unknown SSO Exception: " + exc, new Object[0]);
            return new h77.a("Unknown Signin Error", exc);
        }
        if (((ApiException) exc).getStatusCode() == 12501) {
            ul8.a.z("SUBAUTH").d("Sign in cancelled due to API Exception", new Object[0]);
            aVar = new h77.b(exc);
        } else {
            ul8.a.z("SUBAUTH").d("SSO Exception: " + exc, new Object[0]);
            aVar = new h77.a("SSO Exception", exc);
        }
        return aVar;
    }

    public final Object d(Intent intent, by0 by0Var) {
        h77 b = b(intent);
        ul8.a.z("SUBAUTH").a("Handle SSO result: " + b, new Object[0]);
        Object emit = this.b.emit(b, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097 A[PHI: r10
      0x0097: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:17:0x0094, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.nytimes.android.subauth.credentialmanager.a r6, java.lang.String r7, int r8, defpackage.ss2 r9, defpackage.by0 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$ssoLogin$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$ssoLogin$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$ssoLogin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$ssoLogin$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper$ssoLogin$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r10)
            goto L97
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            int r8 = r0.I$0
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.nytimes.android.subauth.credentialmanager.a r6 = (com.nytimes.android.subauth.credentialmanager.a) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper r5 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper) r5
            kotlin.f.b(r10)
            goto L63
        L43:
            kotlin.f.b(r10)
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r5.b
            r10.resetReplayCache()
            androidx.fragment.app.f r10 = r6.requireActivity()
            java.lang.String r2 = "requireActivity(...)"
            defpackage.zq3.g(r10, r2)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r10 = r5.c(r10, r7, r9, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            android.content.Intent r10 = (android.content.Intent) r10
            ul8$b r7 = defpackage.ul8.a
            java.lang.String r9 = "SUBAUTH"
            ul8$c r7 = r7.z(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SSO Login SignIn Intent: "
            r9.append(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7.a(r9, r2)
            r6.startActivityForResult(r10, r8)
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.b
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r5, r0)
            if (r10 != r1) goto L97
            return r1
        L97:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper.e(com.nytimes.android.subauth.credentialmanager.a, java.lang.String, int, ss2, by0):java.lang.Object");
    }

    public /* synthetic */ GoogleSignInHelper(GoogleSdkWrapper googleSdkWrapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GoogleSdkWrapper() : googleSdkWrapper);
    }
}
