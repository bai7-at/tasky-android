package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class oa0 implements h8 {
    public static final oa0 a = new oa0();
    private static final List b = i.o("__typename", "totalSaved", "updatedAt", "books", "lists");

    private oa0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ma0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Instant instant = null;
        List list = null;
        List list2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                list = j8.a(j8.b(j8.d(na0.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                list2 = j8.a(j8.b(j8.c(pa0.a, true))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "books");
            throw new KotlinNothingValueException();
        }
        if (list2 != null) {
            return new ma0(str, num, instant, list, list2);
        }
        vr.a(jsonReader, "lists");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ma0 ma0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(ma0Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, ma0Var.e());
        lu3Var.name("totalSaved");
        j8.k.toJson(lu3Var, w41Var, ma0Var.c());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, ma0Var.d());
        lu3Var.name("books");
        j8.a(j8.b(j8.d(na0.a, false, 1, null))).toJson(lu3Var, w41Var, ma0Var.a());
        lu3Var.name("lists");
        j8.a(j8.b(j8.c(pa0.a, true))).toJson(lu3Var, w41Var, ma0Var.b());
    }
}
