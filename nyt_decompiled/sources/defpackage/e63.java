package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;
import type.adapter.Tone_ResponseAdapter;

/* loaded from: classes3.dex */
public final class e63 implements h8 {
    public static final e63 a = new e63();
    private static final List b = i.o("__typename", "uri", "url", "summary", "headlineInfo", "lastModified", "promotionalMedia", "tone");

    private e63() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return new defpackage.d63(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        defpackage.vr.a(r11, "tone");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        defpackage.vr.a(r11, "summary");
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
    
        defpackage.vr.a(r11, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        defpackage.vr.a(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r4 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.d63 fromJson(com.apollographql.apollo.api.json.JsonReader r11, defpackage.w41 r12) {
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
            r8 = r7
        L13:
            java.util.List r0 = defpackage.e63.b
            int r0 = r11.l1(r0)
            r9 = 1
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lbf;
                case 2: goto Lb4;
                case 3: goto La9;
                case 4: goto L95;
                case 5: goto L7e;
                case 6: goto L6c;
                case 7: goto L65;
                default: goto L1d;
            }
        L1d:
            d63 r10 = new d63
            if (r1 == 0) goto L5a
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L44
            if (r4 == 0) goto L39
            if (r8 == 0) goto L2e
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L2e:
            java.lang.String r10 = "tone"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L39:
            java.lang.String r10 = "summary"
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
            java.lang.String r10 = "uri"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L5a:
            java.lang.String r10 = "__typename"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L65:
            type.adapter.Tone_ResponseAdapter r0 = type.adapter.Tone_ResponseAdapter.INSTANCE
            type.Tone r8 = r0.fromJson(r11, r12)
            goto L13
        L6c:
            g63 r0 = defpackage.g63.a
            ub5 r0 = defpackage.j8.c(r0, r9)
            ya5 r0 = defpackage.j8.b(r0)
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r7 = r0
            d63$b r7 = (d63.b) r7
            goto L13
        L7e:
            type.DateTime$Companion r0 = type.DateTime.Companion
            x41 r0 = r0.getType()
            h8 r0 = r12.h(r0)
            ya5 r0 = defpackage.j8.b(r0)
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r6 = r0
            org.threeten.bp.Instant r6 = (org.threeten.bp.Instant) r6
            goto L13
        L95:
            f63 r0 = defpackage.f63.a
            r5 = 0
            ub5 r0 = defpackage.j8.d(r0, r5, r9, r10)
            ya5 r0 = defpackage.j8.b(r0)
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r5 = r0
            d63$a r5 = (d63.a) r5
            goto L13
        La9:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L13
        Lb4:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L13
        Lbf:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L13
        Lca:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e63.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):d63");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d63 d63Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(d63Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, d63Var.h());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, d63Var.f());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, d63Var.g());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, d63Var.d());
        lu3Var.name("headlineInfo");
        j8.b(j8.d(f63.a, false, 1, null)).toJson(lu3Var, w41Var, d63Var.a());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, d63Var.b());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(g63.a, true)).toJson(lu3Var, w41Var, d63Var.c());
        lu3Var.name("tone");
        Tone_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, d63Var.e());
    }
}
