package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.d24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class l24 implements h8 {
    public static final l24 a = new l24();
    private static final List b = i.e("renderedRepresentation");

    private l24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d24.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new d24.c(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d24.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("renderedRepresentation");
        j8.i.toJson(lu3Var, w41Var, cVar.a());
    }
}
