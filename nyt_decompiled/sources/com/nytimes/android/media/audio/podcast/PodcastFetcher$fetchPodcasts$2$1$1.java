package com.nytimes.android.media.audio.podcast;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zv5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.media.audio.podcast.PodcastFetcher$fetchPodcasts$2$1$1", f = "PodcastFetcher.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PodcastFetcher$fetchPodcasts$2$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ zv5 $it;
    int label;
    final /* synthetic */ PodcastFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PodcastFetcher$fetchPodcasts$2$1$1(PodcastFetcher podcastFetcher, zv5 zv5Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = podcastFetcher;
        this.$it = zv5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PodcastFetcher$fetchPodcasts$2$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PodcastFetcher podcastFetcher = this.this$0;
            String id = this.$it.getId();
            this.label = 1;
            obj = podcastFetcher.c(id, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PodcastFetcher$fetchPodcasts$2$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
