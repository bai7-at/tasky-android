package com.nytimes.navigation.deeplink;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.navigation.deeplink.DeepLinkManager", f = "DeepLinkManager.kt", l = {72}, m = "getLaunchIntent")
/* loaded from: classes4.dex */
final class DeepLinkManager$getLaunchIntent$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeepLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkManager$getLaunchIntent$1(DeepLinkManager deepLinkManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = deepLinkManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, null, false, null, false, this);
    }
}
