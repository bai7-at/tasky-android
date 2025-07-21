package com.nytimes.android.internal.pushmessaging.tagmanager;

import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;
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
public final class TagMetadataAPI_InnerTagJsonAdapter extends JsonAdapter<TagMetadataAPI.InnerTag> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TagMetadataAPI.InnerTag> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public TagMetadataAPI_InnerTagJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tag", "title", "tagDescription", "default", "pushkinTag");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "tag");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "title");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.TYPE, b0.e(), "default");
        zq3.g(f3, "adapter(...)");
        this.booleanAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TagMetadataAPI.InnerTag fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("tag", "tag", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    JsonDataException x2 = c29.x("default", "default", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -9;
            } else if (P == 4) {
                bool3 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    JsonDataException x3 = c29.x("pushkinTag", "pushkinTag", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -31) {
            if (str != null) {
                return new TagMetadataAPI.InnerTag(str, str2, str3, bool2.booleanValue(), bool3.booleanValue());
            }
            JsonDataException o = c29.o("tag", "tag", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<TagMetadataAPI.InnerTag> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = TagMetadataAPI.InnerTag.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str == null) {
            JsonDataException o2 = c29.o("tag", "tag", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        TagMetadataAPI.InnerTag newInstance = constructor.newInstance(str, str2, str3, bool2, bool3, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TagMetadataAPI.InnerTag innerTag) {
        zq3.h(hVar, "writer");
        if (innerTag == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tag");
        this.stringAdapter.mo197toJson(hVar, innerTag.c());
        hVar.C("title");
        this.nullableStringAdapter.mo197toJson(hVar, innerTag.e());
        hVar.C("tagDescription");
        this.nullableStringAdapter.mo197toJson(hVar, innerTag.d());
        hVar.C("default");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(innerTag.a()));
        hVar.C("pushkinTag");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(innerTag.b()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TagMetadataAPI.InnerTag");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
