package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class d66 implements h8 {
    public static final d66 a = new d66();
    private static final List b = i.e("__typename");

    private d66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        e31 e31Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            e31Var = g31.a.fromJson(jsonReader, w41Var);
        }
        return new s56.k(str, e31Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, kVar.b());
        if (kVar.a() != null) {
            g31.a.toJson(lu3Var, w41Var, kVar.a());
        }
    }
}
