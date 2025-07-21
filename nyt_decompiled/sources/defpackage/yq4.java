package defpackage;

import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yq4 implements h8 {
    public static final yq4 a = new yq4();
    private static final List b = i.o("historyId", "action", "analytics", "body", "cadence", "cancelable", "kicker", "mediaResource", "placement", "presentationRule", "sequenceInfo", "weight");

    private yq4() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r2 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return new defpackage.tq4(r4, r5, r6, r7, r2, r9, r10, r11, r12, r13, r14, r8.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        defpackage.vr.a(r18, "weight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        defpackage.vr.a(r18, "placement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        defpackage.vr.a(r18, "cadence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        defpackage.vr.a(r18, "body");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        defpackage.vr.a(r18, "analytics");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        defpackage.vr.a(r18, "historyId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r3 == null) goto L19;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.tq4 fromJson(com.apollographql.apollo.api.json.JsonReader r18, defpackage.w41 r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq4.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):tq4");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tq4 tq4Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(tq4Var, "value");
        lu3Var.name("historyId");
        j8.a.toJson(lu3Var, w41Var, tq4Var.f());
        lu3Var.name("action");
        j8.b(j8.c(uq4.a, true)).toJson(lu3Var, w41Var, tq4Var.a());
        lu3Var.name("analytics");
        j8.d(vq4.a, false, 1, null).toJson(lu3Var, w41Var, tq4Var.b());
        lu3Var.name("body");
        j8.a(j8.d(wq4.a, false, 1, null)).toJson(lu3Var, w41Var, tq4Var.c());
        lu3Var.name("cadence");
        h8 h8Var = j8.b;
        h8Var.toJson(lu3Var, w41Var, Integer.valueOf(tq4Var.d()));
        lu3Var.name("cancelable");
        j8.l.toJson(lu3Var, w41Var, tq4Var.e());
        lu3Var.name("kicker");
        j8.i.toJson(lu3Var, w41Var, tq4Var.g());
        lu3Var.name("mediaResource");
        j8.b(j8.c(xq4.a, true)).toJson(lu3Var, w41Var, tq4Var.h());
        lu3Var.name("placement");
        j8.c(zq4.a, true).toJson(lu3Var, w41Var, tq4Var.i());
        lu3Var.name("presentationRule");
        j8.b(j8.c(ar4.a, true)).toJson(lu3Var, w41Var, tq4Var.j());
        lu3Var.name("sequenceInfo");
        j8.b(j8.d(br4.a, false, 1, null)).toJson(lu3Var, w41Var, tq4Var.k());
        lu3Var.name("weight");
        h8Var.toJson(lu3Var, w41Var, Integer.valueOf(tq4Var.l()));
    }
}
