package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.b73;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class e73 implements h8 {
    public static final e73 a = new e73();
    private static final List b = i.o("__typename", "main", "subResources", "images");

    private e73() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b73.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        b73.d dVar = null;
        List list = null;
        List list2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                dVar = (b73.d) j8.d(g73.a, false, 1, null).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                list = j8.a(j8.b(j8.d(h73.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                list2 = j8.a(j8.b(j8.d(f73.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (dVar == null) {
            vr.a(jsonReader, "main");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "subResources");
            throw new KotlinNothingValueException();
        }
        if (list2 != null) {
            return new b73.b(str, dVar, list, list2);
        }
        vr.a(jsonReader, "images");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, b73.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.d());
        lu3Var.name("main");
        j8.d(g73.a, false, 1, null).toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("subResources");
        j8.a(j8.b(j8.d(h73.a, false, 1, null))).toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("images");
        j8.a(j8.b(j8.d(f73.a, false, 1, null))).toJson(lu3Var, w41Var, bVar.a());
    }
}
