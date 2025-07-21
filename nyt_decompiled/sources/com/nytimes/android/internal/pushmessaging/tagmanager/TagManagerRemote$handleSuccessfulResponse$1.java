package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote", f = "TagManagerRemote.kt", l = {45, 47, 57}, m = "handleSuccessfulResponse")
/* loaded from: classes4.dex */
final class TagManagerRemote$handleSuccessfulResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerRemote$handleSuccessfulResponse$1(TagManagerRemote tagManagerRemote, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerRemote;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        h = this.this$0.h(null, this);
        return h;
    }
}
