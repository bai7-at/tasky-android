package defpackage;

import defpackage.tn2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class co2 implements h8 {
    public static final co2 a = new co2();
    private static final List b = i.o("__typename", "itemIdentifier", "kicker", "isEditorial", "packChannelURI", "promoText", "assets");

    private co2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return new tn2.j(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        defpackage.vr.a(r10, "assets");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        defpackage.vr.a(r10, "promoText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        defpackage.vr.a(r10, "packChannelURI");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        defpackage.vr.a(r10, "isEditorial");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        defpackage.vr.a(r10, "kicker");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        defpackage.vr.a(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r10.q();
        r8 = defpackage.mo2.a.fromJson(r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r4 = r9.booleanValue();
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tn2.j fromJson(com.apollographql.apollo.api.json.JsonReader r10, defpackage.w41 r11) {
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
            r5 = r3
            r6 = r5
            r7 = r6
        L11:
            java.util.List r0 = defpackage.co2.b
            int r0 = r10.l1(r0)
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto Lb7;
                case 2: goto Lac;
                case 3: goto La2;
                case 4: goto L97;
                case 5: goto L8c;
                case 6: goto L7c;
                default: goto L1a;
            }
        L1a:
            r10.q()
            mo2 r0 = defpackage.mo2.a
            ko2 r8 = r0.fromJson(r10, r11)
            tn2$j r11 = new tn2$j
            if (r1 == 0) goto L71
            if (r3 == 0) goto L66
            if (r9 == 0) goto L5b
            boolean r4 = r9.booleanValue()
            if (r5 == 0) goto L50
            if (r6 == 0) goto L45
            if (r7 == 0) goto L3a
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
        L3a:
            java.lang.String r9 = "assets"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L45:
            java.lang.String r9 = "promoText"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L50:
            java.lang.String r9 = "packChannelURI"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L5b:
            java.lang.String r9 = "isEditorial"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L66:
            java.lang.String r9 = "kicker"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L71:
            java.lang.String r9 = "__typename"
            defpackage.vr.a(r10, r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        L7c:
            wn2 r0 = defpackage.wn2.a
            r4 = 1
            ub5 r0 = defpackage.j8.c(r0, r4)
            s54 r0 = defpackage.j8.a(r0)
            java.util.List r7 = r0.fromJson(r10, r11)
            goto L11
        L8c:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r10, r11)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L11
        L97:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r10, r11)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L11
        La2:
            h8 r9 = defpackage.j8.f
            java.lang.Object r9 = r9.fromJson(r10, r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L11
        Lac:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r10, r11)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L11
        Lb7:
            ya5 r0 = defpackage.j8.i
            java.lang.Object r0 = r0.fromJson(r10, r11)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L11
        Lc2:
            h8 r0 = defpackage.j8.a
            java.lang.Object r0 = r0.fromJson(r10, r11)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co2.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):tn2$j");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, jVar.g());
        lu3Var.name("itemIdentifier");
        j8.i.toJson(lu3Var, w41Var, jVar.c());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, jVar.d());
        lu3Var.name("isEditorial");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(jVar.h()));
        lu3Var.name("packChannelURI");
        h8Var.toJson(lu3Var, w41Var, jVar.e());
        lu3Var.name("promoText");
        h8Var.toJson(lu3Var, w41Var, jVar.f());
        lu3Var.name("assets");
        j8.a(j8.c(wn2.a, true)).toJson(lu3Var, w41Var, jVar.a());
        mo2.a.toJson(lu3Var, w41Var, jVar.b());
    }
}
