package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v9b {
    private final List a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private final JSONObject k;
    private final String l;
    private final String m;

    public v9b(JSONObject jSONObject) {
        this.i = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.e = j(jSONObject.optString("drt_include"));
        this.f = j(jSONObject.optString("cookies_include", "true"));
        this.g = jSONObject.optString("request_id");
        this.d = jSONObject.optString(TransferTable.COLUMN_TYPE);
        String optString = jSONObject.optString(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.a = optString == null ? null : Arrays.asList(optString.split(","));
        this.j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.m = jSONObject.optString("pool_key");
    }

    private static boolean j(String str) {
        if (str != null) {
            return str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || str.equals("true");
        }
        return false;
    }

    public final int a() {
        return this.j;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.m;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.i;
    }

    public final List f() {
        return this.a;
    }

    public final JSONObject g() {
        return this.k;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.e;
    }
}
