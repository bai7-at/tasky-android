package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class b86 implements h8 {
    public static final b86 a = new b86();
    private static final List b = i.o("__typename", "uri", "url", TransferTable.COLUMN_TYPE, "sourceId", "firstPublished", "lastMajorModification", "lastModified");

    private b86() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return new defpackage.y76(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        defpackage.vr.a(r10, "sourceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        defpackage.vr.a(r10, com.amazonaws.mobileconnectors.s3.transferutility.TransferTable.COLUMN_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        defpackage.vr.a(r10, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        defpackage.vr.a(r10, "uri");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        defpackage.vr.a(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r4 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.y76 fromJson(com.apollographql.apollo.api.json.JsonReader r10, defpackage.w41 r11) {
        /*
            r9 = this;
            java.lang.String r9 = "reader"
            defpackage.zq3.h(r10, r9)
            java.lang.String r9 = "customScalarAdapters"
            defpackage.zq3.h(r11, r9)
            r9 = 0
            r1 = r9
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L13:
            java.util.List r9 = defpackage.b86.b
            int r9 = r10.l1(r9)
            switch(r9) {
                case 0: goto Ld3;
                case 1: goto Lc8;
                case 2: goto Lbd;
                case 3: goto Lb2;
                case 4: goto La7;
                case 5: goto L90;
                case 6: goto L7a;
                case 7: goto L64;
                default: goto L1c;
            }
        L1c:
            y76 r9 = new y76
            if (r1 == 0) goto L59
            if (r2 == 0) goto L4e
            if (r3 == 0) goto L43
            if (r4 == 0) goto L38
            if (r5 == 0) goto L2d
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L2d:
            java.lang.String r9 = "sourceId"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L38:
            java.lang.String r9 = "type"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L43:
            java.lang.String r9 = "url"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L4e:
            java.lang.String r9 = "uri"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L59:
            java.lang.String r9 = "__typename"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L64:
            type.DateTime$Companion r9 = type.DateTime.Companion
            x41 r9 = r9.getType()
            h8 r9 = r11.h(r9)
            ya5 r9 = defpackage.j8.b(r9)
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r8 = r9
            org.threeten.bp.Instant r8 = (org.threeten.bp.Instant) r8
            goto L13
        L7a:
            type.DateTime$Companion r9 = type.DateTime.Companion
            x41 r9 = r9.getType()
            h8 r9 = r11.h(r9)
            ya5 r9 = defpackage.j8.b(r9)
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r7 = r9
            org.threeten.bp.Instant r7 = (org.threeten.bp.Instant) r7
            goto L13
        L90:
            type.DateTime$Companion r9 = type.DateTime.Companion
            x41 r9 = r9.getType()
            h8 r9 = r11.h(r9)
            ya5 r9 = defpackage.j8.b(r9)
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r6 = r9
            org.threeten.bp.Instant r6 = (org.threeten.bp.Instant) r6
            goto L13
        La7:
            h8 r9 = defpackage.j8.a
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            goto L13
        Lb2:
            h8 r9 = defpackage.j8.a
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            goto L13
        Lbd:
            h8 r9 = defpackage.j8.a
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            goto L13
        Lc8:
            h8 r9 = defpackage.j8.a
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            goto L13
        Ld3:
            h8 r9 = defpackage.j8.a
            java.lang.Object r9 = r9.fromJson(r10, r11)
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b86.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):y76");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, y76 y76Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(y76Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, y76Var.h());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, y76Var.f());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, y76Var.g());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, y76Var.e());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, y76Var.d());
        lu3Var.name("firstPublished");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, y76Var.a());
        lu3Var.name("lastMajorModification");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, y76Var.b());
        lu3Var.name("lastModified");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, y76Var.c());
    }
}
