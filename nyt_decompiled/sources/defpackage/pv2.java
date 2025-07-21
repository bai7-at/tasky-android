package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class pv2 implements h8 {
    public static final pv2 a = new pv2();
    private static final List b = i.o("__typename", "uri", "targetUrl", "promotionalHeadline", "promotionalSummary", "lastModified", "sourceId");

    private pv2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return new defpackage.ov2(r1, r2, r3, r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        defpackage.vr.a(r9, "sourceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        defpackage.vr.a(r9, "promotionalSummary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        defpackage.vr.a(r9, "promotionalHeadline");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        defpackage.vr.a(r9, "targetUrl");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        defpackage.vr.a(r9, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        defpackage.vr.a(r9, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r4 == null) goto L18;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ov2 fromJson(com.apollographql.apollo.api.json.JsonReader r9, defpackage.w41 r10) {
        /*
            r8 = this;
            java.lang.String r8 = "reader"
            defpackage.zq3.h(r9, r8)
            java.lang.String r8 = "customScalarAdapters"
            defpackage.zq3.h(r10, r8)
            r8 = 0
            r1 = r8
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L12:
            java.util.List r8 = defpackage.pv2.b
            int r8 = r9.l1(r8)
            switch(r8) {
                case 0: goto Lbc;
                case 1: goto Lb1;
                case 2: goto La6;
                case 3: goto L9b;
                case 4: goto L90;
                case 5: goto L7a;
                case 6: goto L70;
                default: goto L1b;
            }
        L1b:
            ov2 r8 = new ov2
            if (r1 == 0) goto L65
            if (r2 == 0) goto L5a
            if (r3 == 0) goto L4f
            if (r4 == 0) goto L44
            if (r5 == 0) goto L39
            if (r7 == 0) goto L2e
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L2e:
            java.lang.String r8 = "sourceId"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L39:
            java.lang.String r8 = "promotionalSummary"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L44:
            java.lang.String r8 = "promotionalHeadline"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L4f:
            java.lang.String r8 = "targetUrl"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L5a:
            java.lang.String r8 = "uri"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L65:
            java.lang.String r8 = "__typename"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L70:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            goto L12
        L7a:
            type.DateTime$Companion r8 = type.DateTime.Companion
            x41 r8 = r8.getType()
            h8 r8 = r10.h(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r6 = r8
            org.threeten.bp.Instant r6 = (org.threeten.bp.Instant) r6
            goto L12
        L90:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            goto L12
        L9b:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        La6:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        Lb1:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        Lbc:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv2.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):ov2");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ov2 ov2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(ov2Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, ov2Var.g());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, ov2Var.f());
        lu3Var.name("targetUrl");
        h8Var.toJson(lu3Var, w41Var, ov2Var.e());
        lu3Var.name("promotionalHeadline");
        h8Var.toJson(lu3Var, w41Var, ov2Var.b());
        lu3Var.name("promotionalSummary");
        h8Var.toJson(lu3Var, w41Var, ov2Var.c());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, ov2Var.a());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, ov2Var.d());
    }
}
