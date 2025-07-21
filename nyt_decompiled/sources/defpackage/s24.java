package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.d24;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class s24 implements h8 {
    public static final s24 a = new s24();
    private static final List b = i.o("displayName", AuthenticationTokenClaims.JSON_KEY_NAME);

    private s24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d24.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "displayName");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new d24.i(str, str2);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d24.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("displayName");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, iVar.a());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, iVar.b());
    }
}
