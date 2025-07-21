package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class c09 implements h8 {
    public static final c09 a = new c09();
    private static final List b = i.e("avatar");

    private c09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yz8.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (yz8.a) j8.b(j8.d(zz8.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new yz8.e(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("avatar");
        j8.b(j8.d(zz8.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
    }
}
