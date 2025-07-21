package com.nytimes.android.subauth.core.auth.sessionRefresh;

import androidx.datastore.preferences.core.MutablePreferences;
import com.nytimes.android.subauth.core.auth.cookies.CookieMonster;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2", f = "SessionRefreshV2Manager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2 sessionRefreshV2Manager$clearLastSessionRefreshPollTime$2 = new SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2(by0Var);
        sessionRefreshV2Manager$clearLastSessionRefreshPollTime$2.L$0 = obj;
        return sessionRefreshV2Manager$clearLastSessionRefreshPollTime$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((SessionRefreshV2Manager$clearLastSessionRefreshPollTime$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ((MutablePreferences) this.L$0).i(CookieMonster.Companion.a());
        return ww8.a;
    }
}
