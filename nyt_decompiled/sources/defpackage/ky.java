package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.ribbon.destinations.audio.AudioHeroData;
import com.nytimes.android.ribbon.destinations.audio.PodcastData;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class ky {
    public static final y25 a(AudioHeroData audioHeroData, int i, String str, int i2) {
        zq3.h(audioHeroData, "<this>");
        zq3.h(str, "blockLabel");
        String c = audioHeroData.c();
        String b = audioHeroData.b();
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        Pair a = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(c, AssetConstants.ARTICLE_TYPE, b, "", "", false, false, null, null, navigationSource, null, null, "audio panel", null, null, null, null, t.m(a, du8.a("label", lowerCase)), t.m(du8.a("index", Integer.valueOf(i2)), du8.a("url", audioHeroData.c()), du8.a("uri", audioHeroData.b())), 57600, null);
    }

    public static final y25 b(PodcastData podcastData, int i, String str, int i2) {
        zq3.h(podcastData, "<this>");
        zq3.h(str, "blockLabel");
        String b = podcastData.b();
        String a = podcastData.a();
        NavigationSource navigationSource = NavigationSource.XPN_PANEL;
        Pair a2 = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return new y25(b, AssetConstants.ARTICLE_TYPE, a, "", "", false, false, null, null, navigationSource, null, null, "audio panel", null, null, null, null, t.m(a2, du8.a("label", lowerCase)), t.m(du8.a("index", Integer.valueOf(i2)), du8.a("url", podcastData.b()), du8.a("uri", podcastData.a())), 57600, null);
    }
}
