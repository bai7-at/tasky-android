package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bz2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cz2 implements h8 {
    public static final cz2 a = new cz2();
    private static final List b = i.e("__typename");

    private cz2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bz2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        wo0 wo0Var;
        kr7 kr7Var;
        u55 u55Var;
        jk2 jk2Var;
        yf2 yf2Var;
        ma0 ma0Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        x55 x55Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("ColumnInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            wo0Var = xo0.a.fromJson(jsonReader, w41Var);
        } else {
            wo0Var = null;
        }
        if (xa0.c(xa0.e("ShuffleInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            kr7Var = or7.a.fromJson(jsonReader, w41Var);
        } else {
            kr7Var = null;
        }
        if (xa0.c(xa0.e("NewsletterInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            u55Var = w55.a.fromJson(jsonReader, w41Var);
        } else {
            u55Var = null;
        }
        if (xa0.c(xa0.e("FlashbackQuizInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            jk2Var = lk2.a.fromJson(jsonReader, w41Var);
        } else {
            jk2Var = null;
        }
        if (xa0.c(xa0.e("FilterInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            yf2Var = ig2.a.fromJson(jsonReader, w41Var);
        } else {
            yf2Var = null;
        }
        if (xa0.c(xa0.e("BooksInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            ma0Var = oa0.a.fromJson(jsonReader, w41Var);
        } else {
            ma0Var = null;
        }
        if (xa0.c(xa0.e("NewsQuizInterest"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            x55Var = a65.a.fromJson(jsonReader, w41Var);
        }
        return new bz2.b(str, wo0Var, kr7Var, u55Var, jk2Var, yf2Var, ma0Var, x55Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bz2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.h());
        if (bVar.b() != null) {
            xo0.a.toJson(lu3Var, w41Var, bVar.b());
        }
        if (bVar.g() != null) {
            or7.a.toJson(lu3Var, w41Var, bVar.g());
        }
        if (bVar.e() != null) {
            w55.a.toJson(lu3Var, w41Var, bVar.e());
        }
        if (bVar.d() != null) {
            lk2.a.toJson(lu3Var, w41Var, bVar.d());
        }
        if (bVar.c() != null) {
            ig2.a.toJson(lu3Var, w41Var, bVar.c());
        }
        if (bVar.a() != null) {
            oa0.a.toJson(lu3Var, w41Var, bVar.a());
        }
        if (bVar.f() != null) {
            a65.a.toJson(lu3Var, w41Var, bVar.f());
        }
    }
}
