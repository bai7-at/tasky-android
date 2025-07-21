package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fz0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hz0 implements h8 {
    public static final hz0 a = new hz0();
    private static final List b = i.o("id", "associatedNewsletter");

    private hz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fz0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        fz0.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                aVar = (fz0.a) j8.b(j8.d(gz0.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new fz0(str, aVar);
        }
        vr.a(jsonReader, "id");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fz0 fz0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fz0Var, "value");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, fz0Var.b());
        lu3Var.name("associatedNewsletter");
        j8.b(j8.d(gz0.a, false, 1, null)).toJson(lu3Var, w41Var, fz0Var.a());
    }
}
