package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zw0 implements h8 {
    public static final zw0 a = new zw0();
    private static final List b = i.o("pageInfo", "metadata", "edges");

    private zw0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tw0.i iVar = null;
        tw0.g gVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                iVar = (tw0.i) j8.d(cx0.a, false, 1, null).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                gVar = (tw0.g) j8.b(j8.d(ax0.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = (List) j8.b(j8.a(j8.b(j8.d(yw0.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
        if (iVar != null) {
            return new tw0.f(iVar, gVar, list);
        }
        vr.a(jsonReader, "pageInfo");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("pageInfo");
        j8.d(cx0.a, false, 1, null).toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("metadata");
        j8.b(j8.d(ax0.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.b());
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(yw0.a, false, 1, null)))).toJson(lu3Var, w41Var, fVar.a());
    }
}
