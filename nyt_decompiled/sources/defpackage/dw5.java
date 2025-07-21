package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aw5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class dw5 implements h8 {
    public static final dw5 a = new dw5();
    private static final List b = i.e("__typename");

    private dw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aw5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        aw5.e eVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Podcast"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            eVar = ew5.a.fromJson(jsonReader, w41Var);
        }
        return new aw5.d(str, eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aw5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.b());
        if (dVar.a() != null) {
            ew5.a.toJson(lu3Var, w41Var, dVar.a());
        }
    }
}
