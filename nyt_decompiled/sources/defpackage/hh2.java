package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xg2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hh2 implements h8 {
    public static final hh2 a = new hh2();
    private static final List b = i.e("__typename");

    private hh2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg2.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        sg2 sg2Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            sg2Var = vg2.a.fromJson(jsonReader, w41Var);
        }
        return new xg2.i(str, sg2Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xg2.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, iVar.b());
        if (iVar.a() != null) {
            vg2.a.toJson(lu3Var, w41Var, iVar.a());
        }
    }
}
