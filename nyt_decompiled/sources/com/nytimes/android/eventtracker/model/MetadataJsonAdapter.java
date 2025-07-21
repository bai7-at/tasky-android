package com.nytimes.android.eventtracker.model;

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
public final class MetadataJsonAdapter extends JsonAdapter<Metadata> {
    private volatile Constructor<Metadata> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Viewport> nullableViewportAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public MetadataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("app_name", "version", "build_number", "os", "os_version", "device_model", "device_name", "device", "viewport");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "appName");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "deviceFormFactor");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Viewport> f3 = iVar.f(Viewport.class, b0.e(), "viewport");
        zq3.g(f3, "adapter(...)");
        this.nullableViewportAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Metadata fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Viewport viewport = null;
        while (true) {
            Viewport viewport2 = viewport;
            String str10 = str9;
            String str11 = str8;
            if (!jsonReader.hasNext()) {
                String str12 = str7;
                jsonReader.h();
                if (i == -121) {
                    if (str2 == null) {
                        JsonDataException o = c29.o("appName", "app_name", jsonReader);
                        zq3.g(o, "missingProperty(...)");
                        throw o;
                    }
                    if (str3 == null) {
                        JsonDataException o2 = c29.o("versionName", "version", jsonReader);
                        zq3.g(o2, "missingProperty(...)");
                        throw o2;
                    }
                    if (str4 == null) {
                        JsonDataException o3 = c29.o("versionCode", "build_number", jsonReader);
                        zq3.g(o3, "missingProperty(...)");
                        throw o3;
                    }
                    zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
                    zq3.f(str6, "null cannot be cast to non-null type kotlin.String");
                    zq3.f(str12, "null cannot be cast to non-null type kotlin.String");
                    zq3.f(str11, "null cannot be cast to non-null type kotlin.String");
                    return new Metadata(str2, str3, str4, str5, str6, str12, str11, str10, viewport2);
                }
                Constructor<Metadata> constructor = this.constructorRef;
                if (constructor == null) {
                    str = "app_name";
                    constructor = Metadata.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Viewport.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "also(...)");
                } else {
                    str = "app_name";
                }
                Constructor<Metadata> constructor2 = constructor;
                if (str2 == null) {
                    JsonDataException o4 = c29.o("appName", str, jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                if (str3 == null) {
                    JsonDataException o5 = c29.o("versionName", "version", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                if (str4 == null) {
                    JsonDataException o6 = c29.o("versionCode", "build_number", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                Metadata newInstance = constructor2.newInstance(str2, str3, str4, str5, str6, str12, str11, str10, viewport2, Integer.valueOf(i), null);
                zq3.g(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str13 = str7;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("appName", "app_name", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 1:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("versionName", "version", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 2:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x3 = c29.x("versionCode", "build_number", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 3:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x4 = c29.x("osName", "os", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -9;
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 4:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x5 = c29.x("osCode", "os_version", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                case 5:
                    String str14 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str14 == null) {
                        JsonDataException x6 = c29.x("deviceModel", "device_model", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    str7 = str14;
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                case 6:
                    str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x7 = c29.x("deviceName", "device_name", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i &= -65;
                    viewport = viewport2;
                    str9 = str10;
                    str7 = str13;
                case 7:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    viewport = viewport2;
                    str8 = str11;
                    str7 = str13;
                case 8:
                    viewport = (Viewport) this.nullableViewportAdapter.fromJson(jsonReader);
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
                default:
                    viewport = viewport2;
                    str9 = str10;
                    str8 = str11;
                    str7 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Metadata metadata) {
        zq3.h(hVar, "writer");
        if (metadata == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("app_name");
        this.stringAdapter.mo197toJson(hVar, metadata.a());
        hVar.C("version");
        this.stringAdapter.mo197toJson(hVar, metadata.h());
        hVar.C("build_number");
        this.stringAdapter.mo197toJson(hVar, metadata.g());
        hVar.C("os");
        this.stringAdapter.mo197toJson(hVar, metadata.f());
        hVar.C("os_version");
        this.stringAdapter.mo197toJson(hVar, metadata.e());
        hVar.C("device_model");
        this.stringAdapter.mo197toJson(hVar, metadata.c());
        hVar.C("device_name");
        this.stringAdapter.mo197toJson(hVar, metadata.d());
        hVar.C("device");
        this.nullableStringAdapter.mo197toJson(hVar, metadata.b());
        hVar.C("viewport");
        this.nullableViewportAdapter.mo197toJson(hVar, metadata.i());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Metadata");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
