package defpackage;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bz2;
import java.util.List;
import kotlin.collections.i;
import type.DateTime;
import type.adapter.InterestType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class gz2 implements h8 {
    public static final gz2 a = new gz2();
    private static final List b = i.o("__typename", "interestId", "interestType", "interestSubType", AuthenticationTokenClaims.JSON_KEY_NAME, "description", "promoImageURL", "isOpinion", "isEditorsPick", "autoAddedAt", "content");

    private gz2() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return new bz2.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        defpackage.vr.a(r13, "interestSubType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        defpackage.vr.a(r13, "interestType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        defpackage.vr.a(r13, "interestId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        defpackage.vr.a(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r2 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r3 == null) goto L15;
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bz2.f fromJson(com.apollographql.apollo.api.json.JsonReader r13, defpackage.w41 r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz2.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):bz2$f");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bz2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, fVar.i());
        lu3Var.name("interestId");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(fVar.d()));
        lu3Var.name("interestType");
        InterestType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, fVar.f());
        lu3Var.name("interestSubType");
        h8Var.toJson(lu3Var, w41Var, fVar.e());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, fVar.g());
        lu3Var.name("description");
        ya5Var.toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("promoImageURL");
        ya5Var.toJson(lu3Var, w41Var, fVar.h());
        lu3Var.name("isOpinion");
        ya5 ya5Var2 = j8.l;
        ya5Var2.toJson(lu3Var, w41Var, fVar.k());
        lu3Var.name("isEditorsPick");
        ya5Var2.toJson(lu3Var, w41Var, fVar.j());
        lu3Var.name("autoAddedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name("content");
        j8.b(j8.c(cz2.a, true)).toJson(lu3Var, w41Var, fVar.b());
    }
}
