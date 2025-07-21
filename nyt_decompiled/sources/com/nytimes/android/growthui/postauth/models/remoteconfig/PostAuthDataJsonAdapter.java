package com.nytimes.android.growthui.postauth.models.remoteconfig;

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
public final class PostAuthDataJsonAdapter extends JsonAdapter<PostAuthData> {
    public static final int $stable = 8;
    private volatile Constructor<PostAuthData> constructorRef;
    private final JsonAdapter<List<ValuePropData>> listOfValuePropDataAdapter;
    private final JsonAdapter<List<PostAuthSkuOverrideData>> nullableListOfPostAuthSkuOverrideDataAdapter;
    private final JsonAdapter<List<PostAuthUrgencyMessageData>> nullableListOfPostAuthUrgencyMessageDataAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PostAuthDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("loginNavigationTitle", "accountCreatedNavigationTitle", "userMessage", "header", "freeTrialHeader", "gameIcons", "productIdentifier", "cardHeader", "cardSubHeader", "cardValuePropsButtonText", "valueProps", "cardCancelNotice", "cardSubscribeButtonText", "freeTrialCardSubscribeButtonText", "cardContinueButtonText", "terms", "noInternetTitleText", "noInternetDetailsText", "postAuthOfferUrgencyMessages", "automatedSkuChanges");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "loginNavigationTitle");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<String>> f2 = iVar.f(j.j(List.class, String.class), b0.e(), "gameIcons");
        zq3.g(f2, "adapter(...)");
        this.nullableListOfStringAdapter = f2;
        JsonAdapter<List<ValuePropData>> f3 = iVar.f(j.j(List.class, ValuePropData.class), b0.e(), "valueProps");
        zq3.g(f3, "adapter(...)");
        this.listOfValuePropDataAdapter = f3;
        JsonAdapter<List<PostAuthUrgencyMessageData>> f4 = iVar.f(j.j(List.class, PostAuthUrgencyMessageData.class), b0.e(), "postAuthOfferUrgencyMessages");
        zq3.g(f4, "adapter(...)");
        this.nullableListOfPostAuthUrgencyMessageDataAdapter = f4;
        JsonAdapter<List<PostAuthSkuOverrideData>> f5 = iVar.f(j.j(List.class, PostAuthSkuOverrideData.class), b0.e(), "automatedSkuChanges");
        zq3.g(f5, "adapter(...)");
        this.nullableListOfPostAuthSkuOverrideDataAdapter = f5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthData fromJson(JsonReader jsonReader) {
        int i;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i2 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        List list4 = null;
        while (jsonReader.hasNext()) {
            String str17 = str2;
            String str18 = str8;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str2 = str17;
                    str8 = str18;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("loginNavigationTitle", "loginNavigationTitle", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i2 &= -2;
                    str2 = str17;
                    str8 = str18;
                case 1:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x2 = c29.x("accountCreatedNavigationTitle", "accountCreatedNavigationTitle", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i2 &= -3;
                    str2 = str17;
                    str8 = str18;
                case 2:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x3 = c29.x("userMessage", "userMessage", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i2 &= -5;
                    str2 = str17;
                    str8 = str18;
                case 3:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x4 = c29.x("header_", "header", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i2 &= -9;
                    str2 = str17;
                    str8 = str18;
                case 4:
                    str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x5 = c29.x("freeTrialHeader", "freeTrialHeader", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i2 &= -17;
                    str2 = str17;
                    str8 = str18;
                case 5:
                    list2 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    str2 = str17;
                    str8 = str18;
                case 6:
                    str9 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        JsonDataException x6 = c29.x("productIdentifier", "productIdentifier", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i2 &= -65;
                    str2 = str17;
                    str8 = str18;
                case 7:
                    str10 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        JsonDataException x7 = c29.x("cardHeader", "cardHeader", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i2 &= -129;
                    str2 = str17;
                    str8 = str18;
                case 8:
                    str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x8 = c29.x("cardSubHeader", "cardSubHeader", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i2 &= -257;
                    str2 = str17;
                    str8 = str18;
                case 9:
                    str12 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str12 == null) {
                        JsonDataException x9 = c29.x("cardValuePropsButtonText", "cardValuePropsButtonText", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i2 &= -513;
                    str2 = str17;
                    str8 = str18;
                case 10:
                    list = (List) this.listOfValuePropDataAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x10 = c29.x("valueProps", "valueProps", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i2 &= -1025;
                    str2 = str17;
                    str8 = str18;
                case 11:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x11 = c29.x("cardCancelNotice", "cardCancelNotice", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    i2 &= -2049;
                    str2 = str17;
                    str8 = str18;
                case 12:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x12 = c29.x("cardSubscribeButtonText", "cardSubscribeButtonText", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    i2 &= -4097;
                    str8 = str18;
                case 13:
                    String str19 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str19 == null) {
                        JsonDataException x13 = c29.x("freeTrialCardSubscribeButtonText", "freeTrialCardSubscribeButtonText", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    i2 &= -8193;
                    str8 = str19;
                    str2 = str17;
                case 14:
                    str13 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str13 == null) {
                        JsonDataException x14 = c29.x("cardContinueButtonText", "cardContinueButtonText", jsonReader);
                        zq3.g(x14, "unexpectedNull(...)");
                        throw x14;
                    }
                    i2 &= -16385;
                    str2 = str17;
                    str8 = str18;
                case 15:
                    str14 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str14 == null) {
                        JsonDataException x15 = c29.x("terms", "terms", jsonReader);
                        zq3.g(x15, "unexpectedNull(...)");
                        throw x15;
                    }
                    i = -32769;
                    i2 &= i;
                    str2 = str17;
                    str8 = str18;
                case 16:
                    str15 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str15 == null) {
                        JsonDataException x16 = c29.x("noInternetTitleText", "noInternetTitleText", jsonReader);
                        zq3.g(x16, "unexpectedNull(...)");
                        throw x16;
                    }
                    i = -65537;
                    i2 &= i;
                    str2 = str17;
                    str8 = str18;
                case 17:
                    str16 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str16 == null) {
                        JsonDataException x17 = c29.x("noInternetDetailsText", "noInternetDetailsText", jsonReader);
                        zq3.g(x17, "unexpectedNull(...)");
                        throw x17;
                    }
                    i = -131073;
                    i2 &= i;
                    str2 = str17;
                    str8 = str18;
                case 18:
                    list3 = (List) this.nullableListOfPostAuthUrgencyMessageDataAdapter.fromJson(jsonReader);
                    i = -262145;
                    i2 &= i;
                    str2 = str17;
                    str8 = str18;
                case 19:
                    list4 = (List) this.nullableListOfPostAuthSkuOverrideDataAdapter.fromJson(jsonReader);
                    i = -524289;
                    i2 &= i;
                    str2 = str17;
                    str8 = str18;
                default:
                    str2 = str17;
                    str8 = str18;
            }
        }
        String str20 = str2;
        String str21 = str8;
        jsonReader.h();
        if (i2 == -1048576) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str6, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str7, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str9, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str10, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str11, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str12, "null cannot be cast to non-null type kotlin.String");
            zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData>");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str20, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str21, "null cannot be cast to non-null type kotlin.String");
            String str22 = str13;
            zq3.f(str22, "null cannot be cast to non-null type kotlin.String");
            String str23 = str14;
            zq3.f(str23, "null cannot be cast to non-null type kotlin.String");
            String str24 = str15;
            zq3.f(str24, "null cannot be cast to non-null type kotlin.String");
            String str25 = str16;
            zq3.f(str25, "null cannot be cast to non-null type kotlin.String");
            return new PostAuthData(str, str4, str5, str6, str7, list2, str9, str10, str11, str12, list, str3, str20, str21, str22, str23, str24, str25, list3, list4);
        }
        String str26 = str15;
        String str27 = str16;
        String str28 = str3;
        Constructor<PostAuthData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PostAuthData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PostAuthData newInstance = constructor.newInstance(str, str4, str5, str6, str7, list2, str9, str10, str11, str12, list, str28, str20, str21, str13, str14, str26, str27, list3, list4, Integer.valueOf(i2), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthData postAuthData) {
        zq3.h(hVar, "writer");
        if (postAuthData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("loginNavigationTitle");
        this.stringAdapter.mo197toJson(hVar, postAuthData.m());
        hVar.C("accountCreatedNavigationTitle");
        this.stringAdapter.mo197toJson(hVar, postAuthData.a());
        hVar.C("userMessage");
        this.stringAdapter.mo197toJson(hVar, postAuthData.s());
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, postAuthData.l());
        hVar.C("freeTrialHeader");
        this.stringAdapter.mo197toJson(hVar, postAuthData.j());
        hVar.C("gameIcons");
        this.nullableListOfStringAdapter.mo197toJson(hVar, postAuthData.k());
        hVar.C("productIdentifier");
        this.stringAdapter.mo197toJson(hVar, postAuthData.q());
        hVar.C("cardHeader");
        this.stringAdapter.mo197toJson(hVar, postAuthData.e());
        hVar.C("cardSubHeader");
        this.stringAdapter.mo197toJson(hVar, postAuthData.f());
        hVar.C("cardValuePropsButtonText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.h());
        hVar.C("valueProps");
        this.listOfValuePropDataAdapter.mo197toJson(hVar, postAuthData.t());
        hVar.C("cardCancelNotice");
        this.stringAdapter.mo197toJson(hVar, postAuthData.c());
        hVar.C("cardSubscribeButtonText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.g());
        hVar.C("freeTrialCardSubscribeButtonText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.i());
        hVar.C("cardContinueButtonText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.d());
        hVar.C("terms");
        this.stringAdapter.mo197toJson(hVar, postAuthData.r());
        hVar.C("noInternetTitleText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.o());
        hVar.C("noInternetDetailsText");
        this.stringAdapter.mo197toJson(hVar, postAuthData.n());
        hVar.C("postAuthOfferUrgencyMessages");
        this.nullableListOfPostAuthUrgencyMessageDataAdapter.mo197toJson(hVar, postAuthData.p());
        hVar.C("automatedSkuChanges");
        this.nullableListOfPostAuthSkuOverrideDataAdapter.mo197toJson(hVar, postAuthData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
