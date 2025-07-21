package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Region;
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
public final class RegionJsonAdapter extends JsonAdapter<Region> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Region.ModuleType> moduleTypeAdapter;
    private final JsonAdapter<List<Asset>> mutableListOfAssetAdapter;
    private final JsonReader.b options;

    public RegionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("moduleType", "contextualMediaCount", "regionAssets", "sprinkledMediaCount");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Region.ModuleType> f = iVar.f(Region.ModuleType.class, b0.e(), "moduleType");
        zq3.g(f, "adapter(...)");
        this.moduleTypeAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "contextualMediaCount");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<List<Asset>> f3 = iVar.f(j.j(List.class, Asset.class), b0.e(), "regionAssets");
        zq3.g(f3, "adapter(...)");
        this.mutableListOfAssetAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Region");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Region fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Region.ModuleType moduleType = null;
        Integer num = null;
        List<Asset> list = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                moduleType = (Region.ModuleType) this.moduleTypeAdapter.fromJson(jsonReader);
                if (moduleType == null) {
                    JsonDataException x = c29.x("moduleType", "moduleType", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("contextualMediaCount", "contextualMediaCount", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                list = (List) this.mutableListOfAssetAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x3 = c29.x("regionAssets", "regionAssets", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
            } else if (P == 3 && (num2 = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x4 = c29.x("sprinkledMediaCount", "sprinkledMediaCount", jsonReader);
                zq3.g(x4, "unexpectedNull(...)");
                throw x4;
            }
        }
        jsonReader.h();
        if (moduleType == null) {
            JsonDataException o = c29.o("moduleType", "moduleType", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Region region = new Region(moduleType);
        region.setContextualMediaCount(num != null ? num.intValue() : region.getContextualMediaCount());
        if (list == null) {
            list = region.getRegionAssets();
        }
        region.setRegionAssets(list);
        region.setSprinkledMediaCount(num2 != null ? num2.intValue() : region.getSprinkledMediaCount());
        return region;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Region region) {
        zq3.h(hVar, "writer");
        if (region == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("moduleType");
        this.moduleTypeAdapter.mo197toJson(hVar, region.getModuleType());
        hVar.C("contextualMediaCount");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(region.getContextualMediaCount()));
        hVar.C("regionAssets");
        this.mutableListOfAssetAdapter.mo197toJson(hVar, region.getRegionAssets());
        hVar.C("sprinkledMediaCount");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(region.getSprinkledMediaCount()));
        hVar.l();
    }
}
