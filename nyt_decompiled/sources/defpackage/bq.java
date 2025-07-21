package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aq;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bq implements h8 {
    public static final bq a = new bq();
    private static final List b = i.o("__typename", "headline", "bylines");

    private bq() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        aq.b bVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                bVar = (aq.b) j8.b(j8.d(dq.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.b(j8.d(cq.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new aq(str, bVar, list);
        }
        vr.a(jsonReader, "bylines");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aq aqVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aqVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aqVar.c());
        lu3Var.name("headline");
        j8.b(j8.d(dq.a, false, 1, null)).toJson(lu3Var, w41Var, aqVar.b());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(cq.a, false, 1, null))).toJson(lu3Var, w41Var, aqVar.a());
    }
}
