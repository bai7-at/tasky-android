package com.nytimes.android.subauth.core.auth;

import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import com.nytimes.android.subauth.core.auth.network.response.c;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.o98;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$onSessionRefreshFailed$1", f = "SubauthUserManager.kt", l = {719}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$onSessionRefreshFailed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $nytSRequestCookie;
    final /* synthetic */ c.a $sessionRefreshError;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$onSessionRefreshFailed$1(c.a aVar, SubauthUserManager subauthUserManager, String str, by0 by0Var) {
        super(2, by0Var);
        this.$sessionRefreshError = aVar;
        this.this$0 = subauthUserManager;
        this.$nytSRequestCookie = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserManager$onSessionRefreshFailed$1(this.$sessionRefreshError, this.this$0, this.$nytSRequestCookie, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ul8.a.z("SUBAUTH").d("Forcing Logout. " + this.$sessionRefreshError, new Object[0]);
            SubauthUserManager subauthUserManager = this.this$0;
            LogoutSource logoutSource = LogoutSource.SESSION_REFRESH_FAILED_FORCE;
            this.label = 1;
            if (subauthUserManager.z(logoutSource, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        mutableStateFlow = this.this$0.v;
        mutableStateFlow.setValue(new o98.b(this.$sessionRefreshError.a(), this.$nytSRequestCookie));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserManager$onSessionRefreshFailed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
