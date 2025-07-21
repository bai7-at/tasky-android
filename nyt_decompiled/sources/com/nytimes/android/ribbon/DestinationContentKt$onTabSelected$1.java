package com.nytimes.android.ribbon;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt", f = "DestinationContent.kt", l = {443}, m = "onTabSelected")
/* loaded from: classes4.dex */
final class DestinationContentKt$onTabSelected$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DestinationContentKt$onTabSelected$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object t;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        t = DestinationContentKt.t(null, null, null, null, this);
        return t;
    }
}
