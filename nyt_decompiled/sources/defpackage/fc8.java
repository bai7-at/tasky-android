package defpackage;

import android.app.Activity;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fc8 {
    public static final fc8 a = new fc8();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final Set c = new LinkedHashSet();
    private static final Set d = new LinkedHashSet();

    private fc8() {
    }

    public static final synchronized void b() {
        synchronized (fc8.class) {
            if (c11.d(fc8.class)) {
                return;
            }
            try {
                w92.t().execute(new Runnable() { // from class: ec8
                    @Override // java.lang.Runnable
                    public final void run() {
                        fc8.c();
                    }
                });
            } catch (Throwable th) {
                c11.b(th, fc8.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (c11.d(fc8.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            a.d();
        } catch (Throwable th) {
            c11.b(th, fc8.class);
        }
    }

    private final void d() {
        String l;
        if (c11.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            rd2 n = FetchedAppSettingsManager.n(w92.m(), false);
            if (n == null || (l = n.l()) == null) {
                return;
            }
            g(l);
            if (c.isEmpty() && d.isEmpty()) {
                return;
            }
            ModelManager modelManager = ModelManager.a;
            File l2 = ModelManager.l(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
            if (l2 == null) {
                return;
            }
            ab2.d(l2);
            Activity l3 = v4.l();
            if (l3 != null) {
                h(l3);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final boolean e(String str) {
        if (c11.d(fc8.class)) {
            return false;
        }
        try {
            zq3.h(str, "event");
            return d.contains(str);
        } catch (Throwable th) {
            c11.b(th, fc8.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (c11.d(fc8.class)) {
            return false;
        }
        try {
            zq3.h(str, "event");
            return c.contains(str);
        } catch (Throwable th) {
            c11.b(th, fc8.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (c11.d(fc8.class)) {
            return;
        }
        try {
            zq3.h(activity, "activity");
            try {
                if (!b.get() || !ab2.f() || (c.isEmpty() && d.isEmpty())) {
                    ua9.d.b(activity);
                    return;
                }
                ua9.d.a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, fc8.class);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (c11.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Set set = c;
                    String string = jSONArray2.getString(i2);
                    zq3.g(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i3 >= length2) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i4 = i + 1;
                Set set2 = d;
                String string2 = jSONArray.getString(i);
                zq3.g(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i4 >= length) {
                    return;
                } else {
                    i = i4;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
