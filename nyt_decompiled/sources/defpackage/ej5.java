package defpackage;

import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ej5 implements h8 {
    public static final ej5 a = new ej5();
    private static final List b = i.o("id", "headline", "summary", "url", "uri", "section", "bylines");

    private ej5() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return new defpackage.aj5(r1, r2, r3, r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        defpackage.vr.a(r11, "bylines");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        defpackage.vr.a(r11, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        defpackage.vr.a(r11, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        defpackage.vr.a(r11, "summary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        defpackage.vr.a(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.aj5 fromJson(com.apollographql.apollo.api.json.JsonReader r11, defpackage.w41 r12) {
        /*
            r10 = this;
            java.lang.String r10 = "reader"
            defpackage.zq3.h(r11, r10)
            java.lang.String r10 = "customScalarAdapters"
            defpackage.zq3.h(r12, r10)
            r10 = 0
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L12:
            java.util.List r0 = defpackage.ej5.b
            int r0 = r11.l1(r0)
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto Lbe;
                case 1: goto Lab;
                case 2: goto La0;
                case 3: goto L95;
                case 4: goto L8a;
                case 5: goto L78;
                case 6: goto L65;
                default: goto L1d;
            }
        L1d:
            aj5 r10 = new aj5
            if (r1 == 0) goto L5a
            if (r3 == 0) goto L4f
            if (r4 == 0) goto L44
            if (r5 == 0) goto L39
            if (r7 == 0) goto L2e
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L2e:
            java.lang.String r10 = "bylines"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L39:
            java.lang.String r10 = "uri"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L44:
            java.lang.String r10 = "url"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L4f:
            java.lang.String r10 = "summary"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L5a:
            java.lang.String r10 = "id"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L65:
            bj5 r0 = defpackage.bj5.a
            ub5 r0 = defpackage.j8.d(r0, r9, r8, r10)
            ya5 r0 = defpackage.j8.b(r0)
            s54 r0 = defpackage.j8.a(r0)
            java.util.List r7 = r0.fromJson(r11, r12)
            goto L12
        L78:
            fj5 r0 = defpackage.fj5.a
            ub5 r0 = defpackage.j8.d(r0, r9, r8, r10)
            ya5 r0 = defpackage.j8.b(r0)
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r6 = r0
            aj5$d r6 = (aj5.d) r6
            goto L12
        L8a:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L12
        L95:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        La0:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        Lab:
            dj5 r0 = defpackage.dj5.a
            ub5 r0 = defpackage.j8.d(r0, r9, r8, r10)
            ya5 r0 = defpackage.j8.b(r0)
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r2 = r0
            aj5$c r2 = (aj5.c) r2
            goto L12
        Lbe:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej5.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):aj5");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aj5 aj5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aj5Var, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aj5Var.c());
        lu3Var.name("headline");
        j8.b(j8.d(dj5.a, false, 1, null)).toJson(lu3Var, w41Var, aj5Var.b());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, aj5Var.e());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, aj5Var.g());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, aj5Var.f());
        lu3Var.name("section");
        j8.b(j8.d(fj5.a, false, 1, null)).toJson(lu3Var, w41Var, aj5Var.d());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(bj5.a, false, 1, null))).toJson(lu3Var, w41Var, aj5Var.a());
    }
}
