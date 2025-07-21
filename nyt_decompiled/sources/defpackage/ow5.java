package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ow5 implements h8 {
    public static final ow5 a = new ow5();
    private static final List b = i.e("__typename");

    private ow5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        g22 g22Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            g22Var = l22.a.fromJson(jsonReader, w41Var);
        }
        return new lw5.d(str, g22Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.b());
        if (dVar.a() != null) {
            l22.a.toJson(lu3Var, w41Var, dVar.a());
        }
    }
}
