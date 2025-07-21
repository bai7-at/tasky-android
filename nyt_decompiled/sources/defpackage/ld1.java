package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.MailTo;
import android.net.ParseException;
import android.net.Uri;
import android.webkit.WebView;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public class ld1 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final NetworkStatus a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String str) {
            zq3.h(str, "url");
            return h.K(str, "mailto:", false, 2, null);
        }

        private a() {
        }
    }

    public ld1(NetworkStatus networkStatus, Application application) {
        zq3.h(networkStatus, "networkStatus");
        zq3.h(application, "context");
        this.a = networkStatus;
        this.b = " nyt_android/" + DeviceUtils.u(application, false, false, 3, null);
    }

    public final void a(WebView webView) {
        zq3.h(webView, "webView");
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + this.b);
    }

    public final boolean b(Activity activity, String str) {
        zq3.h(activity, "activity");
        zq3.h(str, "url");
        if (Companion.a(str)) {
            d(activity, str);
        } else {
            if (!DeepLinkManager.g.c(str)) {
                return false;
            }
            c(activity, str);
        }
        return true;
    }

    public final void c(Activity activity, String str) {
        zq3.h(activity, "activity");
        zq3.h(str, "url");
        if (str.length() == 0) {
            NYTLogger.g("Skip handleExternalUrl() request: url should not be empty", new Object[0]);
            return;
        }
        Intent data = rb5.p(str) ? Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER").setFlags(268435456).setData(Uri.parse(rb5.a.d(str))) : new Intent("android.intent.action.VIEW").setFlags(268435456).setData(Uri.parse(str));
        zq3.e(data);
        try {
            activity.startActivity(data);
        } catch (ActivityNotFoundException e) {
            NYTLogger.i(e, "Exception occurred when launching activity", new Object[0]);
        }
    }

    public final void d(Activity activity, String str) {
        zq3.h(activity, "activity");
        zq3.h(str, "url");
        try {
            MailTo parse = MailTo.parse(str);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            String subject = parse.getSubject();
            if (subject == null) {
                subject = activity.getString(hk6.feedback_email_subject);
                intent.putExtra("android.intent.extra.SUBJECT", subject);
            }
            activity.startActivity(Intent.createChooser(intent, subject));
        } catch (ParseException unused) {
            NYTLogger.g("Invalid mailTo URL: %s", str);
        }
    }

    public final boolean e() {
        return this.a.g();
    }
}
