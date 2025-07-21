package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.a36;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class f36 implements h8 {
    public static final f36 a = new f36();
    private static final List b = i.o("privacyDirectivesV2", "tcfPref", "currentTcfNotice");

    private f36() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a36.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        a36.d dVar = null;
        a36.e eVar = null;
        a36.b bVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                dVar = (a36.d) j8.b(j8.c(d36.a, true)).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                eVar = (a36.e) j8.b(j8.c(e36.a, true)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                bVar = (a36.b) j8.d(b36.a, false, 1, null).fromJson(jsonReader, w41Var);
            }
        }
        if (bVar != null) {
            return new a36.f(dVar, eVar, bVar);
        }
        vr.a(jsonReader, "currentTcfNotice");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, a36.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("privacyDirectivesV2");
        j8.b(j8.c(d36.a, true)).toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("tcfPref");
        j8.b(j8.c(e36.a, true)).toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("currentTcfNotice");
        j8.d(b36.a, false, 1, null).toJson(lu3Var, w41Var, fVar.a());
    }
}
