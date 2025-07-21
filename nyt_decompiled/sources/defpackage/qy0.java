package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ly0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qy0 implements h8 {
    public static final qy0 a = new qy0();
    private static final List b = i.o("id", "groupings");

    private qy0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ly0.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = j8.a(j8.b(j8.d(py0.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new ly0.f(str, list);
        }
        vr.a(jsonReader, "groupings");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ly0.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("groupings");
        j8.a(j8.b(j8.d(py0.a, false, 1, null))).toJson(lu3Var, w41Var, fVar.a());
    }
}
