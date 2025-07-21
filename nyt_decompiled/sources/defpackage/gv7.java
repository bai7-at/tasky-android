package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uu7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;

/* loaded from: classes3.dex */
public final class gv7 implements h8 {
    public static final gv7 a = new gv7();
    private static final List b = i.o("uri", "headline", "summary", "url", "kicker", "bylines", "column", "commentProperties", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE, "promotionalMedia", "advertisingProperties", "adTargetingParams", "slug", "section", "slides", "subsection");

    private gv7() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002f. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uu7 fromJson(JsonReader jsonReader, w41 w41Var) {
        String str;
        uu7.g gVar;
        String str2;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str3 = null;
        uu7.g gVar2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        uu7.e eVar = null;
        uu7.f fVar = null;
        Instant instant = null;
        Instant instant2 = null;
        String str7 = null;
        String str8 = null;
        uu7.i iVar = null;
        uu7.b bVar = null;
        List list2 = null;
        String str9 = null;
        uu7.j jVar = null;
        List list3 = null;
        uu7.l lVar = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str3 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 1:
                    str2 = str3;
                    gVar2 = (uu7.g) j8.b(j8.d(bv7.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str2;
                case 2:
                    str4 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 3:
                    str5 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 4:
                    str6 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 5:
                    str = str3;
                    gVar = gVar2;
                    list = j8.a(j8.b(j8.d(xu7.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    str3 = str;
                    gVar2 = gVar;
                case 6:
                    str2 = str3;
                    eVar = (uu7.e) j8.b(j8.c(zu7.a, true)).fromJson(jsonReader, w41Var);
                    str3 = str2;
                case 7:
                    str = str3;
                    gVar = gVar2;
                    fVar = (uu7.f) j8.d(av7.a, false, 1, null).fromJson(jsonReader, w41Var);
                    str3 = str;
                    gVar2 = gVar;
                case 8:
                    instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 9:
                    instant2 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 10:
                    str7 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 11:
                    str8 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 12:
                    iVar = (uu7.i) j8.b(j8.c(dv7.a, true)).fromJson(jsonReader, w41Var);
                case 13:
                    str = str3;
                    gVar = gVar2;
                    bVar = (uu7.b) j8.b(j8.d(wu7.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str;
                    gVar2 = gVar;
                case 14:
                    list2 = (List) j8.b(j8.a(j8.b(j8.c(vu7.a, true)))).fromJson(jsonReader, w41Var);
                case 15:
                    str9 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 16:
                    jVar = (uu7.j) j8.b(j8.c(ev7.a, true)).fromJson(jsonReader, w41Var);
                case 17:
                    str = str3;
                    gVar = gVar2;
                    list3 = j8.a(j8.b(j8.d(fv7.a, false, 1, null))).fromJson(jsonReader, w41Var);
                    str3 = str;
                    gVar2 = gVar;
                case 18:
                    str = str3;
                    gVar = gVar2;
                    lVar = (uu7.l) j8.b(j8.d(hv7.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str3 = str;
                    gVar2 = gVar;
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
            if (fVar == null) {
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
            if (str9 == null) {
                vr.a(jsonReader, "slug");
                throw new KotlinNothingValueException();
            }
            if (list3 != null) {
                return new uu7(str3, gVar2, str4, str5, str6, list, eVar, fVar, instant, instant2, str7, str8, iVar, bVar, list2, str9, jVar, list3, lVar);
            }
            vr.a(jsonReader, "slides");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uu7 uu7Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(uu7Var, "value");
        lu3Var.name("uri");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, uu7Var.r());
        lu3Var.name("headline");
        j8.b(j8.d(bv7.a, false, 1, null)).toJson(lu3Var, w41Var, uu7Var.f());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, uu7Var.p());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, uu7Var.s());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, uu7Var.g());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(xu7.a, false, 1, null))).toJson(lu3Var, w41Var, uu7Var.c());
        lu3Var.name("column");
        j8.b(j8.c(zu7.a, true)).toJson(lu3Var, w41Var, uu7Var.d());
        lu3Var.name("commentProperties");
        j8.d(av7.a, false, 1, null).toJson(lu3Var, w41Var, uu7Var.e());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, uu7Var.i());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, uu7Var.h());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, uu7Var.n());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, uu7Var.q());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(dv7.a, true)).toJson(lu3Var, w41Var, uu7Var.j());
        lu3Var.name("advertisingProperties");
        j8.b(j8.d(wu7.a, false, 1, null)).toJson(lu3Var, w41Var, uu7Var.b());
        lu3Var.name("adTargetingParams");
        j8.b(j8.a(j8.b(j8.c(vu7.a, true)))).toJson(lu3Var, w41Var, uu7Var.a());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, uu7Var.m());
        lu3Var.name("section");
        j8.b(j8.c(ev7.a, true)).toJson(lu3Var, w41Var, uu7Var.k());
        lu3Var.name("slides");
        j8.a(j8.b(j8.d(fv7.a, false, 1, null))).toJson(lu3Var, w41Var, uu7Var.l());
        lu3Var.name("subsection");
        j8.b(j8.d(hv7.a, false, 1, null)).toJson(lu3Var, w41Var, uu7Var.o());
    }
}
