package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class f66 implements h8 {
    public static final f66 a = new f66();
    private static final List b = i.e("__typename");

    private f66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56 fromJson(JsonReader jsonReader, w41 w41Var) {
        s56.d dVar;
        s56.g gVar;
        s56.f fVar;
        s56.b bVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        s56.c cVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            dVar = w56.a.fromJson(jsonReader, w41Var);
        } else {
            dVar = null;
        }
        if (xa0.c(xa0.e("Video"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            gVar = z56.a.fromJson(jsonReader, w41Var);
        } else {
            gVar = null;
        }
        if (xa0.c(xa0.e("Slideshow"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            fVar = y56.a.fromJson(jsonReader, w41Var);
        } else {
            fVar = null;
        }
        if (xa0.c(xa0.e("Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bVar = u56.a.fromJson(jsonReader, w41Var);
        } else {
            bVar = null;
        }
        if (xa0.c(xa0.e("EmbeddedInteractive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            cVar = v56.a.fromJson(jsonReader, w41Var);
        }
        return new s56(str, dVar, gVar, fVar, bVar, cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56 s56Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(s56Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, s56Var.f());
        if (s56Var.c() != null) {
            w56.a.toJson(lu3Var, w41Var, s56Var.c());
        }
        if (s56Var.e() != null) {
            z56.a.toJson(lu3Var, w41Var, s56Var.e());
        }
        if (s56Var.d() != null) {
            y56.a.toJson(lu3Var, w41Var, s56Var.d());
        }
        if (s56Var.a() != null) {
            u56.a.toJson(lu3Var, w41Var, s56Var.a());
        }
        if (s56Var.b() != null) {
            v56.a.toJson(lu3Var, w41Var, s56Var.b());
        }
    }
}
