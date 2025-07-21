package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.HomeRepository", f = "HomeRepository.kt", l = {66, MdtaMetadataEntry.TYPE_INDICATOR_INT32, 68}, m = "retrieveAllAssets")
/* loaded from: classes4.dex */
final class HomeRepository$retrieveAllAssets$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRepository$retrieveAllAssets$1(HomeRepository homeRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        h = this.this$0.h(null, 0L, this);
        return h;
    }
}
