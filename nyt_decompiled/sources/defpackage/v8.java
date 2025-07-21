package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v8 implements h8 {
    public static final v8 a = new v8();
    private static final List b = i.e("item");

    private v8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u8.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        u8.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (u8.d) j8.b(j8.d(x8.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new u8.a(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u8.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("item");
        j8.b(j8.d(x8.a, false, 1, null)).toJson(lu3Var, w41Var, aVar.a());
    }
}
