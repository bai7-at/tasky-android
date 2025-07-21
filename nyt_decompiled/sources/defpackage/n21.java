package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.m21;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class n21 implements h8 {
    public static final n21 a = new n21();
    private static final List b = i.e("__typename");

    private n21() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m21.b fromJson(JsonReader jsonReader, w41 w41Var) {
        mf5 mf5Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        pf5 pf5Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("ShareCodeData"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            mf5Var = of5.a.fromJson(jsonReader, w41Var);
        } else {
            mf5Var = null;
        }
        if (xa0.c(xa0.e("ShareCodeError"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            pf5Var = qf5.a.fromJson(jsonReader, w41Var);
        }
        return new m21.b(str, mf5Var, pf5Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, m21.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.c());
        if (bVar.a() != null) {
            of5.a.toJson(lu3Var, w41Var, bVar.a());
        }
        if (bVar.b() != null) {
            qf5.a.toJson(lu3Var, w41Var, bVar.b());
        }
    }
}
