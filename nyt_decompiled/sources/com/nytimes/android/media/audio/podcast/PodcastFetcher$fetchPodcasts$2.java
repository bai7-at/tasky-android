package com.nytimes.android.media.audio.podcast;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.media.audio.podcast.PodcastFetcher$fetchPodcasts$2", f = "PodcastFetcher.kt", l = {36, 39}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PodcastFetcher$fetchPodcasts$2 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PodcastFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PodcastFetcher$fetchPodcasts$2(PodcastFetcher podcastFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = podcastFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PodcastFetcher$fetchPodcasts$2 podcastFetcher$fetchPodcasts$2 = new PodcastFetcher$fetchPodcasts$2(this.this$0, by0Var);
        podcastFetcher$fetchPodcasts$2.L$0 = obj;
        return podcastFetcher$fetchPodcasts$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00b7 -> B:6:0x00b8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r1 = r13.L$3
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r13.L$2
            zv5 r3 = (defpackage.zv5) r3
            java.lang.Object r4 = r13.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r13.L$0
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.f.b(r14)
            goto Lb8
        L23:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2b:
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.f.b(r14)
            goto L48
        L33:
            kotlin.f.b(r14)
            java.lang.Object r14 = r13.L$0
            r1 = r14
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            com.nytimes.android.media.audio.podcast.PodcastFetcher r14 = r13.this$0
            r13.L$0 = r1
            r13.label = r3
            java.lang.Object r14 = com.nytimes.android.media.audio.podcast.PodcastFetcher.b(r14, r13)
            if (r14 != r0) goto L48
            return r0
        L48:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            com.nytimes.android.media.audio.podcast.PodcastFetcher r9 = r13.this$0
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r3 = kotlin.collections.i.w(r14, r11)
            r10.<init>(r3)
            java.util.Iterator r14 = r14.iterator()
        L5b:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r14.next()
            r12 = r3
            zv5 r12 = (defpackage.zv5) r12
            com.nytimes.android.media.audio.podcast.PodcastFetcher$fetchPodcasts$2$1$1 r6 = new com.nytimes.android.media.audio.podcast.PodcastFetcher$fetchPodcasts$2$1$1
            r3 = 0
            r6.<init>(r9, r12, r3)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            r3 = r1
            kotlinx.coroutines.Deferred r3 = kotlinx.coroutines.BuildersKt.async$default(r3, r4, r5, r6, r7, r8)
            kotlin.Pair r3 = defpackage.du8.a(r12, r3)
            r10.add(r3)
            goto L5b
        L7f:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r1 = kotlin.collections.i.w(r10, r11)
            r14.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
            r4 = r1
            r1 = r14
        L8e:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto Lc4
            java.lang.Object r14 = r4.next()
            kotlin.Pair r14 = (kotlin.Pair) r14
            java.lang.Object r3 = r14.a()
            zv5 r3 = (defpackage.zv5) r3
            java.lang.Object r14 = r14.b()
            kotlinx.coroutines.Deferred r14 = (kotlinx.coroutines.Deferred) r14
            r13.L$0 = r1
            r13.L$1 = r4
            r13.L$2 = r3
            r13.L$3 = r1
            r13.label = r2
            java.lang.Object r14 = r14.await(r13)
            if (r14 != r0) goto Lb7
            return r0
        Lb7:
            r5 = r1
        Lb8:
            java.util.List r14 = (java.util.List) r14
            com.nytimes.android.media.audio.podcast.Podcast r6 = new com.nytimes.android.media.audio.podcast.Podcast
            r6.<init>(r3, r14)
            r1.add(r6)
            r1 = r5
            goto L8e
        Lc4:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.audio.podcast.PodcastFetcher$fetchPodcasts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PodcastFetcher$fetchPodcasts$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
