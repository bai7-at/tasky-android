package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ls5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ms5 implements h8 {
    public static final ms5 a = new ms5();
    private static final List b = i.e("lists");

    private ms5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ls5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ls5.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (ls5.d) j8.b(j8.d(os5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new ls5.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ls5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("lists");
        j8.b(j8.d(os5.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
