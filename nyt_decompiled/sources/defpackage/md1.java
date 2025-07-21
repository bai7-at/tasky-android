package defpackage;

import android.content.Intent;
import android.net.ParseException;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.nytimes.android.logging.NYTLogger;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class md1 {
    public static final a b = new a(null);
    public static final int c = 8;
    private static final Map d = t.f(du8.a("intent.extra.ANCESTOR", "twitter"));
    private static final Map e = t.m(du8.a("al_applink_data", ""), du8.a("is_app_link", "true"), du8.a("application_link_type", ""), du8.a("extra_launch_uri", AccessToken.DEFAULT_GRAPH_DOMAIN));
    private Intent a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(Bundle bundle) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                zq3.e(str);
                if (c(str)) {
                    return "Facebook";
                }
                if (d(str, obj)) {
                    return "Twitter";
                }
            }
            return null;
        }

        private final boolean c(String str) {
            return md1.e.containsKey(str);
        }

        private final boolean d(String str, Object obj) {
            return md1.d.containsKey(str) && obj != null && h.P(obj.toString(), (CharSequence) t.j(md1.d, str), false, 2, null);
        }

        private a() {
        }
    }

    private final Uri c(Bundle bundle) {
        Uri uri;
        Bundle d2;
        bundle.setClassLoader(bundle.getClass().getClassLoader());
        try {
            uri = (Uri) bundle.getParcelable("android.intent.extra.REFERRER");
        } catch (BadParcelableException e2) {
            NYTLogger.i(e2, "Failed to get parcelable referer", new Object[0]);
            uri = null;
        }
        if (uri != null) {
            return uri;
        }
        Uri g = g(bundle, "android.intent.extra.REFERRER_NAME");
        return (g != null || (d2 = d(bundle)) == null) ? g : g(d2, "Referer");
    }

    private final Bundle d(Bundle bundle) {
        try {
            Object obj = bundle.get("com.android.browser.headers");
            if (obj instanceof Bundle) {
                return (Bundle) obj;
            }
            return null;
        } catch (RuntimeException e2) {
            h(e2, "com.android.browser.headers");
            return null;
        }
    }

    private final String f(Uri uri) {
        if (zq3.c("http", uri.getScheme()) || zq3.c("https", uri.getScheme())) {
            String host = uri.getHost();
            zq3.e(host);
            return h.P(host, "google", false, 2, null) ? "Google Search" : host;
        }
        if (!zq3.c("android-app", uri.getScheme())) {
            return null;
        }
        pd b2 = pd.b(uri);
        zq3.g(b2, "newAndroidAppUri(...)");
        String a2 = b2.a();
        zq3.g(a2, "getPackageName(...)");
        return zq3.c("com.google.android.googlequicksearchbox", a2) ? "Google Search" : a2;
    }

    private final Uri g(Bundle bundle, String str) {
        String str2;
        if (bundle != null) {
            try {
                str2 = bundle.getString(str);
            } catch (RuntimeException e2) {
                this.h(e2, str);
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return Uri.parse(str2);
                } catch (ParseException e3) {
                    NYTLogger.i(e3, "Error when trying to parse referrer", new Object[0]);
                }
            }
        }
        return null;
    }

    private final void h(Exception exc, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("DeepLinkingReferrer, error Unmarshalling for key:" + str);
        Intent intent = this.a;
        zq3.e(intent);
        sb.append(ao3.c(intent));
        try {
            sb.append("; parcelBytes=");
            Intent intent2 = this.a;
            zq3.e(intent2);
            Bundle extras = intent2.getExtras();
            zq3.e(extras);
            sb.append(ao3.b(extras));
            sb.append("; ");
        } catch (Throwable th) {
            sb.append("; exception " + th + "while getting parcel");
        }
        Intent intent3 = this.a;
        zq3.e(intent3);
        Bundle extras2 = intent3.getExtras();
        zq3.e(extras2);
        sb.append(extras2.toString());
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        NYTLogger.i(exc, sb2, new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "intent"
            defpackage.zq3.h(r4, r0)
            r3.a = r4
            android.os.Bundle r0 = r4.getExtras()
            java.lang.String r1 = "Deep Link"
            if (r0 != 0) goto L10
            return r1
        L10:
            android.net.Uri r4 = r4.getData()
            if (r4 == 0) goto L1d
            java.lang.String r2 = "nl"
            java.lang.String r4 = r4.getQueryParameter(r2)
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L67
            int r2 = r4.length()
            if (r2 != 0) goto L27
            goto L67
        L27:
            int r3 = r4.hashCode()
            switch(r3) {
                case -1716884207: goto L59;
                case -1268767050: goto L4d;
                case -679327461: goto L44;
                case 3149008: goto L3b;
                case 1550783935: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L61
        L2f:
            java.lang.String r3 = "running"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L38
            goto L61
        L38:
            java.lang.String r3 = "Deep Link Newsletter Running"
            goto L66
        L3b:
            java.lang.String r3 = "fory"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L61
        L44:
            java.lang.String r3 = "for-you"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L61
        L4d:
            java.lang.String r3 = "foryou"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L61
        L56:
            java.lang.String r3 = "Deep Link Newsletter For You"
            goto L66
        L59:
            java.lang.String r3 = "morning-briefing"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L64
        L61:
            java.lang.String r3 = "Deep Link Newsletter"
            goto L66
        L64:
            java.lang.String r3 = "Deep Link Newsletter Morning Briefing"
        L66:
            return r3
        L67:
            android.net.Uri r4 = r3.c(r0)
            if (r4 == 0) goto L74
            java.lang.String r3 = r3.f(r4)
            if (r3 == 0) goto L74
            return r3
        L74:
            md1$a r3 = defpackage.md1.b
            java.lang.String r3 = md1.a.a(r3, r0)
            if (r3 == 0) goto L84
            int r4 = r3.length()
            if (r4 != 0) goto L83
            goto L84
        L83:
            return r3
        L84:
            java.lang.String r3 = "com.android.browser.application_id"
            java.lang.String r4 = ""
            java.lang.String r3 = r0.getString(r3, r4)
            if (r3 == 0) goto L99
            int r4 = r3.length()
            if (r4 != 0) goto L95
            goto L99
        L95:
            defpackage.zq3.e(r3)
            return r3
        L99:
            java.lang.String r3 = "ARTICLE_REFERRING_SOURCE"
            java.lang.String r3 = r0.getString(r3, r1)
            java.lang.String r4 = "getString(...)"
            defpackage.zq3.g(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md1.e(android.content.Intent):java.lang.String");
    }
}
