package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class h56 implements h8 {
    public static final h56 a = new h56();
    private static final List b = i.o("__typename", "uri", "url", TransferTable.COLUMN_TYPE, "promotionalHeadline", "promotionalSummary", "firstPublished", "lastMajorModification", "lastModified", "targetUrl", "sourceId", "promotionalMedia");

    private h56() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return new defpackage.g56(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        defpackage.vr.a(r14, "sourceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        defpackage.vr.a(r14, "targetUrl");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        defpackage.vr.a(r14, "promotionalSummary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        defpackage.vr.a(r14, "promotionalHeadline");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        defpackage.vr.a(r14, com.amazonaws.mobileconnectors.s3.transferutility.TransferTable.COLUMN_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        defpackage.vr.a(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        defpackage.vr.a(r14, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        defpackage.vr.a(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g56 fromJson(com.apollographql.apollo.api.json.JsonReader r14, defpackage.w41 r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h56.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):g56");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, g56 g56Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(g56Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, g56Var.l());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, g56Var.j());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, g56Var.k());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, g56Var.i());
        lu3Var.name("promotionalHeadline");
        h8Var.toJson(lu3Var, w41Var, g56Var.d());
        lu3Var.name("promotionalSummary");
        h8Var.toJson(lu3Var, w41Var, g56Var.f());
        lu3Var.name("firstPublished");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, g56Var.a());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, g56Var.b());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, g56Var.c());
        lu3Var.name("targetUrl");
        h8Var.toJson(lu3Var, w41Var, g56Var.h());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, g56Var.g());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(i56.a, true)).toJson(lu3Var, w41Var, g56Var.e());
    }
}
