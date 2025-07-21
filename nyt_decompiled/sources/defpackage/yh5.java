package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uh5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yh5 implements h8 {
    public static final yh5 a = new yh5();
    private static final List b = i.e("units");

    private yh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uh5.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.d(zh5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new uh5.e(list);
        }
        vr.a(jsonReader, "units");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uh5.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("units");
        j8.a(j8.d(zh5.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
    }
}
