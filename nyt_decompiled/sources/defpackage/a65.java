package defpackage;

import java.util.List;
import kotlin.collections.i;
import type.DateTime;
import type.adapter.InterestType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class a65 implements h8 {
    public static final a65 a = new a65();
    private static final List b = i.o("__typename", "updatedAt", "interestType", "score", "answers", "average", "answer", "question", "choices", "explanation", "statsCopy", "totalQuestions", "data");

    private a65() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        defpackage.vr.a(r19, "interestType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        defpackage.vr.a(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r4 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        return new defpackage.x55(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.x55 fromJson(com.apollographql.apollo.api.json.JsonReader r19, defpackage.w41 r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a65.fromJson(com.apollographql.apollo.api.json.JsonReader, w41):x55");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, x55 x55Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(x55Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, x55Var.m());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, x55Var.l());
        lu3Var.name("interestType");
        InterestType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, x55Var.g());
        lu3Var.name("score");
        j8.j.toJson(lu3Var, w41Var, x55Var.i());
        lu3Var.name("answers");
        j8.b(j8.a(j8.l)).toJson(lu3Var, w41Var, x55Var.b());
        lu3Var.name("average");
        ya5 ya5Var = j8.k;
        ya5Var.toJson(lu3Var, w41Var, x55Var.c());
        lu3Var.name("answer");
        ya5 ya5Var2 = j8.i;
        ya5Var2.toJson(lu3Var, w41Var, x55Var.a());
        lu3Var.name("question");
        ya5Var2.toJson(lu3Var, w41Var, x55Var.h());
        lu3Var.name("choices");
        j8.b(j8.a(j8.d(y55.a, false, 1, null))).toJson(lu3Var, w41Var, x55Var.d());
        lu3Var.name("explanation");
        ya5Var2.toJson(lu3Var, w41Var, x55Var.f());
        lu3Var.name("statsCopy");
        ya5Var2.toJson(lu3Var, w41Var, x55Var.j());
        lu3Var.name("totalQuestions");
        ya5Var.toJson(lu3Var, w41Var, x55Var.k());
        lu3Var.name("data");
        j8.b(j8.c(z55.a, true)).toJson(lu3Var, w41Var, x55Var.e());
    }
}
