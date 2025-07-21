package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.m21;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class o21 implements h8 {
    public static final o21 a = new o21();
    private static final List b = i.e("createShareCode");

    private o21() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m21.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        m21.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (m21.b) j8.b(j8.c(n21.a, true)).fromJson(jsonReader, w41Var);
        }
        return new m21.c(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, m21.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("createShareCode");
        j8.b(j8.c(n21.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
