package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fh7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class jh7 implements h8 {
    public static final jh7 a = new jh7();
    private static final List b = i.o("uri", "videos");

    private jh7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh7.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        fh7.f fVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                fVar = (fh7.f) j8.b(j8.d(kh7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new fh7.e(str, fVar);
        }
        vr.a(jsonReader, "uri");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fh7.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("uri");
        j8.a.toJson(lu3Var, w41Var, eVar.a());
        lu3Var.name("videos");
        j8.b(j8.d(kh7.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.b());
    }
}
