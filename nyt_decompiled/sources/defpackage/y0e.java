package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y0e {
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final String h;
    public final x0e i;
    public final Bundle j;
    public final String k;
    public final String l;
    public final String m;
    public final JSONObject n;
    public final String o;
    public final int p;

    y0e(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        x0e x0eVar = null;
        long j = 0;
        int i3 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str8 = str5;
            if ("nofill_urls".equals(nextName)) {
                emptyList = t6b.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) pla.c().a(mpa.g8)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    x0eVar = new x0e(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) pla.c().a(mpa.U9)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str5 = jsonReader.nextString();
                        jSONObject = jSONObject2;
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) pla.c().a(mpa.Q6)).booleanValue()) {
                            try {
                                Bundle a = t6b.a(t6b.h(jsonReader));
                                if (a != null) {
                                    bundle = a;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) pla.c().a(mpa.g9)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) pla.c().a(mpa.g9)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zoa zoaVar = mpa.h9;
                        if (((Boolean) pla.c().a(zoaVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str4 = jsonReader.nextString();
                        } else if (((Boolean) pla.c().a(zoaVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = t6b.h(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i3 = Math.max(1, jsonReader.nextInt());
                            } else {
                                jsonReader.skipValue();
                            }
                            str5 = str8;
                            jSONObject = jSONObject2;
                        }
                    }
                    str5 = str8;
                    jSONObject = jSONObject2;
                }
                str5 = str8;
                jSONObject = jSONObject2;
            }
            str5 = str8;
        }
        jsonReader.endObject();
        this.a = emptyList;
        this.c = i;
        this.b = str;
        this.d = str6;
        this.e = i2;
        this.f = j;
        this.i = x0eVar;
        this.g = z;
        this.h = str7;
        this.j = bundle;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = jSONObject;
        this.o = str5;
        cra craVar = asa.a;
        this.p = ((Long) craVar.e()).longValue() > 0 ? ((Long) craVar.e()).intValue() : i3;
    }
}
