package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.gp;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class pp implements h8 {
    public static final pp a = new pp();
    private static final List b = i.e("__typename");

    private pp() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public gp.h fromJson(JsonReader jsonReader, w41 w41Var) {
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
        return new gp.h(str, n59Var, ho3Var, kf3Var, uu7Var, gz1Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, gp.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.f());
        if (hVar.e() != null) {
            a69.a.toJson(lu3Var, w41Var, hVar.e());
        }
        if (hVar.c() != null) {
            oo3.a.toJson(lu3Var, w41Var, hVar.c());
        }
        if (hVar.b() != null) {
            of3.a.toJson(lu3Var, w41Var, hVar.b());
        }
        if (hVar.d() != null) {
            gv7.a.toJson(lu3Var, w41Var, hVar.d());
        }
        if (hVar.a() != null) {
            hz1.a.toJson(lu3Var, w41Var, hVar.a());
        }
    }
}
