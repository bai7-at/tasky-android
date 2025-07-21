package defpackage;

import okhttp3.Request;

/* loaded from: classes4.dex */
public abstract class a96 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request.Builder b(Request.Builder builder, String str, String str2, String str3) {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            builder.addHeader(str, "country=" + str2 + ",region=" + str3);
        }
        return builder;
    }
}
