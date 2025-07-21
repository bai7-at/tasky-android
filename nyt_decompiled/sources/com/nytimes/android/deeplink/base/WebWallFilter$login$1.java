package com.nytimes.android.deeplink.base;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.deeplink.base.WebWallFilter", f = "WebWallFilter.kt", l = {32, 34}, m = "login")
/* loaded from: classes4.dex */
final class WebWallFilter$login$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebWallFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebWallFilter$login$1(WebWallFilter webWallFilter, by0 by0Var) {
        super(by0Var);
        this.this$0 = webWallFilter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(null, this);
        return c;
    }
}
