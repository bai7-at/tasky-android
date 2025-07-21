package defpackage;

import defpackage.sg5;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;

/* loaded from: classes3.dex */
public final class tg5 implements h8 {
    public static final tg5 a = new tg5();
    private static final List b = i.o("__typename", "unit", "campaign", "audience", "viewCount", "lastSeenOn", "dismissed");

    private tg5() {
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
    
        return new sg5.a(r1, r2, r3, r4, r5, r6, r7);
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sg5.a fromJson(com.apollographql.apollo.api.json.JsonReader r9, defpackage.w41 r10) {
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
            java.util.List r8 = defpackage.tg5.b
            int r8 = r9.l1(r8)
            switch(r8) {
                case 0: goto L77;
                case 1: goto L6d;
                case 2: goto L63;
                case 3: goto L59;
                case 4: goto L4f;
                case 5: goto L39;
                case 6: goto L2f;
                default: goto L1b;
            }
        L1b:
            sg5$a r8 = new sg5$a
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
            ya5 r8 = defpackage.j8.l
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r7 = r8
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L12
        L39:
            type.DateTime$Companion r8 = type.DateTime.Companion
            x41 r8 = r8.getType()
            h8 r8 = r10.h(r8)
            ya5 r8 = defpackage.j8.b(r8)
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r6 = r8
            org.threeten.bp.Instant r6 = (org.threeten.bp.Instant) r6
            goto L12
        L4f:
            ya5 r8 = defpackage.j8.k
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r5 = r8
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L12
        L59:
            ya5 r8 = defpackage.j8.i
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        L63:
            ya5 r8 = defpackage.j8.i
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        L6d:
            ya5 r8 = defpackage.j8.i
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        L77:
            h8 r8 = defpackage.j8.a
            java.lang.Object r8 = r8.fromJson(r9, r10)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):sg5$a");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, sg5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.g());
        lu3Var.name("unit");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, aVar.e());
        lu3Var.name("campaign");
        ya5Var.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("audience");
        ya5Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("viewCount");
        j8.k.toJson(lu3Var, w41Var, aVar.f());
        lu3Var.name("lastSeenOn");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, aVar.d());
        lu3Var.name("dismissed");
        j8.l.toJson(lu3Var, w41Var, aVar.c());
    }
}
