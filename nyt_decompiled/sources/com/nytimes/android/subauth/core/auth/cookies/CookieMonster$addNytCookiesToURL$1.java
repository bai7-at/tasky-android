package com.nytimes.android.subauth.core.auth.cookies;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.cookies.CookieMonster", f = "CookieMonster.kt", l = {245, 246, 247, 257, 258}, m = "addNytCookiesToURL")
/* loaded from: classes4.dex */
final class CookieMonster$addNytCookiesToURL$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookieMonster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieMonster$addNytCookiesToURL$1(CookieMonster cookieMonster, by0 by0Var) {
        super(by0Var);
        this.this$0 = cookieMonster;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
