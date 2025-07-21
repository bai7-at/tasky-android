package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nx2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class px2 implements h8 {
    public static final px2 a = new px2();
    private static final List b = i.o("__typename", "trackingParams", "node");

    private px2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx2.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        nx2.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = (List) j8.b(j8.a(j8.b(j8.d(ux2.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                gVar = (nx2.g) j8.b(j8.c(tx2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new nx2.c(str, list, gVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nx2.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(ux2.a, false, 1, null)))).toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("node");
        j8.b(j8.c(tx2.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
