package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class DfpAssetMetaDataJsonAdapter extends JsonAdapter<DfpAssetMetaData> {
    private volatile Constructor<DfpAssetMetaData> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public DfpAssetMetaDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("des", "org", "ttl", "per", "id", "typ", "spon", "geo", "col", "ser");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "des");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DfpAssetMetaData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DfpAssetMetaData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
            }
        }
        jsonReader.h();
        if (i == -1024) {
            return new DfpAssetMetaData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }
        Constructor<DfpAssetMetaData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DfpAssetMetaData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        DfpAssetMetaData newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DfpAssetMetaData dfpAssetMetaData) {
        zq3.h(hVar, "writer");
        if (dfpAssetMetaData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("des");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getDes());
        hVar.C("org");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getOrg());
        hVar.C("ttl");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getTtl());
        hVar.C("per");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getPer());
        hVar.C("id");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getId());
        hVar.C("typ");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getTyp());
        hVar.C("spon");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getSpon());
        hVar.C("geo");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getGeo());
        hVar.C("col");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getCol());
        hVar.C("ser");
        this.nullableStringAdapter.mo197toJson(hVar, dfpAssetMetaData.getSer());
        hVar.l();
    }
}
