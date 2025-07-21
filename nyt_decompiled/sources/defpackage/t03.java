package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q03;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class t03 implements h8 {
    public static final t03 a = new t03();
    private static final List b = i.o("__typename", "giftHistory");

    private t03() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q03.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        q03.c cVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                cVar = (q03.c) j8.b(j8.d(s03.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new q03.d(str, cVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q03.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("giftHistory");
        j8.b(j8.d(s03.a, false, 1, null)).toJson(lu3Var, w41Var, dVar.a());
    }
}
