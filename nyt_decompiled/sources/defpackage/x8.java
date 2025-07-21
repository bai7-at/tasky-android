package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class x8 implements h8 {
    public static final x8 a = new x8();
    private static final List b = i.e("status");

    private x8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u8.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new u8.d(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u8.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("status");
        j8.i.toJson(lu3Var, w41Var, dVar.a());
    }
}
