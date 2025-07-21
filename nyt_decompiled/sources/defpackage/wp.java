package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class wp implements h8 {
    public static final wp a = new wp();
    private static final List b = i.o("lastModified", "main", "subResources", "images");

    private wp() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Instant instant = null;
        tp.d dVar = null;
        List list = null;
        List list2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                dVar = (tp.d) j8.d(yp.a, false, 1, null).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                list = j8.a(j8.b(j8.d(zp.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                list2 = j8.a(j8.b(j8.d(xp.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (dVar == null) {
            vr.a(jsonReader, "main");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "subResources");
            throw new KotlinNothingValueException();
        }
        if (list2 != null) {
            return new tp.b(instant, dVar, list, list2);
        }
        vr.a(jsonReader, "images");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tp.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("lastModified");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("main");
        j8.d(yp.a, false, 1, null).toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("subResources");
        j8.a(j8.b(j8.d(zp.a, false, 1, null))).toJson(lu3Var, w41Var, bVar.d());
        lu3Var.name("images");
        j8.a(j8.b(j8.d(xp.a, false, 1, null))).toJson(lu3Var, w41Var, bVar.a());
    }
}
