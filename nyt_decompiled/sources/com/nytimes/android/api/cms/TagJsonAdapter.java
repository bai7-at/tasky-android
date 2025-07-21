package com.nytimes.android.api.cms;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class TagJsonAdapter extends JsonAdapter<Tag> {
    private volatile Constructor<Tag> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public TagJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "length", "position", "attributes");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "length");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<Map<String, String>> f3 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "attributes");
        zq3.g(f3, "adapter(...)");
        this.mapOfStringStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Tag");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Tag fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = 0;
        Integer num2 = null;
        String str = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("length", "length", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -3;
            } else if (P == 2) {
                num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    JsonDataException x2 = c29.x("position", "position", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -5;
            } else if (P == 3 && (map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("attributes", "attributes", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (i == -8) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (map != null) {
                return new Tag(str, intValue, intValue2, map);
            }
            JsonDataException o = c29.o("attributes", "attributes", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<Tag> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Tag.class.getDeclaredConstructor(String.class, cls, cls, Map.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (map != null) {
            Tag newInstance = constructor.newInstance(str, num, num2, map, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("attributes", "attributes", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Tag tag) {
        zq3.h(hVar, "writer");
        if (tag == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.nullableStringAdapter.mo197toJson(hVar, tag.getName());
        hVar.C("length");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(tag.getLength()));
        hVar.C("position");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(tag.getPosition()));
        hVar.C("attributes");
        this.mapOfStringStringAdapter.mo197toJson(hVar, tag.getAttributes());
        hVar.l();
    }
}
