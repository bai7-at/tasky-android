package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d19 {
    public static final d19 a = new d19();
    private static final String b;
    private static final AtomicBoolean c;
    private static final AtomicBoolean d;
    private static final a e;
    private static final a f;
    private static final a g;
    private static final a h;
    private static final a i;
    private static SharedPreferences j;

    private static final class a {
        private boolean a;
        private String b;
        private Boolean c;
        private long d;

        public a(boolean z, String str) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.a = z;
            this.b = str;
        }

        public final boolean a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final long c() {
            return this.d;
        }

        public final Boolean d() {
            return this.c;
        }

        public final boolean e() {
            Boolean bool = this.c;
            return bool == null ? this.a : bool.booleanValue();
        }

        public final void f(long j) {
            this.d = j;
        }

        public final void g(Boolean bool) {
            this.c = bool;
        }
    }

    static {
        String name = d19.class.getName();
        zq3.g(name, "UserSettingsManager::class.java.name");
        b = name;
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
        e = new a(true, "com.facebook.sdk.AutoInitEnabled");
        f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
        g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
        h = new a(false, "auto_event_setup_enabled");
        i = new a(true, "com.facebook.sdk.MonitorEnabled");
    }

    private d19() {
    }

    public static final boolean b() {
        if (c11.d(d19.class)) {
            return false;
        }
        try {
            a.h();
            return g.e();
        } catch (Throwable th) {
            c11.b(th, d19.class);
            return false;
        }
    }

    public static final boolean c() {
        if (c11.d(d19.class)) {
            return false;
        }
        try {
            a.h();
            return e.e();
        } catch (Throwable th) {
            c11.b(th, d19.class);
            return false;
        }
    }

    public static final boolean d() {
        if (c11.d(d19.class)) {
            return false;
        }
        try {
            a.h();
            return f.e();
        } catch (Throwable th) {
            c11.b(th, d19.class);
            return false;
        }
    }

    public static final boolean e() {
        if (c11.d(d19.class)) {
            return false;
        }
        try {
            a.h();
            return h.e();
        } catch (Throwable th) {
            c11.b(th, d19.class);
            return false;
        }
    }

    private final void f() {
        if (c11.d(this)) {
            return;
        }
        try {
            a aVar = h;
            n(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (d.compareAndSet(false, true)) {
                    w92.t().execute(new Runnable() { // from class: c19
                        @Override // java.lang.Runnable
                        public final void run() {
                            d19.g(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j2) {
        if (c11.d(d19.class)) {
            return;
        }
        try {
            if (g.e()) {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
                rd2 n = FetchedAppSettingsManager.n(w92.m(), false);
                if (n != null && n.b()) {
                    kv e2 = kv.f.e(w92.l());
                    String h2 = (e2 == null || e2.h() == null) ? null : e2.h();
                    if (h2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h2);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest x = GraphRequest.n.x(null, "app", null);
                        x.H(bundle);
                        JSONObject c2 = x.k().c();
                        if (c2 != null) {
                            a aVar = h;
                            aVar.g(Boolean.valueOf(c2.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j2);
                            a.p(aVar);
                        }
                    }
                }
            }
            d.set(false);
        } catch (Throwable th) {
            c11.b(th, d19.class);
        }
    }

    private final void h() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (w92.E() && c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                zq3.g(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                j = sharedPreferences;
                i(f, g, e);
                f();
                m();
                l();
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void i(a... aVarArr) {
        if (c11.d(this)) {
            return;
        }
        try {
            int length = aVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                a aVar = aVarArr[i2];
                i2++;
                if (aVar == h) {
                    f();
                } else if (aVar.d() == null) {
                    n(aVar);
                    if (aVar.d() == null) {
                        j(aVar);
                    }
                } else {
                    p(aVar);
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void j(a aVar) {
        if (c11.d(this)) {
            return;
        }
        try {
            o();
            try {
                Context l = w92.l();
                ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) == null || !applicationInfo.metaData.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            } catch (PackageManager.NameNotFoundException e2) {
                g29 g29Var = g29.a;
                g29.e0(b, e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void k() {
        if (c11.d(d19.class)) {
            return;
        }
        try {
            Context l = w92.l();
            ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
            if ((applicationInfo == null ? null : applicationInfo.metaData) == null || !applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            kq3 kq3Var = new kq3(l);
            Bundle bundle = new Bundle();
            if (!g29.Q()) {
                bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            kq3Var.d("fb_auto_applink", bundle);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            c11.b(th, d19.class);
        }
    }

    private final void l() {
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        if (c11.d(this)) {
            return;
        }
        try {
            if (c.get() && w92.E()) {
                Context l = w92.l();
                int i4 = 0;
                int i5 = (e.e() ? 1 : 0) | ((f.e() ? 1 : 0) << 1) | ((g.e() ? 1 : 0) << 2) | ((i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = j;
                Bundle bundle = null;
                if (sharedPreferences == null) {
                    zq3.z("userSettingPref");
                    throw null;
                }
                int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i6 != i5) {
                    SharedPreferences sharedPreferences2 = j;
                    if (sharedPreferences2 == null) {
                        zq3.z("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i5).apply();
                    try {
                        applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
                        if (applicationInfo != null) {
                            bundle = applicationInfo.metaData;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        i2 = 0;
                    }
                    if (bundle == null) {
                        i3 = 0;
                        kq3 kq3Var = new kq3(l);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("usage", i4);
                        bundle2.putInt("initial", i3);
                        bundle2.putInt("previous", i6);
                        bundle2.putInt("current", i5);
                        kq3Var.b(bundle2);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i2 = 0;
                    i3 = 0;
                    while (true) {
                        int i7 = i4 + 1;
                        try {
                            i2 |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                            i3 |= (applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) ? 1 : 0) << i4;
                            if (i7 > 3) {
                                break;
                            } else {
                                i4 = i7;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i4 = i3;
                            i3 = i4;
                            i4 = i2;
                            kq3 kq3Var2 = new kq3(l);
                            Bundle bundle22 = new Bundle();
                            bundle22.putInt("usage", i4);
                            bundle22.putInt("initial", i3);
                            bundle22.putInt("previous", i6);
                            bundle22.putInt("current", i5);
                            kq3Var2.b(bundle22);
                        }
                    }
                    i4 = i2;
                    kq3 kq3Var22 = new kq3(l);
                    Bundle bundle222 = new Bundle();
                    bundle222.putInt("usage", i4);
                    bundle222.putInt("initial", i3);
                    bundle222.putInt("previous", i6);
                    bundle222.putInt("current", i5);
                    kq3Var22.b(bundle222);
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void m() {
        if (c11.d(this)) {
            return;
        }
        try {
            Context l = w92.l();
            ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w(b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void n(a aVar) {
        String str = "";
        if (c11.d(this)) {
            return;
        }
        try {
            o();
            try {
                SharedPreferences sharedPreferences = j;
                if (sharedPreferences == null) {
                    zq3.z("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e2) {
                g29 g29Var = g29.a;
                g29.e0(b, e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void o() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (c.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void p(a aVar) {
        if (c11.d(this)) {
            return;
        }
        try {
            o();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = j;
                if (sharedPreferences == null) {
                    zq3.z("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                l();
            } catch (Exception e2) {
                g29 g29Var = g29.a;
                g29.e0(b, e2);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
