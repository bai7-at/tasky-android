package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class pw5 implements h8 {
    public static final pw5 a = new pw5();
    private static final List b = i.e("__typename");

    private pw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        lw5.f fVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Podcast"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            fVar = qw5.a.fromJson(jsonReader, w41Var);
        }
        return new lw5.e(str, fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.b());
        if (eVar.a() != null) {
            qw5.a.toJson(lu3Var, w41Var, eVar.a());
        }
    }
}
