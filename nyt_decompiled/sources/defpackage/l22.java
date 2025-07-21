package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class l22 implements h8 {
    public static final l22 a = new l22();
    private static final List b = i.o("id", "headlineDefault", "summary", "firstPublished", "length", "fileUrl", "podcastSeries");

    private l22() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r6 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return new defpackage.g22(r1, r2, r3, r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        defpackage.vr.a(r11, "fileUrl");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        defpackage.vr.a(r11, "length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        defpackage.vr.a(r11, "summary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        defpackage.vr.a(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r5 = r0.intValue();
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g22 fromJson(com.apollographql.apollo.api.json.JsonReader r11, defpackage.w41 r12) {
        /*
            r10 = this;
            java.lang.String r10 = "reader"
            defpackage.zq3.h(r11, r10)
            java.lang.String r10 = "customScalarAdapters"
            defpackage.zq3.h(r12, r10)
            r10 = 0
            r0 = r10
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r6 = r4
            r7 = r6
        L12:
            java.util.List r5 = defpackage.l22.b
            int r5 = r11.l1(r5)
            r8 = 1
            r9 = 0
            switch(r5) {
                case 0: goto Lb3;
                case 1: goto La1;
                case 2: goto L97;
                case 3: goto L81;
                case 4: goto L78;
                case 5: goto L6e;
                case 6: goto L5c;
                default: goto L1d;
            }
        L1d:
            g22 r10 = new g22
            if (r1 == 0) goto L51
            if (r3 == 0) goto L46
            if (r0 == 0) goto L3b
            int r5 = r0.intValue()
            if (r6 == 0) goto L30
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L30:
            java.lang.String r10 = "fileUrl"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L3b:
            java.lang.String r10 = "length"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L46:
            java.lang.String r10 = "summary"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L51:
            java.lang.String r10 = "id"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L5c:
            o22 r5 = defpackage.o22.a
            ub5 r5 = defpackage.j8.d(r5, r9, r8, r10)
            ya5 r5 = defpackage.j8.b(r5)
            java.lang.Object r5 = r5.fromJson(r11, r12)
            r7 = r5
            g22$c r7 = (g22.c) r7
            goto L12
        L6e:
            h8 r5 = defpackage.j8.a
            java.lang.Object r5 = r5.fromJson(r11, r12)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            goto L12
        L78:
            h8 r0 = defpackage.j8.b
            java.lang.Object r0 = r0.fromJson(r11, r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L12
        L81:
            type.DateTime$Companion r4 = type.DateTime.Companion
            x41 r4 = r4.getType()
            h8 r4 = r12.h(r4)
            ya5 r4 = defpackage.j8.b(r4)
            java.lang.Object r4 = r4.fromJson(r11, r12)
            org.threeten.bp.Instant r4 = (org.threeten.bp.Instant) r4
            goto L12
        L97:
            h8 r3 = defpackage.j8.a
            java.lang.Object r3 = r3.fromJson(r11, r12)
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        La1:
            m22 r2 = defpackage.m22.a
            ub5 r2 = defpackage.j8.d(r2, r9, r8, r10)
            ya5 r2 = defpackage.j8.b(r2)
            java.lang.Object r2 = r2.fromJson(r11, r12)
            g22$a r2 = (g22.a) r2
            goto L12
        Lb3:
            h8 r1 = defpackage.j8.a
            java.lang.Object r1 = r1.fromJson(r11, r12)
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l22.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):g22");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, g22 g22Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(g22Var, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, g22Var.d());
        lu3Var.name("headlineDefault");
        j8.b(j8.d(m22.a, false, 1, null)).toJson(lu3Var, w41Var, g22Var.c());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, g22Var.g());
        lu3Var.name("firstPublished");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, g22Var.b());
        lu3Var.name("length");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(g22Var.e()));
        lu3Var.name("fileUrl");
        h8Var.toJson(lu3Var, w41Var, g22Var.a());
        lu3Var.name("podcastSeries");
        j8.b(j8.d(o22.a, false, 1, null)).toJson(lu3Var, w41Var, g22Var.f());
    }
}
