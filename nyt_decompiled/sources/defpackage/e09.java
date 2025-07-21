package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class e09 implements h8 {
    public static final e09 a = new e09();
    private static final List b = i.e("games");

    private e09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yz8.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (yz8.e) j8.b(j8.d(c09.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new yz8.g(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("games");
        j8.b(j8.d(c09.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.a());
    }
}
