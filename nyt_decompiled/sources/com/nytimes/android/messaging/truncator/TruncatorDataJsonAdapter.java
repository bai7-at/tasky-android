package com.nytimes.android.messaging.truncator;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class TruncatorDataJsonAdapter extends JsonAdapter<TruncatorData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TruncatorData> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public TruncatorDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("isActive", "title", "details", "primaryButtonText", "primaryButtonLink", "secondaryButtonText", "isDismissible", "displayIntervalInHours");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "isActive");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "title");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.TYPE, b0.e(), "displayIntervalInHours");
        zq3.g(f3, "adapter(...)");
        this.intAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TruncatorData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        Integer num = 0;
        jsonReader.b();
        int i = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x = c29.x("isActive", "isActive", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x2 = c29.x("title", "title", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x3 = c29.x("details", "details", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x4 = c29.x("primaryButtonText", "primaryButtonText", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x5 = c29.x("primaryButtonLink", "primaryButtonLink", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x6 = c29.x("secondaryButtonText", "secondaryButtonText", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x7 = c29.x("isDismissible", "isDismissible", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i &= -65;
                    break;
                case 7:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x8 = c29.x("displayIntervalInHours", "displayIntervalInHours", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i &= -129;
                    break;
            }
        }
        jsonReader.h();
        if (i == -256) {
            boolean booleanValue = bool2.booleanValue();
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
            return new TruncatorData(booleanValue, str, str2, str3, str4, str5, bool.booleanValue(), num.intValue());
        }
        Constructor<TruncatorData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            constructor = TruncatorData.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, cls, cls2, cls2, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        TruncatorData newInstance = constructor.newInstance(bool2, str, str2, str3, str4, str5, bool, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TruncatorData truncatorData) {
        zq3.h(hVar, "writer");
        if (truncatorData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("isActive");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(truncatorData.g()));
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, truncatorData.f());
        hVar.C("details");
        this.stringAdapter.mo197toJson(hVar, truncatorData.a());
        hVar.C("primaryButtonText");
        this.stringAdapter.mo197toJson(hVar, truncatorData.d());
        hVar.C("primaryButtonLink");
        this.stringAdapter.mo197toJson(hVar, truncatorData.c());
        hVar.C("secondaryButtonText");
        this.stringAdapter.mo197toJson(hVar, truncatorData.e());
        hVar.C("isDismissible");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(truncatorData.h()));
        hVar.C("displayIntervalInHours");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(truncatorData.b()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TruncatorData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
