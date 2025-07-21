package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.f19;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class i19 implements h8 {
    public static final i19 a = new i19();
    private static final List b = i.o("__typename", TransferTable.COLUMN_STATE);

    private i19() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f19.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        f19.c cVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                cVar = (f19.c) j8.b(j8.c(h19.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new f19.d(str, cVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, f19.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name(TransferTable.COLUMN_STATE);
        j8.b(j8.c(h19.a, true)).toJson(lu3Var, w41Var, dVar.a());
    }
}
