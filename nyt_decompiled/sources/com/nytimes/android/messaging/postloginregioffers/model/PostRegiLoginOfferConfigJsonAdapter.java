package com.nytimes.android.messaging.postloginregioffers.model;

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
public final class PostRegiLoginOfferConfigJsonAdapter extends JsonAdapter<PostRegiLoginOfferConfig> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PostRegiLoginOfferConfig> constructorRef;
    private final JsonAdapter<List<ValueProp>> listOfValuePropAdapter;
    private final JsonAdapter<List<PostAuthScheduledSku>> nullableListOfPostAuthScheduledSkuAdapter;
    private final JsonAdapter<List<PostAuthUrgencyMessage>> nullableListOfPostAuthUrgencyMessageAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PostRegiLoginOfferConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("account_status", "header", "card_header", "card_subheader", "value_props_header", "show_value_props_toggle", "value_props", "footer", "subscribe_button_text", "continue_button_text", "sku", "terms", "scheduled_skus", "urgency_messaging", "hasIntroPrice");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "accountStatus");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "showValuePropsToggle");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<List<ValueProp>> f3 = iVar.f(j.j(List.class, ValueProp.class), b0.e(), "valueProps");
        zq3.g(f3, "adapter(...)");
        this.listOfValuePropAdapter = f3;
        JsonAdapter<List<PostAuthScheduledSku>> f4 = iVar.f(j.j(List.class, PostAuthScheduledSku.class), b0.e(), "scheduledSkus");
        zq3.g(f4, "adapter(...)");
        this.nullableListOfPostAuthScheduledSkuAdapter = f4;
        JsonAdapter<List<PostAuthUrgencyMessage>> f5 = iVar.f(j.j(List.class, PostAuthUrgencyMessage.class), b0.e(), "urgencyMessaging");
        zq3.g(f5, "adapter(...)");
        this.nullableListOfPostAuthUrgencyMessageAdapter = f5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostRegiLoginOfferConfig fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        String str2 = null;
        int i = -1;
        Boolean bool2 = bool;
        String str3 = null;
        Boolean bool3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        List list2 = null;
        List list3 = null;
        while (true) {
            String str12 = str3;
            Boolean bool4 = bool3;
            String str13 = str2;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == -16513) {
                    if (str13 == null) {
                        JsonDataException o = c29.o("accountStatus", "account_status", jsonReader);
                        zq3.g(o, "missingProperty(...)");
                        throw o;
                    }
                    if (str4 == null) {
                        JsonDataException o2 = c29.o("header_", "header", jsonReader);
                        zq3.g(o2, "missingProperty(...)");
                        throw o2;
                    }
                    if (str5 == null) {
                        JsonDataException o3 = c29.o("productTitle", "card_header", jsonReader);
                        zq3.g(o3, "missingProperty(...)");
                        throw o3;
                    }
                    if (str6 == null) {
                        JsonDataException o4 = c29.o("productSubHeader", "card_subheader", jsonReader);
                        zq3.g(o4, "missingProperty(...)");
                        throw o4;
                    }
                    if (str7 == null) {
                        JsonDataException o5 = c29.o("valuePropsHeader", "value_props_header", jsonReader);
                        zq3.g(o5, "missingProperty(...)");
                        throw o5;
                    }
                    if (bool4 == null) {
                        JsonDataException o6 = c29.o("showValuePropsToggle", "show_value_props_toggle", jsonReader);
                        zq3.g(o6, "missingProperty(...)");
                        throw o6;
                    }
                    boolean booleanValue = bool4.booleanValue();
                    if (list == null) {
                        JsonDataException o7 = c29.o("valueProps", "value_props", jsonReader);
                        zq3.g(o7, "missingProperty(...)");
                        throw o7;
                    }
                    zq3.f(str12, "null cannot be cast to non-null type kotlin.String");
                    if (str8 == null) {
                        JsonDataException o8 = c29.o("subscribeButtonText", "subscribe_button_text", jsonReader);
                        zq3.g(o8, "missingProperty(...)");
                        throw o8;
                    }
                    if (str9 == null) {
                        JsonDataException o9 = c29.o("continueButtonText", "continue_button_text", jsonReader);
                        zq3.g(o9, "missingProperty(...)");
                        throw o9;
                    }
                    if (str10 == null) {
                        JsonDataException o10 = c29.o("sku", "sku", jsonReader);
                        zq3.g(o10, "missingProperty(...)");
                        throw o10;
                    }
                    if (str11 != null) {
                        return new PostRegiLoginOfferConfig(str13, str4, str5, str6, str7, booleanValue, list, str12, str8, str9, str10, str11, list2, list3, bool2.booleanValue());
                    }
                    JsonDataException o11 = c29.o("legalText", "terms", jsonReader);
                    zq3.g(o11, "missingProperty(...)");
                    throw o11;
                }
                Constructor<PostRegiLoginOfferConfig> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Boolean.TYPE;
                    str = "show_value_props_toggle";
                    constructor = PostRegiLoginOfferConfig.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, cls, List.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, cls, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "also(...)");
                } else {
                    str = "show_value_props_toggle";
                }
                if (str13 == null) {
                    JsonDataException o12 = c29.o("accountStatus", "account_status", jsonReader);
                    zq3.g(o12, "missingProperty(...)");
                    throw o12;
                }
                if (str4 == null) {
                    JsonDataException o13 = c29.o("header_", "header", jsonReader);
                    zq3.g(o13, "missingProperty(...)");
                    throw o13;
                }
                if (str5 == null) {
                    JsonDataException o14 = c29.o("productTitle", "card_header", jsonReader);
                    zq3.g(o14, "missingProperty(...)");
                    throw o14;
                }
                if (str6 == null) {
                    JsonDataException o15 = c29.o("productSubHeader", "card_subheader", jsonReader);
                    zq3.g(o15, "missingProperty(...)");
                    throw o15;
                }
                if (str7 == null) {
                    JsonDataException o16 = c29.o("valuePropsHeader", "value_props_header", jsonReader);
                    zq3.g(o16, "missingProperty(...)");
                    throw o16;
                }
                if (bool4 == null) {
                    JsonDataException o17 = c29.o("showValuePropsToggle", str, jsonReader);
                    zq3.g(o17, "missingProperty(...)");
                    throw o17;
                }
                if (list == null) {
                    JsonDataException o18 = c29.o("valueProps", "value_props", jsonReader);
                    zq3.g(o18, "missingProperty(...)");
                    throw o18;
                }
                if (str8 == null) {
                    JsonDataException o19 = c29.o("subscribeButtonText", "subscribe_button_text", jsonReader);
                    zq3.g(o19, "missingProperty(...)");
                    throw o19;
                }
                if (str9 == null) {
                    JsonDataException o20 = c29.o("continueButtonText", "continue_button_text", jsonReader);
                    zq3.g(o20, "missingProperty(...)");
                    throw o20;
                }
                if (str10 == null) {
                    JsonDataException o21 = c29.o("sku", "sku", jsonReader);
                    zq3.g(o21, "missingProperty(...)");
                    throw o21;
                }
                if (str11 == null) {
                    JsonDataException o22 = c29.o("legalText", "terms", jsonReader);
                    zq3.g(o22, "missingProperty(...)");
                    throw o22;
                }
                PostRegiLoginOfferConfig newInstance = constructor.newInstance(str13, str4, str5, str6, str7, bool4, list, str12, str8, str9, str10, str11, list2, list3, bool2, Integer.valueOf(i), null);
                zq3.g(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("accountStatus", "account_status", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    str3 = str12;
                    bool3 = bool4;
                case 1:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x2 = c29.x("header_", "header", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 2:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x3 = c29.x("productTitle", "card_header", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 3:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x4 = c29.x("productSubHeader", "card_subheader", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 4:
                    str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x5 = c29.x("valuePropsHeader", "value_props_header", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 5:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        JsonDataException x6 = c29.x("showValuePropsToggle", "show_value_props_toggle", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    str3 = str12;
                    str2 = str13;
                case 6:
                    list = (List) this.listOfValuePropAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x7 = c29.x("valueProps", "value_props", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 7:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x8 = c29.x("footer", "footer", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i &= -129;
                    bool3 = bool4;
                    str2 = str13;
                case 8:
                    str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x9 = c29.x("subscribeButtonText", "subscribe_button_text", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 9:
                    str9 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        JsonDataException x10 = c29.x("continueButtonText", "continue_button_text", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 10:
                    str10 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        JsonDataException x11 = c29.x("sku", "sku", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 11:
                    str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x12 = c29.x("legalText", "terms", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 12:
                    list2 = (List) this.nullableListOfPostAuthScheduledSkuAdapter.fromJson(jsonReader);
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 13:
                    list3 = (List) this.nullableListOfPostAuthUrgencyMessageAdapter.fromJson(jsonReader);
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                case 14:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x13 = c29.x("hasIntroPrice", "hasIntroPrice", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    i &= -16385;
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
                default:
                    str3 = str12;
                    bool3 = bool4;
                    str2 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostRegiLoginOfferConfig postRegiLoginOfferConfig) {
        zq3.h(hVar, "writer");
        if (postRegiLoginOfferConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("account_status");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getAccountStatus());
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getHeader());
        hVar.C("card_header");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getProductTitle());
        hVar.C("card_subheader");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getProductSubHeader());
        hVar.C("value_props_header");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getValuePropsHeader());
        hVar.C("show_value_props_toggle");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(postRegiLoginOfferConfig.getShowValuePropsToggle()));
        hVar.C("value_props");
        this.listOfValuePropAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getValueProps());
        hVar.C("footer");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getFooter());
        hVar.C("subscribe_button_text");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getSubscribeButtonText());
        hVar.C("continue_button_text");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getContinueButtonText());
        hVar.C("sku");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getSku());
        hVar.C("terms");
        this.stringAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getLegalText());
        hVar.C("scheduled_skus");
        this.nullableListOfPostAuthScheduledSkuAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getScheduledSkus());
        hVar.C("urgency_messaging");
        this.nullableListOfPostAuthUrgencyMessageAdapter.mo197toJson(hVar, postRegiLoginOfferConfig.getUrgencyMessaging());
        hVar.C("hasIntroPrice");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(postRegiLoginOfferConfig.getHasIntroPrice()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostRegiLoginOfferConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
