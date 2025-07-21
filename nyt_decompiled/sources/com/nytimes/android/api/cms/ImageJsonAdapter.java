package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Image;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class ImageJsonAdapter extends JsonAdapter<Image> {
    private volatile Constructor<Image> constructorRef;
    private final JsonAdapter<Caption> nullableCaptionAdapter;
    private final JsonAdapter<Image.ImageCrop> nullableImageCropAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ImageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("caption", "crops", "credit", "uri");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Caption> f = iVar.f(Caption.class, b0.e(), "caption");
        zq3.g(f, "adapter(...)");
        this.nullableCaptionAdapter = f;
        JsonAdapter<Image.ImageCrop> f2 = iVar.f(Image.ImageCrop.class, b0.e(), "crops");
        zq3.g(f2, "adapter(...)");
        this.nullableImageCropAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "credit");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
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

    @Override // com.squareup.moshi.JsonAdapter
    public Image fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Caption caption = null;
        Image.ImageCrop imageCrop = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                caption = (Caption) this.nullableCaptionAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                imageCrop = (Image.ImageCrop) this.nullableImageCropAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.h();
        if (i == -16) {
            return new Image(caption, imageCrop, str, str2);
        }
        Constructor<Image> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Image.class.getDeclaredConstructor(Caption.class, Image.ImageCrop.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Image newInstance = constructor.newInstance(caption, imageCrop, str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Image image) {
        zq3.h(hVar, "writer");
        if (image == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("caption");
        this.nullableCaptionAdapter.mo197toJson(hVar, image.getCaption());
        hVar.C("crops");
        this.nullableImageCropAdapter.mo197toJson(hVar, image.getCrops());
        hVar.C("credit");
        this.nullableStringAdapter.mo197toJson(hVar, image.getCredit());
        hVar.C("uri");
        this.nullableStringAdapter.mo197toJson(hVar, image.getUri());
        hVar.l();
    }
}
