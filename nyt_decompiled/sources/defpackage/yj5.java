package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yj5 implements h8 {
    public static final yj5 a = new yj5();
    private static final List b = i.o("recommended", "thePoint");

    private yj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xj5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xj5.i iVar = null;
        xj5.j jVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                iVar = (xj5.i) j8.b(j8.d(fk5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new xj5.b(iVar, jVar);
                }
                jVar = (xj5.j) j8.b(j8.d(gk5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xj5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("recommended");
        j8.b(j8.d(fk5.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
        lu3Var.name("thePoint");
        j8.b(j8.d(gk5.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.b());
    }
}
