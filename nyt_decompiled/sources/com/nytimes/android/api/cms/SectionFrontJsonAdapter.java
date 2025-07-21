package com.nytimes.android.api.cms;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class SectionFrontJsonAdapter extends JsonAdapter<SectionFront> {
    private volatile Constructor<SectionFront> constructorRef;
    private final JsonAdapter<List<Asset>> listOfAssetAdapter;
    private final JsonAdapter<List<Map<String, String>>> listOfMapOfStringStringAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<Map<Long, Asset>> nullableMapOfLongAssetAdapter;
    private final JsonAdapter<PackageAsset> nullablePackageAssetAdapter;
    private final JsonAdapter<SectionConfigEntry> nullableSectionConfigEntryAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public SectionFrontJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("title", AuthenticationTokenClaims.JSON_KEY_NAME, "uri", "iconUrl", "pubDate", "path", "hash", "sectionConfig", "sectionName", "subsectionName", "assets", "ledePackage", "photoSpot", "promotionalMediaOverrideMap", "queryId", "trackingParams");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "title");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Date> f3 = iVar.f(Date.class, b0.e(), "pubDate");
        zq3.g(f3, "adapter(...)");
        this.nullableDateAdapter = f3;
        JsonAdapter<SectionConfigEntry> f4 = iVar.f(SectionConfigEntry.class, b0.e(), "sectionConfig");
        zq3.g(f4, "adapter(...)");
        this.nullableSectionConfigEntryAdapter = f4;
        JsonAdapter<List<Asset>> f5 = iVar.f(j.j(List.class, Asset.class), b0.e(), "assets");
        zq3.g(f5, "adapter(...)");
        this.listOfAssetAdapter = f5;
        JsonAdapter<PackageAsset> f6 = iVar.f(PackageAsset.class, b0.e(), "ledePackage");
        zq3.g(f6, "adapter(...)");
        this.nullablePackageAssetAdapter = f6;
        JsonAdapter<Map<Long, Asset>> f7 = iVar.f(j.j(Map.class, Long.class, Asset.class), b0.e(), "promotionalMediaOverrideMap");
        zq3.g(f7, "adapter(...)");
        this.nullableMapOfLongAssetAdapter = f7;
        JsonAdapter<List<Map<String, String>>> f8 = iVar.f(j.j(List.class, j.j(Map.class, String.class, String.class)), b0.e(), "trackingParams");
        zq3.g(f8, "adapter(...)");
        this.listOfMapOfStringStringAdapter = f8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SectionFront");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SectionFront fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Date date = null;
        String str5 = null;
        String str6 = null;
        SectionConfigEntry sectionConfigEntry = null;
        String str7 = null;
        String str8 = null;
        List list2 = null;
        PackageAsset packageAsset = null;
        PackageAsset packageAsset2 = null;
        Map map = null;
        String str9 = null;
        while (true) {
            String str10 = str8;
            String str11 = str7;
            if (!jsonReader.hasNext()) {
                SectionConfigEntry sectionConfigEntry2 = sectionConfigEntry;
                jsonReader.h();
                if (i == -49025) {
                    if (str == null) {
                        JsonDataException o = c29.o("title", "title", jsonReader);
                        zq3.g(o, "missingProperty(...)");
                        throw o;
                    }
                    if (str2 == null) {
                        JsonDataException o2 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(o2, "missingProperty(...)");
                        throw o2;
                    }
                    zq3.f(list2, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.api.cms.Asset>");
                    zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
                    return new SectionFront(str, str2, str3, str4, date, str5, str6, sectionConfigEntry2, str11, str10, list2, packageAsset, packageAsset2, map, str9, list);
                }
                List list3 = list;
                Constructor<SectionFront> constructor = this.constructorRef;
                if (constructor == null) {
                    constructor = SectionFront.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Date.class, String.class, String.class, SectionConfigEntry.class, String.class, String.class, List.class, PackageAsset.class, PackageAsset.class, Map.class, String.class, List.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "also(...)");
                }
                Constructor<SectionFront> constructor2 = constructor;
                if (str == null) {
                    JsonDataException o3 = c29.o("title", "title", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                if (str2 == null) {
                    JsonDataException o4 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                SectionFront newInstance = constructor2.newInstance(str, str2, str3, str4, date, str5, str6, sectionConfigEntry2, str11, str10, list2, packageAsset, packageAsset2, map, str9, list3, Integer.valueOf(i), null);
                zq3.g(newInstance, "newInstance(...)");
                return newInstance;
            }
            SectionConfigEntry sectionConfigEntry3 = sectionConfigEntry;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("title", "title", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 4:
                    date = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 6:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 7:
                    sectionConfigEntry = (SectionConfigEntry) this.nullableSectionConfigEntryAdapter.fromJson(jsonReader);
                    i &= -129;
                    str8 = str10;
                    str7 = str11;
                case 8:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -257;
                    str8 = str10;
                    sectionConfigEntry = sectionConfigEntry3;
                case 9:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -513;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 10:
                    list2 = (List) this.listOfAssetAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x3 = c29.x("assets", "assets", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -1025;
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 11:
                    packageAsset = (PackageAsset) this.nullablePackageAssetAdapter.fromJson(jsonReader);
                    i &= -2049;
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 12:
                    packageAsset2 = (PackageAsset) this.nullablePackageAssetAdapter.fromJson(jsonReader);
                    i &= -4097;
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 13:
                    map = (Map) this.nullableMapOfLongAssetAdapter.fromJson(jsonReader);
                    i &= -8193;
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 14:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                case 15:
                    list = (List) this.listOfMapOfStringStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x4 = c29.x("trackingParams", "trackingParams", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -32769;
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
                default:
                    str8 = str10;
                    str7 = str11;
                    sectionConfigEntry = sectionConfigEntry3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SectionFront sectionFront) {
        zq3.h(hVar, "writer");
        if (sectionFront == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, sectionFront.getTitle());
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, sectionFront.getName());
        hVar.C("uri");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getUri());
        hVar.C("iconUrl");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getIconUrl());
        hVar.C("pubDate");
        this.nullableDateAdapter.mo197toJson(hVar, sectionFront.getPubDate());
        hVar.C("path");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getPath());
        hVar.C("hash");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getHash());
        hVar.C("sectionConfig");
        this.nullableSectionConfigEntryAdapter.mo197toJson(hVar, sectionFront.getSectionConfig());
        hVar.C("sectionName");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getSectionName());
        hVar.C("subsectionName");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getSubsectionName());
        hVar.C("assets");
        this.listOfAssetAdapter.mo197toJson(hVar, sectionFront.getAssets());
        hVar.C("ledePackage");
        this.nullablePackageAssetAdapter.mo197toJson(hVar, sectionFront.getLedePackage());
        hVar.C("photoSpot");
        this.nullablePackageAssetAdapter.mo197toJson(hVar, sectionFront.getPhotoSpot());
        hVar.C("promotionalMediaOverrideMap");
        this.nullableMapOfLongAssetAdapter.mo197toJson(hVar, sectionFront.getPromotionalMediaOverrideMap());
        hVar.C("queryId");
        this.nullableStringAdapter.mo197toJson(hVar, sectionFront.getQueryId());
        hVar.C("trackingParams");
        this.listOfMapOfStringStringAdapter.mo197toJson(hVar, sectionFront.getTrackingParams());
        hVar.l();
    }
}
