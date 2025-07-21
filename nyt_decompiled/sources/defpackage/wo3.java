package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;
import type.adapter.Tone_ResponseAdapter;

/* loaded from: classes3.dex */
public final class wo3 implements h8 {
    public static final wo3 a = new wo3();
    private static final List b = i.o("__typename", "assetID", "uri", "url", "commentProperties", "fingerprint", "headlineInfo", "summary", "lastUpdatedDate", "promotionalMedia", "tone", "lastModified");

    private wo3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r14 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return new defpackage.to3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        defpackage.vr.a(r18, "tone");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        defpackage.vr.a(r18, "summary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        defpackage.vr.a(r18, "commentProperties");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        defpackage.vr.a(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        defpackage.vr.a(r18, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        defpackage.vr.a(r18, "assetID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        defpackage.vr.a(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7 == null) goto L21;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.to3 fromJson(com.apollographql.apollo.api.json.JsonReader r18, defpackage.w41 r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo3.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):to3");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, to3 to3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(to3Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, to3Var.l());
        lu3Var.name("assetID");
        h8Var.toJson(lu3Var, w41Var, to3Var.a());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, to3Var.j());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, to3Var.k());
        lu3Var.name("commentProperties");
        j8.d(uo3.a, false, 1, null).toJson(lu3Var, w41Var, to3Var.b());
        lu3Var.name("fingerprint");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, to3Var.c());
        lu3Var.name("headlineInfo");
        j8.b(j8.d(vo3.a, false, 1, null)).toJson(lu3Var, w41Var, to3Var.d());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, to3Var.h());
        lu3Var.name("lastUpdatedDate");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, to3Var.f());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(xo3.a, true)).toJson(lu3Var, w41Var, to3Var.g());
        lu3Var.name("tone");
        Tone_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, to3Var.i());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, to3Var.e());
    }
}
