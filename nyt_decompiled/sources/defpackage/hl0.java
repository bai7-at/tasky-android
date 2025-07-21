package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.gl0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hl0 implements h8 {
    public static final hl0 a = new hl0();
    private static final List b = i.o("message", "success");

    private hl0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public gl0.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            }
        }
        if (bool != null) {
            return new gl0.a(str, bool.booleanValue());
        }
        vr.a(jsonReader, "success");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, gl0.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("message");
        j8.i.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("success");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(aVar.b()));
    }
}
