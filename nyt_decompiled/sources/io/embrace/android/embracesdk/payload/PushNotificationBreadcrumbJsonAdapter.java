package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class PushNotificationBreadcrumbJsonAdapter extends JsonAdapter<PushNotificationBreadcrumb> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public PushNotificationBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ti", "bd", "tp", "id", "pt", "te", "ts");
        zq3.g(a, "JsonReader.Options.of(\"t…, \"pt\",\n      \"te\", \"ts\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "title");
        zq3.g(f, "moshi.adapter(String::cl…     emptySet(), \"title\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "priority");
        zq3.g(f2, "moshi.adapter(Int::class…  emptySet(), \"priority\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f3, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushNotificationBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PushNotificationBreadcrumb fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x = c29.x("timestamp", "ts", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                        throw x;
                    }
                    break;
            }
        }
        jsonReader.h();
        if (l != null) {
            return new PushNotificationBreadcrumb(str, str2, str3, str4, num, str5, l.longValue());
        }
        JsonDataException o = c29.o("timestamp", "ts", jsonReader);
        zq3.g(o, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PushNotificationBreadcrumb pushNotificationBreadcrumb) {
        zq3.h(hVar, "writer");
        if (pushNotificationBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ti");
        this.nullableStringAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getTitle());
        hVar.C("bd");
        this.nullableStringAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getBody());
        hVar.C("tp");
        this.nullableStringAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getFrom());
        hVar.C("id");
        this.nullableStringAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getId$embrace_android_sdk_release());
        hVar.C("pt");
        this.nullableIntAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getPriority());
        hVar.C("te");
        this.nullableStringAdapter.mo197toJson(hVar, pushNotificationBreadcrumb.getType());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(pushNotificationBreadcrumb.getTimestamp$embrace_android_sdk_release()));
        hVar.l();
    }
}
