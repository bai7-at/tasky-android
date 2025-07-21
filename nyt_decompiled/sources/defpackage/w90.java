package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;
import type.adapter.BestSellerBookListType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class w90 implements h8 {
    public static final w90 a = new w90();
    private static final List b = i.o("__typename", "id", "listName", "listType", "displayName", "bestSellersDate", "publishedDate", "books");

    private w90() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return new defpackage.v90(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        defpackage.vr.a(r11, "publishedDate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        defpackage.vr.a(r11, "displayName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        defpackage.vr.a(r11, "listType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        defpackage.vr.a(r11, "listName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        defpackage.vr.a(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        defpackage.vr.a(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r4 == null) goto L18;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.v90 fromJson(com.apollographql.apollo.api.json.JsonReader r11, defpackage.w41 r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w90.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):v90");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, v90 v90Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(v90Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, v90Var.h());
        lu3Var.name("id");
        h8Var.toJson(lu3Var, w41Var, v90Var.d());
        lu3Var.name("listName");
        h8Var.toJson(lu3Var, w41Var, v90Var.e());
        lu3Var.name("listType");
        BestSellerBookListType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, v90Var.f());
        lu3Var.name("displayName");
        h8Var.toJson(lu3Var, w41Var, v90Var.c());
        lu3Var.name("bestSellersDate");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, v90Var.a());
        lu3Var.name("publishedDate");
        w41Var.h(companion.getType()).toJson(lu3Var, w41Var, v90Var.g());
        lu3Var.name("books");
        j8.b(j8.d(x90.a, false, 1, null)).toJson(lu3Var, w41Var, v90Var.b());
    }
}
