package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bz2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hz2 implements h8 {
    public static final hz2 a = new hz2();
    private static final List b = i.o("__typename", "userInterests", "metadata");

    private hz2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bz2.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        bz2.d dVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.d(gz2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                dVar = (bz2.d) j8.d(ez2.a, false, 1, null).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "userInterests");
            throw new KotlinNothingValueException();
        }
        if (dVar != null) {
            return new bz2.g(str, list, dVar);
        }
        vr.a(jsonReader, "metadata");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bz2.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.c());
        lu3Var.name("userInterests");
        j8.a(j8.d(gz2.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.b());
        lu3Var.name("metadata");
        j8.d(ez2.a, false, 1, null).toJson(lu3Var, w41Var, gVar.a());
    }
}
