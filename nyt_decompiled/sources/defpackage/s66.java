package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.r56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class s66 implements h8 {
    public static final s66 a = new s66();
    private static final List b = i.e("__typename");

    private s66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r56 fromJson(JsonReader jsonReader, w41 w41Var) {
        r56.c cVar;
        r56.e eVar;
        r56.d dVar;
        r56.a aVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        r56.b bVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            cVar = k66.a.fromJson(jsonReader, w41Var);
        } else {
            cVar = null;
        }
        if (xa0.c(xa0.e("Video"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            eVar = m66.a.fromJson(jsonReader, w41Var);
        } else {
            eVar = null;
        }
        if (xa0.c(xa0.e("Slideshow"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            dVar = l66.a.fromJson(jsonReader, w41Var);
        } else {
            dVar = null;
        }
        if (xa0.c(xa0.e("Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            aVar = i66.a.fromJson(jsonReader, w41Var);
        } else {
            aVar = null;
        }
        if (xa0.c(xa0.e("EmbeddedInteractive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bVar = j66.a.fromJson(jsonReader, w41Var);
        }
        return new r56(str, cVar, eVar, dVar, aVar, bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, r56 r56Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(r56Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, r56Var.f());
        if (r56Var.c() != null) {
            k66.a.toJson(lu3Var, w41Var, r56Var.c());
        }
        if (r56Var.e() != null) {
            m66.a.toJson(lu3Var, w41Var, r56Var.e());
        }
        if (r56Var.d() != null) {
            l66.a.toJson(lu3Var, w41Var, r56Var.d());
        }
        if (r56Var.a() != null) {
            i66.a.toJson(lu3Var, w41Var, r56Var.a());
        }
        if (r56Var.b() != null) {
            j66.a.toJson(lu3Var, w41Var, r56Var.b());
        }
    }
}
