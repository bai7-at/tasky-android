package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kr7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class or7 implements h8 {
    public static final or7 a = new or7();
    private static final List b = i.o("__typename", "updatedAt", "data");

    private or7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kr7 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Instant instant = null;
        kr7.a aVar = null;
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
                aVar = (kr7.a) j8.b(j8.d(lr7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new kr7(str, instant, aVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kr7 kr7Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kr7Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, kr7Var.c());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, kr7Var.b());
        lu3Var.name("data");
        j8.b(j8.d(lr7.a, false, 1, null)).toJson(lu3Var, w41Var, kr7Var.a());
    }
}
