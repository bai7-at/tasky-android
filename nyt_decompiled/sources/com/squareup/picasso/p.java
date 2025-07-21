package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import defpackage.wq8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class p {
    private static final long u = TimeUnit.SECONDS.toNanos(5);
    int a;
    long b;
    int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final Picasso.Priority t;

    public static final class b {
        private Uri a;
        private int b;
        private String c;
        private int d;
        private int e;
        private boolean f;
        private int g;
        private boolean h;
        private boolean i;
        private float j;
        private float k;
        private float l;
        private boolean m;
        private boolean n;
        private List o;
        private Bitmap.Config p;
        private Picasso.Priority q;

        b(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.p = config;
        }

        public p a() {
            boolean z = this.h;
            if (z && this.f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.q == null) {
                this.q = Picasso.Priority.NORMAL;
            }
            return new p(this.a, this.b, this.c, this.o, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
        }

        public b b(int i) {
            if (this.h) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f = true;
            this.g = i;
            return this;
        }

        public b c() {
            if (this.f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.h = true;
            return this;
        }

        boolean d() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        boolean e() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }

        public b f(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.d = i;
            this.e = i2;
            return this;
        }

        public b g(wq8 wq8Var) {
            if (wq8Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (wq8Var.a() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.o == null) {
                this.o = new ArrayList(2);
            }
            this.o.add(wq8Var);
            return this;
        }
    }

    String a() {
        Uri uri = this.d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.e);
    }

    boolean b() {
        return this.g != null;
    }

    public boolean c() {
        return (this.h == 0 && this.i == 0) ? false : true;
    }

    String d() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean e() {
        return c() || this.n != 0.0f;
    }

    boolean f() {
        return e() || b();
    }

    String g() {
        return "[R" + this.a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.d);
        }
        List list = this.g;
        if (list != null && !list.isEmpty()) {
            for (wq8 wq8Var : this.g) {
                sb.append(' ');
                sb.append(wq8Var.a());
            }
        }
        if (this.f != null) {
            sb.append(" stableKey(");
            sb.append(this.f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.l) {
            sb.append(" centerInside");
        }
        if (this.n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.n);
            if (this.q) {
                sb.append(" @ ");
                sb.append(this.o);
                sb.append(',');
                sb.append(this.p);
            }
            sb.append(')');
        }
        if (this.r) {
            sb.append(" purgeable");
        }
        if (this.s != null) {
            sb.append(' ');
            sb.append(this.s);
        }
        sb.append('}');
        return sb.toString();
    }

    private p(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority) {
        this.d = uri;
        this.e = i;
        this.f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i2;
        this.i = i3;
        this.j = z;
        this.l = z2;
        this.k = i4;
        this.m = z3;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = z4;
        this.r = z5;
        this.s = config;
        this.t = priority;
    }
}
