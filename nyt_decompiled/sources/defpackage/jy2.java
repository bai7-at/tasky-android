package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fy2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class jy2 implements h8 {
    public static final jy2 a = new jy2();
    private static final List b = i.o("__typename", "topics", "userInterests", "editorsPicks");

    private jy2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fy2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.d(ky2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                list2 = (List) j8.b(j8.a(j8.c(my2.a, true))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                list3 = j8.a(j8.c(hy2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "topics");
            throw new KotlinNothingValueException();
        }
        if (list3 != null) {
            return new fy2.e(str, list, list2, list3);
        }
        vr.a(jsonReader, "editorsPicks");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fy2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.d());
        lu3Var.name("topics");
        j8.a(j8.d(ky2.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.b());
        lu3Var.name("userInterests");
        j8.b(j8.a(j8.c(my2.a, true))).toJson(lu3Var, w41Var, eVar.c());
        lu3Var.name("editorsPicks");
        j8.a(j8.c(hy2.a, true)).toJson(lu3Var, w41Var, eVar.a());
    }
}
