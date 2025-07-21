package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nk5;

/* loaded from: classes2.dex */
public final class wj implements h8 {
    private final h8 a;

    public wj(h8 h8Var) {
        zq3.h(h8Var, "wrappedAdapter");
        this.a = h8Var;
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nk5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return new nk5.c(this.a.fromJson(jsonReader, w41Var));
        }
        jsonReader.skipValue();
        return nk5.a.b;
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nk5 nk5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(nk5Var, "value");
        if (nk5Var instanceof nk5.c) {
            this.a.toJson(lu3Var, w41Var, ((nk5.c) nk5Var).a());
        } else {
            lu3Var.p1();
        }
    }
}
