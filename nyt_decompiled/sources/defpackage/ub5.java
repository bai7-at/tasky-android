package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.c;

/* loaded from: classes2.dex */
public final class ub5 implements h8 {
    private final h8 a;
    private final boolean b;

    public ub5(h8 h8Var, boolean z) {
        zq3.h(h8Var, "wrappedAdapter");
        this.a = h8Var;
        this.b = z;
    }

    @Override // defpackage.h8
    public Object fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        if (this.b) {
            jsonReader = c.j.a(jsonReader);
        }
        jsonReader.beginObject();
        Object fromJson = this.a.fromJson(jsonReader, w41Var);
        jsonReader.endObject();
        return fromJson;
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        if (!this.b || (lu3Var instanceof qe4)) {
            lu3Var.beginObject();
            this.a.toJson(lu3Var, w41Var, obj);
            lu3Var.endObject();
            return;
        }
        qe4 qe4Var = new qe4();
        qe4Var.beginObject();
        this.a.toJson(qe4Var, w41Var, obj);
        qe4Var.endObject();
        Object d = qe4Var.d();
        zq3.e(d);
        k.a(lu3Var, d);
    }
}
