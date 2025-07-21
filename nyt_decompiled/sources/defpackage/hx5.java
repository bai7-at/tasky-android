package defpackage;

import com.nytimes.android.media.audio.podcast.PodcastFetcher;
import com.nytimes.android.media.audio.podcast.PodcastStore;
import com.nytimes.android.media.audio.podcast.b;

/* loaded from: classes4.dex */
public interface hx5 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final PodcastStore a(PodcastFetcher podcastFetcher, ve2 ve2Var) {
            zq3.h(podcastFetcher, "podcastFetcher");
            zq3.h(ve2Var, "fileSystem");
            return b.a.b(podcastFetcher, ve2Var);
        }
    }
}
