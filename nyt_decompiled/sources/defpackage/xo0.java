package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wo0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class xo0 implements h8 {
    public static final xo0 a = new xo0();
    private static final List b = i.o("__typename", "updatedAt", "data");

    private xo0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wo0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Instant instant = null;
        wo0.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                aVar = (wo0.a) j8.b(j8.c(yo0.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new wo0(str, instant, aVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wo0 wo0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(wo0Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, wo0Var.c());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, wo0Var.b());
        lu3Var.name("data");
        j8.b(j8.c(yo0.a, true)).toJson(lu3Var, w41Var, wo0Var.a());
    }
}
