package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.hj3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class jj3 implements h8 {
    public static final jj3 a = new jj3();
    private static final List b = i.e("__typename");

    private jj3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hj3.a fromJson(JsonReader jsonReader, w41 w41Var) {
        kq kqVar;
        to3 to3Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        d63 d63Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            kqVar = lq.a.fromJson(jsonReader, w41Var);
        } else {
            kqVar = null;
        }
        if (xa0.c(xa0.e("Interactive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            to3Var = wo3.a.fromJson(jsonReader, w41Var);
        } else {
            to3Var = null;
        }
        if (xa0.c(xa0.e("Guide"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            d63Var = e63.a.fromJson(jsonReader, w41Var);
        }
        return new hj3.a(str, kqVar, to3Var, d63Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, hj3.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.d());
        if (aVar.a() != null) {
            lq.a.toJson(lu3Var, w41Var, aVar.a());
        }
        if (aVar.c() != null) {
            wo3.a.toJson(lu3Var, w41Var, aVar.c());
        }
        if (aVar.b() != null) {
            e63.a.toJson(lu3Var, w41Var, aVar.b());
        }
    }
}
