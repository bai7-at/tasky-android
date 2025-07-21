package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.m56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class q56 implements h8 {
    public static final q56 a = new q56();
    private static final List b = i.o("__typename", AuthenticationTokenClaims.JSON_KEY_NAME, "height", "width", "url");

    private q56() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m56.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                num2 = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
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
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "height");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (num2 == null) {
            vr.a(jsonReader, "width");
            throw new KotlinNothingValueException();
        }
        int intValue2 = num2.intValue();
        if (str3 != null) {
            return new m56.c(str, str2, intValue, intValue2, str3);
        }
        vr.a(jsonReader, "url");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, m56.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.e());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("height");
        h8 h8Var2 = j8.b;
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(cVar.a()));
        lu3Var.name("width");
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(cVar.d()));
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, cVar.c());
    }
}
