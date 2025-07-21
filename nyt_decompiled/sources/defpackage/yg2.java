package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xg2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yg2 implements h8 {
    public static final yg2 a = new yg2();
    private static final List b = i.e("__typename");

    private yg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg2 fromJson(JsonReader jsonReader, w41 w41Var) {
        xg2.c cVar;
        xg2.e eVar;
        xg2.d dVar;
        xg2.a aVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xg2.b bVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            cVar = bh2.a.fromJson(jsonReader, w41Var);
        } else {
            cVar = null;
        }
        if (xa0.c(xa0.e("Video"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            eVar = dh2.a.fromJson(jsonReader, w41Var);
        } else {
            eVar = null;
        }
        if (xa0.c(xa0.e("Slideshow"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            dVar = ch2.a.fromJson(jsonReader, w41Var);
        } else {
            dVar = null;
        }
        if (xa0.c(xa0.e("Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            aVar = zg2.a.fromJson(jsonReader, w41Var);
        } else {
            aVar = null;
        }
        if (xa0.c(xa0.e("EmbeddedInteractive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bVar = ah2.a.fromJson(jsonReader, w41Var);
        }
        return new xg2(str, cVar, eVar, dVar, aVar, bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xg2 xg2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(xg2Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, xg2Var.f());
        if (xg2Var.c() != null) {
            bh2.a.toJson(lu3Var, w41Var, xg2Var.c());
        }
        if (xg2Var.e() != null) {
            dh2.a.toJson(lu3Var, w41Var, xg2Var.e());
        }
        if (xg2Var.d() != null) {
            ch2.a.toJson(lu3Var, w41Var, xg2Var.d());
        }
        if (xg2Var.a() != null) {
            zg2.a.toJson(lu3Var, w41Var, xg2Var.a());
        }
        if (xg2Var.b() != null) {
            ah2.a.toJson(lu3Var, w41Var, xg2Var.b());
        }
    }
}
