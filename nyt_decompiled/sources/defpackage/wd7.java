package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.ud7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wd7 implements h8 {
    public static final wd7 a = new wd7();
    private static final List b = i.o("__typename", "width", "url", AuthenticationTokenClaims.JSON_KEY_NAME, "height");

    private wd7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ud7.b fromJson(JsonReader jsonReader, w41 w41Var) {
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
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                num2 = (Integer) j8.b.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "width");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (str2 == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str3 == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (num2 != null) {
            return new ud7.b(str, intValue, str2, str3, num2.intValue());
        }
        vr.a(jsonReader, "height");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ud7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, bVar.e());
        lu3Var.name("width");
        h8 h8Var2 = j8.b;
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(bVar.d()));
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8Var.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("height");
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(bVar.a()));
    }
}
