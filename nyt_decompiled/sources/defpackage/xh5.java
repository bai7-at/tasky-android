package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.uh5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class xh5 implements h8 {
    public static final xh5 a = new xh5();
    private static final List b = i.o(AuthenticationTokenClaims.JSON_KEY_NAME, "audience", "canShow", "reason", "content");

    private xh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uh5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        uh5.b bVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                bVar = (uh5.b) j8.b(j8.c(vh5.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (bool == null) {
            vr.a(jsonReader, "canShow");
            throw new KotlinNothingValueException();
        }
        boolean booleanValue = bool.booleanValue();
        if (str3 != null) {
            return new uh5.d(str, str2, booleanValue, str3, bVar);
        }
        vr.a(jsonReader, "reason");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uh5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, dVar.d());
        lu3Var.name("audience");
        j8.i.toJson(lu3Var, w41Var, dVar.a());
        lu3Var.name("canShow");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(dVar.b()));
        lu3Var.name("reason");
        h8Var.toJson(lu3Var, w41Var, dVar.e());
        lu3Var.name("content");
        j8.b(j8.c(vh5.a, true)).toJson(lu3Var, w41Var, dVar.c());
    }
}
