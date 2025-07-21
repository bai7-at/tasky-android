package com.nytimes.android.features.discovery.discoverytab.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.data.SectionLinksRepository", f = "SectionLinksRepository.kt", l = {31}, m = "createLinkLockups")
/* loaded from: classes4.dex */
final class SectionLinksRepository$createLinkLockups$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionLinksRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionLinksRepository$createLinkLockups$1(SectionLinksRepository sectionLinksRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionLinksRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, null, null, this);
    }
}
