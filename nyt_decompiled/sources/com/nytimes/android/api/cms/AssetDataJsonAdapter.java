package com.nytimes.android.api.cms;

import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class AssetDataJsonAdapter extends JsonAdapter<AssetData> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AssetData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Asset> nullableAssetAdapter;
    private final JsonAdapter<AssetSection> nullableAssetSectionAdapter;
    private final JsonAdapter<Column> nullableColumnAdapter;
    private final JsonAdapter<DfpAssetMetaData> nullableDfpAssetMetaDataAdapter;
    private final JsonAdapter<DisplaySizeType> nullableDisplaySizeTypeAdapter;
    private final JsonAdapter<List<Addendum>> nullableListOfAddendumAdapter;
    private final JsonAdapter<List<Author>> nullableListOfAuthorAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<Map<String, Region>> nullableMapOfStringRegionAdapter;
    private final JsonAdapter<ParsedHtmlText> nullableParsedHtmlTextAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Subsection> nullableSubsectionAdapter;
    private final JsonReader.b options;

    public AssetDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("uri", "assetType", "title", "meterAccessType", "parsedHtmlSummary", "authors", "column", "displaySize", "isCommentsEnabled", "lastModified", "lastMajorModified", "firstPublished", "subHeadline", "advertisingSensitivity", "dataName", "assetSection", "dfp", "promotionalMediaSize", "isSummaryHidden", "isPromotionalMediaHidden", "isTitleHidden", "isKickerHidden", "isOak", "htmlMedia", "summary", "url", "kicker", "byline", "tone", "addendums", "subsection", "promotionalMedia", "desk", "regions", "assetId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<ParsedHtmlText> f2 = iVar.f(ParsedHtmlText.class, b0.e(), "parsedHtmlSummary");
        zq3.g(f2, "adapter(...)");
        this.nullableParsedHtmlTextAdapter = f2;
        JsonAdapter<List<Author>> f3 = iVar.f(j.j(List.class, Author.class), b0.e(), "authors");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfAuthorAdapter = f3;
        JsonAdapter<Column> f4 = iVar.f(Column.class, b0.e(), "column");
        zq3.g(f4, "adapter(...)");
        this.nullableColumnAdapter = f4;
        JsonAdapter<Boolean> f5 = iVar.f(Boolean.TYPE, b0.e(), "isCommentsEnabled");
        zq3.g(f5, "adapter(...)");
        this.booleanAdapter = f5;
        JsonAdapter<Long> f6 = iVar.f(Long.TYPE, b0.e(), "lastModified");
        zq3.g(f6, "adapter(...)");
        this.longAdapter = f6;
        JsonAdapter<AssetSection> f7 = iVar.f(AssetSection.class, b0.e(), "assetSection");
        zq3.g(f7, "adapter(...)");
        this.nullableAssetSectionAdapter = f7;
        JsonAdapter<DfpAssetMetaData> f8 = iVar.f(DfpAssetMetaData.class, b0.e(), "dfp");
        zq3.g(f8, "adapter(...)");
        this.nullableDfpAssetMetaDataAdapter = f8;
        JsonAdapter<DisplaySizeType> f9 = iVar.f(DisplaySizeType.class, b0.e(), "promotionalMediaSize");
        zq3.g(f9, "adapter(...)");
        this.nullableDisplaySizeTypeAdapter = f9;
        JsonAdapter<Map<String, Object>> f10 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "htmlMedia");
        zq3.g(f10, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f10;
        JsonAdapter<List<Addendum>> f11 = iVar.f(j.j(List.class, Addendum.class), b0.e(), "addendums");
        zq3.g(f11, "adapter(...)");
        this.nullableListOfAddendumAdapter = f11;
        JsonAdapter<Subsection> f12 = iVar.f(Subsection.class, b0.e(), "subsection");
        zq3.g(f12, "adapter(...)");
        this.nullableSubsectionAdapter = f12;
        JsonAdapter<Asset> f13 = iVar.f(Asset.class, b0.e(), "promotionalMedia");
        zq3.g(f13, "adapter(...)");
        this.nullableAssetAdapter = f13;
        JsonAdapter<Map<String, Region>> f14 = iVar.f(j.j(Map.class, String.class, Region.class), b0.e(), "regions");
        zq3.g(f14, "adapter(...)");
        this.nullableMapOfStringRegionAdapter = f14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AssetData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AssetData fromJson(JsonReader jsonReader) {
        int i;
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        Long l = 0L;
        jsonReader.b();
        int i2 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Long l2 = l;
        Long l3 = l2;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ParsedHtmlText parsedHtmlText = null;
        List list = null;
        Column column = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        AssetSection assetSection = null;
        DfpAssetMetaData dfpAssetMetaData = null;
        DisplaySizeType displaySizeType = null;
        Map map = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        List list2 = null;
        Subsection subsection = null;
        Asset asset = null;
        String str14 = null;
        Map map2 = null;
        int i3 = -1;
        Long l4 = l3;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    continue;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    parsedHtmlText = (ParsedHtmlText) this.nullableParsedHtmlTextAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    list = (List) this.nullableListOfAuthorAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    column = (Column) this.nullableColumnAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x = c29.x("isCommentsEnabled", "isCommentsEnabled", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i2 &= -257;
                    continue;
                case 9:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x2 = c29.x("lastModified", "lastModified", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i2 &= -513;
                    continue;
                case 10:
                    l4 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l4 == null) {
                        JsonDataException x3 = c29.x("lastMajorModified", "lastMajorModified", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i2 &= -1025;
                    continue;
                case 11:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x4 = c29.x("firstPublished", "firstPublished", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i2 &= -2049;
                    continue;
                case 12:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    assetSection = (AssetSection) this.nullableAssetSectionAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    dfpAssetMetaData = (DfpAssetMetaData) this.nullableDfpAssetMetaDataAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    displaySizeType = (DisplaySizeType) this.nullableDisplaySizeTypeAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        JsonDataException x5 = c29.x("isSummaryHidden", "isSummaryHidden", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i = -262145;
                    break;
                case 19:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        JsonDataException x6 = c29.x("isPromotionalMediaHidden", "isPromotionalMediaHidden", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i = -524289;
                    break;
                case 20:
                    bool5 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool5 == null) {
                        JsonDataException x7 = c29.x("isTitleHidden", "isTitleHidden", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i = -1048577;
                    break;
                case 21:
                    bool6 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool6 == null) {
                        JsonDataException x8 = c29.x("isKickerHidden", "isKickerHidden", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i = -2097153;
                    break;
                case 22:
                    bool7 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool7 == null) {
                        JsonDataException x9 = c29.x("isOak", "isOak", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i = -4194305;
                    break;
                case 23:
                    map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                    i = -8388609;
                    break;
                case 24:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -16777217;
                    break;
                case EventType.SUBS /* 25 */:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -33554433;
                    break;
                case EventType.CDN /* 26 */:
                    str11 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -67108865;
                    break;
                case 27:
                    str12 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -134217729;
                    break;
                case 28:
                    str13 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -268435457;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    list2 = (List) this.nullableListOfAddendumAdapter.fromJson(jsonReader);
                    i = -536870913;
                    break;
                case 30:
                    subsection = (Subsection) this.nullableSubsectionAdapter.fromJson(jsonReader);
                    i = -1073741825;
                    break;
                case 31:
                    asset = (Asset) this.nullableAssetAdapter.fromJson(jsonReader);
                    i = Integer.MAX_VALUE;
                    break;
                case 32:
                    str14 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i3 &= -2;
                    continue;
                case 33:
                    map2 = (Map) this.nullableMapOfStringRegionAdapter.fromJson(jsonReader);
                    i3 &= -3;
                    continue;
                case 34:
                    l3 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        JsonDataException x10 = c29.x("assetId", "assetId", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i3 &= -5;
                    continue;
            }
            i2 &= i;
        }
        jsonReader.h();
        if (i2 == 0 && i3 == -8) {
            return new AssetData(str2, str3, str, str4, parsedHtmlText, list, column, str5, bool2.booleanValue(), l.longValue(), l4.longValue(), l2.longValue(), str6, str7, str8, assetSection, dfpAssetMetaData, displaySizeType, bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), map, str9, str10, str11, str12, str13, list2, subsection, asset, str14, map2, l3.longValue());
        }
        Constructor<AssetData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = AssetData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, ParsedHtmlText.class, List.class, Column.class, String.class, cls, cls2, cls2, cls2, String.class, String.class, String.class, AssetSection.class, DfpAssetMetaData.class, DisplaySizeType.class, cls, cls, cls, cls, cls, Map.class, String.class, String.class, String.class, String.class, String.class, List.class, Subsection.class, Asset.class, String.class, Map.class, cls2, cls3, cls3, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AssetData newInstance = constructor.newInstance(str2, str3, str, str4, parsedHtmlText, list, column, str5, bool2, l, l4, l2, str6, str7, str8, assetSection, dfpAssetMetaData, displaySizeType, bool3, bool4, bool5, bool6, bool7, map, str9, str10, str11, str12, str13, list2, subsection, asset, str14, map2, l3, Integer.valueOf(i2), Integer.valueOf(i3), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AssetData assetData) {
        zq3.h(hVar, "writer");
        if (assetData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("uri");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getUri());
        hVar.C("assetType");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getAssetType());
        hVar.C("title");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getTitle());
        hVar.C("meterAccessType");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getMeterAccessType());
        hVar.C("parsedHtmlSummary");
        this.nullableParsedHtmlTextAdapter.mo197toJson(hVar, assetData.getParsedHtmlSummary());
        hVar.C("authors");
        this.nullableListOfAuthorAdapter.mo197toJson(hVar, assetData.getAuthors());
        hVar.C("column");
        this.nullableColumnAdapter.mo197toJson(hVar, assetData.getColumn());
        hVar.C("displaySize");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getDisplaySize());
        hVar.C("isCommentsEnabled");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isCommentsEnabled()));
        hVar.C("lastModified");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(assetData.getLastModified()));
        hVar.C("lastMajorModified");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(assetData.getLastMajorModified()));
        hVar.C("firstPublished");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(assetData.getFirstPublished()));
        hVar.C("subHeadline");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getSubHeadline());
        hVar.C("advertisingSensitivity");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getAdvertisingSensitivity());
        hVar.C("dataName");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getDataName());
        hVar.C("assetSection");
        this.nullableAssetSectionAdapter.mo197toJson(hVar, assetData.getAssetSection());
        hVar.C("dfp");
        this.nullableDfpAssetMetaDataAdapter.mo197toJson(hVar, assetData.getDfp());
        hVar.C("promotionalMediaSize");
        this.nullableDisplaySizeTypeAdapter.mo197toJson(hVar, assetData.getPromotionalMediaSize());
        hVar.C("isSummaryHidden");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isSummaryHidden()));
        hVar.C("isPromotionalMediaHidden");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isPromotionalMediaHidden()));
        hVar.C("isTitleHidden");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isTitleHidden()));
        hVar.C("isKickerHidden");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isKickerHidden()));
        hVar.C("isOak");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetData.isOak()));
        hVar.C("htmlMedia");
        this.nullableMapOfStringAnyAdapter.mo197toJson(hVar, assetData.getHtmlMedia());
        hVar.C("summary");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getSummary());
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getUrl());
        hVar.C("kicker");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getKicker());
        hVar.C("byline");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getByline());
        hVar.C("tone");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getTone());
        hVar.C("addendums");
        this.nullableListOfAddendumAdapter.mo197toJson(hVar, assetData.getAddendums());
        hVar.C("subsection");
        this.nullableSubsectionAdapter.mo197toJson(hVar, assetData.getSubsection());
        hVar.C("promotionalMedia");
        this.nullableAssetAdapter.mo197toJson(hVar, assetData.getPromotionalMedia());
        hVar.C("desk");
        this.nullableStringAdapter.mo197toJson(hVar, assetData.getDesk());
        hVar.C("regions");
        this.nullableMapOfStringRegionAdapter.mo197toJson(hVar, assetData.getRegions());
        hVar.C("assetId");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(assetData.getAssetId()));
        hVar.l();
    }
}
