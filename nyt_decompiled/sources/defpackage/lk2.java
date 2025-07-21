package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class lk2 implements h8 {
    public static final lk2 a = new lk2();
    private static final List b = i.o("__typename", "score", "updatedAt", "answers", "event", AssetConstants.IMAGE_TYPE, "data");

    private lk2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return new defpackage.jk2(r1, r2, r3, r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        defpackage.vr.a(r9, com.nytimes.android.api.cms.AssetConstants.IMAGE_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        defpackage.vr.a(r9, "event");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        defpackage.vr.a(r9, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r6 == null) goto L11;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jk2 fromJson(com.apollographql.apollo.api.json.JsonReader r9, defpackage.w41 r10) {
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
            java.util.List r8 = defpackage.lk2.b
            int r8 = r9.l1(r8)
            switch(r8) {
                case 0: goto La4;
                case 1: goto L99;
                case 2: goto L82;
                case 3: goto L70;
                case 4: goto L66;
                case 5: goto L5c;
                case 6: goto L49;
                default: goto L1b;
            }
        L1b:
            jk2 r8 = new jk2
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L33
            if (r6 == 0) goto L28
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L28:
            java.lang.String r8 = "image"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L33:
            java.lang.String r8 = "event"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L3e:
            java.lang.String r8 = "__typename"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L49:
            kk2 r8 = defpackage.kk2.a
            r0 = 1
            ub5 r8 = defpackage.j8.c(r8, r0)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r7 = r8
            jk2$a r7 = (jk2.a) r7
            goto L12
        L5c:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            goto L12
        L66:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            goto L12
        L70:
            ya5 r8 = defpackage.j8.l
            s54 r8 = defpackage.j8.a(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            goto L12
        L82:
            type.DateTime$Companion r8 = type.DateTime.Companion
            x41 r8 = r8.getType()
            h8 r8 = r10.h(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r3 = r8
            org.threeten.bp.Instant r3 = (org.threeten.bp.Instant) r3
            goto L12
        L99:
            ya5 r8 = defpackage.j8.j
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r2 = r8
            java.lang.Double r2 = (java.lang.Double) r2
            goto L12
        La4:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk2.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):jk2");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, jk2 jk2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jk2Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, jk2Var.g());
        lu3Var.name("score");
        j8.j.toJson(lu3Var, w41Var, jk2Var.e());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, jk2Var.f());
        lu3Var.name("answers");
        j8.b(j8.a(j8.l)).toJson(lu3Var, w41Var, jk2Var.a());
        lu3Var.name("event");
        h8Var.toJson(lu3Var, w41Var, jk2Var.c());
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        h8Var.toJson(lu3Var, w41Var, jk2Var.d());
        lu3Var.name("data");
        j8.b(j8.c(kk2.a, true)).toJson(lu3Var, w41Var, jk2Var.b());
    }
}
