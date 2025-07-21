package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uy0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vy0 implements h8 {
    public static final vy0 a = new vy0();
    private static final List b = i.e("__typename");

    private vy0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uy0.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        mz0 mz0Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Recipe"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            mz0Var = nz0.a.fromJson(jsonReader, w41Var);
        }
        return new uy0.a(str, mz0Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uy0.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        if (aVar.a() != null) {
            nz0.a.toJson(lu3Var, w41Var, aVar.a());
        }
    }
}
