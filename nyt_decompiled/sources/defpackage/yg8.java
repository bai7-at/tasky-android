package defpackage;

import com.apollographql.apollo.api.json.JsonReader;

/* loaded from: classes4.dex */
public final class yg8 implements h8 {
    public static final yg8 a = new yg8();

    private yg8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg8 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xg8 xg8Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(xg8Var, "value");
        lu3Var.name("tcString");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, xg8Var.b());
        lu3Var.name("noticeVersion");
        h8Var.toJson(lu3Var, w41Var, xg8Var.a());
    }
}
