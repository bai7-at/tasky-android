package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class d86 implements h8 {
    public static final d86 a = new d86();
    private static final List b = i.o("uri", "url", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE);

    private d86() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c86 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Instant instant = null;
        Instant instant2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                instant2 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                str4 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "uri");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str3 == null) {
            vr.a(jsonReader, "sourceId");
            throw new KotlinNothingValueException();
        }
        if (str4 != null) {
            return new c86(str, str2, instant, instant2, str3, str4);
        }
        vr.a(jsonReader, TransferTable.COLUMN_TYPE);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, c86 c86Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(c86Var, "value");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, c86Var.e());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, c86Var.f());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, c86Var.b());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, c86Var.a());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, c86Var.c());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, c86Var.d());
    }
}
