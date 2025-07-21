package com.skydoves.balloon;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;
import defpackage.z38;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class h {
    private final CharSequence a;
    private final float b;
    private final int c;
    private final boolean d;
    private final MovementMethod e;
    private final int f;
    private final Typeface g;
    private final Float h;
    private final boolean i;
    private final Float j;
    private final int k;

    public static final class a {
        private final Context a;
        private CharSequence b;
        private float c;
        private int d;
        private boolean e;
        private MovementMethod f;
        private int g;
        private Typeface h;
        private Float i;
        private boolean j;
        private Float k;
        private int l;

        public a(Context context) {
            zq3.h(context, "context");
            this.a = context;
            z38 z38Var = z38.a;
            this.b = "";
            this.c = 12.0f;
            this.d = -1;
            this.j = true;
            this.l = 17;
        }

        public final h a() {
            return new h(this, null);
        }

        public final boolean b() {
            return this.j;
        }

        public final MovementMethod c() {
            return this.f;
        }

        public final CharSequence d() {
            return this.b;
        }

        public final int e() {
            return this.d;
        }

        public final int f() {
            return this.l;
        }

        public final boolean g() {
            return this.e;
        }

        public final Float h() {
            return this.k;
        }

        public final Float i() {
            return this.i;
        }

        public final float j() {
            return this.c;
        }

        public final int k() {
            return this.g;
        }

        public final Typeface l() {
            return this.h;
        }

        public final a m(CharSequence charSequence) {
            zq3.h(charSequence, "value");
            this.b = charSequence;
            return this;
        }

        public final a n(int i) {
            this.d = i;
            return this;
        }

        public final a o(int i) {
            this.l = i;
            return this;
        }

        public final a p(boolean z) {
            this.e = z;
            return this;
        }

        public final a q(Float f) {
            this.k = f;
            return this;
        }

        public final a r(Float f) {
            this.i = f;
            return this;
        }

        public final a s(float f) {
            this.c = f;
            return this;
        }

        public final a t(int i) {
            this.g = i;
            return this;
        }

        public final a u(Typeface typeface) {
            this.h = typeface;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final boolean a() {
        return this.i;
    }

    public final MovementMethod b() {
        return this.e;
    }

    public final CharSequence c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.k;
    }

    public final boolean f() {
        return this.d;
    }

    public final Float g() {
        return this.j;
    }

    public final Float h() {
        return this.h;
    }

    public final float i() {
        return this.b;
    }

    public final int j() {
        return this.f;
    }

    public final Typeface k() {
        return this.g;
    }

    private h(a aVar) {
        this.a = aVar.d();
        this.b = aVar.j();
        this.c = aVar.e();
        this.d = aVar.g();
        this.e = aVar.c();
        this.f = aVar.k();
        this.g = aVar.l();
        this.h = aVar.i();
        this.i = aVar.b();
        this.j = aVar.h();
        this.k = aVar.f();
    }
}
