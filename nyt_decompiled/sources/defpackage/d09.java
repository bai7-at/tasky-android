package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class d09 implements h8 {
    public static final d09 a = new d09();
    private static final List b = i.o("displayName", AuthenticationTokenClaims.JSON_KEY_NAME, "givenName", "familyName", "username", "gamesUsername");

    private d09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str4 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str5 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    return new yz8.f(str, str2, str3, str4, str5, str6);
                }
                str6 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("displayName");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        ya5Var.toJson(lu3Var, w41Var, fVar.e());
        lu3Var.name("givenName");
        ya5Var.toJson(lu3Var, w41Var, fVar.d());
        lu3Var.name("familyName");
        ya5Var.toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("username");
        ya5Var.toJson(lu3Var, w41Var, fVar.f());
        lu3Var.name("gamesUsername");
        ya5Var.toJson(lu3Var, w41Var, fVar.c());
    }
}
