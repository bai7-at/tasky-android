package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fk5 implements h8 {
    public static final fk5 a = new fk5();
    private static final List b = i.e("personalizedList");

    private fk5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xj5.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xj5.h hVar = null;
        while (jsonReader.l1(b) == 0) {
            hVar = (xj5.h) j8.b(j8.d(ek5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new xj5.i(hVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xj5.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("personalizedList");
        j8.b(j8.d(ek5.a, false, 1, null)).toJson(lu3Var, w41Var, iVar.a());
    }
}
