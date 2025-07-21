package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.b73;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class c73 implements h8 {
    public static final c73 a = new c73();
    private static final List b = i.o("__typename", "minViewportWidth", "target");

    private c73() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b73.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
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
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (num == null) {
            vr.a(jsonReader, "minViewportWidth");
            throw new KotlinNothingValueException();
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new b73.a(str, intValue, str2);
        }
        vr.a(jsonReader, "target");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, b73.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("minViewportWidth");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(aVar.a()));
        lu3Var.name("target");
        h8Var.toJson(lu3Var, w41Var, aVar.b());
    }
}
