package com.nytimes.android.media.audio.podcast;

import com.apollographql.apollo.ApolloClient;
import defpackage.by0;
import defpackage.p22;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public final class PodcastFetcher {
    private final ApolloClient a;
    private final a b;
    private final p22 c;

    public PodcastFetcher(ApolloClient apolloClient, a aVar, p22 p22Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(aVar, "podcastParser");
        zq3.h(p22Var, "episodeParser");
        this.a = apolloClient;
        this.b = aVar;
        this.c = p22Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastEpisodes$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastEpisodes$1 r0 = (com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastEpisodes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastEpisodes$1 r0 = new com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastEpisodes$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.media.audio.podcast.PodcastFetcher r4 = (com.nytimes.android.media.audio.podcast.PodcastFetcher) r4
            kotlin.f.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.a
            lw5 r2 = new lw5
            r2.<init>(r5)
            com.apollographql.apollo.ApolloCall r5 = r6.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            yj r6 = (defpackage.yj) r6
            ii5$a r5 = r6.c
            defpackage.zq3.e(r5)
            lw5$b r5 = (lw5.b) r5
            p22 r4 = r4.c
            java.util.List r4 = r4.e(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.audio.podcast.PodcastFetcher.c(java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastList$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastList$1 r0 = (com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastList$1 r0 = new com.nytimes.android.media.audio.podcast.PodcastFetcher$downloadPodcastList$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.media.audio.podcast.PodcastFetcher r4 = (com.nytimes.android.media.audio.podcast.PodcastFetcher) r4
            kotlin.f.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.a
            aw5 r2 = new aw5
            r2.<init>()
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yj r5 = (defpackage.yj) r5
            ii5$a r5 = r5.c
            defpackage.zq3.e(r5)
            aw5$b r5 = (aw5.b) r5
            com.nytimes.android.media.audio.podcast.a r4 = r4.b
            java.util.List r4 = r4.b(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.audio.podcast.PodcastFetcher.d(by0):java.lang.Object");
    }

    public final Object e(by0 by0Var) {
        return CoroutineScopeKt.coroutineScope(new PodcastFetcher$fetchPodcasts$2(this, null), by0Var);
    }
}
