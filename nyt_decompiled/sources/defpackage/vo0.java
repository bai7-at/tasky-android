package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vo0 implements h8 {
    public static final vo0 a = new vo0();
    private static final List b = i.o("slug", "showPicture", AuthenticationTokenClaims.JSON_KEY_NAME);

    private vo0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uo0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
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
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "slug");
            throw new KotlinNothingValueException();
        }
        if (bool == null) {
            vr.a(jsonReader, "showPicture");
            throw new KotlinNothingValueException();
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new uo0(str, booleanValue, str2);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uo0 uo0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(uo0Var, "value");
        lu3Var.name("slug");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, uo0Var.c());
        lu3Var.name("showPicture");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(uo0Var.b()));
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, uo0Var.a());
    }
}
