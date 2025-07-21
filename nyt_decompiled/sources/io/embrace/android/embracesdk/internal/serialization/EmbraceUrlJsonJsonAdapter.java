package io.embrace.android.embracesdk.internal.serialization;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EmbraceUrlJsonJsonAdapter extends JsonAdapter<EmbraceUrlJson> {
    private volatile Constructor<EmbraceUrlJson> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public EmbraceUrlJsonJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("url");
        zq3.g(a, "JsonReader.Options.of(\"url\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmbraceUrlJson");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EmbraceUrlJson fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new EmbraceUrlJson(str);
        }
        Constructor<EmbraceUrlJson> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmbraceUrlJson.class.getDeclaredConstructor(String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "EmbraceUrlJson::class.ja…his.constructorRef = it }");
        }
        EmbraceUrlJson newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmbraceUrlJson embraceUrlJson) {
        zq3.h(hVar, "writer");
        if (embraceUrlJson == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, embraceUrlJson.getUrl());
        hVar.l();
    }
}
