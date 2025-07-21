package com.dropbox.android.external.store4;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.dropbox.android.external.store4.StoreKt", f = "Store.kt", l = {70}, m = "get")
/* loaded from: classes2.dex */
final class StoreKt$get$1<Key, Output> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    StoreKt$get$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return StoreKt.b(null, null, this);
    }
}
