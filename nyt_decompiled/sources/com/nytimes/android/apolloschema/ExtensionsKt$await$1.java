package com.nytimes.android.apolloschema;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ii5;
import ii5.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.apolloschema.ExtensionsKt", f = "Extensions.kt", l = {21}, m = "await")
/* loaded from: classes3.dex */
final class ExtensionsKt$await$1<D extends ii5.a> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    ExtensionsKt$await$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return ExtensionsKt.a(null, this);
    }
}
