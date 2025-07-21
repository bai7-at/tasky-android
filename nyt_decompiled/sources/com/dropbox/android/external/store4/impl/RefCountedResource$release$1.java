package com.dropbox.android.external.store4.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.dropbox.android.external.store4.impl.RefCountedResource", f = "RefCountedResource.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32, 47}, m = "release")
/* loaded from: classes2.dex */
final class RefCountedResource$release$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefCountedResource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefCountedResource$release$1(RefCountedResource refCountedResource, by0 by0Var) {
        super(by0Var);
        this.this$0 = refCountedResource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, this);
    }
}
