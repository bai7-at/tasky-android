package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yn2 implements h8 {
    public static final yn2 a = new yn2();
    private static final List b = i.e("dailyFive");

    private yn2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.c(xn2.a, true)))).fromJson(jsonReader, w41Var);
        }
        return new tn2.f(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("dailyFive");
        j8.b(j8.a(j8.b(j8.c(xn2.a, true)))).toJson(lu3Var, w41Var, fVar.a());
    }
}
