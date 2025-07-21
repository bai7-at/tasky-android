package com.nytimes.android.media.audio.podcast;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.media.audio.podcast.PodcastFetcher", f = "PodcastFetcher.kt", l = {BuildConfig.VERSION_CODE}, m = "downloadPodcastEpisodes")
/* loaded from: classes4.dex */
final class PodcastFetcher$downloadPodcastEpisodes$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PodcastFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PodcastFetcher$downloadPodcastEpisodes$1(PodcastFetcher podcastFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = podcastFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(null, this);
        return c;
    }
}
