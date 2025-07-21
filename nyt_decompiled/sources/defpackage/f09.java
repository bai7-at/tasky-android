package defpackage;

import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class f09 implements h8 {
    public static final f09 a = new f09();
    private static final List b = i.o("bundleType", "cancellationDate", "subscriptionName", "isFreeTrial", "hasQueuedSub", "startDate", "endDate", "status", "entitlements", "graceStartDate", "graceEndDate", "hasTransactionInProgress", "hasActiveEntitlements", "billingSource", "ownershipStatus", "promotionTierType", "subscriptionProducts", "subscriptionLabels");

    private f09() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r12 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r17 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r18 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r19 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r20 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r21 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return new yz8.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        defpackage.vr.a(r23, "subscriptionLabels");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        defpackage.vr.a(r23, "subscriptionProducts");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        defpackage.vr.a(r23, "promotionTierType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        defpackage.vr.a(r23, "ownershipStatus");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        defpackage.vr.a(r23, "billingSource");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        defpackage.vr.a(r23, "entitlements");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        defpackage.vr.a(r23, "isFreeTrial");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        defpackage.vr.a(r23, "subscriptionName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        defpackage.vr.a(r23, "bundleType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r7 = r2.booleanValue();
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yz8.h fromJson(com.apollographql.apollo.api.json.JsonReader r23, defpackage.w41 r24) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f09.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):yz8$h");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("bundleType");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, hVar.d());
        lu3Var.name("cancellationDate");
        ya5 ya5Var = j8.m;
        ya5Var.toJson(lu3Var, w41Var, hVar.e());
        lu3Var.name("subscriptionName");
        h8Var.toJson(lu3Var, w41Var, hVar.r());
        lu3Var.name("isFreeTrial");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(hVar.t()));
        lu3Var.name("hasQueuedSub");
        ya5 ya5Var2 = j8.l;
        ya5Var2.toJson(lu3Var, w41Var, hVar.k());
        lu3Var.name("startDate");
        ya5Var.toJson(lu3Var, w41Var, hVar.o());
        lu3Var.name("endDate");
        ya5Var.toJson(lu3Var, w41Var, hVar.f());
        lu3Var.name("status");
        j8.b(o19.a).toJson(lu3Var, w41Var, hVar.p());
        lu3Var.name("entitlements");
        j8.a(j8.i).toJson(lu3Var, w41Var, hVar.g());
        lu3Var.name("graceStartDate");
        ya5Var.toJson(lu3Var, w41Var, hVar.i());
        lu3Var.name("graceEndDate");
        ya5Var.toJson(lu3Var, w41Var, hVar.h());
        lu3Var.name("hasTransactionInProgress");
        ya5Var2.toJson(lu3Var, w41Var, hVar.l());
        lu3Var.name("hasActiveEntitlements");
        ya5Var2.toJson(lu3Var, w41Var, hVar.j());
        lu3Var.name("billingSource");
        h8Var.toJson(lu3Var, w41Var, hVar.c());
        lu3Var.name("ownershipStatus");
        n19.a.toJson(lu3Var, w41Var, hVar.m());
        lu3Var.name("promotionTierType");
        h8Var.toJson(lu3Var, w41Var, hVar.n());
        lu3Var.name("subscriptionProducts");
        j8.a(h8Var).toJson(lu3Var, w41Var, hVar.s());
        lu3Var.name("subscriptionLabels");
        j8.a(h8Var).toJson(lu3Var, w41Var, hVar.q());
    }
}
