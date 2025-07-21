package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.t66;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class u66 implements h8 {
    public static final u66 a = new u66();
    private static final List b = i.e("__typename");

    private u66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t66.a fromJson(JsonReader jsonReader, w41 w41Var) {
        n59 n59Var;
        ho3 ho3Var;
        kf3 kf3Var;
        uu7 uu7Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        gz1 gz1Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Video"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            n59Var = a69.a.fromJson(jsonReader, w41Var);
        } else {
            n59Var = null;
        }
        if (xa0.c(xa0.e("Interactive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ho3Var = oo3.a.fromJson(jsonReader, w41Var);
        } else {
            ho3Var = null;
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            kf3Var = of3.a.fromJson(jsonReader, w41Var);
        } else {
            kf3Var = null;
        }
        if (xa0.c(xa0.e("Slideshow"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            uu7Var = gv7.a.fromJson(jsonReader, w41Var);
        } else {
            uu7Var = null;
        }
        if (xa0.c(xa0.e("EmbeddedInteractive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            gz1Var = hz1.a.fromJson(jsonReader, w41Var);
        }
        return new t66.a(str, n59Var, ho3Var, kf3Var, uu7Var, gz1Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, t66.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.f());
        if (aVar.e() != null) {
            a69.a.toJson(lu3Var, w41Var, aVar.e());
        }
        if (aVar.c() != null) {
            oo3.a.toJson(lu3Var, w41Var, aVar.c());
        }
        if (aVar.b() != null) {
            of3.a.toJson(lu3Var, w41Var, aVar.b());
        }
        if (aVar.d() != null) {
            gv7.a.toJson(lu3Var, w41Var, aVar.d());
        }
        if (aVar.a() != null) {
            hz1.a.toJson(lu3Var, w41Var, aVar.a());
        }
    }
}
