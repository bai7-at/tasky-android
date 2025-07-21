package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.vl3;
import defpackage.yl;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class yl {
    public static final a c = new a(null);
    private static final String d;
    private static ScheduledThreadPoolExecutor e;
    private static AppEventsLogger.FlushBehavior f;
    private static final Object g;
    private static String h;
    private static boolean i;
    private static String j;
    private final String a;
    private AccessTokenAppIdPair b;

    public static final class a {

        /* renamed from: yl$a$a, reason: collision with other inner class name */
        public static final class C0557a implements vl3.a {
            C0557a() {
            }

            @Override // vl3.a
            public void a(String str) {
                yl.c.t(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(Context context, yl ylVar) {
            zq3.h(context, "$context");
            zq3.h(ylVar, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                String str = strArr[i];
                String str2 = strArr2[i];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i2 |= 1 << i;
                } catch (ClassNotFoundException unused) {
                }
                if (i3 > 10) {
                    break;
                } else {
                    i = i3;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                ylVar.o("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o() {
            synchronized (yl.e()) {
                if (yl.b() != null) {
                    return;
                }
                yl.i(new ScheduledThreadPoolExecutor(1));
                ww8 ww8Var = ww8.a;
                Runnable runnable = new Runnable() { // from class: wl
                    @Override // java.lang.Runnable
                    public final void run() {
                        yl.a.p();
                    }
                };
                ScheduledThreadPoolExecutor b = yl.b();
                if (b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator it2 = ql.p().iterator();
            while (it2.hasNext()) {
                hashSet.add(((AccessTokenAppIdPair) it2.next()).b());
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                FetchedAppSettingsManager.n((String) it3.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            ql.g(accessTokenAppIdPair, appEvent);
            FeatureManager featureManager = FeatureManager.a;
            if (FeatureManager.g(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && te5.d()) {
                te5.e(accessTokenAppIdPair.b(), appEvent);
            }
            if (appEvent.c() || yl.f()) {
                return;
            }
            if (zq3.c(appEvent.f(), "fb_mobile_activate_app")) {
                yl.g(true);
            } else {
                k94.e.b(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(String str) {
            k94.e.b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void f(Application application, String str) {
            zq3.h(application, "application");
            if (!w92.E()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            fd.d();
            uz8.e();
            if (str == null) {
                str = w92.m();
            }
            w92.J(application, str);
            v4.x(application, str);
        }

        public final void g() {
            if (j() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                ql qlVar = ql.a;
                ql.l(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor h() {
            if (yl.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor b = yl.b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String i(Context context) {
            zq3.h(context, "context");
            if (yl.a() == null) {
                synchronized (yl.e()) {
                    try {
                        if (yl.a() == null) {
                            yl.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (yl.a() == null) {
                                UUID randomUUID = UUID.randomUUID();
                                zq3.g(randomUUID, "randomUUID()");
                                yl.h(zq3.q("XZ", randomUUID));
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", yl.a()).apply();
                            }
                        }
                        ww8 ww8Var = ww8.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String a = yl.a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final AppEventsLogger.FlushBehavior j() {
            AppEventsLogger.FlushBehavior c;
            synchronized (yl.e()) {
                c = yl.c();
            }
            return c;
        }

        public final String k() {
            vl3 vl3Var = vl3.a;
            vl3.d(new C0557a());
            return w92.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            String d;
            synchronized (yl.e()) {
                d = yl.d();
            }
            return d;
        }

        public final void m(final Context context, String str) {
            zq3.h(context, "context");
            if (w92.p()) {
                final yl ylVar = new yl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor b = yl.b();
                if (b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b.execute(new Runnable() { // from class: xl
                    @Override // java.lang.Runnable
                    public final void run() {
                        yl.a.n(context, ylVar);
                    }
                });
            }
        }

        public final void s() {
            ql.s();
        }

        public final void t(String str) {
            SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        private a() {
        }
    }

    static {
        String canonicalName = yl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        d = canonicalName;
        f = AppEventsLogger.FlushBehavior.AUTO;
        g = new Object();
    }

    public yl(String str, String str2, AccessToken accessToken) {
        zq3.h(str, "activityName");
        v29.o();
        this.a = str;
        accessToken = accessToken == null ? AccessToken.Companion.e() : accessToken;
        if (accessToken == null || accessToken.o() || !(str2 == null || zq3.c(str2, accessToken.c()))) {
            if (str2 == null) {
                g29 g29Var = g29.a;
                str2 = g29.F(w92.l());
            }
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.b = new AccessTokenAppIdPair(null, str2);
        } else {
            this.b = new AccessTokenAppIdPair(accessToken);
        }
        c.o();
    }

    public static final /* synthetic */ String a() {
        if (c11.d(yl.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (c11.d(yl.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior c() {
        if (c11.d(yl.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (c11.d(yl.class)) {
            return null;
        }
        try {
            return j;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (c11.d(yl.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (c11.d(yl.class)) {
            return false;
        }
        try {
            return i;
        } catch (Throwable th) {
            c11.b(th, yl.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z) {
        if (c11.d(yl.class)) {
            return;
        }
        try {
            i = z;
        } catch (Throwable th) {
            c11.b(th, yl.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (c11.d(yl.class)) {
            return;
        }
        try {
            h = str;
        } catch (Throwable th) {
            c11.b(th, yl.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (c11.d(yl.class)) {
            return;
        }
        try {
            e = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            c11.b(th, yl.class);
        }
    }

    public final void j() {
        if (c11.d(this)) {
            return;
        }
        try {
            ql qlVar = ql.a;
            ql.l(FlushReason.EXPLICIT);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void k(String str, double d2, Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            m(str, Double.valueOf(d2), bundle, false, v4.m());
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void l(String str, Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            m(str, null, bundle, false, v4.m());
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void m(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (c11.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            qd2 qd2Var = qd2.a;
            if (qd2.d("app_events_killswitch", w92.m(), false)) {
                k94.e.c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                c.q(new AppEvent(this.a, str, d2, bundle, z, v4.o(), uuid), this.b);
            } catch (FacebookException e2) {
                k94.e.c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (JSONException e3) {
                k94.e.c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void n(String str, String str2) {
        if (c11.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void o(String str, Double d2, Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            m(str, d2, bundle, true, v4.m());
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                g29 g29Var = g29.a;
                g29.f0(d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, v4.m());
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (c11.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                c.r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                c.r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, v4.m());
            c.g();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            q(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public yl(Context context, String str, AccessToken accessToken) {
        this(g29.t(context), str, accessToken);
    }
}
