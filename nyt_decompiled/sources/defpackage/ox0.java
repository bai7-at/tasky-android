package defpackage;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes4.dex */
public abstract class ox0 {
    public static final String a(Context context) {
        zq3.h(context, "<this>");
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
