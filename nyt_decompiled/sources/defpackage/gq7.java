package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class gq7 {
    private static final void a(Intent intent, String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str)) {
            z38 z38Var = z38.a;
            str3 = String.format("NYTimes: %s", Arrays.copyOf(new Object[]{str}, 1));
            zq3.g(str3, "format(...)");
            str2 = String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            zq3.g(str2, "format(...)");
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("android.intent.extra.SUBJECT", str3);
        }
        intent.putExtra("android.intent.extra.TEXT", str2);
    }

    public static final Intent b(String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            ul8.a.a("createSharingIntentFromUrl(): url is null/empty", new Object[0]);
            return null;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        a(intent, str2, str, str3);
        return intent;
    }
}
