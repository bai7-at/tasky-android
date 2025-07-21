package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class dg2 implements h8 {
    public static final dg2 a = new dg2();
    private static final List b = i.o("__typename", "aggregate", "childCollections");

    private dg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        List list2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.d(zf2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list2 = j8.a(j8.d(cg2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "aggregate");
            throw new KotlinNothingValueException();
        }
        if (list2 != null) {
            return new yf2.e(str, list, list2);
        }
        vr.a(jsonReader, "childCollections");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.c());
        lu3Var.name("aggregate");
        j8.a(j8.d(zf2.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
        lu3Var.name("childCollections");
        j8.a(j8.d(cg2.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.b());
    }
}
