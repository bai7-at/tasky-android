package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsNameV2;

/* loaded from: classes4.dex */
public final class x09 implements h8 {
    public static final x09 a = new x09();

    private x09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserPrivacyPrefsNameV2 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return UserPrivacyPrefsNameV2.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, UserPrivacyPrefsNameV2 userPrivacyPrefsNameV2) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userPrivacyPrefsNameV2, "value");
        lu3Var.value(userPrivacyPrefsNameV2.getRawValue());
    }
}
