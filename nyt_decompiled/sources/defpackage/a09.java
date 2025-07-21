package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class a09 implements h8 {
    public static final a09 a = new a09();
    private static final List b = i.e("user");

    private a09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yz8.i iVar = null;
        while (jsonReader.l1(b) == 0) {
            iVar = (yz8.i) j8.b(j8.d(g09.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new yz8.c(iVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(g09.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
