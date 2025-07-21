package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;

/* loaded from: classes4.dex */
public final class y09 implements h8 {
    public static final y09 a = new y09();

    private y09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserPrivacyPrefsName fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserPrivacyPrefsName.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserPrivacyPrefsName userPrivacyPrefsName) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userPrivacyPrefsName, "value");
        lu3Var.value(userPrivacyPrefsName.getRawValue());
    }
}
