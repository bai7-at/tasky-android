package com.skydoves.balloon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import defpackage.dg4;
import defpackage.z38;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g {
    private final Drawable a;
    private Integer b;
    private final IconGravity c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final CharSequence h;

    public static final class a {
        private final Context a;
        private Drawable b;
        private Integer c;
        private IconGravity d;
        private int e;
        private int f;
        private int g;
        private int h;
        private CharSequence i;

        public a(Context context) {
            zq3.h(context, "context");
            this.a = context;
            this.d = IconGravity.START;
            float f = 28;
            this.e = dg4.d(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.f = dg4.d(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.g = dg4.d(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.h = -1;
            z38 z38Var = z38.a;
            this.i = "";
        }

        public final g a() {
            return new g(this, null);
        }

        public final Drawable b() {
            return this.b;
        }

        public final Integer c() {
            return this.c;
        }

        public final int d() {
            return this.h;
        }

        public final CharSequence e() {
            return this.i;
        }

        public final IconGravity f() {
            return this.d;
        }

        public final int g() {
            return this.f;
        }

        public final int h() {
            return this.g;
        }

        public final int i() {
            return this.e;
        }

        public final a j(Drawable drawable) {
            this.b = drawable;
            return this;
        }

        public final a k(IconGravity iconGravity) {
            zq3.h(iconGravity, "value");
            this.d = iconGravity;
            return this;
        }

        public final a l(int i) {
            this.h = i;
            return this;
        }

        public final a m(int i) {
            this.f = i;
            return this;
        }

        public final a n(int i) {
            this.g = i;
            return this;
        }

        public final a o(int i) {
            this.e = i;
            return this;
        }
    }

    public /* synthetic */ g(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Drawable a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final int c() {
        return this.g;
    }

    public final CharSequence d() {
        return this.h;
    }

    public final IconGravity e() {
        return this.c;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.d;
    }

    private g(a aVar) {
        this.a = aVar.b();
        this.b = aVar.c();
        this.c = aVar.f();
        this.d = aVar.i();
        this.e = aVar.g();
        this.f = aVar.h();
        this.g = aVar.d();
        this.h = aVar.e();
    }
}
