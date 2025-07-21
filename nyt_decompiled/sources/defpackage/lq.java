package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kq;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;
import type.Tone;
import type.adapter.Tone_ResponseAdapter;

/* loaded from: classes3.dex */
public final class lq implements h8 {
    public static final lq a = new lq();
    private static final List b = i.o("__typename", "assetID", "uri", "url", "commentProperties", "fingerprint", "headlineInfo", "summary", "lastUpdatedDate", "promotionalMedia", "tone", "lastModified", "hybridBody");

    private lq() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0023. Please report as an issue. */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kq fromJson(JsonReader jsonReader, w41 w41Var) {
        String str;
        String str2;
        String str3;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        kq.a aVar = null;
        Instant instant = null;
        kq.b bVar = null;
        String str8 = null;
        Instant instant2 = null;
        kq.d dVar = null;
        Tone tone = null;
        Instant instant3 = null;
        kq.c cVar = null;
        while (true) {
            switch (jsonReader.l1(b)) {
                case 0:
                    str4 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 1:
                    str3 = str4;
                    str5 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str4 = str3;
                case 2:
                    str3 = str4;
                    str6 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str4 = str3;
                case 3:
                    str3 = str4;
                    str7 = (String) j8.a.fromJson(jsonReader, w41Var);
                    str4 = str3;
                case 4:
                    str = str4;
                    str2 = str5;
                    aVar = (kq.a) j8.d(mq.a, false, 1, null).fromJson(jsonReader, w41Var);
                    str4 = str;
                    str5 = str2;
                case 5:
                    instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 6:
                    str = str4;
                    str2 = str5;
                    bVar = (kq.b) j8.b(j8.d(nq.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str4 = str;
                    str5 = str2;
                case 7:
                    str8 = (String) j8.a.fromJson(jsonReader, w41Var);
                case 8:
                    instant2 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 9:
                    dVar = (kq.d) j8.b(j8.c(pq.a, true)).fromJson(jsonReader, w41Var);
                case 10:
                    tone = Tone_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
                case 11:
                    instant3 = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
                case 12:
                    str = str4;
                    str2 = str5;
                    cVar = (kq.c) j8.b(j8.d(oq.a, false, 1, null)).fromJson(jsonReader, w41Var);
                    str4 = str;
                    str5 = str2;
            }
            if (str4 == null) {
                vr.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            }
            if (str5 == null) {
                vr.a(jsonReader, "assetID");
                throw new KotlinNothingValueException();
            }
            if (str6 == null) {
                vr.a(jsonReader, "uri");
                throw new KotlinNothingValueException();
            }
            if (str7 == null) {
                vr.a(jsonReader, "url");
                throw new KotlinNothingValueException();
            }
            if (aVar == null) {
                vr.a(jsonReader, "commentProperties");
                throw new KotlinNothingValueException();
            }
            if (str8 == null) {
                vr.a(jsonReader, "summary");
                throw new KotlinNothingValueException();
            }
            if (tone != null) {
                return new kq(str4, str5, str6, str7, aVar, instant, bVar, str8, instant2, dVar, tone, instant3, cVar);
            }
            vr.a(jsonReader, "tone");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kq kqVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kqVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, kqVar.m());
        lu3Var.name("assetID");
        h8Var.toJson(lu3Var, w41Var, kqVar.a());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, kqVar.k());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, kqVar.l());
        lu3Var.name("commentProperties");
        j8.d(mq.a, false, 1, null).toJson(lu3Var, w41Var, kqVar.b());
        lu3Var.name("fingerprint");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, kqVar.c());
        lu3Var.name("headlineInfo");
        j8.b(j8.d(nq.a, false, 1, null)).toJson(lu3Var, w41Var, kqVar.d());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, kqVar.i());
        lu3Var.name("lastUpdatedDate");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, kqVar.g());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(pq.a, true)).toJson(lu3Var, w41Var, kqVar.h());
        lu3Var.name("tone");
        Tone_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, kqVar.j());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, kqVar.f());
        lu3Var.name("hybridBody");
        j8.b(j8.d(oq.a, false, 1, null)).toJson(lu3Var, w41Var, kqVar.e());
    }
}
