package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ls5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ns5 implements h8 {
    public static final ns5 a = new ns5();
    private static final List b = i.o("__typename", "trackingParams", "node");

    private ns5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ls5.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        ls5.f fVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = (List) j8.b(j8.a(j8.b(j8.d(ss5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                fVar = (ls5.f) j8.b(j8.c(qs5.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new ls5.c(str, list, fVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ls5.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(ss5.a, false, 1, null)))).toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("node");
        j8.b(j8.c(qs5.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
