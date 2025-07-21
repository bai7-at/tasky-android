package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uq1;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wq1 implements h8 {
    public static final wq1 a = new wq1();
    private static final List b = i.e("program_beta");

    private wq1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uq1.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uq1.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (uq1.d) j8.b(j8.d(xq1.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new uq1.c(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uq1.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("program_beta");
        j8.b(j8.d(xq1.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
