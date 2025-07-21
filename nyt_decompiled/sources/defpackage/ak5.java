package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ak5 implements h8 {
    public static final ak5 a = new ak5();
    private static final List b = i.o("trackingParams", "node");

    private ak5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xj5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        xj5.f fVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                list = (List) j8.b(j8.a(j8.b(j8.d(ik5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new xj5.d(list, fVar);
                }
                fVar = (xj5.f) j8.b(j8.c(ck5.a, true)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xj5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(ik5.a, false, 1, null)))).toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("node");
        j8.b(j8.c(ck5.a, true)).toJson(lu3Var, w41Var, dVar.a());
    }
}
