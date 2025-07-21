package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cu2 implements h8 {
    public static final cu2 a = new cu2();
    private static final List b = i.e("edges");

    private cu2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(iu2.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new bu2.a(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(iu2.a, false, 1, null)))).toJson(lu3Var, w41Var, aVar.a());
    }
}
