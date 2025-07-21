package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.uh5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zh5 implements h8 {
    public static final zh5 a = new zh5();
    private static final List b = i.o(AuthenticationTokenClaims.JSON_KEY_NAME, "canShow", "messages");

    private zh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uh5.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.d(xh5.a, false, 1, null)).fromJson(jsonReader, w41Var);
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
        if (list != null) {
            return new uh5.f(str, booleanValue, list);
        }
        vr.a(jsonReader, "messages");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uh5.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        j8.a.toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("canShow");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(fVar.a()));
        lu3Var.name("messages");
        j8.a(j8.d(xh5.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.b());
    }
}
