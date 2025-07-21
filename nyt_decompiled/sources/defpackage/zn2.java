package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zn2 implements h8 {
    public static final zn2 a = new zn2();
    private static final List b = i.e("__typename");

    private zn2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        qv2 qv2Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image", "Video", "Interactive", "Slideshow", "EmbeddedInteractive", "Article", "Promo", "Audio"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            qv2Var = rv2.a.fromJson(jsonReader, w41Var);
        }
        return new tn2.g(str, qv2Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.b());
        if (gVar.a() != null) {
            rv2.a.toJson(lu3Var, w41Var, gVar.a());
        }
    }
}
