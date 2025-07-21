package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class xp implements h8 {
    public static final xp a = new xp();
    private static final List b = i.e("crops");

    private xp() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.d(vp.a, false, 1, null))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new tp.c(list);
        }
        vr.a(jsonReader, "crops");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tp.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(vp.a, false, 1, null))).toJson(lu3Var, w41Var, cVar.a());
    }
}
