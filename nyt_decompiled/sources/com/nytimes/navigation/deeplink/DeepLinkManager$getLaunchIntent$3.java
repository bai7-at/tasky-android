package com.nytimes.navigation.deeplink;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.navigation.deeplink.DeepLinkManager", f = "DeepLinkManager.kt", l = {88, 90}, m = "getLaunchIntent")
/* loaded from: classes4.dex */
final class DeepLinkManager$getLaunchIntent$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeepLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkManager$getLaunchIntent$3(DeepLinkManager deepLinkManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = deepLinkManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, null, null, this);
    }
}
