package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ImageCropJsonAdapter extends JsonAdapter<ImageCrop> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ImageCropJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("width", "height", "url");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "width");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "url");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImageCrop fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("width", "width", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    JsonDataException x2 = c29.x("height", "height", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("url", "url", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (num == null) {
            JsonDataException o = c29.o("width", "width", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            JsonDataException o2 = c29.o("height", "height", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        int intValue2 = num2.intValue();
        if (str != null) {
            return new ImageCrop(intValue, intValue2, str);
        }
        JsonDataException o3 = c29.o("url", "url", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ImageCrop imageCrop) {
        zq3.h(hVar, "writer");
        if (imageCrop == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("width");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(imageCrop.c()));
        hVar.C("height");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(imageCrop.a()));
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, imageCrop.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ImageCrop");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
