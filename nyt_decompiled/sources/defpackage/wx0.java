package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;

/* loaded from: classes4.dex */
public abstract class wx0 {
    public static final String a(Context context) {
        zq3.h(context, "<this>");
        try {
            return b(context, "com.nytimes.xwords.hybrid");
        } catch (PackageManager.NameNotFoundException unused) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
    }

    private static final String b(Context context, String str) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        return str2 == null ? "1.0.0" : str2;
    }
}
