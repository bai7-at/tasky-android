package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import defpackage.du8;
import defpackage.g29;
import defpackage.k94;
import defpackage.kv;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.t;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AppEventsLoggerUtility {
    public static final AppEventsLoggerUtility a = new AppEventsLoggerUtility();
    private static final Map b = t.k(du8.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), du8.a(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static GraphAPIActivityType[] valuesCustom() {
            GraphAPIActivityType[] valuesCustom = values();
            return (GraphAPIActivityType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private AppEventsLoggerUtility() {
    }

    public static final JSONObject a(GraphAPIActivityType graphAPIActivityType, kv kvVar, String str, boolean z, Context context) {
        zq3.h(graphAPIActivityType, "activityType");
        zq3.h(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", b.get(graphAPIActivityType));
        String e = AppEventsLogger.b.e();
        if (e != null) {
            jSONObject.put("app_user_id", e);
        }
        g29.z0(jSONObject, kvVar, str, z, context);
        try {
            g29.A0(jSONObject, context);
        } catch (Exception e2) {
            k94.e.c(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        JSONObject A = g29.A();
        if (A != null) {
            Iterator<String> keys = A.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, A.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
