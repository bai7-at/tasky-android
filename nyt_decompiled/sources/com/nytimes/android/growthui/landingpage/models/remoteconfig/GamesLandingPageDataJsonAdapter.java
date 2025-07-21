package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.comscore.streaming.EventType;
import com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData;
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
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GamesLandingPageDataJsonAdapter extends JsonAdapter<GamesLandingPageData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<GamesLandingPageData> constructorRef;
    private final JsonAdapter<List<SkuOverrideData>> listOfSkuOverrideDataAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<ValuePropData>> listOfValuePropDataAdapter;
    private final JsonAdapter<BadgeDetailsData> nullableBadgeDetailsDataAdapter;
    private final JsonAdapter<List<UrgencyMessageData>> nullableListOfUrgencyMessageDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public GamesLandingPageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("gamesHeadline", "gamesSubHeadline", "gamesFreeTrialHeadline", "gamesFreeTrialSubHeadline", "allAccessHeadline", "allAccessSubHeadline", "allAccessFreeTrialHeadline", "allAccessFreeTrialSubHeadline", "icons", "tabOrder", "isAllAccessDefault", "gamesTabTitle", "allAccessTabTitle", "legalTerms", "yearlyAdaIdentifier", "monthlyGamesIdentifier", "monthlyAdaIdentifier", "yearlyGamesIdentifier", "skuOverrides", "gamesUrgencyMessages", "allAccessUrgencyMessages", "monthlyAdaBadge", "yearlyAdaBadge", "monthlyGamesBadge", "yearlyGamesBadge", "gamesValueProps", "allAccessValueProps");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "gamesHeadline");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<String>> f2 = iVar.f(j.j(List.class, String.class), b0.e(), "icons");
        zq3.g(f2, "adapter(...)");
        this.listOfStringAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.TYPE, b0.e(), "isAllAccessDefault");
        zq3.g(f3, "adapter(...)");
        this.booleanAdapter = f3;
        JsonAdapter<List<SkuOverrideData>> f4 = iVar.f(j.j(List.class, SkuOverrideData.class), b0.e(), "skuOverrides");
        zq3.g(f4, "adapter(...)");
        this.listOfSkuOverrideDataAdapter = f4;
        JsonAdapter<List<UrgencyMessageData>> f5 = iVar.f(j.j(List.class, UrgencyMessageData.class), b0.e(), "gamesUrgencyMessages");
        zq3.g(f5, "adapter(...)");
        this.nullableListOfUrgencyMessageDataAdapter = f5;
        JsonAdapter<BadgeDetailsData> f6 = iVar.f(BadgeDetailsData.class, b0.e(), "monthlyAdaBadge");
        zq3.g(f6, "adapter(...)");
        this.nullableBadgeDetailsDataAdapter = f6;
        JsonAdapter<List<ValuePropData>> f7 = iVar.f(j.j(List.class, ValuePropData.class), b0.e(), "gamesValueProps");
        zq3.g(f7, "adapter(...)");
        this.listOfValuePropDataAdapter = f7;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GamesLandingPageData fromJson(JsonReader jsonReader) {
        String str;
        int i;
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        String str2 = null;
        int i2 = -1;
        Boolean bool2 = bool;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        BadgeDetailsData badgeDetailsData = null;
        BadgeDetailsData badgeDetailsData2 = null;
        BadgeDetailsData badgeDetailsData3 = null;
        BadgeDetailsData badgeDetailsData4 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        while (jsonReader.hasNext()) {
            String str17 = str4;
            String str18 = str5;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str5 = str18;
                    str4 = str17;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("gamesHeadline", "gamesHeadline", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i2 &= -2;
                    str5 = str18;
                    str4 = str17;
                case 1:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("gamesSubHeadline", "gamesSubHeadline", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i2 &= -3;
                    str5 = str18;
                    str4 = str17;
                case 2:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x3 = c29.x("gamesFreeTrialHeadline", "gamesFreeTrialHeadline", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i2 &= -5;
                    str5 = str18;
                    str4 = str17;
                case 3:
                    str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x4 = c29.x("gamesFreeTrialSubHeadline", "gamesFreeTrialSubHeadline", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i2 &= -9;
                    str5 = str18;
                    str4 = str17;
                case 4:
                    str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x5 = c29.x("allAccessHeadline", "allAccessHeadline", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i2 &= -17;
                    str5 = str18;
                    str4 = str17;
                case 5:
                    str9 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        JsonDataException x6 = c29.x("allAccessSubHeadline", "allAccessSubHeadline", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i2 &= -33;
                    str5 = str18;
                    str4 = str17;
                case 6:
                    str10 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        JsonDataException x7 = c29.x("allAccessFreeTrialHeadline", "allAccessFreeTrialHeadline", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i2 &= -65;
                    str5 = str18;
                    str4 = str17;
                case 7:
                    str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x8 = c29.x("allAccessFreeTrialSubHeadline", "allAccessFreeTrialSubHeadline", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i2 &= -129;
                    str5 = str18;
                    str4 = str17;
                case 8:
                    list = (List) this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x9 = c29.x("icons", "icons", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i2 &= -257;
                    str5 = str18;
                    str4 = str17;
                case 9:
                    list2 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x10 = c29.x("tabOrder", "tabOrder", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i2 &= -513;
                    str5 = str18;
                    str4 = str17;
                case 10:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x11 = c29.x("isAllAccessDefault", "isAllAccessDefault", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    i2 &= -1025;
                    str5 = str18;
                    str4 = str17;
                case 11:
                    String str19 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str19 == null) {
                        JsonDataException x12 = c29.x("gamesTabTitle", "gamesTabTitle", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    i2 &= -2049;
                    str5 = str19;
                    str4 = str17;
                case 12:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x13 = c29.x("allAccessTabTitle", "allAccessTabTitle", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    i2 &= -4097;
                    str5 = str18;
                case 13:
                    str12 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str12 == null) {
                        JsonDataException x14 = c29.x("legalTerms", "legalTerms", jsonReader);
                        zq3.g(x14, "unexpectedNull(...)");
                        throw x14;
                    }
                    i2 &= -8193;
                    str5 = str18;
                    str4 = str17;
                case 14:
                    str13 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str13 == null) {
                        JsonDataException x15 = c29.x("yearlyAdaIdentifier", "yearlyAdaIdentifier", jsonReader);
                        zq3.g(x15, "unexpectedNull(...)");
                        throw x15;
                    }
                    i2 &= -16385;
                    str5 = str18;
                    str4 = str17;
                case 15:
                    str14 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str14 == null) {
                        JsonDataException x16 = c29.x("monthlyGamesIdentifier", "monthlyGamesIdentifier", jsonReader);
                        zq3.g(x16, "unexpectedNull(...)");
                        throw x16;
                    }
                    i = -32769;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 16:
                    str15 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str15 == null) {
                        JsonDataException x17 = c29.x("monthlyAdaIdentifier", "monthlyAdaIdentifier", jsonReader);
                        zq3.g(x17, "unexpectedNull(...)");
                        throw x17;
                    }
                    i = -65537;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 17:
                    str16 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str16 == null) {
                        JsonDataException x18 = c29.x("yearlyGamesIdentifier", "yearlyGamesIdentifier", jsonReader);
                        zq3.g(x18, "unexpectedNull(...)");
                        throw x18;
                    }
                    i = -131073;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 18:
                    list5 = (List) this.listOfSkuOverrideDataAdapter.fromJson(jsonReader);
                    if (list5 == null) {
                        JsonDataException x19 = c29.x("skuOverrides", "skuOverrides", jsonReader);
                        zq3.g(x19, "unexpectedNull(...)");
                        throw x19;
                    }
                    i = -262145;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 19:
                    list3 = (List) this.nullableListOfUrgencyMessageDataAdapter.fromJson(jsonReader);
                    i = -524289;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 20:
                    list4 = (List) this.nullableListOfUrgencyMessageDataAdapter.fromJson(jsonReader);
                    i = -1048577;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 21:
                    badgeDetailsData = (BadgeDetailsData) this.nullableBadgeDetailsDataAdapter.fromJson(jsonReader);
                    i = -2097153;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 22:
                    badgeDetailsData2 = (BadgeDetailsData) this.nullableBadgeDetailsDataAdapter.fromJson(jsonReader);
                    i = -4194305;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 23:
                    badgeDetailsData3 = (BadgeDetailsData) this.nullableBadgeDetailsDataAdapter.fromJson(jsonReader);
                    i = -8388609;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case 24:
                    badgeDetailsData4 = (BadgeDetailsData) this.nullableBadgeDetailsDataAdapter.fromJson(jsonReader);
                    i = -16777217;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case EventType.SUBS /* 25 */:
                    list6 = (List) this.listOfValuePropDataAdapter.fromJson(jsonReader);
                    if (list6 == null) {
                        JsonDataException x20 = c29.x("gamesValueProps", "gamesValueProps", jsonReader);
                        zq3.g(x20, "unexpectedNull(...)");
                        throw x20;
                    }
                    i = -33554433;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                case EventType.CDN /* 26 */:
                    list7 = (List) this.listOfValuePropDataAdapter.fromJson(jsonReader);
                    if (list7 == null) {
                        JsonDataException x21 = c29.x("allAccessValueProps", "allAccessValueProps", jsonReader);
                        zq3.g(x21, "unexpectedNull(...)");
                        throw x21;
                    }
                    i = -67108865;
                    i2 &= i;
                    str5 = str18;
                    str4 = str17;
                default:
                    str5 = str18;
                    str4 = str17;
            }
        }
        String str20 = str4;
        String str21 = str5;
        jsonReader.h();
        if (i2 != -134217728) {
            Constructor<GamesLandingPageData> constructor = this.constructorRef;
            if (constructor == null) {
                str = str20;
                constructor = GamesLandingPageData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, List.class, BadgeDetailsData.class, BadgeDetailsData.class, BadgeDetailsData.class, BadgeDetailsData.class, List.class, List.class, Integer.TYPE, c29.c);
                this.constructorRef = constructor;
                zq3.g(constructor, "also(...)");
            } else {
                str = str20;
            }
            GamesLandingPageData newInstance = constructor.newInstance(str2, str3, str6, str7, str8, str9, str10, str11, list, list2, bool2, str21, str, str12, str13, str14, str15, str16, list5, list3, list4, badgeDetailsData, badgeDetailsData2, badgeDetailsData3, badgeDetailsData4, list6, list7, Integer.valueOf(i2), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str6, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str7, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str8, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str9, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str10, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str11, "null cannot be cast to non-null type kotlin.String");
        zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        zq3.f(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        boolean booleanValue = bool2.booleanValue();
        zq3.f(str21, "null cannot be cast to non-null type kotlin.String");
        zq3.f(str20, "null cannot be cast to non-null type kotlin.String");
        String str22 = str12;
        zq3.f(str22, "null cannot be cast to non-null type kotlin.String");
        String str23 = str13;
        zq3.f(str23, "null cannot be cast to non-null type kotlin.String");
        String str24 = str14;
        zq3.f(str24, "null cannot be cast to non-null type kotlin.String");
        String str25 = str15;
        zq3.f(str25, "null cannot be cast to non-null type kotlin.String");
        String str26 = str16;
        zq3.f(str26, "null cannot be cast to non-null type kotlin.String");
        List list8 = list5;
        zq3.f(list8, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData>");
        List list9 = list6;
        zq3.f(list9, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData>");
        List list10 = list7;
        zq3.f(list10, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData>");
        return new GamesLandingPageData(str2, str3, str6, str7, str8, str9, str10, str11, list, list2, booleanValue, str21, str20, str22, str23, str24, str25, str26, list8, list3, list4, badgeDetailsData, badgeDetailsData2, badgeDetailsData3, badgeDetailsData4, list9, list10);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GamesLandingPageData gamesLandingPageData) {
        zq3.h(hVar, "writer");
        if (gamesLandingPageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("gamesHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.j());
        hVar.C("gamesSubHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.k());
        hVar.C("gamesFreeTrialHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.h());
        hVar.C("gamesFreeTrialSubHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.i());
        hVar.C("allAccessHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.c());
        hVar.C("allAccessSubHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.d());
        hVar.C("allAccessFreeTrialHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.a());
        hVar.C("allAccessFreeTrialSubHeadline");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.b());
        hVar.C("icons");
        this.listOfStringAdapter.mo197toJson(hVar, gamesLandingPageData.o());
        hVar.C("tabOrder");
        this.listOfStringAdapter.mo197toJson(hVar, gamesLandingPageData.v());
        hVar.C("isAllAccessDefault");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(gamesLandingPageData.A()));
        hVar.C("gamesTabTitle");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.l());
        hVar.C("allAccessTabTitle");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.e());
        hVar.C("legalTerms");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.p());
        hVar.C("yearlyAdaIdentifier");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.x());
        hVar.C("monthlyGamesIdentifier");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.t());
        hVar.C("monthlyAdaIdentifier");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.r());
        hVar.C("yearlyGamesIdentifier");
        this.stringAdapter.mo197toJson(hVar, gamesLandingPageData.z());
        hVar.C("skuOverrides");
        this.listOfSkuOverrideDataAdapter.mo197toJson(hVar, gamesLandingPageData.u());
        hVar.C("gamesUrgencyMessages");
        this.nullableListOfUrgencyMessageDataAdapter.mo197toJson(hVar, gamesLandingPageData.m());
        hVar.C("allAccessUrgencyMessages");
        this.nullableListOfUrgencyMessageDataAdapter.mo197toJson(hVar, gamesLandingPageData.f());
        hVar.C("monthlyAdaBadge");
        this.nullableBadgeDetailsDataAdapter.mo197toJson(hVar, gamesLandingPageData.q());
        hVar.C("yearlyAdaBadge");
        this.nullableBadgeDetailsDataAdapter.mo197toJson(hVar, gamesLandingPageData.w());
        hVar.C("monthlyGamesBadge");
        this.nullableBadgeDetailsDataAdapter.mo197toJson(hVar, gamesLandingPageData.s());
        hVar.C("yearlyGamesBadge");
        this.nullableBadgeDetailsDataAdapter.mo197toJson(hVar, gamesLandingPageData.y());
        hVar.C("gamesValueProps");
        this.listOfValuePropDataAdapter.mo197toJson(hVar, gamesLandingPageData.n());
        hVar.C("allAccessValueProps");
        this.listOfValuePropDataAdapter.mo197toJson(hVar, gamesLandingPageData.g());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GamesLandingPageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
