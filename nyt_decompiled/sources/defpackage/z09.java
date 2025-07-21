package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;

/* loaded from: classes4.dex */
public final class z09 implements h8 {
    public static final z09 a = new z09();

    private z09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserPrivacyPrefsValue fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserPrivacyPrefsValue.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserPrivacyPrefsValue userPrivacyPrefsValue) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userPrivacyPrefsValue, "value");
        lu3Var.value(userPrivacyPrefsValue.getRawValue());
    }
}
