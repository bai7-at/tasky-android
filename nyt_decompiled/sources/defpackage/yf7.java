package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.rf7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yf7 implements h8 {
    public static final yf7 a = new yf7();
    private static final List b = i.e(AuthenticationTokenClaims.JSON_KEY_NAME);

    private yf7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rf7.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str != null) {
            return new rf7.h(str);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, rf7.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        j8.a.toJson(lu3Var, w41Var, hVar.a());
    }
}
