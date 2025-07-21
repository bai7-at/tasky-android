package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.r56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class n66 implements h8 {
    public static final n66 a = new n66();
    private static final List b = i.o("__typename", "promotionalMedia");

    private n66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r56.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        r56.h hVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                hVar = (r56.h) j8.b(j8.c(q66.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new r56.f(str, hVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, r56.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(q66.a, true)).toJson(lu3Var, w41Var, fVar.a());
    }
}
