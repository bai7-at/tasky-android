package defpackage;

import com.apollographql.apollo.api.json.JsonReader;

/* loaded from: classes4.dex */
public final class i09 implements h8 {
    public static final i09 a = new i09();

    private i09() {
    }

    public h09 a(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    public void b(lu3 lu3Var, w41 w41Var, h09 h09Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(h09Var, "value");
        lu3Var.name("token");
        h8 h8Var = j8.a;
        throw null;
    }

    @Override // defpackage.h8
    public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, w41 w41Var) {
        a(jsonReader, w41Var);
        return null;
    }

    @Override // defpackage.h8
    public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
        lh4.a(obj);
        b(lu3Var, w41Var, null);
    }
}
