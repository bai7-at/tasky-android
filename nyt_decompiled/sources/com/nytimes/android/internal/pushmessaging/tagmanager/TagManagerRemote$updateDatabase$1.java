package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote", f = "TagManagerRemote.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "updateDatabase")
/* loaded from: classes4.dex */
final class TagManagerRemote$updateDatabase$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerRemote$updateDatabase$1(TagManagerRemote tagManagerRemote, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerRemote;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i = this.this$0.i(null, this);
        return i;
    }
}
