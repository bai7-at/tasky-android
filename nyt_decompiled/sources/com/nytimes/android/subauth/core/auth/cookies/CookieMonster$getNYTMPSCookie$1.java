package com.nytimes.android.subauth.core.auth.cookies;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster", f = "CookieMonster.kt", l = {128}, m = "getNYTMPSCookie")
/* loaded from: classes4.dex */
final class CookieMonster$getNYTMPSCookie$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookieMonster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieMonster$getNYTMPSCookie$1(CookieMonster cookieMonster, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookieMonster;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.s(this);
    }
}
