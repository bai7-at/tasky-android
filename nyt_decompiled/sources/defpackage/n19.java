package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserSubscriptionOwnershipStatus;

/* loaded from: classes4.dex */
public final class n19 implements h8 {
    public static final n19 a = new n19();

    private n19() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionOwnershipStatus fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserSubscriptionOwnershipStatus.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userSubscriptionOwnershipStatus, "value");
        lu3Var.value(userSubscriptionOwnershipStatus.getRawValue());
    }
}
