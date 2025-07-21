package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class rv2 implements h8 {
    public static final rv2 a = new rv2();
    private static final List b = i.e("__typename");

    private rv2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qv2 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ov2 ov2Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Promo"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ov2Var = pv2.a.fromJson(jsonReader, w41Var);
        }
        return new qv2(str, ov2Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, qv2 qv2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(qv2Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, qv2Var.b());
        if (qv2Var.a() != null) {
            pv2.a.toJson(lu3Var, w41Var, qv2Var.a());
        }
    }
}
