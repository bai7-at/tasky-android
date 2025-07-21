package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.f19;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class h19 implements h8 {
    public static final h19 a = new h19();
    private static final List b = i.e("__typename");

    private h19() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f19.c fromJson(JsonReader jsonReader, w41 w41Var) {
        sg5 sg5Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        vg5 vg5Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("UserStateData"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            sg5Var = ug5.a.fromJson(jsonReader, w41Var);
        } else {
            sg5Var = null;
        }
        if (xa0.c(xa0.e("UserStateError"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            vg5Var = wg5.a.fromJson(jsonReader, w41Var);
        }
        return new f19.c(str, sg5Var, vg5Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, f19.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.c());
        if (cVar.a() != null) {
            ug5.a.toJson(lu3Var, w41Var, cVar.a());
        }
        if (cVar.b() != null) {
            wg5.a.toJson(lu3Var, w41Var, cVar.b());
        }
    }
}
