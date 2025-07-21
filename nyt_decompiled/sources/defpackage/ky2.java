package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.fy2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ky2 implements h8 {
    public static final ky2 a = new ky2();
    private static final List b = i.o("__typename", "description", "id", AuthenticationTokenClaims.JSON_KEY_NAME, "title", "interests");

    private ky2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fy2.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str4 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                list = j8.a(j8.c(iy2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "description");
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (str3 == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (str4 == null) {
            vr.a(jsonReader, "title");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new fy2.f(str, str2, intValue, str3, str4, list);
        }
        vr.a(jsonReader, "interests");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fy2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, fVar.f());
        lu3Var.name("description");
        h8Var.toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name("id");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(fVar.b()));
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, fVar.d());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, fVar.e());
        lu3Var.name("interests");
        j8.a(j8.c(iy2.a, true)).toJson(lu3Var, w41Var, fVar.c());
    }
}
