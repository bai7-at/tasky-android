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
public final class Image_ImageCropJsonAdapter extends JsonAdapter<Image.ImageCrop> {
    private volatile Constructor<Image.ImageCrop> constructorRef;
    private final JsonAdapter<ImageDimension> nullableImageDimensionAdapter;
    private final JsonReader.b options;

    public Image_ImageCropJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("articleInline", "articleLarge", "popup", "jumbo", "superJumbo", "thumbLarge", "mediumThreeByTwo225", "mediumThreeByTwo210", "videoSixteenByNine1050", "mediumThreeByTwo440", "smallSquare168", "square320", "square640", "master675", "master768", "master1050");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<ImageDimension> f = iVar.f(ImageDimension.class, b0.e(), "articleInline");
        zq3.g(f, "adapter(...)");
        this.nullableImageDimensionAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Image.ImageCrop");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Image.ImageCrop fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        ImageDimension imageDimension = null;
        int i = -1;
        ImageDimension imageDimension2 = null;
        ImageDimension imageDimension3 = null;
        ImageDimension imageDimension4 = null;
        ImageDimension imageDimension5 = null;
        ImageDimension imageDimension6 = null;
        ImageDimension imageDimension7 = null;
        ImageDimension imageDimension8 = null;
        ImageDimension imageDimension9 = null;
        ImageDimension imageDimension10 = null;
        ImageDimension imageDimension11 = null;
        ImageDimension imageDimension12 = null;
        ImageDimension imageDimension13 = null;
        ImageDimension imageDimension14 = null;
        ImageDimension imageDimension15 = null;
        ImageDimension imageDimension16 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    imageDimension = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    imageDimension2 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    imageDimension3 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    imageDimension4 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    imageDimension5 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    imageDimension6 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    imageDimension7 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    imageDimension8 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    imageDimension9 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    imageDimension10 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
                case 10:
                    imageDimension11 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -1025;
                    break;
                case 11:
                    imageDimension12 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -2049;
                    break;
                case 12:
                    imageDimension13 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -4097;
                    break;
                case 13:
                    imageDimension14 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -8193;
                    break;
                case 14:
                    imageDimension15 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -16385;
                    break;
                case 15:
                    imageDimension16 = (ImageDimension) this.nullableImageDimensionAdapter.fromJson(jsonReader);
                    i &= -32769;
                    break;
            }
        }
        jsonReader.h();
        if (i == -65536) {
            return new Image.ImageCrop(imageDimension, imageDimension2, imageDimension3, imageDimension4, imageDimension5, imageDimension6, imageDimension7, imageDimension8, imageDimension9, imageDimension10, imageDimension11, imageDimension12, imageDimension13, imageDimension14, imageDimension15, imageDimension16);
        }
        Constructor<Image.ImageCrop> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Image.ImageCrop.class.getDeclaredConstructor(ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, ImageDimension.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Image.ImageCrop newInstance = constructor.newInstance(imageDimension, imageDimension2, imageDimension3, imageDimension4, imageDimension5, imageDimension6, imageDimension7, imageDimension8, imageDimension9, imageDimension10, imageDimension11, imageDimension12, imageDimension13, imageDimension14, imageDimension15, imageDimension16, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Image.ImageCrop imageCrop) {
        zq3.h(hVar, "writer");
        if (imageCrop == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("articleInline");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getArticleInline());
        hVar.C("articleLarge");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getArticleLarge());
        hVar.C("popup");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getPopup());
        hVar.C("jumbo");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getJumbo());
        hVar.C("superJumbo");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getSuperJumbo());
        hVar.C("thumbLarge");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getThumbLarge());
        hVar.C("mediumThreeByTwo225");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMediumThreeByTwo225());
        hVar.C("mediumThreeByTwo210");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMediumThreeByTwo210());
        hVar.C("videoSixteenByNine1050");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getVideoSixteenByNine1050());
        hVar.C("mediumThreeByTwo440");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMediumThreeByTwo440());
        hVar.C("smallSquare168");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getSmallSquare168());
        hVar.C("square320");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getSquare320());
        hVar.C("square640");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getSquare640());
        hVar.C("master675");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMaster675());
        hVar.C("master768");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMaster768());
        hVar.C("master1050");
        this.nullableImageDimensionAdapter.mo197toJson(hVar, imageCrop.getMaster1050());
        hVar.l();
    }
}
