package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fg7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gg7 implements h8 {
    public static final gg7 a = new gg7();
    private static final List b = i.e("lists");

    private gg7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fg7.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fg7.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (fg7.d) j8.b(j8.d(ig7.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new fg7.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fg7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("lists");
        j8.b(j8.d(ig7.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
