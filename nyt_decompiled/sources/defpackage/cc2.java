package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wb2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class cc2 implements h8 {
    public static final cc2 a = new cc2();
    private static final List b = i.o("uri", "headline", "summary", "url", "kicker", "bylines", "column", "commentProperties", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE, "promotionalMedia", "advertisingProperties", "adTargetingParams", "slug", "section", "subsection");

    private cc2() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002d. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wb2 fromJson(JsonReader jsonReader, w41 w41Var) {
        String str;
        wb2.f fVar;
        String str2;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str3 = null;
        wb2.f fVar2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        wb2.d dVar = null;
        wb2.e eVar = null;
        Instant instant = null;
        Instant instant2 = null;
        String str7 = null;
        String str8 = null;
        wb2.g gVar = null;
        wb2.b bVar = null;
        List list2 = null;
        String str9 = null;
        wb2.h hVar = null;
        wb2.i iVar = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str3 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 1:
                    str2 = str3;
                    fVar2 = (wb2.f) j8.b(j8.d(dc2.a, false, 1, null)).fromJson(jsonReader, w41Var);
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
                    list = j8.a(j8.b(j8.d(zb2.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
                case 6:
                    str2 = str3;
                    dVar = (wb2.d) j8.b(j8.c(ac2.a, true)).fromJson(jsonReader, w41Var);
                    str3 = str2;
                case 7:
                    str = str3;
                    fVar = fVar2;
                    eVar = (wb2.e) j8.d(bc2.a, false, 1, null).fromJson(jsonReader, w41Var);
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
                    gVar = (wb2.g) j8.b(j8.c(ec2.a, true)).fromJson(jsonReader, w41Var);
                case 13:
                    str = str3;
                    fVar = fVar2;
                    bVar = (wb2.b) j8.b(j8.d(yb2.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str;
                    fVar2 = fVar;
                case 14:
                    list2 = (List) j8.b(j8.a(j8.b(j8.c(xb2.a, true)))).fromJson(jsonReader, w41Var);
                case 15:
                    str9 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 16:
                    hVar = (wb2.h) j8.b(j8.c(fc2.a, true)).fromJson(jsonReader, w41Var);
                case 17:
                    str = str3;
                    fVar = fVar2;
                    iVar = (wb2.i) j8.b(j8.d(gc2.a, false, 1, null)).fromJson(jsonReader, w41Var);
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
                return new wb2(str3, fVar2, str4, str5, str6, list, dVar, eVar, instant, instant2, str7, str8, gVar, bVar, list2, str9, hVar, iVar);
            }
            vr.a(jsonReader, "slug");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wb2 wb2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(wb2Var, "value");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, wb2Var.q());
        lu3Var.name("headline");
        j8.b(j8.d(dc2.a, false, 1, null)).toJson(lu3Var, w41Var, wb2Var.f());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, wb2Var.o());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, wb2Var.r());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, wb2Var.g());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(zb2.a, false, 1, null))).toJson(lu3Var, w41Var, wb2Var.c());
        lu3Var.name("column");
        j8.b(j8.c(ac2.a, true)).toJson(lu3Var, w41Var, wb2Var.d());
        lu3Var.name("commentProperties");
        j8.d(bc2.a, false, 1, null).toJson(lu3Var, w41Var, wb2Var.e());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, wb2Var.i());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, wb2Var.h());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, wb2Var.m());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, wb2Var.p());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(ec2.a, true)).toJson(lu3Var, w41Var, wb2Var.j());
        lu3Var.name("advertisingProperties");
        j8.b(j8.d(yb2.a, false, 1, null)).toJson(lu3Var, w41Var, wb2Var.b());
        lu3Var.name("adTargetingParams");
        j8.b(j8.a(j8.b(j8.c(xb2.a, true)))).toJson(lu3Var, w41Var, wb2Var.a());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, wb2Var.l());
        lu3Var.name("section");
        j8.b(j8.c(fc2.a, true)).toJson(lu3Var, w41Var, wb2Var.k());
        lu3Var.name("subsection");
        j8.b(j8.d(gc2.a, false, 1, null)).toJson(lu3Var, w41Var, wb2Var.n());
    }
}
