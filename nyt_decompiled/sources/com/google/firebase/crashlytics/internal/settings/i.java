package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.c;
import defpackage.e41;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class i implements f {
    i() {
    }

    private static c.a b(JSONObject jSONObject) {
        return new c.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static c.b c(JSONObject jSONObject) {
        return new c.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(e41 e41Var, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : e41Var.a() + (j * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public c a(e41 e41Var, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new c(d(e41Var, optInt2, jSONObject), jSONObject.has("session") ? c(jSONObject.getJSONObject("session")) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
