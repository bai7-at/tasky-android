package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nx2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class rx2 implements h8 {
    public static final rx2 a = new rx2();
    private static final List b = i.o("__typename", "genericPersonalizedList");

    private rx2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        nx2.d dVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                dVar = (nx2.d) j8.b(j8.d(qx2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new nx2.e(str, dVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nx2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.b());
        lu3Var.name("genericPersonalizedList");
        j8.b(j8.d(qx2.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
    }
}
