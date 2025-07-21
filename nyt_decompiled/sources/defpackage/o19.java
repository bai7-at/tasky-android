package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserSubscriptionStatus;

/* loaded from: classes4.dex */
public final class o19 implements h8 {
    public static final o19 a = new o19();

    private o19() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionStatus fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserSubscriptionStatus.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserSubscriptionStatus userSubscriptionStatus) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userSubscriptionStatus, "value");
        lu3Var.value(userSubscriptionStatus.getRawValue());
    }
}
