package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fz4;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class gz4 implements h8 {
    public static final gz4 a = new gz4();
    private static final List b = i.e("updateTcfPref");

    private gz4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fz4.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fz4.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (fz4.c) j8.b(j8.c(hz4.a, true)).fromJson(jsonReader, w41Var);
        }
        return new fz4.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fz4.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("updateTcfPref");
        j8.b(j8.c(hz4.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
