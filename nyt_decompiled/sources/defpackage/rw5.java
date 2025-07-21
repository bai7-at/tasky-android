package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class rw5 implements h8 {
    public static final rw5 a = new rw5();
    private static final List b = i.o("__typename", "edges");

    private rw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.g fromJson(JsonReader jsonReader, w41 w41Var) {
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
                list = (List) j8.b(j8.a(j8.b(j8.d(nw5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new lw5.g(str, list);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.b());
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(nw5.a, false, 1, null)))).toJson(lu3Var, w41Var, gVar.a());
    }
}
