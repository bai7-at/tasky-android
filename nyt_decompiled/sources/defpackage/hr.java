package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.gr;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hr implements h8 {
    public static final hr a = new hr();
    private static final List b = i.o("__typename", "promotionalImage");

    private hr() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public gr fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        gr.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                aVar = (gr.a) j8.b(j8.d(ir.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new gr(str, aVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, gr grVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(grVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, grVar.b());
        lu3Var.name("promotionalImage");
        j8.b(j8.d(ir.a, false, 1, null)).toJson(lu3Var, w41Var, grVar.a());
    }
}
