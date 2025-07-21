package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uw6;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ww6 implements h8 {
    public static final ww6 a = new ww6();
    private static final List b = i.o("success", "message");

    private ww6() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uw6.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (bool != null) {
            return new uw6.c(bool.booleanValue(), str);
        }
        vr.a(jsonReader, "success");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uw6.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("success");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(cVar.b()));
        lu3Var.name("message");
        j8.i.toJson(lu3Var, w41Var, cVar.a());
    }
}
