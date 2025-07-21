package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.vi;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wi implements h8 {
    public static final wi a = new wi();
    private static final List b = i.e("__typename");

    private wi() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public vi.a fromJson(JsonReader jsonReader, w41 w41Var) {
        tp tpVar;
        n59 n59Var;
        ho3 ho3Var;
        d24 d24Var;
        kf3 kf3Var;
        uu7 uu7Var;
        lv lvVar;
        wb2 wb2Var;
        pu puVar;
        bi0 bi0Var;
        dt6 dt6Var;
        ci9 ci9Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uu uuVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            tpVar = up.a.fromJson(jsonReader, w41Var);
        } else {
            tpVar = null;
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
        if (xa0.c(xa0.e("LegacyCollection"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            d24Var = p24.a.fromJson(jsonReader, w41Var);
        } else {
            d24Var = null;
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
        if (xa0.c(xa0.e("AthleticArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            puVar = qu.a.fromJson(jsonReader, w41Var);
        } else {
            puVar = null;
        }
        if (xa0.c(xa0.e("CardDeck"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bi0Var = ci0.a.fromJson(jsonReader, w41Var);
        } else {
            bi0Var = null;
        }
        bi0 bi0Var2 = bi0Var;
        if (xa0.c(xa0.e("Recipe"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            dt6Var = et6.a.fromJson(jsonReader, w41Var);
        } else {
            dt6Var = null;
        }
        dt6 dt6Var2 = dt6Var;
        if (xa0.c(xa0.e("WirecutterArticle"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ci9Var = di9.a.fromJson(jsonReader, w41Var);
        } else {
            ci9Var = null;
        }
        if (xa0.c(xa0.e("AthleticLiveBlog"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            uuVar = vu.a.fromJson(jsonReader, w41Var);
        }
        return new vi.a(str, tpVar, n59Var, ho3Var, d24Var, kf3Var, uu7Var, lvVar, wb2Var, puVar, bi0Var2, dt6Var2, ci9Var, uuVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, vi.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.n());
        if (aVar.a() != null) {
            up.a.toJson(lu3Var, w41Var, aVar.a());
        }
        if (aVar.l() != null) {
            a69.a.toJson(lu3Var, w41Var, aVar.l());
        }
        if (aVar.h() != null) {
            oo3.a.toJson(lu3Var, w41Var, aVar.h());
        }
        if (aVar.i() != null) {
            p24.a.toJson(lu3Var, w41Var, aVar.i());
        }
        if (aVar.g() != null) {
            of3.a.toJson(lu3Var, w41Var, aVar.g());
        }
        if (aVar.k() != null) {
            gv7.a.toJson(lu3Var, w41Var, aVar.k());
        }
        if (aVar.d() != null) {
            ov.a.toJson(lu3Var, w41Var, aVar.d());
        }
        if (aVar.f() != null) {
            cc2.a.toJson(lu3Var, w41Var, aVar.f());
        }
        if (aVar.b() != null) {
            qu.a.toJson(lu3Var, w41Var, aVar.b());
        }
        if (aVar.e() != null) {
            ci0.a.toJson(lu3Var, w41Var, aVar.e());
        }
        if (aVar.j() != null) {
            et6.a.toJson(lu3Var, w41Var, aVar.j());
        }
        if (aVar.m() != null) {
            di9.a.toJson(lu3Var, w41Var, aVar.m());
        }
        if (aVar.c() != null) {
            vu.a.toJson(lu3Var, w41Var, aVar.c());
        }
    }
}
