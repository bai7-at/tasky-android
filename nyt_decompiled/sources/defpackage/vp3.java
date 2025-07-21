package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.collections.i;
import type.adapter.InterestType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class vp3 implements h8 {
    public static final vp3 a = new vp3();
    private static final List b = i.o("__typename", "interestId", "interestType", "interestSubType", AuthenticationTokenClaims.JSON_KEY_NAME, "description", "promoImageURL", "isOpinion", "isEditorsPick");

    private vp3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return new defpackage.up3(r1, r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        defpackage.vr.a(r11, "interestSubType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        defpackage.vr.a(r11, "interestType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        defpackage.vr.a(r11, "interestId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        defpackage.vr.a(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r2 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r3 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.up3 fromJson(com.apollographql.apollo.api.json.JsonReader r11, defpackage.w41 r12) {
        /*
            r10 = this;
            java.lang.String r10 = "reader"
            defpackage.zq3.h(r11, r10)
            java.lang.String r10 = "customScalarAdapters"
            defpackage.zq3.h(r12, r10)
            r10 = 0
            r1 = r10
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L13:
            java.util.List r0 = defpackage.vp3.b
            int r0 = r11.l1(r0)
            switch(r0) {
                case 0: goto Laa;
                case 1: goto La0;
                case 2: goto L98;
                case 3: goto L8d;
                case 4: goto L83;
                case 5: goto L79;
                case 6: goto L6f;
                case 7: goto L65;
                case 8: goto L5b;
                default: goto L1c;
            }
        L1c:
            up3 r12 = new up3
            if (r1 == 0) goto L50
            if (r10 == 0) goto L45
            int r2 = r10.intValue()
            if (r3 == 0) goto L3a
            if (r4 == 0) goto L2f
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
        L2f:
            java.lang.String r10 = "interestSubType"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L3a:
            java.lang.String r10 = "interestType"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L45:
            java.lang.String r10 = "interestId"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L50:
            java.lang.String r10 = "__typename"
            defpackage.vr.a(r11, r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
        L5b:
            ya5 r0 = defpackage.j8.l
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r9 = r0
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L13
        L65:
            ya5 r0 = defpackage.j8.l
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r8 = r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L13
        L6f:
            ya5 r0 = defpackage.j8.i
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L13
        L79:
            ya5 r0 = defpackage.j8.i
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L13
        L83:
            ya5 r0 = defpackage.j8.i
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L13
        L8d:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L13
        L98:
            type.adapter.InterestType_ResponseAdapter r0 = type.adapter.InterestType_ResponseAdapter.INSTANCE
            type.InterestType r3 = r0.fromJson(r11, r12)
            goto L13
        La0:
            h8 r10 = defpackage.j8.b
            java.lang.Object r10 = r10.fromJson(r11, r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L13
        Laa:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r11, r12)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp3.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):up3");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, up3 up3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(up3Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, up3Var.g());
        lu3Var.name("interestId");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(up3Var.b()));
        lu3Var.name("interestType");
        InterestType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, up3Var.d());
        lu3Var.name("interestSubType");
        h8Var.toJson(lu3Var, w41Var, up3Var.c());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, up3Var.e());
        lu3Var.name("description");
        ya5Var.toJson(lu3Var, w41Var, up3Var.a());
        lu3Var.name("promoImageURL");
        ya5Var.toJson(lu3Var, w41Var, up3Var.f());
        lu3Var.name("isOpinion");
        ya5 ya5Var2 = j8.l;
        ya5Var2.toJson(lu3Var, w41Var, up3Var.i());
        lu3Var.name("isEditorsPick");
        ya5Var2.toJson(lu3Var, w41Var, up3Var.h());
    }
}
