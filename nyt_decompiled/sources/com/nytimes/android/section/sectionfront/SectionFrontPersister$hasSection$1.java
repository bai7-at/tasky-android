package com.nytimes.android.section.sectionfront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.section.sectionfront.SectionFrontPersister", f = "SectionFrontPersister.kt", l = {76}, m = "hasSection")
/* loaded from: classes4.dex */
final class SectionFrontPersister$hasSection$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionFrontPersister this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionFrontPersister$hasSection$1(SectionFrontPersister sectionFrontPersister, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionFrontPersister;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.l(null, this);
    }
}
