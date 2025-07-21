package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.p;
import defpackage.wq8;
import defpackage.yg0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class q {
    private static final AtomicInteger m = new AtomicInteger();
    private final Picasso a;
    private final p.b b;
    private boolean c;
    private boolean d;
    private boolean e = true;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private Object l;

    q(Picasso picasso, Uri uri, int i) {
        if (picasso.n) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.a = picasso;
        this.b = new p.b(uri, i, picasso.k);
    }

    private p d(long j) {
        int andIncrement = m.getAndIncrement();
        p a = this.b.a();
        a.a = andIncrement;
        a.b = j;
        boolean z = this.a.m;
        if (z) {
            w.u("Main", "created", a.g(), a.toString());
        }
        p p = this.a.p(a);
        if (p != a) {
            p.a = andIncrement;
            p.b = j;
            if (z) {
                w.u("Main", "changed", p.d(), "into " + p);
            }
        }
        return p;
    }

    private Drawable h() {
        int i = this.f;
        return i != 0 ? this.a.d.getDrawable(i) : this.j;
    }

    public q a() {
        this.b.b(17);
        return this;
    }

    public q b() {
        this.b.c();
        return this;
    }

    q c() {
        this.l = null;
        return this;
    }

    public q e(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.g = i;
        return this;
    }

    public q f() {
        this.d = true;
        return this;
    }

    public Bitmap g() {
        long nanoTime = System.nanoTime();
        w.d();
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.b.d()) {
            return null;
        }
        p d = d(nanoTime);
        i iVar = new i(this.a, d, this.h, this.i, this.l, w.h(d, new StringBuilder()));
        Picasso picasso = this.a;
        return c.g(picasso, picasso.e, picasso.f, picasso.g, iVar).t();
    }

    public void i(ImageView imageView) {
        j(imageView, null);
    }

    public void j(ImageView imageView, yg0 yg0Var) {
        Bitmap l;
        long nanoTime = System.nanoTime();
        w.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.b.d()) {
            this.a.b(imageView);
            if (this.e) {
                n.d(imageView, h());
                return;
            }
            return;
        }
        if (this.d) {
            if (this.b.e()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.e) {
                    n.d(imageView, h());
                }
                this.a.e(imageView, new f(this, imageView, yg0Var));
                return;
            }
            this.b.f(width, height);
        }
        p d = d(nanoTime);
        String g = w.g(d);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.h) || (l = this.a.l(g)) == null) {
            if (this.e) {
                n.d(imageView, h());
            }
            this.a.g(new j(this.a, imageView, d, this.h, this.i, this.g, this.k, g, this.l, yg0Var, this.c));
            return;
        }
        this.a.b(imageView);
        Picasso picasso = this.a;
        Context context = picasso.d;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        n.c(imageView, context, l, loadedFrom, this.c, picasso.l);
        if (this.a.m) {
            w.u("Main", "completed", d.g(), "from " + loadedFrom);
        }
        if (yg0Var != null) {
            yg0Var.onSuccess();
        }
    }

    public void k(u uVar) {
        Bitmap l;
        long nanoTime = System.nanoTime();
        w.c();
        if (uVar == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.b.d()) {
            this.a.c(uVar);
            uVar.c(this.e ? h() : null);
            return;
        }
        p d = d(nanoTime);
        String g = w.g(d);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.h) || (l = this.a.l(g)) == null) {
            uVar.c(this.e ? h() : null);
            this.a.g(new v(this.a, uVar, d, this.h, this.i, this.k, g, this.l, this.g));
        } else {
            this.a.c(uVar);
            uVar.a(l, Picasso.LoadedFrom.MEMORY);
        }
    }

    public q l(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.h = memoryPolicy.index | this.h;
        if (memoryPolicyArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.h = memoryPolicy2.index | this.h;
            }
        }
        return this;
    }

    public q m(int i) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f = i;
        return this;
    }

    public q n(Drawable drawable) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.f != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.j = drawable;
        return this;
    }

    public q o(int i, int i2) {
        this.b.f(i, i2);
        return this;
    }

    public q p(wq8 wq8Var) {
        this.b.g(wq8Var);
        return this;
    }

    q q() {
        this.d = false;
        return this;
    }
}
