package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.google.android.gms.common.Scopes;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class g09 implements h8 {
    public static final g09 a = new g09();
    private static final List b = i.o("email", Scopes.PROFILE, "regiId", "setting", "subscriptionDetails");

    private g09() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yz8.d dVar = null;
        yz8.f fVar = null;
        String str = null;
        yz8.g gVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                dVar = (yz8.d) j8.b(j8.d(b09.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                fVar = (yz8.f) j8.b(j8.d(d09.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                gVar = (yz8.g) j8.b(j8.d(e09.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    return new yz8.i(dVar, fVar, str, gVar, list);
                }
                list = (List) j8.b(j8.a(j8.d(f09.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("email");
        j8.b(j8.d(b09.a, false, 1, null)).toJson(lu3Var, w41Var, iVar.a());
        lu3Var.name(Scopes.PROFILE);
        j8.b(j8.d(d09.a, false, 1, null)).toJson(lu3Var, w41Var, iVar.b());
        lu3Var.name("regiId");
        j8.i.toJson(lu3Var, w41Var, iVar.c());
        lu3Var.name("setting");
        j8.b(j8.d(e09.a, false, 1, null)).toJson(lu3Var, w41Var, iVar.d());
        lu3Var.name("subscriptionDetails");
        j8.b(j8.a(j8.d(f09.a, false, 1, null))).toJson(lu3Var, w41Var, iVar.e());
    }
}
