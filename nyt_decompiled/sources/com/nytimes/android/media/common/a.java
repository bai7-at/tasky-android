package com.nytimes.android.media.common;

import com.nytimes.android.api.cms.Audio;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.PodcastSeries;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SubscribeUrl;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class a {
    public static final C0359a Companion = new C0359a(null);

    /* renamed from: com.nytimes.android.media.common.a$a, reason: collision with other inner class name */
    public static final class C0359a {
        public /* synthetic */ C0359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0359a() {
        }
    }

    private final String b(AudioAsset audioAsset) {
        String str = null;
        if (audioAsset.podcastSeries() == null) {
            return null;
        }
        List<SubscribeUrl> subscribeUrls = audioAsset.subscribeUrls();
        if (subscribeUrls == null) {
            subscribeUrls = i.l();
        }
        for (SubscribeUrl subscribeUrl : subscribeUrls) {
            String component1 = subscribeUrl.component1();
            String component2 = subscribeUrl.component2();
            zq3.e(component1);
            if (h.w("android", component1, true) && component2 != null) {
                str = component2;
            }
        }
        return str;
    }

    private final boolean c(AudioAsset audioAsset) {
        boolean z;
        String fileUrl;
        String fileName;
        Long durationInSeconds = audioAsset.durationInSeconds();
        boolean z2 = (durationInSeconds != null ? durationInSeconds.longValue() : 0L) == 0;
        Audio audio = audioAsset.getAudio();
        if (!((audio == null || (fileName = audio.getFileName()) == null) ? false : h.N(fileName, ".mp3", true))) {
            Audio audio2 = audioAsset.getAudio();
            if (!((audio2 == null || (fileUrl = audio2.getFileUrl()) == null) ? false : h.N(fileUrl, ".mp3", true))) {
                z = false;
                return z2 && !z;
            }
        }
        z = true;
        if (z2) {
            return false;
        }
    }

    public final NYTMediaItem a(AudioAsset audioAsset, SectionFront sectionFront) {
        String name;
        zq3.h(audioAsset, "audioAsset");
        String safeUri = audioAsset.getSafeUri();
        String displayTitle = audioAsset.getDisplayTitle();
        String displayTitle2 = audioAsset.getDisplayTitle();
        String summary = audioAsset.getSummary();
        String str = summary == null ? "" : summary;
        String fileUrl = audioAsset.fileUrl();
        String str2 = fileUrl == null ? "" : fileUrl;
        String seriesThumbUrl = audioAsset.seriesThumbUrl();
        String valueOf = String.valueOf(audioAsset.getAssetId());
        Long durationInSeconds = audioAsset.durationInSeconds();
        String seriesName = audioAsset.seriesName();
        String seriesName2 = audioAsset.seriesName();
        AudioPosition audioPosition = AudioPosition.SECTION;
        String str3 = (sectionFront == null || (name = sectionFront.getName()) == null) ? "" : name;
        AudioType audioType = audioAsset.isPodcast() ? AudioType.PODCAST : AudioType.AUDIO;
        String b = b(audioAsset);
        PodcastSeries podcastSeries = audioAsset.podcastSeries();
        return new NYTMediaItem(valueOf, str2, displayTitle2, str, 0L, false, false, safeUri, displayTitle, null, seriesThumbUrl, null, durationInSeconds, seriesName, audioPosition, audioType, podcastSeries != null ? Long.valueOf(podcastSeries.getSeriesId()) : null, str3, null, null, b, null, null, null, null, null, null, null, c(audioAsset), seriesName2, null, null, null, null, false, null, false, false, null, null, null, null, -806614416, 1023, null);
    }
}
