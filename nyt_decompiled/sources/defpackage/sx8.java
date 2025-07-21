package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.rx8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class sx8 implements h8 {
    public static final sx8 a = new sx8();
    private static final List b = i.e("updateUserEmailPref");

    private sx8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx8.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        rx8.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (rx8.c) j8.b(j8.d(tx8.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new rx8.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, rx8.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("updateUserEmailPref");
        j8.b(j8.d(tx8.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
