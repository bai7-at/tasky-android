package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.m56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class p56 implements h8 {
    public static final p56 a = new p56();
    private static final List b = i.e("__typename");

    private p56() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m56 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        m56.b bVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bVar = o56.a.fromJson(jsonReader, w41Var);
        }
        return new m56(str, bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, m56 m56Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(m56Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, m56Var.b());
        if (m56Var.a() != null) {
            o56.a.toJson(lu3Var, w41Var, m56Var.a());
        }
    }
}
