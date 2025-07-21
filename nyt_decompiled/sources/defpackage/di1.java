package defpackage;

import android.content.Context;
import com.iteratehq.iterate.data.remote.DefaultIterateApi;
import com.iteratehq.iterate.model.EmbedContext;
import com.iteratehq.iterate.model.StringToAnyMap;
import com.iteratehq.iterate.model.Survey;
import defpackage.vr3;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes3.dex */
public final class di1 implements zr3 {
    private vr3 a;
    private final yr3 b;
    private final as3 c;

    public di1(Context context, String str, boolean z, vr3 vr3Var, yr3 yr3Var, as3 as3Var) {
        zq3.h(context, "context");
        zq3.h(str, "apiKey");
        zq3.h(vr3Var, "iterateApi");
        zq3.h(yr3Var, "iterateInMemoryStore");
        zq3.h(as3Var, "iterateSharedPrefs");
        this.a = vr3Var;
        this.b = yr3Var;
        this.c = as3Var;
    }

    @Override // defpackage.zr3
    public void a(StringToAnyMap stringToAnyMap) {
        zq3.h(stringToAnyMap, "userTraits");
        this.c.a(stringToAnyMap);
    }

    @Override // defpackage.zr3
    public void b(String str) {
        zq3.h(str, "companyAuthToken");
        this.b.b(str);
    }

    @Override // defpackage.zr3
    public StringToAnyMap c() {
        return this.c.c();
    }

    @Override // defpackage.zr3
    public String d() {
        return this.b.d();
    }

    @Override // defpackage.zr3
    public void e(long j) {
        this.c.e(j);
    }

    @Override // defpackage.zr3
    public String f() {
        return this.b.f();
    }

    @Override // defpackage.zr3
    public String g() {
        return this.c.g();
    }

    @Override // defpackage.zr3
    public void h(String str) {
        zq3.h(str, "userAuthToken");
        this.c.h(str);
    }

    @Override // defpackage.zr3
    public void i(EmbedContext embedContext, qj qjVar) {
        zq3.h(embedContext, "embedContext");
        this.a.i(embedContext, qjVar);
    }

    @Override // defpackage.zr3
    public Long j() {
        return this.c.j();
    }

    @Override // defpackage.zr3
    public void k() {
        String f = this.b.f();
        this.b.clear();
        this.c.clear();
        if (f != null) {
            this.b.b(f);
        }
    }

    @Override // defpackage.zr3
    public StringToAnyMap l(long j) {
        Map i = this.b.i();
        if (i != null) {
            return (StringToAnyMap) i.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // defpackage.zr3
    public void m(Survey survey) {
        zq3.h(survey, "survey");
        vr3.a.b(this.a, survey, null, 2, null);
    }

    @Override // defpackage.zr3
    public void n(StringToAnyMap stringToAnyMap, long j) {
        zq3.h(stringToAnyMap, "eventTraits");
        this.b.g(t.f(du8.a(Long.valueOf(j), stringToAnyMap)));
    }

    @Override // defpackage.zr3
    public void o(String str) {
        zq3.h(str, "apiKey");
        this.a = new DefaultIterateApi(str, null, null, 6, null);
    }

    @Override // defpackage.zr3
    public void p(Survey survey) {
        zq3.h(survey, "survey");
        vr3.a.a(this.a, survey, null, 2, null);
        this.b.h(null);
        this.b.g(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ di1(android.content.Context r12, java.lang.String r13, boolean r14, defpackage.vr3 r15, defpackage.yr3 r16, defpackage.as3 r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r11 = this;
            r0 = r18 & 4
            if (r0 == 0) goto L7
            r0 = 1
            r4 = r0
            goto L8
        L7:
            r4 = r14
        L8:
            r0 = r18 & 8
            if (r0 == 0) goto L18
            com.iteratehq.iterate.data.remote.DefaultIterateApi r0 = new com.iteratehq.iterate.data.remote.DefaultIterateApi
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            goto L19
        L18:
            r5 = r15
        L19:
            r0 = r18 & 16
            if (r0 == 0) goto L24
            ci1 r0 = new ci1
            r0.<init>()
            r6 = r0
            goto L26
        L24:
            r6 = r16
        L26:
            r0 = r18 & 32
            if (r0 == 0) goto L3a
            com.iteratehq.iterate.data.local.DefaultIterateSharedPrefs r0 = new com.iteratehq.iterate.data.local.DefaultIterateSharedPrefs
            android.content.Context r1 = r12.getApplicationContext()
            java.lang.String r2 = "context.applicationContext"
            defpackage.zq3.g(r1, r2)
            r0.<init>(r1, r4)
            r7 = r0
            goto L3c
        L3a:
            r7 = r17
        L3c:
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di1.<init>(android.content.Context, java.lang.String, boolean, vr3, yr3, as3, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
