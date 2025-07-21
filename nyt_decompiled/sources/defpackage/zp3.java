package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class zp3 implements h8 {
    public static final zp3 a = new zp3();
    private static final List b = i.o("__typename", "uri", "url", TransferTable.COLUMN_TYPE, "caption", "lastModified", "lastMajorModification", "crops");

    private zp3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return new defpackage.wp3(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        defpackage.vr.a(r12, "crops");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        defpackage.vr.a(r12, com.amazonaws.mobileconnectors.s3.transferutility.TransferTable.COLUMN_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        defpackage.vr.a(r12, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        defpackage.vr.a(r12, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        defpackage.vr.a(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.wp3 fromJson(com.apollographql.apollo.api.json.JsonReader r12, defpackage.w41 r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp3.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):wp3");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wp3 wp3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(wp3Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, wp3Var.h());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, wp3Var.f());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, wp3Var.g());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, wp3Var.e());
        lu3Var.name("caption");
        j8.b(j8.d(xp3.a, false, 1, null)).toJson(lu3Var, w41Var, wp3Var.a());
        lu3Var.name("lastModified");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, wp3Var.d());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, wp3Var.c());
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(yp3.a, false, 1, null))).toJson(lu3Var, w41Var, wp3Var.b());
    }
}
