package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vr4 implements h8 {
    public static final vr4 a = new vr4();
    private static final List b = i.o(AuthenticationTokenClaims.JSON_KEY_NAME, "properties");

    private vr4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ur4 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = j8.a(j8.d(wr4.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new ur4(str, list);
        }
        vr.a(jsonReader, "properties");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ur4 ur4Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(ur4Var, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        j8.a.toJson(lu3Var, w41Var, ur4Var.a());
        lu3Var.name("properties");
        j8.a(j8.d(wr4.a, false, 1, null)).toJson(lu3Var, w41Var, ur4Var.b());
    }
}
