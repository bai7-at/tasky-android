package com.nytimes.android.navigation.factory;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher", f = "SectionFrontIntentDispatcher.kt", l = {24}, m = "dispatch")
/* loaded from: classes4.dex */
final class SectionFrontIntentDispatcher$dispatch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    SectionFrontIntentDispatcher$dispatch$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return SectionFrontIntentDispatcher.a(null, null, null, null, this);
    }
}
