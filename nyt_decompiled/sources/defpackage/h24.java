package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.e24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class h24 implements h8 {
    public static final h24 a = new h24();
    private static final List b = i.e("__typename");

    private h24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e24.b fromJson(JsonReader jsonReader, w41 w41Var) {
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
        return new e24.b(str, ap3Var, ip3Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, e24.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.c());
        if (bVar.a() != null) {
            dp3.a.toJson(lu3Var, w41Var, bVar.a());
        }
        if (bVar.b() != null) {
            kp3.a.toJson(lu3Var, w41Var, bVar.b());
        }
    }
}
