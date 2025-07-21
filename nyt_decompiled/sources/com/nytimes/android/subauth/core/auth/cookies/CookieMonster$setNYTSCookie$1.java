package com.nytimes.android.subauth.core.auth.cookies;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster", f = "CookieMonster.kt", l = {83, 86, 101}, m = "setNYTSCookie")
/* loaded from: classes4.dex */
final class CookieMonster$setNYTSCookie$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookieMonster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieMonster$setNYTSCookie$1(CookieMonster cookieMonster, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookieMonster;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.l(null, this);
    }
}
