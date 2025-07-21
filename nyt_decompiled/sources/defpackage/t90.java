package defpackage;

import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class t90 implements h8 {
    public static final t90 a = new t90();
    private static final List b = i.o("__typename", "id", "author", "title", "description", "imageUrl", "imageWidth", "imageHeight", "rank", "rankLastWeek", "weeksOnList", "bookReviewUrl", "firstChapterUrl", "sundayReviewUrl", "articleChapterUrl", "buyLinks");

    private t90() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r2 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r12 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r14 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r19 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return new defpackage.o90(r4, r5, r6, r7, r8, r9, r10, r11, r2, r13, r14, r15, r16, r17, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        defpackage.vr.a(r22, "buyLinks");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        defpackage.vr.a(r22, "weeksOnList");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        defpackage.vr.a(r22, "rank");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        defpackage.vr.a(r22, "description");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        defpackage.vr.a(r22, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        defpackage.vr.a(r22, "author");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        defpackage.vr.a(r22, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        defpackage.vr.a(r22, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7 == null) goto L26;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.o90 fromJson(com.apollographql.apollo.api.json.JsonReader r22, defpackage.w41 r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t90.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):o90");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, o90 o90Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(o90Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, o90Var.p());
        lu3Var.name("id");
        h8Var.toJson(lu3Var, w41Var, o90Var.g());
        lu3Var.name("author");
        h8Var.toJson(lu3Var, w41Var, o90Var.b());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, o90Var.n());
        lu3Var.name("description");
        h8Var.toJson(lu3Var, w41Var, o90Var.e());
        lu3Var.name("imageUrl");
        j8.i.toJson(lu3Var, w41Var, o90Var.i());
        lu3Var.name("imageWidth");
        ya5 ya5Var = j8.k;
        ya5Var.toJson(lu3Var, w41Var, o90Var.j());
        lu3Var.name("imageHeight");
        ya5Var.toJson(lu3Var, w41Var, o90Var.h());
        lu3Var.name("rank");
        h8 h8Var2 = j8.b;
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(o90Var.k()));
        lu3Var.name("rankLastWeek");
        ya5Var.toJson(lu3Var, w41Var, o90Var.l());
        lu3Var.name("weeksOnList");
        h8Var2.toJson(lu3Var, w41Var, Integer.valueOf(o90Var.o()));
        lu3Var.name("bookReviewUrl");
        ya5 ya5Var2 = j8.m;
        ya5Var2.toJson(lu3Var, w41Var, o90Var.c());
        lu3Var.name("firstChapterUrl");
        ya5Var2.toJson(lu3Var, w41Var, o90Var.f());
        lu3Var.name("sundayReviewUrl");
        ya5Var2.toJson(lu3Var, w41Var, o90Var.m());
        lu3Var.name("articleChapterUrl");
        ya5Var2.toJson(lu3Var, w41Var, o90Var.a());
        lu3Var.name("buyLinks");
        j8.a(j8.d(u90.a, false, 1, null)).toJson(lu3Var, w41Var, o90Var.d());
    }
}
