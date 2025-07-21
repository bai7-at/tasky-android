package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class w24 implements h8 {
    public static final w24 a = new w24();
    private static final List b = i.e("stream");

    private w24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u24 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        u24.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (u24.c) j8.b(j8.d(y24.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new u24(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u24 u24Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(u24Var, "value");
        lu3Var.name("stream");
        j8.b(j8.d(y24.a, false, 1, null)).toJson(lu3Var, w41Var, u24Var.a());
    }
}
