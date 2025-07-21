package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.b73;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class f73 implements h8 {
    public static final f73 a = new f73();
    private static final List b = i.o("__typename", "crops");

    private f73() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b73.c fromJson(JsonReader jsonReader, w41 w41Var) {
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
                list = j8.a(j8.b(j8.d(c73.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new b73.c(str, list);
        }
        vr.a(jsonReader, "crops");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, b73.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(c73.a, false, 1, null))).toJson(lu3Var, w41Var, cVar.a());
    }
}
