package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;

/* loaded from: classes2.dex */
public abstract class sx1 {
    private static final String b(boolean z) {
        return z ? "PLAYING" : "PAUSED";
    }

    public static final ue4 c(NYTMediaItem nYTMediaItem, String str, boolean z, long j, boolean z2, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "eventName");
        return new j79(nYTMediaItem, str, new ms4(nYTMediaItem, z, j, str2), b(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(NYTMediaItem nYTMediaItem) {
        return nYTMediaItem.R() ? "live" : "vod";
    }
}
