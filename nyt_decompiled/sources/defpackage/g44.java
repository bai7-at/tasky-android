package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import java.util.List;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public abstract class g44 {
    private static final AssetData a;
    private static final he7 b;
    private static final be8 c;
    private static final j44 d;

    static {
        AssetData assetData = new AssetData(null, null, "Duis at consectetur lorem donec", null, null, null, null, null, false, System.currentTimeMillis(), 0L, 0L, null, null, null, new AssetSection("Movies", "Movies", false, 4, null), null, null, false, false, false, false, false, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", null, null, null, null, null, null, null, null, null, 0L, -16810501, 7, null);
        a = assetData;
        b = new he7("Duis at consectetur lorem donec", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "Jan 1st", "kicker", "", "uri", null, null, null, false, false, 1984, null);
        c = new be8("id", "url", "headline", "");
        d = new j44(assetData, du8.a(assetData, assetData), null, d(5), c(6), du8.a(du8.a(assetData, assetData), du8.a(assetData, assetData)), c(6), assetData, b(6), c(6), d(4));
    }

    public static final j44 a() {
        return d;
    }

    private static final List b(int i) {
        AssetData copy;
        List c2 = i.c();
        int i2 = 0;
        while (i2 < i) {
            AssetData assetData = a;
            i2++;
            copy = assetData.copy((r57 & 1) != 0 ? assetData.uri : assetData.getTitle() + i2, (r57 & 2) != 0 ? assetData.assetType : null, (r57 & 4) != 0 ? assetData.title : null, (r57 & 8) != 0 ? assetData.meterAccessType : null, (r57 & 16) != 0 ? assetData.parsedHtmlSummary : null, (r57 & 32) != 0 ? assetData.authors : null, (r57 & 64) != 0 ? assetData.column : null, (r57 & 128) != 0 ? assetData.displaySize : null, (r57 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? assetData.isCommentsEnabled : false, (r57 & 512) != 0 ? assetData.lastModified : 0L, (r57 & 1024) != 0 ? assetData.lastMajorModified : 0L, (r57 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? assetData.firstPublished : 0L, (r57 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? assetData.subHeadline : null, (r57 & 8192) != 0 ? assetData.advertisingSensitivity : null, (r57 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? assetData.dataName : null, (r57 & 32768) != 0 ? assetData.assetSection : null, (r57 & 65536) != 0 ? assetData.dfp : null, (r57 & 131072) != 0 ? assetData.promotionalMediaSize : null, (r57 & 262144) != 0 ? assetData.isSummaryHidden : false, (r57 & 524288) != 0 ? assetData.isPromotionalMediaHidden : false, (r57 & Constants.MB) != 0 ? assetData.isTitleHidden : false, (r57 & 2097152) != 0 ? assetData.isKickerHidden : false, (r57 & 4194304) != 0 ? assetData.isOak : false, (r57 & 8388608) != 0 ? assetData.htmlMedia : null, (r57 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? assetData.summary : null, (r57 & 33554432) != 0 ? assetData.url : null, (r57 & 67108864) != 0 ? assetData.kicker : null, (r57 & 134217728) != 0 ? assetData.byline : null, (r57 & 268435456) != 0 ? assetData.tone : null, (r57 & 536870912) != 0 ? assetData.addendums : null, (r57 & 1073741824) != 0 ? assetData.subsection : null, (r57 & RecyclerView.UNDEFINED_DURATION) != 0 ? assetData.promotionalMedia : null, (r58 & 1) != 0 ? assetData.desk : null, (r58 & 2) != 0 ? assetData.regions : null, (r58 & 4) != 0 ? assetData.assetId : 0L);
            c2.add(copy);
        }
        return i.a(c2);
    }

    private static final List c(int i) {
        List c2 = i.c();
        int i2 = 0;
        while (i2 < i) {
            be8 be8Var = c;
            i2++;
            c2.add(be8.b(be8Var, be8Var.c() + i2, null, null, null, 14, null));
        }
        return i.a(c2);
    }

    private static final List d(int i) {
        he7 a2;
        List c2 = i.c();
        int i2 = 0;
        while (i2 < i) {
            he7 he7Var = b;
            i2++;
            a2 = he7Var.a((r24 & 1) != 0 ? he7Var.a : he7Var.h() + i2, (r24 & 2) != 0 ? he7Var.b : null, (r24 & 4) != 0 ? he7Var.c : null, (r24 & 8) != 0 ? he7Var.d : null, (r24 & 16) != 0 ? he7Var.e : null, (r24 & 32) != 0 ? he7Var.f : null, (r24 & 64) != 0 ? he7Var.g : null, (r24 & 128) != 0 ? he7Var.h : null, (r24 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? he7Var.i : null, (r24 & 512) != 0 ? he7Var.j : false, (r24 & 1024) != 0 ? he7Var.k : false);
            c2.add(a2);
        }
        return i.a(c2);
    }
}
