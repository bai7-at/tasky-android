package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bz2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class ez2 implements h8 {
    public static final ez2 a = new ez2();
    private static final List b = i.o("__typename", "ordering", "lastAutoAddedAt");

    private ez2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bz2.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        Instant instant = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.k).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new bz2.d(str, list, instant);
        }
        vr.a(jsonReader, "ordering");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bz2.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.c());
        lu3Var.name("ordering");
        j8.a(j8.k).toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("lastAutoAddedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, dVar.a());
    }
}
