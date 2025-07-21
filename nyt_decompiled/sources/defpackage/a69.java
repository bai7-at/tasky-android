package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import com.comscore.streaming.EventType;
import defpackage.n59;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;
import type.VideoProductionType;
import type.adapter.VideoProductionType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class a69 implements h8 {
    public static final a69 a = new a69();
    private static final List b = i.o("__typename", "uri", "headline", "summary", "url", "kicker", "bylines", "column", "commentProperties", "lastModified", "lastMajorModification", "sourceId", TransferTable.COLUMN_TYPE, "promotionalMedia", "advertisingProperties", "adTargetingParams", "slug", "section", "subsection", "liveUrls", "is360", "isLive", "playlist", "contentSeries", "aspectRatio", "renditions", "duration", "productionType", "transcript");

    private a69() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0042. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n59 fromJson(JsonReader jsonReader, w41 w41Var) {
        w41 w41Var2;
        String str;
        w41 w41Var3;
        Boolean bool;
        String str2;
        w41 w41Var4;
        Boolean bool2;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Boolean bool3 = null;
        String str3 = null;
        String str4 = null;
        n59.g gVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        n59.d dVar = null;
        n59.e eVar = null;
        Instant instant = null;
        Instant instant2 = null;
        String str8 = null;
        String str9 = null;
        n59.i iVar = null;
        n59.b bVar = null;
        List list2 = null;
        String str10 = null;
        n59.k kVar = null;
        n59.l lVar = null;
        List list3 = null;
        Boolean bool4 = null;
        n59.h hVar = null;
        String str11 = null;
        String str12 = null;
        List list4 = null;
        Integer num = null;
        VideoProductionType videoProductionType = null;
        String str13 = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str = str4;
                    str3 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str4 = str;
                case 1:
                    w41Var2 = w41Var;
                    str4 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 2:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    gVar = (n59.g) j8.b(j8.d(u59.a, false, 1, null)).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 3:
                    w41Var2 = w41Var;
                    str5 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 4:
                    w41Var2 = w41Var;
                    str6 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 5:
                    w41Var2 = w41Var;
                    str7 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 6:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    list = j8.a(j8.b(j8.d(q59.a, false, 1, null))).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 7:
                    str = str4;
                    dVar = (n59.d) j8.b(j8.c(r59.a, true)).fromJson(jsonReader, w41Var);
                    bool3 = bool3;
                    str4 = str;
                case 8:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    eVar = (n59.e) j8.d(s59.a, false, 1, null).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 9:
                    w41Var2 = w41Var;
                    instant = (Instant) j8.b(w41Var2.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var2);
                case 10:
                    w41Var2 = w41Var;
                    instant2 = (Instant) j8.b(w41Var2.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var2);
                case 11:
                    w41Var2 = w41Var;
                    str8 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 12:
                    w41Var2 = w41Var;
                    str9 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 13:
                    w41Var4 = w41Var;
                    bool2 = bool3;
                    iVar = (n59.i) j8.b(j8.c(w59.a, true)).fromJson(jsonReader, w41Var4);
                    bool3 = bool2;
                case 14:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    bVar = (n59.b) j8.b(j8.d(p59.a, false, 1, null)).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 15:
                    w41Var4 = w41Var;
                    bool2 = bool3;
                    list2 = (List) j8.b(j8.a(j8.b(j8.c(o59.a, true)))).fromJson(jsonReader, w41Var4);
                    bool3 = bool2;
                case 16:
                    w41Var2 = w41Var;
                    str10 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 17:
                    w41Var4 = w41Var;
                    bool2 = bool3;
                    kVar = (n59.k) j8.b(j8.c(y59.a, true)).fromJson(jsonReader, w41Var4);
                    bool3 = bool2;
                case 18:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    lVar = (n59.l) j8.b(j8.d(z59.a, false, 1, null)).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 19:
                    w41Var2 = w41Var;
                    list3 = j8.a(j8.a).fromJson(jsonReader, w41Var2);
                case 20:
                    w41Var2 = w41Var;
                    bool3 = (Boolean) j8.f.fromJson(jsonReader, w41Var2);
                case 21:
                    w41Var2 = w41Var;
                    bool4 = (Boolean) j8.f.fromJson(jsonReader, w41Var2);
                case 22:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    hVar = (n59.h) j8.b(j8.d(v59.a, false, 1, null)).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case 23:
                    w41Var2 = w41Var;
                    str11 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case 24:
                    w41Var2 = w41Var;
                    str12 = (String) j8.a.fromJson(jsonReader, w41Var2);
                case EventType.SUBS /* 25 */:
                    w41Var3 = w41Var;
                    bool = bool3;
                    str2 = str3;
                    str = str4;
                    list4 = j8.a(j8.b(j8.d(x59.a, false, 1, null))).fromJson(jsonReader, w41Var3);
                    bool3 = bool;
                    str3 = str2;
                    str4 = str;
                case EventType.CDN /* 26 */:
                    w41Var2 = w41Var;
                    num = (Integer) j8.k.fromJson(jsonReader, w41Var2);
                case 27:
                    w41Var2 = w41Var;
                    videoProductionType = VideoProductionType_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var2);
                case 28:
                    w41Var2 = w41Var;
                    str13 = (String) j8.a.fromJson(jsonReader, w41Var2);
            }
            if (str3 == null) {
                vr.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            }
            if (str4 == null) {
                vr.a(jsonReader, "uri");
                throw new KotlinNothingValueException();
            }
            if (str5 == null) {
                vr.a(jsonReader, "summary");
                throw new KotlinNothingValueException();
            }
            if (str6 == null) {
                vr.a(jsonReader, "url");
                throw new KotlinNothingValueException();
            }
            if (str7 == null) {
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
            if (str8 == null) {
                vr.a(jsonReader, "sourceId");
                throw new KotlinNothingValueException();
            }
            if (str9 == null) {
                vr.a(jsonReader, TransferTable.COLUMN_TYPE);
                throw new KotlinNothingValueException();
            }
            if (str10 == null) {
                vr.a(jsonReader, "slug");
                throw new KotlinNothingValueException();
            }
            if (list3 == null) {
                vr.a(jsonReader, "liveUrls");
                throw new KotlinNothingValueException();
            }
            if (bool3 == null) {
                vr.a(jsonReader, "is360");
                throw new KotlinNothingValueException();
            }
            boolean booleanValue = bool3.booleanValue();
            if (bool4 == null) {
                vr.a(jsonReader, "isLive");
                throw new KotlinNothingValueException();
            }
            boolean booleanValue2 = bool4.booleanValue();
            if (str11 == null) {
                vr.a(jsonReader, "contentSeries");
                throw new KotlinNothingValueException();
            }
            if (str12 == null) {
                vr.a(jsonReader, "aspectRatio");
                throw new KotlinNothingValueException();
            }
            if (list4 == null) {
                vr.a(jsonReader, "renditions");
                throw new KotlinNothingValueException();
            }
            if (videoProductionType == null) {
                vr.a(jsonReader, "productionType");
                throw new KotlinNothingValueException();
            }
            if (str13 != null) {
                return new n59(str3, str4, gVar, str5, str6, str7, list, dVar, eVar, instant, instant2, str8, str9, iVar, bVar, list2, str10, kVar, lVar, list3, booleanValue, booleanValue2, hVar, str11, str12, list4, num, videoProductionType, str13);
            }
            vr.a(jsonReader, "transcript");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, n59 n59Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(n59Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, n59Var.A());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, n59Var.y());
        lu3Var.name("headline");
        j8.b(j8.d(u59.a, false, 1, null)).toJson(lu3Var, w41Var, n59Var.i());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, n59Var.v());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, n59Var.z());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, n59Var.j());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(q59.a, false, 1, null))).toJson(lu3Var, w41Var, n59Var.d());
        lu3Var.name("column");
        j8.b(j8.c(r59.a, true)).toJson(lu3Var, w41Var, n59Var.e());
        lu3Var.name("commentProperties");
        j8.d(s59.a, false, 1, null).toJson(lu3Var, w41Var, n59Var.f());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, n59Var.l());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, n59Var.k());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, n59Var.t());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, n59Var.x());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(w59.a, true)).toJson(lu3Var, w41Var, n59Var.p());
        lu3Var.name("advertisingProperties");
        j8.b(j8.d(p59.a, false, 1, null)).toJson(lu3Var, w41Var, n59Var.b());
        lu3Var.name("adTargetingParams");
        j8.b(j8.a(j8.b(j8.c(o59.a, true)))).toJson(lu3Var, w41Var, n59Var.a());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, n59Var.s());
        lu3Var.name("section");
        j8.b(j8.c(y59.a, true)).toJson(lu3Var, w41Var, n59Var.r());
        lu3Var.name("subsection");
        j8.b(j8.d(z59.a, false, 1, null)).toJson(lu3Var, w41Var, n59Var.u());
        lu3Var.name("liveUrls");
        j8.a(h8Var).toJson(lu3Var, w41Var, n59Var.m());
        lu3Var.name("is360");
        h8 h8Var2 = j8.f;
        h8Var2.toJson(lu3Var, w41Var, Boolean.valueOf(n59Var.B()));
        lu3Var.name("isLive");
        h8Var2.toJson(lu3Var, w41Var, Boolean.valueOf(n59Var.C()));
        lu3Var.name("playlist");
        j8.b(j8.d(v59.a, false, 1, null)).toJson(lu3Var, w41Var, n59Var.n());
        lu3Var.name("contentSeries");
        h8Var.toJson(lu3Var, w41Var, n59Var.g());
        lu3Var.name("aspectRatio");
        h8Var.toJson(lu3Var, w41Var, n59Var.c());
        lu3Var.name("renditions");
        j8.a(j8.b(j8.d(x59.a, false, 1, null))).toJson(lu3Var, w41Var, n59Var.q());
        lu3Var.name("duration");
        j8.k.toJson(lu3Var, w41Var, n59Var.h());
        lu3Var.name("productionType");
        VideoProductionType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, n59Var.o());
        lu3Var.name("transcript");
        h8Var.toJson(lu3Var, w41Var, n59Var.w());
    }
}
