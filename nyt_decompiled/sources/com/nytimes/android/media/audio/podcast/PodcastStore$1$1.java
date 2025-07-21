package com.nytimes.android.media.audio.podcast;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.media.audio.podcast.PodcastStore$1$1", f = "PodcastStore.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PodcastStore$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PodcastFetcher $podcastFetcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PodcastStore$1$1(PodcastFetcher podcastFetcher, by0 by0Var) {
        super(2, by0Var);
        this.$podcastFetcher = podcastFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PodcastStore$1$1(this.$podcastFetcher, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PodcastFetcher podcastFetcher = this.$podcastFetcher;
            this.label = 1;
            obj = podcastFetcher.e(this);
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
        return ((PodcastStore$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
