package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uh5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vh5 implements h8 {
    public static final vh5 a = new vh5();
    private static final List b = i.e("__typename");

    private vh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uh5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tq4 tq4Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("OnsiteMessagingStaticContentMobileNewsContent"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            tq4Var = yq4.a.fromJson(jsonReader, w41Var);
        }
        return new uh5.b(str, tq4Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uh5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        if (bVar.a() != null) {
            yq4.a.toJson(lu3Var, w41Var, bVar.a());
        }
    }
}
