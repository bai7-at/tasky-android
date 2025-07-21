package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kr7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class nr7 implements h8 {
    public static final nr7 a = new nr7();
    private static final List b = i.e("__typename");

    private nr7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kr7.c fromJson(JsonReader jsonReader, w41 w41Var) {
        ap3 ap3Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ip3 ip3Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ap3Var = dp3.a.fromJson(jsonReader, w41Var);
        } else {
            ap3Var = null;
        }
        if (xa0.c(xa0.e("Interactive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ip3Var = kp3.a.fromJson(jsonReader, w41Var);
        }
        return new kr7.c(str, ap3Var, ip3Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kr7.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.c());
        if (cVar.a() != null) {
            dp3.a.toJson(lu3Var, w41Var, cVar.a());
        }
        if (cVar.b() != null) {
            kp3.a.toJson(lu3Var, w41Var, cVar.b());
        }
    }
}
