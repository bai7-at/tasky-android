package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class w8 implements h8 {
    public static final w8 a = new w8();
    private static final List b = i.e("addToReadingList");

    private w8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u8.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        u8.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (u8.a) j8.b(j8.d(v8.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new u8.c(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u8.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("addToReadingList");
        j8.b(j8.d(v8.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
