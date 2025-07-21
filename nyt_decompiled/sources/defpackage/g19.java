package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.f19;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class g19 implements h8 {
    public static final g19 a = new g19();
    private static final List b = i.e("user");

    private g19() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f19.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        f19.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (f19.d) j8.b(j8.d(i19.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new f19.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, f19.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(i19.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
