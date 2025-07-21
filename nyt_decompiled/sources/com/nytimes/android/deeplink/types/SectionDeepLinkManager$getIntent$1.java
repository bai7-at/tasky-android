package com.nytimes.android.deeplink.types;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.deeplink.types.SectionDeepLinkManager", f = "SectionDeepLinkManager.kt", l = {EventType.SUBS}, m = "getIntent")
/* loaded from: classes4.dex */
final class SectionDeepLinkManager$getIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionDeepLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionDeepLinkManager$getIntent$1(SectionDeepLinkManager sectionDeepLinkManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionDeepLinkManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, null, null, false, this);
    }
}
