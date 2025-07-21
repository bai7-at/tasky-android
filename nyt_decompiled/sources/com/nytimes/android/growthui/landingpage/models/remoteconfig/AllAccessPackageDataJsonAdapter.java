package com.nytimes.android.growthui.landingpage.models.remoteconfig;

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
public final class AllAccessPackageDataJsonAdapter extends JsonAdapter<AllAccessPackageData> {
    public static final int $stable = 8;
    private volatile Constructor<AllAccessPackageData> constructorRef;
    private final JsonAdapter<List<AllAccessSkuOverrideData>> listOfAllAccessSkuOverrideDataAdapter;
    private final JsonAdapter<List<AllAccessValuePropData>> listOfAllAccessValuePropDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AllAccessPackageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("headline", "sub_headline", "free_trial_headline", "free_trial_sub_headline", "description", "month_sku_id", "year_sku_id", "main_bullets", "sku_schedules", "monthly_badge", "yearly_badge");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "headline");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<AllAccessValuePropData>> f2 = iVar.f(j.j(List.class, AllAccessValuePropData.class), b0.e(), "mainBullets");
        zq3.g(f2, "adapter(...)");
        this.listOfAllAccessValuePropDataAdapter = f2;
        JsonAdapter<List<AllAccessSkuOverrideData>> f3 = iVar.f(j.j(List.class, AllAccessSkuOverrideData.class), b0.e(), "skuSchedules");
        zq3.g(f3, "adapter(...)");
        this.listOfAllAccessSkuOverrideDataAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AllAccessPackageData fromJson(JsonReader jsonReader) {
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
        List list = null;
        List list2 = null;
        String str8 = null;
        String str9 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("headline", "headline", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("subHeadline", "sub_headline", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("freeTrialHeadline", "free_trial_headline", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("freeTrialSubHeadline", "free_trial_sub_headline", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x5 = c29.x("description", "description", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x6 = c29.x("monthSkuId", "month_sku_id", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x7 = c29.x("yearSkuId", "year_sku_id", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i &= -65;
                    break;
                case 7:
                    list = (List) this.listOfAllAccessValuePropDataAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x8 = c29.x("mainBullets", "main_bullets", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i &= -129;
                    break;
                case 8:
                    list2 = (List) this.listOfAllAccessSkuOverrideDataAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x9 = c29.x("skuSchedules", "sku_schedules", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i &= -257;
                    break;
                case 9:
                    str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x10 = c29.x("monthlyBadge", "monthly_badge", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i &= -513;
                    break;
                case 10:
                    str9 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        JsonDataException x11 = c29.x("yearlyBadge", "yearly_badge", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    i &= -1025;
                    break;
            }
        }
        jsonReader.h();
        if (i == -2048) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str6, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str7, "null cannot be cast to non-null type kotlin.String");
            zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessValuePropData>");
            zq3.f(list2, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData>");
            zq3.f(str8, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str9, "null cannot be cast to non-null type kotlin.String");
            return new AllAccessPackageData(str, str2, str3, str4, str5, str6, str7, list, list2, str8, str9);
        }
        Constructor<AllAccessPackageData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AllAccessPackageData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AllAccessPackageData newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, str7, list, list2, str8, str9, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AllAccessPackageData allAccessPackageData) {
        zq3.h(hVar, "writer");
        if (allAccessPackageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("headline");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.d());
        hVar.C("sub_headline");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.i());
        hVar.C("free_trial_headline");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.b());
        hVar.C("free_trial_sub_headline");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.c());
        hVar.C("description");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.a());
        hVar.C("month_sku_id");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.f());
        hVar.C("year_sku_id");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.j());
        hVar.C("main_bullets");
        this.listOfAllAccessValuePropDataAdapter.mo197toJson(hVar, allAccessPackageData.e());
        hVar.C("sku_schedules");
        this.listOfAllAccessSkuOverrideDataAdapter.mo197toJson(hVar, allAccessPackageData.h());
        hVar.C("monthly_badge");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.g());
        hVar.C("yearly_badge");
        this.stringAdapter.mo197toJson(hVar, allAccessPackageData.k());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AllAccessPackageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
