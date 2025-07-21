package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.t66;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v66 implements h8 {
    public static final v66 a = new v66();
    private static final List b = i.e("promotionalMedia");

    private v66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t66 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        t66.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (t66.a) j8.b(j8.c(u66.a, true)).fromJson(jsonReader, w41Var);
        }
        return new t66(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, t66 t66Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(t66Var, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(u66.a, true)).toJson(lu3Var, w41Var, t66Var.a());
    }
}
