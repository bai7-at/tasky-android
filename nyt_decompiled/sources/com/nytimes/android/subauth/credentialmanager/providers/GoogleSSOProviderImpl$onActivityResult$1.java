package com.nytimes.android.subauth.credentialmanager.providers;

import android.content.Intent;
import com.nytimes.android.subauth.credentialmanager.a;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl$onActivityResult$1", f = "GoogleSSOProviderImpl.kt", l = {159, 164, 169, 174}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleSSOProviderImpl$onActivityResult$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Intent $data;
    final /* synthetic */ a $fragment;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ int $resultCode;
    int label;
    final /* synthetic */ GoogleSSOProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSSOProviderImpl$onActivityResult$1(int i, GoogleSSOProviderImpl googleSSOProviderImpl, Intent intent, int i2, a aVar, by0 by0Var) {
        super(2, by0Var);
        this.$requestCode = i;
        this.this$0 = googleSSOProviderImpl;
        this.$data = intent;
        this.$resultCode = i2;
        this.$fragment = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleSSOProviderImpl$onActivityResult$1(this.$requestCode, this.this$0, this.$data, this.$resultCode, this.$fragment, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoogleSmartLockHelper googleSmartLockHelper;
        GoogleSmartLockHelper googleSmartLockHelper2;
        GoogleOneTapHelper googleOneTapHelper;
        GoogleSignInHelper googleSignInHelper;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            int i2 = this.$requestCode;
            if (i2 == this.this$0.n()) {
                googleSignInHelper = this.this$0.b;
                Intent intent = this.$data;
                this.label = 1;
                if (googleSignInHelper.d(intent, this) == h) {
                    return h;
                }
            } else if (i2 == 20000) {
                googleOneTapHelper = this.this$0.a;
                Intent intent2 = this.$data;
                this.label = 2;
                if (googleOneTapHelper.f(intent2, this) == h) {
                    return h;
                }
            } else {
                if (i2 != 30000) {
                    if (i2 == 30001) {
                        googleSmartLockHelper = this.this$0.c;
                        int i3 = this.$resultCode;
                        this.label = 4;
                        if (googleSmartLockHelper.d(i3, this) == h) {
                            return h;
                        }
                    }
                    return ww8.a;
                }
                googleSmartLockHelper2 = this.this$0.c;
                int i4 = this.$resultCode;
                Intent intent3 = this.$data;
                this.label = 3;
                if (googleSmartLockHelper2.c(i4, intent3, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.this$0.o(this.$fragment);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleSSOProviderImpl$onActivityResult$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
