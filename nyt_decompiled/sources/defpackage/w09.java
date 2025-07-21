package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;

/* loaded from: classes4.dex */
public final class w09 implements h8 {
    public static final w09 a = new w09();

    private w09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserPrivacyPrefsKind fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserPrivacyPrefsKind.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserPrivacyPrefsKind userPrivacyPrefsKind) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userPrivacyPrefsKind, "value");
        lu3Var.value(userPrivacyPrefsKind.getRawValue());
    }
}
