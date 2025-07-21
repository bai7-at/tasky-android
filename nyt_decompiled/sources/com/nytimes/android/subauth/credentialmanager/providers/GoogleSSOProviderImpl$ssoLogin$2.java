package com.nytimes.android.subauth.credentialmanager.providers;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.credentialmanager.a;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h77;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl$ssoLogin$2", f = "GoogleSSOProviderImpl.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleSSOProviderImpl$ssoLogin$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $accountName;
    final /* synthetic */ f $activity;
    Object L$0;
    int label;
    final /* synthetic */ GoogleSSOProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSSOProviderImpl$ssoLogin$2(GoogleSSOProviderImpl googleSSOProviderImpl, f fVar, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleSSOProviderImpl;
        this.$activity = fVar;
        this.$accountName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleSSOProviderImpl$ssoLogin$2(this.this$0, this.$activity, this.$accountName, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ss2 ss2Var;
        a aVar;
        Exception e;
        GoogleSignInHelper googleSignInHelper;
        a h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                GoogleSSOProviderImpl googleSSOProviderImpl = this.this$0;
                f fVar = this.$activity;
                ss2Var = googleSSOProviderImpl.d;
                a k = googleSSOProviderImpl.k(fVar, googleSSOProviderImpl, ss2Var);
                try {
                    ul8.a.z("SUBAUTH").a("Attached SSO Fragment. Attempting SSO Login.", new Object[0]);
                    googleSignInHelper = this.this$0.b;
                    String str = this.$accountName;
                    int n = this.this$0.n();
                    GoogleSSOProviderImpl$ssoLogin$2$result$1 googleSSOProviderImpl$ssoLogin$2$result$1 = new GoogleSSOProviderImpl$ssoLogin$2$result$1(this.this$0);
                    this.L$0 = k;
                    this.label = 1;
                    Object e2 = googleSignInHelper.e(k, str, n, googleSSOProviderImpl$ssoLogin$2$result$1, this);
                    if (e2 == h) {
                        return h;
                    }
                    aVar = k;
                    obj = e2;
                } catch (Exception e3) {
                    aVar = k;
                    e = e3;
                    ul8.a.z("SUBAUTH").d("SSO Login Exception: " + e, new Object[0]);
                    h77.a aVar2 = new h77.a("Error trying to sign in with google", e);
                    this.this$0.o(aVar);
                    return aVar2;
                } catch (Throwable th) {
                    h = k;
                    th = th;
                    this.this$0.o(h);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.L$0;
                try {
                    kotlin.f.b(obj);
                } catch (Exception e4) {
                    e = e4;
                    ul8.a.z("SUBAUTH").d("SSO Login Exception: " + e, new Object[0]);
                    h77.a aVar22 = new h77.a("Error trying to sign in with google", e);
                    this.this$0.o(aVar);
                    return aVar22;
                }
            }
            h77 h77Var = (h77) obj;
            ul8.a.z("SUBAUTH").a("SSO Result: " + h77Var, new Object[0]);
            this.this$0.o(aVar);
            return h77Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleSSOProviderImpl$ssoLogin$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
