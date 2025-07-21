package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bz2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class dz2 implements h8 {
    public static final dz2 a = new dz2();
    private static final List b = i.e("user");

    private dz2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bz2.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bz2.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (bz2.e) j8.b(j8.d(fz2.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new bz2.c(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bz2.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(fz2.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
