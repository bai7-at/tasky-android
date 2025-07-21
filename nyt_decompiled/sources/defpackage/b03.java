package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xz2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class b03 implements h8 {
    public static final b03 a = new b03();
    private static final List b = i.o("__typename", "remaining", "gifts");

    private b03() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xz2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.b(j8.d(a03.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "remaining");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (list != null) {
            return new xz2.e(str, intValue, list);
        }
        vr.a(jsonReader, "gifts");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xz2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.c());
        lu3Var.name("remaining");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(eVar.b()));
        lu3Var.name("gifts");
        j8.a(j8.b(j8.d(a03.a, false, 1, null))).toJson(lu3Var, w41Var, eVar.a());
    }
}
