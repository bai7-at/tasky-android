package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.am7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bm7 implements h8 {
    public static final bm7 a = new bm7();
    private static final List b = i.e("setUserInterests");

    private bm7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public am7.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        am7.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (am7.c) j8.b(j8.d(cm7.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new am7.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, am7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("setUserInterests");
        j8.b(j8.d(cm7.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
