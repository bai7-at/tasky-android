package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hg2 implements h8 {
    public static final hg2 a = new hg2();
    private static final List b = i.o("__typename", AuthenticationTokenClaims.JSON_KEY_NAME, "filterId");

    private hg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
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
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
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
        if (num != null) {
            return new yf2.i(str, str2, num.intValue());
        }
        vr.a(jsonReader, "filterId");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, iVar.c());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, iVar.b());
        lu3Var.name("filterId");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(iVar.a()));
    }
}
