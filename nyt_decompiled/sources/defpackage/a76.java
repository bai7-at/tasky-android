package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.w66;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class a76 implements h8 {
    public static final a76 a = new a76();
    private static final List b = i.e("promotionalImage");

    private a76() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w66 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        w66.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (w66.c) j8.b(j8.d(z66.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new w66(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, w66 w66Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(w66Var, "value");
        lu3Var.name("promotionalImage");
        j8.b(j8.d(z66.a, false, 1, null)).toJson(lu3Var, w41Var, w66Var.a());
    }
}
