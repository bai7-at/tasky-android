package com.nytimes.android.hybrid.model;

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

/* loaded from: classes4.dex */
public final class HybridImageJsonAdapter extends JsonAdapter<HybridImage> {
    private final JsonAdapter<List<HybridImageCrop>> listOfHybridImageCropAdapter;
    private final JsonReader.b options;

    public HybridImageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("crops");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<HybridImageCrop>> f = iVar.f(j.j(List.class, HybridImageCrop.class), b0.e(), "crops");
        zq3.g(f, "adapter(...)");
        this.listOfHybridImageCropAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridImage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public HybridImage fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (list = (List) this.listOfHybridImageCropAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("crops", "crops", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (list != null) {
            return new HybridImage(list);
        }
        JsonDataException o = c29.o("crops", "crops", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridImage hybridImage) {
        zq3.h(hVar, "writer");
        if (hybridImage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("crops");
        this.listOfHybridImageCropAdapter.mo197toJson(hVar, hybridImage.getCrops());
        hVar.l();
    }
}
