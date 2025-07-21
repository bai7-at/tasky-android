package com.nytimes.android.subauth.core.auth.cookies;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster$expireNYTSCookie$2", f = "CookieMonster.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CookieMonster$expireNYTSCookie$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    CookieMonster$expireNYTSCookie$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CookieMonster$expireNYTSCookie$2 cookieMonster$expireNYTSCookie$2 = new CookieMonster$expireNYTSCookie$2(by0Var);
        cookieMonster$expireNYTSCookie$2.L$0 = obj;
        return cookieMonster$expireNYTSCookie$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((CookieMonster$expireNYTSCookie$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s16.a aVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        aVar = CookieMonster.j;
        mutablePreferences.i(aVar);
        return ww8.a;
    }
}
