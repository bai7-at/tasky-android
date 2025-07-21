package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wg5 implements h8 {
    public static final wg5 a = new wg5();
    private static final List b = i.o("__typename", "message");

    private wg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public vg5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new vg5(str, str2);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, vg5 vg5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(vg5Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, vg5Var.b());
        lu3Var.name("message");
        j8.i.toJson(lu3Var, w41Var, vg5Var.a());
    }
}
