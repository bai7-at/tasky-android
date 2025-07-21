package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.dg3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gg3 implements h8 {
    public static final gg3 a = new gg3();
    private static final List b = i.e("promotionalImage");

    private gg3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dg3 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        dg3.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (dg3.c) j8.b(j8.d(hg3.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new dg3(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, dg3 dg3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dg3Var, "value");
        lu3Var.name("promotionalImage");
        j8.b(j8.d(hg3.a, false, 1, null)).toJson(lu3Var, w41Var, dg3Var.a());
    }
}
