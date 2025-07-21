package io.embrace.android.embracesdk.internal.payload;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SpanEventJsonAdapter extends JsonAdapter<SpanEvent> {
    private volatile Constructor<SpanEvent> constructorRef;
    private final JsonAdapter<List<Attribute>> nullableListOfAttributeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public SpanEventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "time_unix_nano", "attributes");
        zq3.g(a, "JsonReader.Options.of(\"n…ano\",\n      \"attributes\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "timeUnixNano");
        zq3.g(f2, "moshi.adapter(Long::clas…ptySet(), \"timeUnixNano\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<List<Attribute>> f3 = iVar.f(j.j(List.class, Attribute.class), b0.e(), "attributes");
        zq3.g(f3, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.nullableListOfAttributeAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SpanEvent");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SpanEvent fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    list = (List) this.nullableListOfAttributeAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967288L)) {
            return new SpanEvent(str, l, list);
        }
        Constructor<SpanEvent> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SpanEvent.class.getDeclaredConstructor(String.class, Long.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "SpanEvent::class.java.ge…his.constructorRef = it }");
        }
        SpanEvent newInstance = constructor.newInstance(str, l, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SpanEvent spanEvent) {
        zq3.h(hVar, "writer");
        if (spanEvent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.nullableStringAdapter.mo197toJson(hVar, spanEvent.getName());
        hVar.C("time_unix_nano");
        this.nullableLongAdapter.mo197toJson(hVar, spanEvent.getTimeUnixNano());
        hVar.C("attributes");
        this.nullableListOfAttributeAdapter.mo197toJson(hVar, spanEvent.getAttributes());
        hVar.l();
    }
}
