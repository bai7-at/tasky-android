package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ls5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class os5 implements h8 {
    public static final os5 a = new os5();
    private static final List b = i.o("__typename", "personalizedList");

    private os5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ls5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        ls5.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                gVar = (ls5.g) j8.b(j8.d(rs5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new ls5.d(str, gVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ls5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("personalizedList");
        j8.b(j8.d(rs5.a, false, 1, null)).toJson(lu3Var, w41Var, dVar.a());
    }
}
