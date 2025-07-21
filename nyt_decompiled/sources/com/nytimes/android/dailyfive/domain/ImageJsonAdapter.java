package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ImageJsonAdapter extends JsonAdapter<Image> {
    public static final int $stable = 8;
    private final JsonAdapter<Map<String, ImageCrop>> mapOfStringImageCropAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ImageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("credit", "crops");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "credit");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Map<String, ImageCrop>> f2 = iVar.f(j.j(Map.class, String.class, ImageCrop.class), b0.e(), "crops");
        zq3.g(f2, "adapter(...)");
        this.mapOfStringImageCropAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Image fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("credit", "credit", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (map = (Map) this.mapOfStringImageCropAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("crops", "crops", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("credit", "credit", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (map != null) {
            return new Image(str, map);
        }
        JsonDataException o2 = c29.o("crops", "crops", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Image image) {
        zq3.h(hVar, "writer");
        if (image == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("credit");
        this.stringAdapter.mo197toJson(hVar, image.a());
        hVar.C("crops");
        this.mapOfStringImageCropAdapter.mo197toJson(hVar, image.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Image");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
