package com.apollographql.apollo.network.http;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zendesk.core.BuildConfig;

@fc1(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", l = {BuildConfig.VERSION_CODE}, m = "execute")
/* loaded from: classes2.dex */
final class JvmHttpEngine$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JvmHttpEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JvmHttpEngine$execute$1(JvmHttpEngine jvmHttpEngine, by0 by0Var) {
        super(by0Var);
        this.this$0 = jvmHttpEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.M0(null, this);
    }
}
