package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.gz1;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hz1 implements h8 {
    public static final hz1 a = new hz1();
    private static final List b = i.e("promotionalMedia");

    private hz1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public gz1 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        gz1.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (gz1.a) j8.b(j8.c(iz1.a, true)).fromJson(jsonReader, w41Var);
        }
        return new gz1(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, gz1 gz1Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gz1Var, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(iz1.a, true)).toJson(lu3Var, w41Var, gz1Var.a());
    }
}
