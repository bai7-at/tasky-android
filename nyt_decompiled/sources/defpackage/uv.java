package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.lv;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class uv implements h8 {
    public static final uv a = new uv();
    private static final List b = i.o(AuthenticationTokenClaims.JSON_KEY_NAME, "title", "subtitle", "summary", "itunesUrl", AssetConstants.IMAGE_TYPE);

    private uv() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lv.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        lv.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str4 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str5 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                gVar = (lv.g) j8.b(j8.c(tv.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "title");
            throw new KotlinNothingValueException();
        }
        if (str3 == null) {
            vr.a(jsonReader, "subtitle");
            throw new KotlinNothingValueException();
        }
        if (str4 == null) {
            vr.a(jsonReader, "summary");
            throw new KotlinNothingValueException();
        }
        if (str5 != null) {
            return new lv.h(str, str2, str3, str4, str5, gVar);
        }
        vr.a(jsonReader, "itunesUrl");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lv.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, hVar.c());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, hVar.f());
        lu3Var.name("subtitle");
        h8Var.toJson(lu3Var, w41Var, hVar.d());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, hVar.e());
        lu3Var.name("itunesUrl");
        h8Var.toJson(lu3Var, w41Var, hVar.b());
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.c(tv.a, true)).toJson(lu3Var, w41Var, hVar.a());
    }
}
