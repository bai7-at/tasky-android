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
public final class PackageAssetJsonAdapter extends JsonAdapter<PackageAsset> {
    private volatile Constructor<PackageAsset> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonReader.b options;

    public PackageAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetIds", "hasBanner");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<Long>> f = iVar.f(j.j(List.class, Long.class), b0.e(), "assetIds");
        zq3.g(f, "adapter(...)");
        this.nullableListOfLongAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.class, b0.e(), "hasBanner");
        zq3.g(f2, "adapter(...)");
        this.nullableBooleanAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PackageAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PackageAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfLongAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new PackageAsset(list, bool);
        }
        Constructor<PackageAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PackageAsset.class.getDeclaredConstructor(List.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PackageAsset newInstance = constructor.newInstance(list, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PackageAsset packageAsset) {
        zq3.h(hVar, "writer");
        if (packageAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetIds");
        this.nullableListOfLongAdapter.mo197toJson(hVar, packageAsset.getAssetIds());
        hVar.C("hasBanner");
        this.nullableBooleanAdapter.mo197toJson(hVar, packageAsset.getHasBanner());
        hVar.l();
    }
}
