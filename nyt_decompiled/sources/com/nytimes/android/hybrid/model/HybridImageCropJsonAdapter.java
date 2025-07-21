package com.nytimes.android.hybrid.model;

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
public final class HybridImageCropJsonAdapter extends JsonAdapter<HybridImageCrop> {
    private volatile Constructor<HybridImageCrop> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public HybridImageCropJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("target", "minViewportWidth");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "target");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "minViewportWidth");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridImageCrop");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public HybridImageCrop fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("target", "target", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("minViewportWidth", "minViewportWidth", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (str != null) {
                return new HybridImageCrop(str, num.intValue());
            }
            JsonDataException o = c29.o("target", "target", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<HybridImageCrop> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = HybridImageCrop.class.getDeclaredConstructor(String.class, cls, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str != null) {
            HybridImageCrop newInstance = constructor.newInstance(str, num, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("target", "target", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridImageCrop hybridImageCrop) {
        zq3.h(hVar, "writer");
        if (hybridImageCrop == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("target");
        this.stringAdapter.mo197toJson(hVar, hybridImageCrop.getTarget());
        hVar.C("minViewportWidth");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(hybridImageCrop.getMinViewportWidth()));
        hVar.l();
    }
}
