package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import defpackage.e46;
import defpackage.h80;
import defpackage.ku7;
import defpackage.lb6;
import defpackage.n86;
import defpackage.o86;
import defpackage.s3;
import defpackage.t3;
import defpackage.x6f;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0138a {
        private volatile q a;
        private final Context b;
        private volatile o86 c;

        /* synthetic */ C0138a(Context context, x6f x6fVar) {
            this.b = context;
        }

        public a a() {
            if (this.b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.a != null) {
                return this.c != null ? new b(null, this.a, this.b, this.c, null, null) : new b(null, this.a, this.b, null, null);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public C0138a b() {
            p pVar = new p(null);
            pVar.a();
            this.a = pVar.b();
            return this;
        }

        public C0138a c(o86 o86Var) {
            this.c = o86Var;
            return this;
        }
    }

    public static C0138a e(Context context) {
        return new C0138a(context, null);
    }

    public abstract void a(s3 s3Var, t3 t3Var);

    public abstract d b(String str);

    public abstract boolean c();

    public abstract d d(Activity activity, c cVar);

    public abstract void f(f fVar, e46 e46Var);

    public abstract void g(lb6 lb6Var, n86 n86Var);

    public abstract void h(g gVar, ku7 ku7Var);

    public abstract void i(h80 h80Var);
}
