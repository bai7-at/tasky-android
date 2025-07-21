package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xg2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zg2 implements h8 {
    public static final zg2 a = new zg2();
    private static final List b = i.o("__typename", "podcastCollection");

    private zg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg2.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        xg2.f fVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                fVar = (xg2.f) j8.b(j8.d(eh2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new xg2.a(str, fVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xg2.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("podcastCollection");
        j8.b(j8.d(eh2.a, false, 1, null)).toJson(lu3Var, w41Var, aVar.a());
    }
}
