package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wb2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ec2 implements h8 {
    public static final ec2 a = new ec2();
    private static final List b = i.e("__typename");

    private ec2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wb2.g fromJson(JsonReader jsonReader, w41 w41Var) {
        n59 n59Var;
        kf3 kf3Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uu7 uu7Var = null;
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
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            kf3Var = of3.a.fromJson(jsonReader, w41Var);
        } else {
            kf3Var = null;
        }
        if (xa0.c(xa0.e("Slideshow"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            uu7Var = gv7.a.fromJson(jsonReader, w41Var);
        }
        return new wb2.g(str, n59Var, kf3Var, uu7Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wb2.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.d());
        if (gVar.c() != null) {
            a69.a.toJson(lu3Var, w41Var, gVar.c());
        }
        if (gVar.a() != null) {
            of3.a.toJson(lu3Var, w41Var, gVar.a());
        }
        if (gVar.b() != null) {
            gv7.a.toJson(lu3Var, w41Var, gVar.b());
        }
    }
}
