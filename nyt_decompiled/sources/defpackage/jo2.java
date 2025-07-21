package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ho2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class jo2 implements h8 {
    public static final jo2 a = new jo2();
    private static final List b = i.o("__typename", "uri", "following");

    private jo2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ho2.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
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
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
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
        if (bool != null) {
            return new ho2.c(str, str2, bool.booleanValue());
        }
        vr.a(jsonReader, "following");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ho2.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("following");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(cVar.a()));
    }
}
