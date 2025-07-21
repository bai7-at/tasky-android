package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.d65;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class g65 implements h8 {
    public static final g65 a = new g65();
    private static final List b = i.e("newsletters");

    private g65() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d65.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.d(f65.a, false, 1, null))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new d65.d(list);
        }
        vr.a(jsonReader, "newsletters");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d65.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("newsletters");
        j8.a(j8.b(j8.d(f65.a, false, 1, null))).toJson(lu3Var, w41Var, dVar.a());
    }
}
