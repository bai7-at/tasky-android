package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lv;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class ov implements h8 {
    public static final ov a = new ov();
    private static final List b = i.o("uri", "credit", "fileName", "fileUrl", "length", "podcastSeries", "subscribeUrls", "headline", "summary", "url", "kicker", "bylines", "column", "commentProperties", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE, "promotionalMedia", "advertisingProperties", "adTargetingParams", "slug", "section", "subsection");

    private ov() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0039. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lv fromJson(JsonReader jsonReader, w41 w41Var) {
        String str;
        Integer num;
        Integer num2;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        lv.h hVar = null;
        List list = null;
        lv.f fVar = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list2 = null;
        lv.d dVar = null;
        lv.e eVar = null;
        Instant instant = null;
        Instant instant2 = null;
        String str9 = null;
        String str10 = null;
        lv.i iVar = null;
        lv.b bVar = null;
        List list3 = null;
        String str11 = null;
        lv.j jVar = null;
        lv.l lVar = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str2 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 1:
                    str = str2;
                    str3 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str2 = str;
                case 2:
                    str = str2;
                    str4 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str2 = str;
                case 3:
                    str = str2;
                    str5 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str2 = str;
                case 4:
                    str = str2;
                    num3 = (Integer) j8.b.fromJson(jsonReader, w41Var);
                    str2 = str;
                case 5:
                    num = num3;
                    str = str2;
                    hVar = (lv.h) j8.b(j8.d(uv.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 6:
                    num = num3;
                    str = str2;
                    list = j8.a(j8.b(j8.d(xv.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 7:
                    num = num3;
                    str = str2;
                    fVar = (lv.f) j8.b(j8.d(sv.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 8:
                    str6 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 9:
                    str7 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 10:
                    str8 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 11:
                    num = num3;
                    str = str2;
                    list2 = j8.a(j8.b(j8.d(pv.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 12:
                    num = num3;
                    str = str2;
                    dVar = (lv.d) j8.b(j8.c(qv.a, true)).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 13:
                    num = num3;
                    str = str2;
                    eVar = (lv.e) j8.d(rv.a, false, 1, null).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 14:
                    instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 15:
                    instant2 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 16:
                    str9 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 17:
                    str10 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 18:
                    num2 = num3;
                    iVar = (lv.i) j8.b(j8.c(vv.a, true)).fromJson(jsonReader, w41Var);
                    num3 = num2;
                case 19:
                    num = num3;
                    str = str2;
                    bVar = (lv.b) j8.b(j8.d(nv.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
                case 20:
                    num2 = num3;
                    list3 = (List) j8.b(j8.a(j8.b(j8.c(mv.a, true)))).fromJson(jsonReader, w41Var);
                    num3 = num2;
                case 21:
                    str11 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 22:
                    num2 = num3;
                    jVar = (lv.j) j8.b(j8.c(wv.a, true)).fromJson(jsonReader, w41Var);
                    num3 = num2;
                case 23:
                    num = num3;
                    str = str2;
                    lVar = (lv.l) j8.b(j8.d(yv.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    num3 = num;
                    str2 = str;
            }
            if (str2 == null) {
                vr.a(jsonReader, "uri");
                throw new KotlinNothingValueException();
            }
            if (str3 == null) {
                vr.a(jsonReader, "credit");
                throw new KotlinNothingValueException();
            }
            if (str4 == null) {
                vr.a(jsonReader, "fileName");
                throw new KotlinNothingValueException();
            }
            if (str5 == null) {
                vr.a(jsonReader, "fileUrl");
                throw new KotlinNothingValueException();
            }
            if (num3 == null) {
                vr.a(jsonReader, "length");
                throw new KotlinNothingValueException();
            }
            int intValue = num3.intValue();
            if (list == null) {
                vr.a(jsonReader, "subscribeUrls");
                throw new KotlinNothingValueException();
            }
            if (str6 == null) {
                vr.a(jsonReader, "summary");
                throw new KotlinNothingValueException();
            }
            if (str7 == null) {
                vr.a(jsonReader, "url");
                throw new KotlinNothingValueException();
            }
            if (str8 == null) {
                vr.a(jsonReader, "kicker");
                throw new KotlinNothingValueException();
            }
            if (list2 == null) {
                vr.a(jsonReader, "bylines");
                throw new KotlinNothingValueException();
            }
            if (eVar == null) {
                vr.a(jsonReader, "commentProperties");
                throw new KotlinNothingValueException();
            }
            if (str9 == null) {
                vr.a(jsonReader, "sourceId");
                throw new KotlinNothingValueException();
            }
            if (str10 == null) {
                vr.a(jsonReader, TransferTable.COLUMN_TYPE);
                throw new KotlinNothingValueException();
            }
            if (str11 != null) {
                return new lv(str2, str3, str4, str5, intValue, hVar, list, fVar, str6, str7, str8, list2, dVar, eVar, instant, instant2, str9, str10, iVar, bVar, list3, str11, jVar, lVar);
            }
            vr.a(jsonReader, "slug");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lv lvVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(lvVar, "value");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, lvVar.w());
        lu3Var.name("credit");
        h8Var.toJson(lu3Var, w41Var, lvVar.f());
        lu3Var.name("fileName");
        h8Var.toJson(lu3Var, w41Var, lvVar.g());
        lu3Var.name("fileUrl");
        h8Var.toJson(lu3Var, w41Var, lvVar.h());
        lu3Var.name("length");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(lvVar.m()));
        lu3Var.name("podcastSeries");
        j8.b(j8.d(uv.a, false, 1, null)).toJson(lu3Var, w41Var, lvVar.n());
        lu3Var.name("subscribeUrls");
        j8.a(j8.b(j8.d(xv.a, false, 1, null))).toJson(lu3Var, w41Var, lvVar.s());
        lu3Var.name("headline");
        j8.b(j8.d(sv.a, false, 1, null)).toJson(lu3Var, w41Var, lvVar.i());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, lvVar.u());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, lvVar.x());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, lvVar.j());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(pv.a, false, 1, null))).toJson(lu3Var, w41Var, lvVar.c());
        lu3Var.name("column");
        j8.b(j8.c(qv.a, true)).toJson(lu3Var, w41Var, lvVar.d());
        lu3Var.name("commentProperties");
        j8.d(rv.a, false, 1, null).toJson(lu3Var, w41Var, lvVar.e());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, lvVar.l());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, lvVar.k());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, lvVar.r());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, lvVar.v());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(vv.a, true)).toJson(lu3Var, w41Var, lvVar.o());
        lu3Var.name("advertisingProperties");
        j8.b(j8.d(nv.a, false, 1, null)).toJson(lu3Var, w41Var, lvVar.b());
        lu3Var.name("adTargetingParams");
        j8.b(j8.a(j8.b(j8.c(mv.a, true)))).toJson(lu3Var, w41Var, lvVar.a());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, lvVar.q());
        lu3Var.name("section");
        j8.b(j8.c(wv.a, true)).toJson(lu3Var, w41Var, lvVar.p());
        lu3Var.name("subsection");
        j8.b(j8.d(yv.a, false, 1, null)).toJson(lu3Var, w41Var, lvVar.t());
    }
}
