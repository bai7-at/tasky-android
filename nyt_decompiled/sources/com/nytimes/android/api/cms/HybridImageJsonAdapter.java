package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class HybridImageJsonAdapter extends JsonAdapter<HybridImage> {
    private volatile Constructor<HybridImage> constructorRef;
    private final JsonAdapter<List<HybridCrop>> nullableListOfHybridCropAdapter;
    private final JsonReader.b options;

    public HybridImageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("crops");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<HybridCrop>> f = iVar.f(j.j(List.class, HybridCrop.class), b0.e(), "crops");
        zq3.g(f, "adapter(...)");
        this.nullableListOfHybridCropAdapter = f;
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
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfHybridCropAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new HybridImage(list);
        }
        Constructor<HybridImage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HybridImage.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        HybridImage newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
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
        this.nullableListOfHybridCropAdapter.mo197toJson(hVar, hybridImage.getCrops());
        hVar.l();
    }
}
