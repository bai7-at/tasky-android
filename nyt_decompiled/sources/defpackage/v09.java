package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.nk5;

/* loaded from: classes4.dex */
public final class v09 implements h8 {
    public static final v09 a = new v09();

    private v09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u09 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u09 u09Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(u09Var, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        y09.a.toJson(lu3Var, w41Var, u09Var.b());
        if (u09Var.c() instanceof nk5.c) {
            lu3Var.name("nameV2");
            j8.e(j8.b(x09.a)).toJson(lu3Var, w41Var, (nk5.c) u09Var.c());
        }
        lu3Var.name("value");
        z09.a.toJson(lu3Var, w41Var, u09Var.d());
        lu3Var.name("kind");
        w09.a.toJson(lu3Var, w41Var, u09Var.a());
    }
}
