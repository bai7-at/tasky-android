package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kw6;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mw6 implements h8 {
    public static final mw6 a = new mw6();
    private static final List b = i.e("status");

    private mw6() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw6.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new kw6.c(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kw6.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("status");
        j8.i.toJson(lu3Var, w41Var, cVar.a());
    }
}
