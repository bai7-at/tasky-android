package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class el7 {
    public static final a f = new a(null);
    private static final String g;
    private static final int h;
    private final kv a;
    private final String b;
    private List c;
    private final List d;
    private int e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String simpleName = el7.class.getSimpleName();
        zq3.g(simpleName, "SessionEventsState::class.java.simpleName");
        g = simpleName;
        h = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    }

    public el7(kv kvVar, String str) {
        zq3.h(kvVar, "attributionIdentifiers");
        zq3.h(str, "anonymousAppDeviceGUID");
        this.a = kvVar;
        this.b = str;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    private final void f(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (c11.d(this)) {
                return;
            }
            try {
                AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.a;
                jSONObject = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.F(jSONObject);
            Bundle u = graphRequest.u();
            String jSONArray2 = jSONArray.toString();
            zq3.g(jSONArray2, "events.toString()");
            u.putString("custom_events", jSONArray2);
            graphRequest.I(jSONArray2);
            graphRequest.H(u);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final synchronized void a(AppEvent appEvent) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(appEvent, "event");
            if (this.c.size() + this.d.size() >= h) {
                this.e++;
            } else {
                this.c.add(appEvent);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final synchronized void b(boolean z) {
        if (c11.d(this)) {
            return;
        }
        if (z) {
            try {
                this.c.addAll(this.d);
            } catch (Throwable th) {
                c11.b(th, this);
                return;
            }
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized int c() {
        if (c11.d(this)) {
            return 0;
        }
        try {
            return this.c.size();
        } catch (Throwable th) {
            c11.b(th, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (c11.d(this)) {
            return null;
        }
        try {
            List list = this.c;
            this.c = new ArrayList();
            return list;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final int e(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        if (c11.d(this)) {
            return 0;
        }
        try {
            zq3.h(graphRequest, "request");
            zq3.h(context, "applicationContext");
            synchronized (this) {
                try {
                    int i = this.e;
                    x32 x32Var = x32.a;
                    x32.d(this.c);
                    this.d.addAll(this.c);
                    this.c.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (AppEvent appEvent : this.d) {
                        if (appEvent.g()) {
                            if (!z && appEvent.h()) {
                            }
                            jSONArray.put(appEvent.e());
                        } else {
                            g29 g29Var = g29.a;
                            g29.f0(g, zq3.q("Event with invalid checksum: ", appEvent));
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    ww8 ww8Var = ww8.a;
                    f(graphRequest, context, i, jSONArray, z2);
                    return jSONArray.length();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c11.b(th2, this);
            return 0;
        }
    }
}
