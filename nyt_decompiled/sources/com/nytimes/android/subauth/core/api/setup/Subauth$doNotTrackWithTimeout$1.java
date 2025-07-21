package com.nytimes.android.subauth.core.api.setup;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.api.setup.Subauth", f = "Subauth.kt", l = {183}, m = "doNotTrackWithTimeout")
/* loaded from: classes4.dex */
final class Subauth$doNotTrackWithTimeout$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Subauth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Subauth$doNotTrackWithTimeout$1(Subauth subauth, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauth;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = this.this$0.d(this);
        return d;
    }
}
