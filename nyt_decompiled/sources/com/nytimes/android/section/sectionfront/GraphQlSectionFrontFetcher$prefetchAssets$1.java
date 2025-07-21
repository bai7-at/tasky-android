package com.nytimes.android.section.sectionfront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.http.StatusLine;

@fc1(c = "com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher", f = "GraphQlSectionFrontFetcher.kt", l = {296, StatusLine.HTTP_PERM_REDIRECT, 310}, m = "prefetchAssets")
/* loaded from: classes4.dex */
final class GraphQlSectionFrontFetcher$prefetchAssets$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQlSectionFrontFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlSectionFrontFetcher$prefetchAssets$1(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQlSectionFrontFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        r = this.this$0.r(null, null, this);
        return r;
    }
}
