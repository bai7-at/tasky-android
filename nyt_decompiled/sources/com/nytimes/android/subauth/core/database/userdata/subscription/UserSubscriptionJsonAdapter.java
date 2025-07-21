package com.nytimes.android.subauth.core.database.userdata.subscription;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class UserSubscriptionJsonAdapter extends JsonAdapter<UserSubscription> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<UserSubscriptionProduct>> listOfUserSubscriptionProductAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Set<UserSubscriptionEntitlement>> setOfUserSubscriptionEntitlementAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UserSubscriptionOwnershipStatus> userSubscriptionOwnershipStatusAdapter;
    private final JsonAdapter<UserSubscriptionStatus> userSubscriptionStatusAdapter;

    public UserSubscriptionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "status", "ownershipStatus", "bundleType", "startDate", "endDate", "gracePeriodStartDate", "gracePeriodEndDate", "cancellationDate", "isFreeTrial", "hasQueuedSub", "hasTransactionInProgress", "billingSource", "promotionTierType", "subscriptionProducts", "subscriptionLabels", "hasActiveEntitlements", "entitlements");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<UserSubscriptionStatus> f2 = iVar.f(UserSubscriptionStatus.class, b0.e(), "status");
        zq3.g(f2, "adapter(...)");
        this.userSubscriptionStatusAdapter = f2;
        JsonAdapter<UserSubscriptionOwnershipStatus> f3 = iVar.f(UserSubscriptionOwnershipStatus.class, b0.e(), "ownershipStatus");
        zq3.g(f3, "adapter(...)");
        this.userSubscriptionOwnershipStatusAdapter = f3;
        JsonAdapter<Date> f4 = iVar.f(Date.class, b0.e(), "startDate");
        zq3.g(f4, "adapter(...)");
        this.nullableDateAdapter = f4;
        JsonAdapter<Boolean> f5 = iVar.f(Boolean.TYPE, b0.e(), "isFreeTrial");
        zq3.g(f5, "adapter(...)");
        this.booleanAdapter = f5;
        JsonAdapter<List<UserSubscriptionProduct>> f6 = iVar.f(j.j(List.class, UserSubscriptionProduct.class), b0.e(), "subscriptionProducts");
        zq3.g(f6, "adapter(...)");
        this.listOfUserSubscriptionProductAdapter = f6;
        JsonAdapter<List<String>> f7 = iVar.f(j.j(List.class, String.class), b0.e(), "subscriptionLabels");
        zq3.g(f7, "adapter(...)");
        this.listOfStringAdapter = f7;
        JsonAdapter<Set<UserSubscriptionEntitlement>> f8 = iVar.f(j.j(Set.class, UserSubscriptionEntitlement.class), b0.e(), "entitlements");
        zq3.g(f8, "adapter(...)");
        this.setOfUserSubscriptionEntitlementAdapter = f8;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserSubscription fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        UserSubscriptionStatus userSubscriptionStatus = null;
        UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus = null;
        String str2 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        Set set = null;
        while (true) {
            Date date6 = date5;
            Date date7 = date4;
            Date date8 = date3;
            Date date9 = date2;
            Date date10 = date;
            Boolean bool5 = bool4;
            Boolean bool6 = bool3;
            Boolean bool7 = bool2;
            Boolean bool8 = bool;
            String str5 = str2;
            UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus2 = userSubscriptionOwnershipStatus;
            UserSubscriptionStatus userSubscriptionStatus2 = userSubscriptionStatus;
            String str6 = str;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (str6 == null) {
                    JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(o, "missingProperty(...)");
                    throw o;
                }
                if (userSubscriptionStatus2 == null) {
                    JsonDataException o2 = c29.o("status", "status", jsonReader);
                    zq3.g(o2, "missingProperty(...)");
                    throw o2;
                }
                if (userSubscriptionOwnershipStatus2 == null) {
                    JsonDataException o3 = c29.o("ownershipStatus", "ownershipStatus", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                if (str5 == null) {
                    JsonDataException o4 = c29.o("bundleType", "bundleType", jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                if (bool8 == null) {
                    JsonDataException o5 = c29.o("isFreeTrial", "isFreeTrial", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                boolean booleanValue = bool8.booleanValue();
                if (bool7 == null) {
                    JsonDataException o6 = c29.o("hasQueuedSub", "hasQueuedSub", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                boolean booleanValue2 = bool7.booleanValue();
                if (bool6 == null) {
                    JsonDataException o7 = c29.o("hasTransactionInProgress", "hasTransactionInProgress", jsonReader);
                    zq3.g(o7, "missingProperty(...)");
                    throw o7;
                }
                boolean booleanValue3 = bool6.booleanValue();
                if (str3 == null) {
                    JsonDataException o8 = c29.o("billingSource", "billingSource", jsonReader);
                    zq3.g(o8, "missingProperty(...)");
                    throw o8;
                }
                if (str4 == null) {
                    JsonDataException o9 = c29.o("promotionTierType", "promotionTierType", jsonReader);
                    zq3.g(o9, "missingProperty(...)");
                    throw o9;
                }
                if (list == null) {
                    JsonDataException o10 = c29.o("subscriptionProducts", "subscriptionProducts", jsonReader);
                    zq3.g(o10, "missingProperty(...)");
                    throw o10;
                }
                if (list2 == null) {
                    JsonDataException o11 = c29.o("subscriptionLabels", "subscriptionLabels", jsonReader);
                    zq3.g(o11, "missingProperty(...)");
                    throw o11;
                }
                if (bool5 == null) {
                    JsonDataException o12 = c29.o("hasActiveEntitlements", "hasActiveEntitlements", jsonReader);
                    zq3.g(o12, "missingProperty(...)");
                    throw o12;
                }
                boolean booleanValue4 = bool5.booleanValue();
                if (set != null) {
                    return new UserSubscription(str6, userSubscriptionStatus2, userSubscriptionOwnershipStatus2, str5, date10, date9, date8, date7, date6, booleanValue, booleanValue2, booleanValue3, str3, str4, list, list2, booleanValue4, set);
                }
                JsonDataException o13 = c29.o("entitlements", "entitlements", jsonReader);
                zq3.g(o13, "missingProperty(...)");
                throw o13;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                case 1:
                    userSubscriptionStatus = (UserSubscriptionStatus) this.userSubscriptionStatusAdapter.fromJson(jsonReader);
                    if (userSubscriptionStatus == null) {
                        JsonDataException x2 = c29.x("status", "status", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    str = str6;
                case 2:
                    userSubscriptionOwnershipStatus = (UserSubscriptionOwnershipStatus) this.userSubscriptionOwnershipStatusAdapter.fromJson(jsonReader);
                    if (userSubscriptionOwnershipStatus == null) {
                        JsonDataException x3 = c29.x("ownershipStatus", "ownershipStatus", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x4 = c29.x("bundleType", "bundleType", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 4:
                    date = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 5:
                    date2 = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 6:
                    date3 = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    date5 = date6;
                    date4 = date7;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 7:
                    date4 = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    date5 = date6;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 8:
                    date5 = (Date) this.nullableDateAdapter.fromJson(jsonReader);
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 9:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x5 = c29.x("isFreeTrial", "isFreeTrial", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 10:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x6 = c29.x("hasQueuedSub", "hasQueuedSub", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 11:
                    Boolean bool9 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool9 == null) {
                        JsonDataException x7 = c29.x("hasTransactionInProgress", "hasTransactionInProgress", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    bool3 = bool9;
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 12:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x8 = c29.x("billingSource", "billingSource", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 13:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x9 = c29.x("promotionTierType", "promotionTierType", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 14:
                    list = (List) this.listOfUserSubscriptionProductAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x10 = c29.x("subscriptionProducts", "subscriptionProducts", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 15:
                    list2 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x11 = c29.x("subscriptionLabels", "subscriptionLabels", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 16:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        JsonDataException x12 = c29.x("hasActiveEntitlements", "hasActiveEntitlements", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                case 17:
                    set = (Set) this.setOfUserSubscriptionEntitlementAdapter.fromJson(jsonReader);
                    if (set == null) {
                        JsonDataException x13 = c29.x("entitlements", "entitlements", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
                default:
                    date5 = date6;
                    date4 = date7;
                    date3 = date8;
                    date2 = date9;
                    date = date10;
                    bool4 = bool5;
                    bool3 = bool6;
                    bool2 = bool7;
                    bool = bool8;
                    str2 = str5;
                    userSubscriptionOwnershipStatus = userSubscriptionOwnershipStatus2;
                    userSubscriptionStatus = userSubscriptionStatus2;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserSubscription userSubscription) {
        zq3.h(hVar, "writer");
        if (userSubscription == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, userSubscription.getName());
        hVar.C("status");
        this.userSubscriptionStatusAdapter.mo197toJson(hVar, userSubscription.getStatus());
        hVar.C("ownershipStatus");
        this.userSubscriptionOwnershipStatusAdapter.mo197toJson(hVar, userSubscription.getOwnershipStatus());
        hVar.C("bundleType");
        this.stringAdapter.mo197toJson(hVar, userSubscription.getBundleType());
        hVar.C("startDate");
        this.nullableDateAdapter.mo197toJson(hVar, userSubscription.getStartDate());
        hVar.C("endDate");
        this.nullableDateAdapter.mo197toJson(hVar, userSubscription.getEndDate());
        hVar.C("gracePeriodStartDate");
        this.nullableDateAdapter.mo197toJson(hVar, userSubscription.getGracePeriodStartDate());
        hVar.C("gracePeriodEndDate");
        this.nullableDateAdapter.mo197toJson(hVar, userSubscription.getGracePeriodEndDate());
        hVar.C("cancellationDate");
        this.nullableDateAdapter.mo197toJson(hVar, userSubscription.getCancellationDate());
        hVar.C("isFreeTrial");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(userSubscription.isFreeTrial()));
        hVar.C("hasQueuedSub");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(userSubscription.getHasQueuedSub()));
        hVar.C("hasTransactionInProgress");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(userSubscription.getHasTransactionInProgress()));
        hVar.C("billingSource");
        this.stringAdapter.mo197toJson(hVar, userSubscription.getBillingSource());
        hVar.C("promotionTierType");
        this.stringAdapter.mo197toJson(hVar, userSubscription.getPromotionTierType());
        hVar.C("subscriptionProducts");
        this.listOfUserSubscriptionProductAdapter.mo197toJson(hVar, userSubscription.getSubscriptionProducts());
        hVar.C("subscriptionLabels");
        this.listOfStringAdapter.mo197toJson(hVar, userSubscription.getSubscriptionLabels());
        hVar.C("hasActiveEntitlements");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(userSubscription.getHasActiveEntitlements()));
        hVar.C("entitlements");
        this.setOfUserSubscriptionEntitlementAdapter.mo197toJson(hVar, userSubscription.getEntitlements());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UserSubscription");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
