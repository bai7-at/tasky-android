package defpackage;

import com.nytimes.android.ad.a;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.VideoAsset;

/* loaded from: classes4.dex */
public abstract class yo4 {
    public static final String a(a aVar, VideoAsset videoAsset, LatestFeed latestFeed, String str, String str2, boolean z) {
        zq3.h(aVar, "<this>");
        zq3.h(videoAsset, "videoAsset");
        zq3.h(latestFeed, "latestFeed");
        zq3.h(str, "sectionName");
        zq3.h(str2, "subSectionName");
        return str.length() > 0 ? aVar.d(str, str2, videoAsset.getSectionNameOptional(), videoAsset.getSubSectionNameOptional(), latestFeed, z) : aVar.f(videoAsset, latestFeed);
    }
}
