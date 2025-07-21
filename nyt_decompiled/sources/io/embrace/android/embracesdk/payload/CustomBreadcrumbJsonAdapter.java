package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class CustomBreadcrumbJsonAdapter extends JsonAdapter<CustomBreadcrumb> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public CustomBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.MAX_SCROLL_DEPTH, "ts");
        zq3.g(a, "JsonReader.Options.of(\"m\", \"ts\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "message");
        zq3.g(f, "moshi.adapter(String::cl…   emptySet(), \"message\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CustomBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CustomBreadcrumb fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("timestamp", "ts", jsonReader);
                zq3.g(x, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                throw x;
            }
        }
        jsonReader.h();
        if (l != null) {
            return new CustomBreadcrumb(str, l.longValue());
        }
        JsonDataException o = c29.o("timestamp", "ts", jsonReader);
        zq3.g(o, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CustomBreadcrumb customBreadcrumb) {
        zq3.h(hVar, "writer");
        if (customBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.MAX_SCROLL_DEPTH);
        this.nullableStringAdapter.mo197toJson(hVar, customBreadcrumb.getMessage());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(customBreadcrumb.getTimestamp$embrace_android_sdk_release()));
        hVar.l();
    }
}
