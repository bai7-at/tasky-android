package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes4.dex */
public abstract class j84 {
    public static final i84 a(String str) {
        zq3.h(str, "<this>");
        try {
            if (str.length() != 43) {
                throw new Exception(str + " does not contain 43 characters");
            }
            String substring = str.substring(6, 7);
            zq3.g(substring, "substring(...)");
            if (!zq3.c(substring, QueryKeys.END_MARKER)) {
                throw new Exception(str + " missing separator");
            }
            String substring2 = str.substring(0, 6);
            zq3.g(substring2, "substring(...)");
            String substring3 = str.substring(7);
            zq3.g(substring3, "substring(...)");
            return new i84(substring2, substring3);
        } catch (Exception unused) {
            return null;
        }
    }
}
