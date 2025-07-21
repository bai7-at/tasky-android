package defpackage;

import android.net.UrlQuerySanitizer;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes4.dex */
public abstract class ee9 {
    public static final String a(UrlQuerySanitizer urlQuerySanitizer, String str) {
        zq3.h(urlQuerySanitizer, "<this>");
        zq3.h(str, TransferTable.COLUMN_KEY);
        String value = urlQuerySanitizer.getValue(str);
        return value == null ? "" : value;
    }
}
