package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uh5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wh5 implements h8 {
    public static final wh5 a = new wh5();
    private static final List b = i.e("onsiteMessaging");

    private wh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uh5.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uh5.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (uh5.e) j8.b(j8.d(yh5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new uh5.c(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uh5.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("onsiteMessaging");
        j8.b(j8.d(yh5.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
