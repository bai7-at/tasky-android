package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.media.common.NYTMediaItem;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public final class j79 extends ue4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j79(NYTMediaItem nYTMediaItem, String str, ms4 ms4Var, String str2) {
        super(du8.a("module", "video-player"), du8.a("version", "2.11.6"), du8.a("contentId", nYTMediaItem.a()), du8.a("eventName", str), du8.a("eventTimestamp", Long.valueOf(System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT)), du8.a("referrer", nYTMediaItem.I()), du8.a("mData", ms4Var), du8.a(TransferTable.COLUMN_STATE, str2));
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "eventName");
        zq3.h(ms4Var, "metadata");
        zq3.h(str2, "playbackState");
    }
}
