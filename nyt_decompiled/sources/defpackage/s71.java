package defpackage;

import android.content.Context;
import defpackage.is8;

/* loaded from: classes2.dex */
final class s71 extends is8 {
    private p76 a;
    private p76 b;
    private p76 c;
    private p76 d;
    private p76 e;
    private p76 f;
    private p76 g;
    private p76 h;
    private p76 i;
    private p76 j;
    private p76 k;
    private p76 l;
    private p76 m;

    private static final class b implements is8.a {
        private Context a;

        private b() {
        }

        @Override // is8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.a = (Context) a16.b(context);
            return this;
        }

        @Override // is8.a
        public is8 build() {
            a16.a(this.a, Context.class);
            return new s71(this.a);
        }
    }

    public static is8.a d() {
        return new b();
    }

    private void h(Context context) {
        this.a = ot1.a(p62.a());
        ca2 a2 = yl3.a(context);
        this.b = a2;
        s21 a3 = s21.a(a2, bm8.a(), cm8.a());
        this.c = a3;
        this.d = ot1.a(os4.a(this.b, a3));
        this.e = xb7.a(this.b, z42.a(), b52.a());
        this.f = ot1.a(a52.a(this.b));
        this.g = ot1.a(d77.a(bm8.a(), cm8.a(), c52.a(), this.e, this.f));
        ob7 b2 = ob7.b(bm8.a());
        this.h = b2;
        qb7 a4 = qb7.a(this.b, this.g, b2, cm8.a());
        this.i = a4;
        p76 p76Var = this.a;
        p76 p76Var2 = this.d;
        p76 p76Var3 = this.g;
        this.j = kj1.a(p76Var, p76Var2, a4, p76Var3, p76Var3);
        p76 p76Var4 = this.b;
        p76 p76Var5 = this.d;
        p76 p76Var6 = this.g;
        this.k = qy8.a(p76Var4, p76Var5, p76Var6, this.i, this.a, p76Var6, bm8.a(), cm8.a(), this.g);
        p76 p76Var7 = this.a;
        p76 p76Var8 = this.g;
        this.l = ij9.a(p76Var7, p76Var8, this.i, p76Var8);
        this.m = ot1.a(js8.a(bm8.a(), cm8.a(), this.j, this.k, this.l));
    }

    @Override // defpackage.is8
    w42 a() {
        return (w42) this.g.get();
    }

    @Override // defpackage.is8
    hs8 b() {
        return (hs8) this.m.get();
    }

    private s71(Context context) {
        h(context);
    }
}
