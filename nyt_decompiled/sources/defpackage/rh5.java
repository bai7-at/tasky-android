package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ph5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class rh5 implements h8 {
    public static final rh5 a = new rh5();
    private static final List b = i.e("__typename");

    private rh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ph5.c fromJson(JsonReader jsonReader, w41 w41Var) {
        b73 b73Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        qm1 qm1Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article", "Dispatch", "EmbeddedInteractive", "ProgrammingList", "ProgrammingNode"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            b73Var = d73.a.fromJson(jsonReader, w41Var);
        } else {
            b73Var = null;
        }
        if (xa0.c(xa0.e("ProgrammingNode"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            qm1Var = sm1.a.fromJson(jsonReader, w41Var);
        }
        return new ph5.c(str, b73Var, qm1Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ph5.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.c());
        if (cVar.b() != null) {
            d73.a.toJson(lu3Var, w41Var, cVar.b());
        }
        if (cVar.a() != null) {
            sm1.a.toJson(lu3Var, w41Var, cVar.a());
        }
    }
}
