package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.zi;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bj implements h8 {
    public static final bj a = new bj();
    private static final List b = i.e("anyWorks");

    private bj() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zi.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.c(aj.a, true))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new zi.c(list);
        }
        vr.a(jsonReader, "anyWorks");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, zi.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("anyWorks");
        j8.a(j8.b(j8.c(aj.a, true))).toJson(lu3Var, w41Var, cVar.a());
    }
}
