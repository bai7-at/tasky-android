package defpackage;

import com.amazonaws.services.s3.internal.Constants;

/* loaded from: classes4.dex */
public abstract class ec5 {
    public static String a(Object obj) {
        return b(obj, Constants.NULL_VERSION_ID);
    }

    public static String b(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }
}
