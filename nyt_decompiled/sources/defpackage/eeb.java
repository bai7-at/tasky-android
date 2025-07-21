package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class eeb {
    static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String b(Uri uri, Context context) {
        String a;
        if (dyf.p().p(context) && (a = dyf.p().a(context)) != null) {
            String str = (String) pla.c().a(mpa.e0);
            String uri2 = uri.toString();
            if (((Boolean) pla.c().a(mpa.d0)).booleanValue() && uri2.contains(str)) {
                dyf.p().j(context, a);
                return d(uri2, context).replace(str, a);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return uri2;
            }
            String uri3 = a(d(uri2, context), "fbs_aeid", a).toString();
            dyf.p().j(context, a);
            return uri3;
        }
        return uri.toString();
    }

    public static String c(String str, Context context, boolean z) {
        String a;
        if ((((Boolean) pla.c().a(mpa.l0)).booleanValue() && !z) || !dyf.p().p(context) || TextUtils.isEmpty(str) || (a = dyf.p().a(context)) == null) {
            return str;
        }
        String str2 = (String) pla.c().a(mpa.e0);
        if (((Boolean) pla.c().a(mpa.d0)).booleanValue() && str.contains(str2)) {
            if (dyf.r().K(str)) {
                dyf.p().j(context, a);
                return d(str, context).replace(str2, a);
            }
            if (!dyf.r().L(str)) {
                return str;
            }
            dyf.p().k(context, a);
            return d(str, context).replace(str2, a);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (dyf.r().K(str)) {
            dyf.p().j(context, a);
            return a(d(str, context), "fbs_aeid", a).toString();
        }
        if (!dyf.r().L(str)) {
            return str;
        }
        dyf.p().k(context, a);
        return a(d(str, context), "fbs_aeid", a).toString();
    }

    private static String d(String str, Context context) {
        String d = dyf.p().d(context);
        String b = dyf.p().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(d)) {
            str = a(str, "gmp_app_id", d).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(b)) ? str : a(str, "fbs_aiid", b).toString();
    }
}
