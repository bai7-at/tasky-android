package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nx2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class tx2 implements h8 {
    public static final tx2 a = new tx2();
    private static final List b = i.e("__typename");

    private tx2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx2.g fromJson(JsonReader jsonReader, w41 w41Var) {
        gp gpVar;
        n59 n59Var;
        ho3 ho3Var;
        kf3 kf3Var;
        uu7 uu7Var;
        g56 g56Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        wb2 wb2Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            gpVar = jp.a.fromJson(jsonReader, w41Var);
        } else {
            gpVar = null;
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
        if (xa0.c(xa0.e("Promo"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            g56Var = h56.a.fromJson(jsonReader, w41Var);
        } else {
            g56Var = null;
        }
        if (xa0.c(xa0.e("FeedPublication"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            wb2Var = cc2.a.fromJson(jsonReader, w41Var);
        }
        return new nx2.g(str, gpVar, n59Var, ho3Var, kf3Var, uu7Var, g56Var, wb2Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nx2.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.h());
        if (gVar.a() != null) {
            jp.a.toJson(lu3Var, w41Var, gVar.a());
        }
        if (gVar.g() != null) {
            a69.a.toJson(lu3Var, w41Var, gVar.g());
        }
        if (gVar.d() != null) {
            oo3.a.toJson(lu3Var, w41Var, gVar.d());
        }
        if (gVar.c() != null) {
            of3.a.toJson(lu3Var, w41Var, gVar.c());
        }
        if (gVar.f() != null) {
            gv7.a.toJson(lu3Var, w41Var, gVar.f());
        }
        if (gVar.e() != null) {
            h56.a.toJson(lu3Var, w41Var, gVar.e());
        }
        if (gVar.b() != null) {
            cc2.a.toJson(lu3Var, w41Var, gVar.b());
        }
    }
}
