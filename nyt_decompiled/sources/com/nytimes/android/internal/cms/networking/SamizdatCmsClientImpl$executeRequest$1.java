package com.nytimes.android.internal.cms.networking;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.cms.networking.SamizdatCmsClientImpl", f = "SamizdatCmsClientImpl.kt", l = {41, 56}, m = "executeRequest$cms_release")
/* loaded from: classes4.dex */
final class SamizdatCmsClientImpl$executeRequest$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SamizdatCmsClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamizdatCmsClientImpl$executeRequest$1(SamizdatCmsClientImpl samizdatCmsClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = samizdatCmsClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, 0, this);
    }
}
