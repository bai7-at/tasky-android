package defpackage;

import com.apollographql.apollo.api.json.JsonReader;

/* loaded from: classes2.dex */
public final class ya5 implements h8 {
    private final h8 a;

    public ya5(h8 h8Var) {
        zq3.h(h8Var, "wrappedAdapter");
        this.a = h8Var;
        if (h8Var instanceof ya5) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    @Override // defpackage.h8
    public Object fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return this.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.skipValue();
        return null;
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        if (obj == null) {
            lu3Var.p1();
        } else {
            this.a.toJson(lu3Var, w41Var, obj);
        }
    }
}
