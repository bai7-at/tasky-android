package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.k94;
import defpackage.kq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class hl7 {
    public static final hl7 a = new hl7();
    private static final String b = hl7.class.getCanonicalName();
    private static final long[] c = {300000, 900000, 1800000, AbraPackageKt.MS_IN_HOUR, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private hl7() {
    }

    private final String a(Context context) {
        if (c11.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String q = zq3.q("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(q, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String c2 = k73.c(context, null);
            if (c2 == null) {
                c2 = k73.b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            }
            sharedPreferences.edit().putString(q, c2).apply();
            return c2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final int b(long j) {
        if (c11.d(hl7.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = c;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                c11.b(th, hl7.class);
                return 0;
            }
        }
        return i;
    }

    public static final void c(String str, qx7 qx7Var, String str2, Context context) {
        String qx7Var2;
        if (c11.d(hl7.class)) {
            return;
        }
        try {
            zq3.h(str, "activityName");
            zq3.h(context, "context");
            String str3 = "Unclassified";
            if (qx7Var != null && (qx7Var2 = qx7Var.toString()) != null) {
                str3 = qx7Var2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str3);
            bundle.putString("fb_mobile_pckg_fp", a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", vi0.a(context));
            kq3.a aVar = kq3.b;
            kq3 b2 = aVar.b(str, str2, null);
            b2.d("fb_mobile_activate_app", bundle);
            if (aVar.d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                b2.a();
            }
        } catch (Throwable th) {
            c11.b(th, hl7.class);
        }
    }

    private final void d() {
        if (c11.d(this)) {
            return;
        }
        try {
            k94.a aVar = k94.e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = b;
            zq3.e(str);
            aVar.b(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void e(String str, gl7 gl7Var, String str2) {
        long longValue;
        String qx7Var;
        if (c11.d(hl7.class)) {
            return;
        }
        try {
            zq3.h(str, "activityName");
            if (gl7Var == null) {
                return;
            }
            Long b2 = gl7Var.b();
            long j = 0;
            if (b2 == null) {
                Long e = gl7Var.e();
                longValue = 0 - (e == null ? 0L : e.longValue());
            } else {
                longValue = b2.longValue();
            }
            if (longValue < 0) {
                a.d();
                longValue = 0;
            }
            long f = gl7Var.f();
            if (f < 0) {
                a.d();
                f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", gl7Var.c());
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            qx7 g = gl7Var.g();
            String str3 = "Unclassified";
            if (g != null && (qx7Var = g.toString()) != null) {
                str3 = qx7Var;
            }
            bundle.putString("fb_mobile_launch_source", str3);
            Long e2 = gl7Var.e();
            if (e2 != null) {
                j = e2.longValue();
            }
            bundle.putLong("_logTime", j / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            kq3.b.b(str, str2, null).c("fb_mobile_deactivate_app", f / 1000, bundle);
        } catch (Throwable th) {
            c11.b(th, hl7.class);
        }
    }
}
