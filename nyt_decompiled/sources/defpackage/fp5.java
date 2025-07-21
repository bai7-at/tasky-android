package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.c;

/* loaded from: classes2.dex */
public final class fp5 implements h8 {
    @Override // defpackage.h8
    public Object fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        if (jsonReader instanceof c) {
            return ((c) jsonReader).s();
        }
        throw new IllegalStateException("UnsafeAdapter only supports MapJsonReader");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        if (!(lu3Var instanceof qe4)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonWriter");
        }
        ((qe4) lu3Var).r(obj);
    }
}
