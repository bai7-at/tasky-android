package defpackage;

import defpackage.xz2;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class a03 implements h8 {
    public static final a03 a = new a03();
    private static final List b = i.o("__typename", "shareCreationDate", "shareExpirationDate", "shareIsExpired", "shareCode", "shareViews", "asset");

    private a03() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        defpackage.vr.a(r9, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        return new xz2.d(r1, r2, r3, r4, r5, r6, r7);
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xz2.d fromJson(com.apollographql.apollo.api.json.JsonReader r9, defpackage.w41 r10) {
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
            java.util.List r8 = defpackage.a03.b
            int r8 = r9.l1(r8)
            switch(r8) {
                case 0: goto L8c;
                case 1: goto L76;
                case 2: goto L60;
                case 3: goto L56;
                case 4: goto L4c;
                case 5: goto L42;
                case 6: goto L2f;
                default: goto L1b;
            }
        L1b:
            xz2$d r8 = new xz2$d
            if (r1 == 0) goto L24
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L24:
            java.lang.String r8 = "__typename"
            defpackage.vr.a(r9, r8)
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
            r8.<init>()
            throw r8
        L2f:
            yz2 r8 = defpackage.yz2.a
            r0 = 1
            ub5 r8 = defpackage.j8.c(r8, r0)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r7 = r8
            xz2$a r7 = (xz2.a) r7
            goto L12
        L42:
            ya5 r8 = defpackage.j8.k
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r6 = r8
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L12
        L4c:
            ya5 r8 = defpackage.j8.i
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            goto L12
        L56:
            ya5 r8 = defpackage.j8.l
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r4 = r8
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L12
        L60:
            type.DateTime$Companion r8 = type.DateTime.Companion
            x41 r8 = r8.getType()
            h8 r8 = r10.h(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r3 = r8
            org.threeten.bp.Instant r3 = (org.threeten.bp.Instant) r3
            goto L12
        L76:
            type.DateTime$Companion r8 = type.DateTime.Companion
            x41 r8 = r8.getType()
            h8 r8 = r10.h(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r2 = r8
            org.threeten.bp.Instant r2 = (org.threeten.bp.Instant) r2
            goto L12
        L8c:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a03.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):xz2$d");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xz2.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, dVar.g());
        lu3Var.name("shareCreationDate");
        DateTime.Companion companion = DateTime.Companion;
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, dVar.c());
        lu3Var.name("shareExpirationDate");
        j8.b(w41Var.h(companion.getType())).toJson(lu3Var, w41Var, dVar.d());
        lu3Var.name("shareIsExpired");
        j8.l.toJson(lu3Var, w41Var, dVar.e());
        lu3Var.name("shareCode");
        j8.i.toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("shareViews");
        j8.k.toJson(lu3Var, w41Var, dVar.f());
        lu3Var.name("asset");
        j8.b(j8.c(yz2.a, true)).toJson(lu3Var, w41Var, dVar.a());
    }
}
