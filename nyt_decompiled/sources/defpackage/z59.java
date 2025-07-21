package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.n59;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z59 implements h8 {
    public static final z59 a = new z59();
    private static final List b = i.o("__typename", "displayName", AuthenticationTokenClaims.JSON_KEY_NAME);

    private z59() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n59.l fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "displayName");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new n59.l(str, str2, str3);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, n59.l lVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(lVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, lVar.c());
        lu3Var.name("displayName");
        h8Var.toJson(lu3Var, w41Var, lVar.a());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, lVar.b());
    }
}
