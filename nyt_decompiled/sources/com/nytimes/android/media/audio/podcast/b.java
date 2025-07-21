package com.nytimes.android.media.audio.podcast;

import com.nytimes.android.external.store3.base.impl.StalePolicy;
import defpackage.sp4;
import defpackage.ve2;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    private final sp4 a() {
        sp4 a2 = sp4.a().d(10L).c(TimeUnit.HOURS.toMillis(12L)).b(TimeUnit.MILLISECONDS).a();
        zq3.g(a2, "build(...)");
        return a2;
    }

    public final PodcastStore b(PodcastFetcher podcastFetcher, ve2 ve2Var) {
        zq3.h(podcastFetcher, "podcastFetcher");
        zq3.h(ve2Var, "fileSystem");
        return new PodcastStore(podcastFetcher, PodcastPersister.Companion.a(ve2Var), a(), StalePolicy.NETWORK_BEFORE_STALE);
    }
}
