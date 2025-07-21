package defpackage;

import defpackage.ki9;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mi9 implements h8 {
    public static final mi9 a = new mi9();
    private static final List b = i.o("__typename", "id", "newsletterId", "slug", "title", "titleFont", "titleImage", "altTextLogo", "caption", "frequency", "altText", "sampleUrl", "thumbImageUrl", "allowedEntitlement", "subscriptionPageLink");

    private mi9() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return new ki9.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        defpackage.vr.a(r20, "titleFont");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        defpackage.vr.a(r20, "slug");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        defpackage.vr.a(r20, "newsletterId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        defpackage.vr.a(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        defpackage.vr.a(r20, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r7 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ki9.c fromJson(com.apollographql.apollo.api.json.JsonReader r20, defpackage.w41 r21) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi9.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):ki9$c");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ki9.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.o());
        lu3Var.name("id");
        h8Var.toJson(lu3Var, w41Var, cVar.f());
        lu3Var.name("newsletterId");
        h8Var.toJson(lu3Var, w41Var, cVar.g());
        lu3Var.name("slug");
        h8Var.toJson(lu3Var, w41Var, cVar.i());
        lu3Var.name("title");
        ya5 ya5Var = j8.m;
        ya5Var.toJson(lu3Var, w41Var, cVar.l());
        lu3Var.name("titleFont");
        h8Var.toJson(lu3Var, w41Var, cVar.m());
        lu3Var.name("titleImage");
        ya5Var.toJson(lu3Var, w41Var, cVar.n());
        lu3Var.name("altTextLogo");
        ya5Var.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("caption");
        ya5Var.toJson(lu3Var, w41Var, cVar.d());
        lu3Var.name("frequency");
        ya5Var.toJson(lu3Var, w41Var, cVar.e());
        lu3Var.name("altText");
        ya5Var.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("sampleUrl");
        ya5Var.toJson(lu3Var, w41Var, cVar.h());
        lu3Var.name("thumbImageUrl");
        ya5Var.toJson(lu3Var, w41Var, cVar.k());
        lu3Var.name("allowedEntitlement");
        ya5Var.toJson(lu3Var, w41Var, cVar.a());
        lu3Var.name("subscriptionPageLink");
        ya5Var.toJson(lu3Var, w41Var, cVar.j());
    }
}
