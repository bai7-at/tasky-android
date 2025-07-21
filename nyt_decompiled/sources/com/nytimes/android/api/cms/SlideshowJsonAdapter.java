package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class SlideshowJsonAdapter extends JsonAdapter<Slideshow> {
    private final JsonAdapter<List<Image>> listOfImageAdapter;
    private final JsonReader.b options;

    public SlideshowJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("slides");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<Image>> f = iVar.f(j.j(List.class, Image.class), b0.e(), "slides");
        zq3.g(f, "adapter(...)");
        this.listOfImageAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Slideshow");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Slideshow fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (list = (List) this.listOfImageAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("slides", "slides", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (list != null) {
            return new Slideshow(list);
        }
        JsonDataException o = c29.o("slides", "slides", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Slideshow slideshow) {
        zq3.h(hVar, "writer");
        if (slideshow == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("slides");
        this.listOfImageAdapter.mo197toJson(hVar, slideshow.getSlides());
        hVar.l();
    }
}
