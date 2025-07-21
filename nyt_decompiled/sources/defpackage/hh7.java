package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fh7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hh7 implements h8 {
    public static final hh7 a = new hh7();
    private static final List b = i.e("node");

    private hh7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh7.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fh7.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (fh7.d) j8.b(j8.c(ih7.a, true)).fromJson(jsonReader, w41Var);
        }
        return new fh7.c(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fh7.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(ih7.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
