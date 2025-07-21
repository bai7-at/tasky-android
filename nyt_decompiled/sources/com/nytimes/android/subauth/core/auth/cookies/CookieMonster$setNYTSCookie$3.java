package com.nytimes.android.subauth.core.auth.cookies;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$3", f = "CookieMonster.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CookieMonster$setNYTSCookie$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $lastTimeSetNYTSCookie;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieMonster$setNYTSCookie$3(long j, by0 by0Var) {
        super(2, by0Var);
        this.$lastTimeSetNYTSCookie = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CookieMonster$setNYTSCookie$3 cookieMonster$setNYTSCookie$3 = new CookieMonster$setNYTSCookie$3(this.$lastTimeSetNYTSCookie, by0Var);
        cookieMonster$setNYTSCookie$3.L$0 = obj;
        return cookieMonster$setNYTSCookie$3;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((CookieMonster$setNYTSCookie$3) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ((MutablePreferences) this.L$0).j(CookieMonster.Companion.a(), cc0.d(this.$lastTimeSetNYTSCookie));
        return ww8.a;
    }
}
