package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qj5 implements h8 {
    public static final qj5 a = new qj5();
    private static final List b = i.o("id", "altText", "crops");

    private qj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oj5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.b(j8.d(pj5.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "altText");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new oj5(str, str2, list);
        }
        vr.a(jsonReader, "crops");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, oj5 oj5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(oj5Var, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, oj5Var.c());
        lu3Var.name("altText");
        h8Var.toJson(lu3Var, w41Var, oj5Var.a());
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(pj5.a, false, 1, null))).toJson(lu3Var, w41Var, oj5Var.b());
    }
}
