package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.yy0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cz0 implements h8 {
    public static final cz0 a = new cz0();
    private static final List b = i.o("url", "width", "height", AuthenticationTokenClaims.JSON_KEY_NAME);

    private cz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yy0.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                num2 = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "width");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (num2 == null) {
            vr.a(jsonReader, "height");
            throw new KotlinNothingValueException();
        }
        int intValue2 = num2.intValue();
        if (str2 != null) {
            return new yy0.c(str, intValue, intValue2, str2);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yy0.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("url");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("width");
        h8 h8Var2 = j8.b;
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(cVar.d()));
        lu3Var.name("height");
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(cVar.a()));
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, cVar.b());
    }
}
