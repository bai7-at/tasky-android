package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.e24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class g24 implements h8 {
    public static final g24 a = new g24();
    private static final List b = i.e("stream");

    private g24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e24 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        e24.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (e24.c) j8.b(j8.d(i24.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new e24(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, e24 e24Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(e24Var, "value");
        lu3Var.name("stream");
        j8.b(j8.d(i24.a, false, 1, null)).toJson(lu3Var, w41Var, e24Var.a());
    }
}
