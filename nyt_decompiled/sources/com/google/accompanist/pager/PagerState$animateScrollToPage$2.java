package com.google.accompanist.pager;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", l = {218, 223, 226, AdvertisementType.BRANDED_AS_CONTENT, 241, 253}, m = "animateScrollToPage")
/* loaded from: classes2.dex */
final class PagerState$animateScrollToPage$2 extends ContinuationImpl {
    float F$0;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$2(PagerState pagerState, by0 by0Var) {
        super(by0Var);
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.i(0, 0.0f, this);
    }
}
