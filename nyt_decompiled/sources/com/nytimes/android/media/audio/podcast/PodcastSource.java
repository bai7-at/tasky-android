package com.nytimes.android.media.audio.podcast;

import defpackage.gt2;
import defpackage.zq3;
import io.reactivex.Single;
import kotlin.text.h;

/* loaded from: classes4.dex */
public interface PodcastSource {

    public static final class DefaultImpls {
        public static Single a(PodcastSource podcastSource, String str) {
            zq3.h(str, "currentMediaId");
            return podcastSource.g(str, new gt2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSource$getNextEpisode$1
                public final Integer b(int i, int i2) {
                    int i3;
                    if (i == -1 || (i3 = i + 1) >= i2) {
                        i3 = 0;
                    }
                    return Integer.valueOf(i3);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b(((Number) obj).intValue(), ((Number) obj2).intValue());
                }
            });
        }

        public static Single b(PodcastSource podcastSource, String str) {
            zq3.h(str, "currentMediaId");
            return podcastSource.g(str, new gt2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSource$getPreviousEpisode$1
                public final Integer b(int i, int i2) {
                    int i3;
                    int i4 = 0;
                    if (i != 0 && i >= 0 && i - 1 < i2) {
                        i4 = i3;
                    }
                    return Integer.valueOf(i4);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b(((Number) obj).intValue(), ((Number) obj2).intValue());
                }
            });
        }

        public static boolean c(PodcastSource podcastSource, String str) {
            zq3.h(str, "query");
            return h.N(str, "podcast", true);
        }
    }

    Single a(String str);

    Single b();

    Single c(String str);

    Single d(String str);

    boolean e(String str);

    Single f(String str);

    Single g(String str, gt2 gt2Var);
}
