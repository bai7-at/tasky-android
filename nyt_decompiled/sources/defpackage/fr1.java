package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.er1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fr1 implements h8 {
    public static final fr1 a = new fr1();
    private static final List b = i.o("__typename", "edges");

    private fr1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er1.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = (List) j8.b(j8.a(j8.b(j8.d(hr1.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new er1.a(str, list);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, er1.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(hr1.a, false, 1, null)))).toJson(lu3Var, w41Var, aVar.a());
    }
}
