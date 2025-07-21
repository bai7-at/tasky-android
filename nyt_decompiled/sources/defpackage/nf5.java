package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.mf5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class nf5 implements h8 {
    public static final nf5 a = new nf5();
    private static final List b = i.o("__typename", "uri", "url", "creationDate", "expirationDate", "regiId");

    private nf5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mf5.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str4 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str5 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new mf5.a(str, str2, str3, str4, str5, num);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, mf5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.f());
        lu3Var.name("uri");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, aVar.d());
        lu3Var.name("url");
        ya5Var.toJson(lu3Var, w41Var, aVar.e());
        lu3Var.name("creationDate");
        ya5Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("expirationDate");
        ya5Var.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("regiId");
        j8.k.toJson(lu3Var, w41Var, aVar.c());
    }
}
