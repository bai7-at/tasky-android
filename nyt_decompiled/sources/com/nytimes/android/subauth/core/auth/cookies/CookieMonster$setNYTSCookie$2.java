package com.nytimes.android.subauth.core.auth.cookies;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster$setNYTSCookie$2", f = "CookieMonster.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CookieMonster$setNYTSCookie$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $nytSCookie;
    final /* synthetic */ long $pollTime;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieMonster$setNYTSCookie$2(String str, long j, by0 by0Var) {
        super(2, by0Var);
        this.$nytSCookie = str;
        this.$pollTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CookieMonster$setNYTSCookie$2 cookieMonster$setNYTSCookie$2 = new CookieMonster$setNYTSCookie$2(this.$nytSCookie, this.$pollTime, by0Var);
        cookieMonster$setNYTSCookie$2.L$0 = obj;
        return cookieMonster$setNYTSCookie$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((CookieMonster$setNYTSCookie$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s16.a aVar;
        s16.a aVar2;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        if (this.$nytSCookie != null) {
            mutablePreferences.j(CookieMonster.i, this.$nytSCookie);
            aVar2 = CookieMonster.j;
            mutablePreferences.j(aVar2, cc0.d(this.$pollTime));
        } else {
            mutablePreferences.i(CookieMonster.i);
            aVar = CookieMonster.j;
            mutablePreferences.i(aVar);
        }
        return ww8.a;
    }
}
