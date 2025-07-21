package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class of3 implements h8 {
    public static final of3 a = new of3();
    private static final List b = i.o("__typename", "uri", "credit", "caption", TransferTable.COLUMN_TYPE, "crops", "sourceId", "url", "lastModified", "lastMajorModification");

    private of3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return new defpackage.kf3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        defpackage.vr.a(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        defpackage.vr.a(r14, "sourceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        defpackage.vr.a(r14, "crops");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        defpackage.vr.a(r14, com.amazonaws.mobileconnectors.s3.transferutility.TransferTable.COLUMN_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        defpackage.vr.a(r14, "credit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        defpackage.vr.a(r14, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        defpackage.vr.a(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r5 == null) goto L21;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kf3 fromJson(com.apollographql.apollo.api.json.JsonReader r14, defpackage.w41 r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of3.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):kf3");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kf3 kf3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kf3Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, kf3Var.j());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, kf3Var.h());
        lu3Var.name("credit");
        h8Var.toJson(lu3Var, w41Var, kf3Var.b());
        lu3Var.name("caption");
        j8.b(j8.d(mf3.a, false, 1, null)).toJson(lu3Var, w41Var, kf3Var.a());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, kf3Var.g());
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(nf3.a, false, 1, null))).toJson(lu3Var, w41Var, kf3Var.c());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, kf3Var.f());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, kf3Var.i());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, kf3Var.e());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, kf3Var.d());
    }
}
