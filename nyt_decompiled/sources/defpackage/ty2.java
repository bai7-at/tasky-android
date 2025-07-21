package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.oy2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ty2 implements h8 {
    public static final ty2 a = new ty2();
    private static final List b = i.o("__typename", "hasNextPage", "endCursor");

    private ty2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oy2.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (bool != null) {
            return new oy2.f(str, bool.booleanValue(), str2);
        }
        vr.a(jsonReader, "hasNextPage");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, oy2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("hasNextPage");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(fVar.b()));
        lu3Var.name("endCursor");
        j8.i.toJson(lu3Var, w41Var, fVar.a());
    }
}
