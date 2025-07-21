package com.nytimes.android.subauth.credentialmanager.providers.wrappers;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import defpackage.b31;
import defpackage.by0;
import defpackage.c31;
import defpackage.ef3;
import defpackage.hc1;
import defpackage.me5;
import defpackage.og8;
import defpackage.ss2;
import defpackage.ue5;
import defpackage.ul8;
import defpackage.vf5;
import defpackage.x21;
import defpackage.yr7;
import defpackage.z21;
import defpackage.zq3;
import kotlin.Result;
import kotlin.Triple;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class GoogleSdkWrapper {

    static final class a implements ue5 {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.ue5
        public final void onFailure(Exception exc) {
            if (this.a.isActive()) {
                ul8.a.z("SUBAUTH").d("One Tap Failure: " + exc, new Object[0]);
                CancellableContinuation cancellableContinuation = this.a;
                Result.a aVar = Result.a;
                zq3.e(exc);
                cancellableContinuation.resumeWith(Result.b(f.a(exc)));
            }
        }
    }

    static final class b implements me5 {
        final /* synthetic */ CancellableContinuation a;

        b(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.me5
        public final void onComplete(og8 og8Var) {
            if (!this.a.isActive()) {
                ul8.a.z("SUBAUTH").t("Failed to get SAVE smart lock result. Task cancelled!", new Object[0]);
                return;
            }
            if (og8Var.q()) {
                ul8.a.z("SUBAUTH").t("Smart lock SAVE result Success", new Object[0]);
                this.a.resume(Boolean.TRUE, null);
                return;
            }
            Exception l = og8Var.l();
            ul8.a.z("SUBAUTH").t("Smart lock SAVE result Failure: " + l, new Object[0]);
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            zq3.e(l);
            cancellableContinuation.resumeWith(Result.b(f.a(l)));
        }
    }

    static final class c implements me5 {
        final /* synthetic */ CancellableContinuation a;

        c(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // defpackage.me5
        public final void onComplete(og8 og8Var) {
            if (!this.a.isActive()) {
                ul8.a.z("SUBAUTH").t("Failed to get READ smart lock result. Task cancelled!", new Object[0]);
                return;
            }
            if (og8Var.q()) {
                Credential a = ((x21) og8Var.m()).a();
                ul8.a.z("SUBAUTH").t("Smart lock READ result Success: " + a, new Object[0]);
                this.a.resume(a, null);
                return;
            }
            Exception l = og8Var.l();
            ul8.a.z("SUBAUTH").t("Smart lock READ result Failure: " + l, new Object[0]);
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            zq3.e(l);
            cancellableContinuation.resumeWith(Result.b(f.a(l)));
        }
    }

    static final class d implements vf5 {
        private final /* synthetic */ ss2 a;

        d(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vf5
        public final /* synthetic */ void onSuccess(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.yr7 r5, com.google.android.gms.auth.api.identity.BeginSignInRequest r6, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$1 r0 = (com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$1 r0 = new com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.L$1
            com.google.android.gms.auth.api.identity.BeginSignInRequest r5 = (com.google.android.gms.auth.api.identity.BeginSignInRequest) r5
            java.lang.Object r5 = r0.L$0
            yr7 r5 = (defpackage.yr7) r5
            kotlin.f.b(r4)
            goto L7e
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.f.b(r4)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r2
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            by0 r1 = kotlin.coroutines.intrinsics.a.d(r0)
            r4.<init>(r1, r2)
            r4.initCancellability()
            if (r5 == 0) goto L6e
            og8 r5 = r5.c(r6)
            if (r5 == 0) goto L6e
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$2$1 r6 = new com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$beginOneTapSignIn$2$1
            r6.<init>()
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$d r1 = new com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$d
            r1.<init>(r6)
            og8 r5 = r5.f(r1)
            if (r5 == 0) goto L6e
            com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$a r6 = new com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper$a
            r6.<init>(r4)
            r5.d(r6)
        L6e:
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.h()
            if (r4 != r5) goto L7b
            defpackage.hc1.c(r0)
        L7b:
            if (r4 != r7) goto L7e
            return r7
        L7e:
            com.google.android.gms.auth.api.identity.BeginSignInResult r4 = (com.google.android.gms.auth.api.identity.BeginSignInResult) r4
            android.app.PendingIntent r4 = r4.getPendingIntent()
            android.content.IntentSender r4 = r4.getIntentSender()
            java.lang.String r5 = "getIntentSender(...)"
            defpackage.zq3.g(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper.a(yr7, com.google.android.gms.auth.api.identity.BeginSignInRequest, by0):java.lang.Object");
    }

    public final Object b(b31 b31Var, Credential credential, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        b31Var.e(credential).b(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public final Object c(b31 b31Var, CredentialRequest credentialRequest, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        og8 d2 = b31Var.d(credentialRequest);
        if (d2 != null) {
            d2.b(new c(cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public final BeginSignInRequest d(String str) {
        zq3.h(str, "serverId");
        BeginSignInRequest a2 = BeginSignInRequest.t0().c(BeginSignInRequest.GoogleIdTokenRequestOptions.t0().d(true).c(str).b(false).a()).a();
        zq3.g(a2, "build(...)");
        return a2;
    }

    public final Credential e(String str, String str2) {
        zq3.h(str, "userName");
        Credential.a aVar = new Credential.a(str);
        if (str2 != null) {
            aVar.b(str2);
        }
        Credential a2 = aVar.a();
        zq3.g(a2, "build(...)");
        return a2;
    }

    public final yr7 f(androidx.fragment.app.f fVar) {
        zq3.h(fVar, "activity");
        return ef3.a(fVar);
    }

    public final String g(yr7 yr7Var, Intent intent) {
        SignInCredential a2 = yr7Var != null ? yr7Var.a(intent) : null;
        if (a2 != null) {
            return a2.K0();
        }
        return null;
    }

    public final Intent h(Context context, GoogleSignInOptions googleSignInOptions) {
        zq3.h(context, "context");
        zq3.h(googleSignInOptions, "options");
        Intent d2 = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptions).d();
        zq3.g(d2, "getSignInIntent(...)");
        return d2;
    }

    public final GoogleSignInOptions i(String str, String str2) {
        zq3.h(str, "serverAuthCode");
        GoogleSignInOptions.a f = new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().e(new Scope(Scopes.PROFILE), new Scope("email")).f(str, false);
        if (str2 != null && !h.d0(str2)) {
            f.g(str2);
        }
        GoogleSignInOptions a2 = f.a();
        zq3.g(a2, "build(...)");
        return a2;
    }

    public final Triple j(Intent intent) {
        String str;
        og8 b2 = com.google.android.gms.auth.api.signin.a.b(intent);
        try {
            str = ((GoogleSignInAccount) b2.m()).x1();
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").b(e);
            str = null;
        }
        return new Triple(b2, str, b2.l());
    }

    public final b31 k(Context context, c31 c31Var) {
        zq3.h(context, "context");
        zq3.h(c31Var, "options");
        return z21.a(context, c31Var);
    }
}
