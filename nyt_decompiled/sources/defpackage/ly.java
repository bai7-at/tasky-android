package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.media.common.NYTMediaItem;

/* loaded from: classes4.dex */
public final class ly extends ue4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(NYTMediaItem nYTMediaItem, String str) {
        super(du8.a("videoName", nYTMediaItem.A()), du8.a("videoType", AssetConstants.AUDIO_TYPE), du8.a("device", str), du8.a("playerType", "core_audio_player"), du8.a("videoDuration", nYTMediaItem.B()), du8.a("series", nYTMediaItem.v()), du8.a("videoId", nYTMediaItem.D()), du8.a("videoUri", nYTMediaItem.u()), du8.a("duration", nYTMediaItem.B()), du8.a("nyt_uri", nYTMediaItem.u()), du8.a("asset_uri", nYTMediaItem.F()));
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "deviceType");
    }
}
