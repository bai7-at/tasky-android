package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class ns {
    public static final Intent a(ms msVar, Context context, String str, String str2, boolean z) {
        zq3.h(msVar, "<this>");
        zq3.h(context, "context");
        zq3.h(str, "assetUrl");
        zq3.h(str2, "referringSource");
        boolean b = yt6.b(str2);
        if (!gp0.d(str)) {
            return h.K(str, "nyt://", false, 2, null) ? msVar.a(context, str, str2, b, z) : msVar.c(context, str, str2, b, z);
        }
        String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
        zq3.g(uri, "toString(...)");
        Long c = gp0.c(str);
        return msVar.d(context, null, gp0.e(uri), str2, b, z, c != null ? c.longValue() : 0L, null);
    }
}
