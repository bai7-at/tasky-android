package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vib {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;

    public vib(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", mpa.J);
        this.b = b(jSONObject, "byte_buffer_precache_limit", mpa.l);
        this.c = b(jSONObject, "exo_cache_buffer_size", mpa.w);
        this.d = b(jSONObject, "exo_connect_timeout_millis", mpa.h);
        zoa zoaVar = mpa.g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.e = string;
            this.f = b(jSONObject, "exo_read_timeout_millis", mpa.i);
            this.g = b(jSONObject, "load_check_interval_bytes", mpa.j);
            this.h = b(jSONObject, "player_precache_limit", mpa.k);
            this.i = b(jSONObject, "socket_receive_buffer_size", mpa.m);
            this.j = a(jSONObject, "use_cache_data_source", mpa.i4);
            b(jSONObject, "min_retry_count", mpa.n);
            this.k = a(jSONObject, "treat_load_exception_as_non_fatal", mpa.q);
            this.l = a(jSONObject, "enable_multiple_video_playback", mpa.R1);
            this.m = a(jSONObject, "use_range_http_data_source", mpa.T1);
            this.n = c(jSONObject, "range_http_data_source_high_water_mark", mpa.U1);
            this.o = c(jSONObject, "range_http_data_source_low_water_mark", mpa.V1);
        }
        string = (String) pla.c().a(zoaVar);
        this.e = string;
        this.f = b(jSONObject, "exo_read_timeout_millis", mpa.i);
        this.g = b(jSONObject, "load_check_interval_bytes", mpa.j);
        this.h = b(jSONObject, "player_precache_limit", mpa.k);
        this.i = b(jSONObject, "socket_receive_buffer_size", mpa.m);
        this.j = a(jSONObject, "use_cache_data_source", mpa.i4);
        b(jSONObject, "min_retry_count", mpa.n);
        this.k = a(jSONObject, "treat_load_exception_as_non_fatal", mpa.q);
        this.l = a(jSONObject, "enable_multiple_video_playback", mpa.R1);
        this.m = a(jSONObject, "use_range_http_data_source", mpa.T1);
        this.n = c(jSONObject, "range_http_data_source_high_water_mark", mpa.U1);
        this.o = c(jSONObject, "range_http_data_source_low_water_mark", mpa.V1);
    }

    private static final boolean a(JSONObject jSONObject, String str, zoa zoaVar) {
        boolean booleanValue = ((Boolean) pla.c().a(zoaVar)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, zoa zoaVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) pla.c().a(zoaVar)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, zoa zoaVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) pla.c().a(zoaVar)).longValue();
    }
}
