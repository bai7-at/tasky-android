package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.er1;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ir1 implements h8 {
    public static final ir1 a = new ir1();
    private static final List b = i.e("__typename");

    private ir1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public er1.c fromJson(JsonReader jsonReader, w41 w41Var) {
        gp gpVar;
        n59 n59Var;
        ho3 ho3Var;
        kf3 kf3Var;
        uu7 uu7Var;
        lv lvVar;
        wb2 wb2Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        g56 g56Var = null;
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
        if (xa0.c(xa0.e("Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            lvVar = ov.a.fromJson(jsonReader, w41Var);
        } else {
            lvVar = null;
        }
        if (xa0.c(xa0.e("FeedPublication"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            wb2Var = cc2.a.fromJson(jsonReader, w41Var);
        } else {
            wb2Var = null;
        }
        if (xa0.c(xa0.e("Promo"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            g56Var = h56.a.fromJson(jsonReader, w41Var);
        }
        return new er1.c(str, gpVar, n59Var, ho3Var, kf3Var, uu7Var, lvVar, wb2Var, g56Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, er1.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.i());
        if (cVar.a() != null) {
            jp.a.toJson(lu3Var, w41Var, cVar.a());
        }
        if (cVar.h() != null) {
            a69.a.toJson(lu3Var, w41Var, cVar.h());
        }
        if (cVar.e() != null) {
            oo3.a.toJson(lu3Var, w41Var, cVar.e());
        }
        if (cVar.d() != null) {
            of3.a.toJson(lu3Var, w41Var, cVar.d());
        }
        if (cVar.g() != null) {
            gv7.a.toJson(lu3Var, w41Var, cVar.g());
        }
        if (cVar.b() != null) {
            ov.a.toJson(lu3Var, w41Var, cVar.b());
        }
        if (cVar.c() != null) {
            cc2.a.toJson(lu3Var, w41Var, cVar.c());
        }
        if (cVar.f() != null) {
            h56.a.toJson(lu3Var, w41Var, cVar.f());
        }
    }
}
