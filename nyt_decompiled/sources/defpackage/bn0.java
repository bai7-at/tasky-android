package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.ga9;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bn0 {
    private static SensorManager c;
    private static fa9 d;
    private static String e;
    private static volatile boolean h;
    public static final bn0 a = new bn0();
    private static final ga9 b = new ga9();
    private static final AtomicBoolean f = new AtomicBoolean(true);
    private static final AtomicBoolean g = new AtomicBoolean(false);

    private bn0() {
    }

    private final void c(final String str) {
        if (c11.d(this)) {
            return;
        }
        try {
            if (h) {
                return;
            }
            h = true;
            w92.t().execute(new Runnable() { // from class: an0
                @Override // java.lang.Runnable
                public final void run() {
                    bn0.d(str);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str) {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            kv e2 = kv.f.e(w92.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((e2 == null ? null : e2.h()) != null) {
                jSONArray.put(e2.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(sl.f() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            Locale y = g29.y();
            jSONArray.put(y.getLanguage() + '_' + ((Object) y.getCountry()));
            String jSONArray2 = jSONArray.toString();
            zq3.g(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", jSONArray2);
            GraphRequest.c cVar = GraphRequest.n;
            z38 z38Var = z38.a;
            boolean z = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            JSONObject c2 = cVar.B(null, format, bundle, null).k().c();
            AtomicBoolean atomicBoolean = g;
            if (c2 == null || !c2.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (atomicBoolean.get()) {
                fa9 fa9Var = d;
                if (fa9Var != null) {
                    fa9Var.h();
                }
            } else {
                e = null;
            }
            h = false;
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final void e() {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            f.set(false);
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final void f() {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            f.set(true);
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final String g() {
        if (c11.d(bn0.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            c11.b(th, bn0.class);
            return null;
        }
    }

    public static final boolean h() {
        if (c11.d(bn0.class)) {
            return false;
        }
        try {
            return g.get();
        } catch (Throwable th) {
            c11.b(th, bn0.class);
            return false;
        }
    }

    private final boolean i() {
        c11.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            dn0.f.a().f(activity);
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final void k(Activity activity) {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            if (f.get()) {
                dn0.f.a().h(activity);
                fa9 fa9Var = d;
                if (fa9Var != null) {
                    fa9Var.l();
                }
                SensorManager sensorManager = c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(b);
            }
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final void l(Activity activity) {
        bn0 bn0Var;
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            if (f.get()) {
                dn0.f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String m = w92.m();
                final rd2 f2 = FetchedAppSettingsManager.f(m);
                if (!zq3.c(f2 == null ? null : Boolean.valueOf(f2.b()), Boolean.TRUE)) {
                    if (a.i()) {
                    }
                    bn0Var = a;
                    if (bn0Var.i() || g.get()) {
                    }
                    bn0Var.c(m);
                    return;
                }
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                c = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                fa9 fa9Var = new fa9(activity);
                d = fa9Var;
                ga9 ga9Var = b;
                ga9Var.a(new ga9.b() { // from class: zm0
                    @Override // ga9.b
                    public final void a() {
                        bn0.m(rd2.this, m);
                    }
                });
                sensorManager.registerListener(ga9Var, defaultSensor, 2);
                if (f2 != null && f2.b()) {
                    fa9Var.h();
                }
                bn0Var = a;
                if (bn0Var.i()) {
                }
            }
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(rd2 rd2Var, String str) {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            zq3.h(str, "$appId");
            boolean z = rd2Var != null && rd2Var.b();
            boolean s = w92.s();
            if (z && s) {
                a.c(str);
            }
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }

    public static final void n(boolean z) {
        if (c11.d(bn0.class)) {
            return;
        }
        try {
            g.set(z);
        } catch (Throwable th) {
            c11.b(th, bn0.class);
        }
    }
}
