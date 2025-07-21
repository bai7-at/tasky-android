package com.nytimes.android.deeplink.types;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager", f = "SectionFrontDeepLinkManager.kt", l = {38}, m = "getIntent")
/* loaded from: classes4.dex */
final class SectionFrontDeepLinkManager$getIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionFrontDeepLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionFrontDeepLinkManager$getIntent$1(SectionFrontDeepLinkManager sectionFrontDeepLinkManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionFrontDeepLinkManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, null, null, false, this);
    }
}
