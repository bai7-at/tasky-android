package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.pz0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qz0 implements h8 {
    public static final qz0 a = new qz0();
    private static final List b = i.o("id", "promotionalImage");

    private qz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pz0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        pz0.b bVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                bVar = (pz0.b) j8.b(j8.d(sz0.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new pz0(str, bVar);
        }
        vr.a(jsonReader, "id");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, pz0 pz0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(pz0Var, "value");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, pz0Var.a());
        lu3Var.name("promotionalImage");
        j8.b(j8.d(sz0.a, false, 1, null)).toJson(lu3Var, w41Var, pz0Var.b());
    }
}
