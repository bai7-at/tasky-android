package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class wf2 implements h8 {
    public static final wf2 a = new wf2();
    private static final List b = i.o("__typename", "lastModified");

    private wf2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tf2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Instant instant = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new tf2.b(str, instant);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tf2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, bVar.a());
    }
}
