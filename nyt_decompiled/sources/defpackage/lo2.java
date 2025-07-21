package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.ko2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lo2 implements h8 {
    public static final lo2 a = new lo2();
    private static final List b = i.o("__typename", "uri", AuthenticationTokenClaims.JSON_KEY_NAME, "description", "shortDescription", AssetConstants.IMAGE_TYPE);

    private lo2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko2.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ko2.b bVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str4 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str5 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                bVar = (ko2.b) j8.b(j8.c(no2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "uri");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new ko2.a(str, str2, str3, str4, str5, bVar);
        }
        vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ko2.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aVar.f());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, aVar.e());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("description");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("shortDescription");
        ya5Var.toJson(lu3Var, w41Var, aVar.d());
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.c(no2.a, true)).toJson(lu3Var, w41Var, aVar.b());
    }
}
