package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.sd8;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wd8 implements h8 {
    public static final wd8 a = new wd8();
    private static final List b = i.e("containers");

    private wd8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public sd8.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.c(ud8.a, true))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new sd8.e(list);
        }
        vr.a(jsonReader, "containers");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, sd8.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("containers");
        j8.a(j8.b(j8.c(ud8.a, true))).toJson(lu3Var, w41Var, eVar.a());
    }
}
