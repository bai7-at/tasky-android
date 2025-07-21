package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mw5 implements h8 {
    public static final mw5 a = new mw5();
    private static final List b = i.o("__typename", "node");

    private mw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        lw5.e eVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                eVar = (lw5.e) j8.b(j8.c(pw5.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new lw5.b(str, eVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("node");
        j8.b(j8.c(pw5.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
