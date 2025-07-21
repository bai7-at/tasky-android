package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tq4;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class br4 implements h8 {
    public static final br4 a = new br4();
    private static final List b = i.o("next", "canSkip");

    private br4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tq4.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new tq4.g(str, bool);
                }
                bool = (Boolean) j8.l.fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tq4.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("next");
        j8.i.toJson(lu3Var, w41Var, gVar.b());
        lu3Var.name("canSkip");
        j8.l.toJson(lu3Var, w41Var, gVar.a());
    }
}
