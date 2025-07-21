package com.nytimes.android.subauth.core.database.typeconverters;

import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import com.nytimes.android.subauth.core.database.userdata.subscription.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import defpackage.er2;
import defpackage.um8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class UserSubscriptionProductJsonAdapter extends JsonAdapter<UserSubscriptionProduct> {
    @Override // com.squareup.moshi.JsonAdapter
    @er2
    public UserSubscriptionProduct fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        if (jsonReader.r() == JsonReader.Token.NULL) {
            return (UserSubscriptionProduct) jsonReader.l();
        }
        String nextString = jsonReader.nextString();
        zq3.g(nextString, "nextString(...)");
        return b.a(nextString);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @um8
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserSubscriptionProduct userSubscriptionProduct) {
        zq3.h(hVar, "writer");
        hVar.K0(userSubscriptionProduct != null ? userSubscriptionProduct.getRawValue() : null);
    }
}
