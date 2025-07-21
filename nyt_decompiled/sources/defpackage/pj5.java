package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.oj5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class pj5 implements h8 {
    public static final pj5 a = new pj5();
    private static final List b = i.e("renditions");

    private pj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oj5.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.d(rj5.a, false, 1, null))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new oj5.a(list);
        }
        vr.a(jsonReader, "renditions");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, oj5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("renditions");
        j8.a(j8.b(j8.d(rj5.a, false, 1, null))).toJson(lu3Var, w41Var, aVar.a());
    }
}
