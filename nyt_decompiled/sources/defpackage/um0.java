package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.WindowState;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes3.dex */
public abstract class um0 extends fh5 {
    private static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    static final int[] b;
    private static final int c;

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, Constants.NO_SUCH_BUCKET_STATUS_CODE, WindowState.MINIMIZED, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, ContentFeedType.OTHER, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, ContentFeedType.WEST_HD, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        b = iArr;
        c = iArr[47];
    }
}
