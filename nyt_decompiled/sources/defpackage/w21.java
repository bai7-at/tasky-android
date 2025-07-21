package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u21;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class w21 implements h8 {
    public static final w21 a = new w21();
    private static final List b = i.o("__typename", "default", "seo");

    private w21() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u21.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "default");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new u21.a(str, str2, str3);
        }
        vr.a(jsonReader, "seo");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u21.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("default");
        h8Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("seo");
        h8Var.toJson(lu3Var, w41Var, aVar.b());
    }
}
