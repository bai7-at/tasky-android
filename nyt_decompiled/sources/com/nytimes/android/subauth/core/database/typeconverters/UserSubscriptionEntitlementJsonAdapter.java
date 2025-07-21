package com.nytimes.android.subauth.core.database.typeconverters;

import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.database.userdata.subscription.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import defpackage.er2;
import defpackage.um8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class UserSubscriptionEntitlementJsonAdapter extends JsonAdapter<UserSubscriptionEntitlement> {
    @Override // com.squareup.moshi.JsonAdapter
    @er2
    public UserSubscriptionEntitlement fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        if (jsonReader.r() == JsonReader.Token.NULL) {
            return (UserSubscriptionEntitlement) jsonReader.l();
        }
        String nextString = jsonReader.nextString();
        zq3.g(nextString, "nextString(...)");
        return a.b(nextString);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @um8
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserSubscriptionEntitlement userSubscriptionEntitlement) {
        zq3.h(hVar, "writer");
        hVar.K0(userSubscriptionEntitlement != null ? userSubscriptionEntitlement.getRawValue() : null);
    }
}
