package com.nytimes.android.hybrid.bridge;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
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

/* loaded from: classes4.dex */
public final class JavascriptEventParameterJsonAdapter extends JsonAdapter<JavascriptEventParameter> {
    private volatile Constructor<JavascriptEventParameter> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringNullableAnyAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public JavascriptEventParameterJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", TransferTable.COLUMN_TYPE, "options");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<Map<String, Object>> f3 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "options");
        zq3.g(f3, "adapter(...)");
        this.nullableMapOfStringNullableAnyAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JavascriptEventParameter fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        String str = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("id", "id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x(TransferTable.COLUMN_TYPE, TransferTable.COLUMN_TYPE, jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                map = (Map) this.nullableMapOfStringNullableAnyAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -8) {
            int intValue = num.intValue();
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            return new JavascriptEventParameter(intValue, str, map);
        }
        Constructor<JavascriptEventParameter> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = JavascriptEventParameter.class.getDeclaredConstructor(cls, String.class, Map.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        JavascriptEventParameter newInstance = constructor.newInstance(num, str, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, JavascriptEventParameter javascriptEventParameter) {
        zq3.h(hVar, "writer");
        if (javascriptEventParameter == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(javascriptEventParameter.b()));
        hVar.C(TransferTable.COLUMN_TYPE);
        this.stringAdapter.mo197toJson(hVar, javascriptEventParameter.d());
        hVar.C("options");
        this.nullableMapOfStringNullableAnyAdapter.mo197toJson(hVar, javascriptEventParameter.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("JavascriptEventParameter");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
