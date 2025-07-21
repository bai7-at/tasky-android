package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xz2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class c03 implements h8 {
    public static final c03 a = new c03();
    private static final List b = i.o("__typename", "giftHistory");

    private c03() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xz2.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        xz2.e eVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                eVar = (xz2.e) j8.b(j8.d(b03.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new xz2.f(str, eVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xz2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("giftHistory");
        j8.b(j8.d(b03.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.a());
    }
}
