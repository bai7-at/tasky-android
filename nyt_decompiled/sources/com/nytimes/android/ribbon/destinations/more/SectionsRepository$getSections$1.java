package com.nytimes.android.ribbon.destinations.more;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.more.SectionsRepository", f = "SectionsRepository.kt", l = {EventType.SUBS}, m = "getSections")
/* loaded from: classes4.dex */
final class SectionsRepository$getSections$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionsRepository$getSections$1(SectionsRepository sectionsRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
