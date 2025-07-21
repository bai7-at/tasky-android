package com.nytimes.android.media.audio.podcast;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.media.audio.podcast.PodcastFetcher", f = "PodcastFetcher.kt", l = {20}, m = "downloadPodcastList")
/* loaded from: classes4.dex */
final class PodcastFetcher$downloadPodcastList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PodcastFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PodcastFetcher$downloadPodcastList$1(PodcastFetcher podcastFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = podcastFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = this.this$0.d(this);
        return d;
    }
}
