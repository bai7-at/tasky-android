package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.a36;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class b36 implements h8 {
    public static final b36 a = new b36();
    private static final List b = i.o("acceptAllTcString", "rejectAllTcString", "currentNoticeVersion");

    private b36() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a36.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "acceptAllTcString");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "rejectAllTcString");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new a36.b(str, str2, str3);
        }
        vr.a(jsonReader, "currentNoticeVersion");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, a36.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("acceptAllTcString");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, bVar.a());
        lu3Var.name("rejectAllTcString");
        h8Var.toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("currentNoticeVersion");
        h8Var.toJson(lu3Var, w41Var, bVar.b());
    }
}
