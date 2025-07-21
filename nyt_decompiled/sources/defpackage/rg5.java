package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class rg5 implements h8 {
    public static final rg5 a = new rg5();
    private static final List b = i.o(AuthenticationTokenClaims.JSON_KEY_NAME, "kind", "value");

    private rg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qg5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        UserPrivacyPrefsName userPrivacyPrefsName = null;
        UserPrivacyPrefsKind userPrivacyPrefsKind = null;
        UserPrivacyPrefsValue userPrivacyPrefsValue = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                userPrivacyPrefsName = y09.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                userPrivacyPrefsKind = w09.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                userPrivacyPrefsValue = z09.a.fromJson(jsonReader, w41Var);
            }
        }
        if (userPrivacyPrefsName == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (userPrivacyPrefsKind == null) {
            vr.a(jsonReader, "kind");
            throw new KotlinNothingValueException();
        }
        if (userPrivacyPrefsValue != null) {
            return new qg5(userPrivacyPrefsName, userPrivacyPrefsKind, userPrivacyPrefsValue);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, qg5 qg5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(qg5Var, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        y09.a.toJson(lu3Var, w41Var, qg5Var.b());
        lu3Var.name("kind");
        w09.a.toJson(lu3Var, w41Var, qg5Var.a());
        lu3Var.name("value");
        z09.a.toJson(lu3Var, w41Var, qg5Var.c());
    }
}
