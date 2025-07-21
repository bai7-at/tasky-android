package defpackage;

import defpackage.s56;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class u56 implements h8 {
    public static final u56 a = new u56();
    private static final List b = i.o("__typename", "assetID", "duration", "fileUrl", "fingerprint", "headlineInfo", "podcastCollection");

    private u56() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return new s56.b(r1, r2, r3, r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        defpackage.vr.a(r10, "fileUrl");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        defpackage.vr.a(r10, "duration");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        defpackage.vr.a(r10, "assetID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        defpackage.vr.a(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r3 = r0.intValue();
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s56.b fromJson(com.apollographql.apollo.api.json.JsonReader r10, defpackage.w41 r11) {
        /*
            r9 = this;
            java.lang.String r9 = "reader"
            defpackage.zq3.h(r10, r9)
            java.lang.String r9 = "customScalarAdapters"
            defpackage.zq3.h(r11, r9)
            r9 = 0
            r0 = r9
            r1 = r0
            r2 = r1
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L12:
            java.util.List r3 = defpackage.u56.b
            int r3 = r10.l1(r3)
            r8 = 1
            switch(r3) {
                case 0: goto Lb6;
                case 1: goto Lac;
                case 2: goto La2;
                case 3: goto L97;
                case 4: goto L80;
                case 5: goto L6d;
                case 6: goto L5b;
                default: goto L1c;
            }
        L1c:
            s56$b r9 = new s56$b
            if (r1 == 0) goto L50
            if (r2 == 0) goto L45
            if (r0 == 0) goto L3a
            int r3 = r0.intValue()
            if (r4 == 0) goto L2f
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L2f:
            java.lang.String r9 = "fileUrl"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L3a:
            java.lang.String r9 = "duration"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L45:
            java.lang.String r9 = "assetID"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L50:
            java.lang.String r9 = "__typename"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L5b:
            a66 r3 = defpackage.a66.a
            ub5 r3 = defpackage.j8.c(r3, r8)
            ya5 r3 = defpackage.j8.b(r3)
            java.lang.Object r3 = r3.fromJson(r10, r11)
            r7 = r3
            s56$h r7 = (s56.h) r7
            goto L12
        L6d:
            t56 r3 = defpackage.t56.a
            r6 = 0
            ub5 r3 = defpackage.j8.d(r3, r6, r8, r9)
            ya5 r3 = defpackage.j8.b(r3)
            java.lang.Object r3 = r3.fromJson(r10, r11)
            r6 = r3
            s56$a r6 = (s56.a) r6
            goto L12
        L80:
            type.DateTime$Companion r3 = type.DateTime.Companion
            x41 r3 = r3.getType()
            h8 r3 = r11.h(r3)
            ya5 r3 = defpackage.j8.b(r3)
            java.lang.Object r3 = r3.fromJson(r10, r11)
            r5 = r3
            org.threeten.bp.Instant r5 = (org.threeten.bp.Instant) r5
            goto L12
        L97:
            h8 r3 = defpackage.j8.a
            java.lang.Object r3 = r3.fromJson(r10, r11)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        La2:
            h8 r0 = defpackage.j8.b
            java.lang.Object r0 = r0.fromJson(r10, r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L12
        Lac:
            h8 r2 = defpackage.j8.a
            java.lang.Object r2 = r2.fromJson(r10, r11)
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        Lb6:
            h8 r1 = defpackage.j8.a
            java.lang.Object r1 = r1.fromJson(r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u56.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):s56$b");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, bVar.g());
        lu3Var.name("assetID");
        h8Var.toJson(lu3Var, w41Var, bVar.a());
        lu3Var.name("duration");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(bVar.b()));
        lu3Var.name("fileUrl");
        h8Var.toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("fingerprint");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, bVar.d());
        lu3Var.name("headlineInfo");
        j8.b(j8.d(t56.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.e());
        lu3Var.name("podcastCollection");
        j8.b(j8.c(a66.a, true)).toJson(lu3Var, w41Var, bVar.f());
    }
}
