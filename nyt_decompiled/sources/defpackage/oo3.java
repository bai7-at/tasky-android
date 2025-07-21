package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ho3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class oo3 implements h8 {
    public static final oo3 a = new oo3();
    private static final List b = i.o("uri", "headline", "summary", "url", "kicker", "bylines", "column", "commentProperties", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE, "promotionalMedia", "advertisingProperties", "adTargetingParams", "slug", "section", "subsection");

    private oo3() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002d. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ho3 fromJson(JsonReader jsonReader, w41 w41Var) {
        String str;
        ho3.f fVar;
        String str2;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str3 = null;
        ho3.f fVar2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        ho3.d dVar = null;
        ho3.e eVar = null;
        Instant instant = null;
        Instant instant2 = null;
        String str7 = null;
        String str8 = null;
        ho3.g gVar = null;
        ho3.b bVar = null;
        List list2 = null;
        String str9 = null;
        ho3.h hVar = null;
        ho3.i iVar = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str3 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 1:
                    str2 = str3;
                    fVar2 = (ho3.f) j8.b(j8.d(no3.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str2;
                case 2:
                    str4 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 3:
                    str5 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 4:
                    str6 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 5:
                    str = str3;
                    fVar = fVar2;
                    list = j8.a(j8.b(j8.d(ko3.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
                case 6:
                    str2 = str3;
                    dVar = (ho3.d) j8.b(j8.c(lo3.a, true)).fromJson(jsonReader, w41Var);
                    str3 = str2;
                case 7:
                    str = str3;
                    fVar = fVar2;
                    eVar = (ho3.e) j8.d(mo3.a, false, 1, null).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
                case 8:
                    instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 9:
                    instant2 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 10:
                    str7 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 11:
                    str8 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 12:
                    gVar = (ho3.g) j8.b(j8.c(po3.a, true)).fromJson(jsonReader, w41Var);
                case 13:
                    str = str3;
                    fVar = fVar2;
                    bVar = (ho3.b) j8.b(j8.d(jo3.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
                case 14:
                    list2 = (List) j8.b(j8.a(j8.b(j8.c(io3.a, true)))).fromJson(jsonReader, w41Var);
                case 15:
                    str9 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 16:
                    hVar = (ho3.h) j8.b(j8.c(qo3.a, true)).fromJson(jsonReader, w41Var);
                case 17:
                    str = str3;
                    fVar = fVar2;
                    iVar = (ho3.i) j8.b(j8.d(ro3.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
            }
            if (str3 == null) {
                vr.a(jsonReader, "uri");
                throw new KotlinNothingValueException();
            }
            if (str4 == null) {
                vr.a(jsonReader, "summary");
                throw new KotlinNothingValueException();
            }
            if (str5 == null) {
                vr.a(jsonReader, "url");
                throw new KotlinNothingValueException();
            }
            if (str6 == null) {
                vr.a(jsonReader, "kicker");
                throw new KotlinNothingValueException();
            }
            if (list == null) {
                vr.a(jsonReader, "bylines");
                throw new KotlinNothingValueException();
            }
            if (eVar == null) {
                vr.a(jsonReader, "commentProperties");
                throw new KotlinNothingValueException();
            }
            if (str7 == null) {
                vr.a(jsonReader, "sourceId");
                throw new KotlinNothingValueException();
            }
            if (str8 == null) {
                vr.a(jsonReader, TransferTable.COLUMN_TYPE);
                throw new KotlinNothingValueException();
            }
            if (str9 != null) {
                return new ho3(str3, fVar2, str4, str5, str6, list, dVar, eVar, instant, instant2, str7, str8, gVar, bVar, list2, str9, hVar, iVar);
            }
            vr.a(jsonReader, "slug");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ho3 ho3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(ho3Var, "value");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, ho3Var.q());
        lu3Var.name("headline");
        j8.b(j8.d(no3.a, false, 1, null)).toJson(lu3Var, w41Var, ho3Var.f());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, ho3Var.o());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, ho3Var.r());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, ho3Var.g());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(ko3.a, false, 1, null))).toJson(lu3Var, w41Var, ho3Var.c());
        lu3Var.name("column");
        j8.b(j8.c(lo3.a, true)).toJson(lu3Var, w41Var, ho3Var.d());
        lu3Var.name("commentProperties");
        j8.d(mo3.a, false, 1, null).toJson(lu3Var, w41Var, ho3Var.e());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, ho3Var.i());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, ho3Var.h());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, ho3Var.m());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, ho3Var.p());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(po3.a, true)).toJson(lu3Var, w41Var, ho3Var.j());
        lu3Var.name("advertisingProperties");
        j8.b(j8.d(jo3.a, false, 1, null)).toJson(lu3Var, w41Var, ho3Var.b());
        lu3Var.name("adTargetingParams");
        j8.b(j8.a(j8.b(j8.c(io3.a, true)))).toJson(lu3Var, w41Var, ho3Var.a());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, ho3Var.l());
        lu3Var.name("section");
        j8.b(j8.c(qo3.a, true)).toJson(lu3Var, w41Var, ho3Var.k());
        lu3Var.name("subsection");
        j8.b(j8.d(ro3.a, false, 1, null)).toJson(lu3Var, w41Var, ho3Var.n());
    }
}
