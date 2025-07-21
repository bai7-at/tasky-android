package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ma0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class na0 implements h8 {
    public static final na0 a = new na0();
    private static final List b = i.o("__typename", "url", "promoImageUrl", "title", "listTitle");

    private na0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ma0.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
            } else {
                if (l1 != 4) {
                    break;
                }
                str5 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str3 == null) {
            vr.a(jsonReader, "promoImageUrl");
            throw new KotlinNothingValueException();
        }
        if (str4 == null) {
            vr.a(jsonReader, "title");
            throw new KotlinNothingValueException();
        }
        if (str5 != null) {
            return new ma0.a(str, str2, str3, str4, str5);
        }
        vr.a(jsonReader, "listTitle");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ma0.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aVar.e());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, aVar.d());
        lu3Var.name("promoImageUrl");
        h8Var.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("listTitle");
        h8Var.toJson(lu3Var, w41Var, aVar.a());
    }
}
