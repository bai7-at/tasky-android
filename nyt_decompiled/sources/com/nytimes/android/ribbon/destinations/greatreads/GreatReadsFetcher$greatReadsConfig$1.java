package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher", f = "GreatReadsFetcher.kt", l = {165}, m = "greatReadsConfig")
/* loaded from: classes4.dex */
final class GreatReadsFetcher$greatReadsConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GreatReadsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GreatReadsFetcher$greatReadsConfig$1(GreatReadsFetcher greatReadsFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = greatReadsFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        e = this.this$0.e(this);
        return e;
    }
}
