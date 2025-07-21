package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import com.google.android.gms.common.api.ApiException;
import com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper;
import defpackage.by0;
import defpackage.lh5;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.yr7;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class GoogleOneTapHelper {
    private final GoogleSdkWrapper a;
    private yr7 b;
    private final MutableSharedFlow c;

    public GoogleOneTapHelper(GoogleSdkWrapper googleSdkWrapper) {
        zq3.h(googleSdkWrapper, "googleSdkWrapper");
        this.a = googleSdkWrapper;
        this.c = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ss2 r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$createOneTapRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$createOneTapRequest$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$createOneTapRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$createOneTapRequest$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$createOneTapRequest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper r4 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper) r4
            kotlin.f.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r5.invoke(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse r6 = (com.nytimes.android.subauth.credentialmanager.models.LireSSOResponse) r6
            com.nytimes.android.subauth.credentialmanager.models.LireSSOData r5 = r6.a()
            com.nytimes.android.subauth.credentialmanager.models.OAuthCredentials r5 = r5.a()
            java.lang.String r5 = r5.b()
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper r4 = r4.a
            com.google.android.gms.auth.api.identity.BeginSignInRequest r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper.c(ss2, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[PHI: r8
      0x0063: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.yr7 r6, defpackage.ss2 r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$getOneTapIntent$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$getOneTapIntent$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$getOneTapIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$getOneTapIntent$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$getOneTapIntent$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            yr7 r6 = (defpackage.yr7) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper r5 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper) r5
            kotlin.f.b(r8)
            goto L51
        L41:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            com.google.android.gms.auth.api.identity.BeginSignInRequest r8 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r8
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper r5 = r5.a
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r5.a(r6, r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper.d(yr7, ss2, by0):java.lang.Object");
    }

    private final Object e(ApiException apiException, by0 by0Var) {
        int statusCode = apiException.getStatusCode();
        if (statusCode == 7) {
            ul8.a.z("SUBAUTH").f(apiException, "One Tap encountered a network error", new Object[0]);
            Object emit = this.c.emit(new lh5.a("Network Error", apiException), by0Var);
            return emit == a.h() ? emit : ww8.a;
        }
        if (statusCode == 16) {
            ul8.a.z("SUBAUTH").c(apiException, "User declined to sign in via One Tap", new Object[0]);
            Object emit2 = this.c.emit(new lh5.b(apiException), by0Var);
            return emit2 == a.h() ? emit2 : ww8.a;
        }
        ul8.a.z("SUBAUTH").f(apiException, "One Tap couldn't get Credential from result " + apiException.getLocalizedMessage(), new Object[0]);
        Object emit3 = this.c.emit(new lh5.a("Error trying to parse one tap result", apiException), by0Var);
        return emit3 == a.h() ? emit3 : ww8.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(2:(1:(1:(3:16|17|18)(2:13|14))(1:19))(1:23)|20)(3:24|25|(2:27|(1:29))(2:30|(1:32)))|21|17|18))|42|6|7|(0)(0)|21|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if ((r11 instanceof com.google.android.gms.common.api.ApiException) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r0.L$0 = null;
        r0.label = 3;
        r10 = r10.e((com.google.android.gms.common.api.ApiException) r11, r0);
        r3 = r3;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r12 = defpackage.ul8.a.z(r4);
        r2 = new java.lang.StringBuilder();
        r4 = "One Tap Failure. Error trying to parse result: ";
        r2.append("One Tap Failure. Error trying to parse result: ");
        r2.append(r11);
        r3 = new java.lang.Object[r3];
        r12.d(r2.toString(), r3);
        r10 = r10.c;
        r12 = new lh5.a("Error trying to parse one tap result", r11);
        r0.L$0 = null;
        r0.label = 4;
        r10 = r10.emit(r12, r0);
        r3 = r3;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:21:0x00e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00dd -> B:21:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Intent r11, defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper.f(android.content.Intent, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[PHI: r15
      0x0085: PHI (r15v8 java.lang.Object) = (r15v9 java.lang.Object), (r15v10 java.lang.Object) binds: [B:18:0x0082, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.nytimes.android.subauth.credentialmanager.a r13, defpackage.ss2 r14, defpackage.by0 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$oneTapLogin$1
            if (r0 == 0) goto L13
            r0 = r15
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$oneTapLogin$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$oneTapLogin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$oneTapLogin$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper$oneTapLogin$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r15)
            goto L85
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.Object r12 = r0.L$1
            r13 = r12
            com.nytimes.android.subauth.credentialmanager.a r13 = (com.nytimes.android.subauth.credentialmanager.a) r13
            java.lang.Object r12 = r0.L$0
            com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper r12 = (com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper) r12
            kotlin.f.b(r15)
        L40:
            r4 = r13
            goto L68
        L42:
            kotlin.f.b(r15)
            kotlinx.coroutines.flow.MutableSharedFlow r15 = r12.c
            r15.resetReplayCache()
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper r15 = r12.a
            androidx.fragment.app.f r2 = r13.requireActivity()
            java.lang.String r5 = "requireActivity(...)"
            defpackage.zq3.g(r2, r5)
            yr7 r15 = r15.f(r2)
            r12.b = r15
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r15 = r12.d(r15, r14, r0)
            if (r15 != r1) goto L40
            return r1
        L68:
            r5 = r15
            android.content.IntentSender r5 = (android.content.IntentSender) r5
            r10 = 0
            r11 = 0
            r6 = 20000(0x4e20, float:2.8026E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r4.startIntentSenderForResult(r5, r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.MutableSharedFlow r12 = r12.c
            r13 = 0
            r0.L$0 = r13
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r15 = kotlinx.coroutines.flow.FlowKt.first(r12, r0)
            if (r15 != r1) goto L85
            return r1
        L85:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper.g(com.nytimes.android.subauth.credentialmanager.a, ss2, by0):java.lang.Object");
    }

    public /* synthetic */ GoogleOneTapHelper(GoogleSdkWrapper googleSdkWrapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GoogleSdkWrapper() : googleSdkWrapper);
    }
}
