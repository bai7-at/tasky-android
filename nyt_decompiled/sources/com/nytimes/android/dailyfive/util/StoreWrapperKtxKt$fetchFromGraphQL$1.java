package com.nytimes.android.dailyfive.util;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.dailyfive.util.StoreWrapperKtxKt", f = "StoreWrapperKtx.kt", l = {11, 14}, m = "fetchFromGraphQL")
/* loaded from: classes4.dex */
final class StoreWrapperKtxKt$fetchFromGraphQL$1<T, V> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    StoreWrapperKtxKt$fetchFromGraphQL$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return StoreWrapperKtxKt.a(null, null, null, this);
    }
}
