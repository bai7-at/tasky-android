package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kr7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class pr7 implements h8 {
    public static final pr7 a = new pr7();
    private static final List b = i.o("__typename", TransferTable.COLUMN_KEY, "value");

    private pr7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kr7.d fromJson(JsonReader jsonReader, w41 w41Var) {
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
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, TransferTable.COLUMN_KEY);
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new kr7.d(str, str2, str3);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kr7.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, dVar.c());
        lu3Var.name(TransferTable.COLUMN_KEY);
        h8Var.toJson(lu3Var, w41Var, dVar.a());
        lu3Var.name("value");
        h8Var.toJson(lu3Var, w41Var, dVar.b());
    }
}
