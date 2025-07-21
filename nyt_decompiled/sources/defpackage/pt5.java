package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.q;

/* loaded from: classes4.dex */
public final class pt5 implements fy6 {
    private final Picasso a;
    private q b;

    public pt5(Picasso picasso) {
        zq3.h(picasso, "picasso");
        this.a = picasso;
    }

    @Override // defpackage.fy6
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public pt5 i(Drawable drawable) {
        zq3.h(drawable, "drawable");
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.n(drawable);
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public pt5 n(int i, int i2) {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.o(i, i2);
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public pt5 m(bh3 bh3Var) {
        zq3.h(bh3Var, "transformation");
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.p(new rt5(bh3Var));
        return this;
    }

    @Override // defpackage.fy6
    public void a(ImageView imageView, gy6 gy6Var) {
        zq3.h(imageView, "imageView");
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.j(imageView, gy6Var != null ? new ot5(gy6Var) : null);
    }

    @Override // defpackage.fy6
    public void d(uy6 uy6Var) {
        zq3.h(uy6Var, "target");
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.k(new qt5(uy6Var));
    }

    @Override // defpackage.fy6
    public Bitmap get() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        Bitmap g = qVar.g();
        zq3.g(g, "get(...)");
        return g;
    }

    @Override // defpackage.fy6
    public void p(ImageView imageView) {
        zq3.h(imageView, "imageView");
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.i(imageView);
    }

    @Override // defpackage.fy6
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public pt5 f() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.a();
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public pt5 h() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.b();
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public pt5 e() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.l(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE);
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public pt5 c() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.l(MemoryPolicy.NO_STORE, new MemoryPolicy[0]);
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public pt5 k(int i) {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.e(i);
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public pt5 j() {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.f();
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public pt5 g(int i) {
        q i2 = this.a.i(i);
        zq3.g(i2, "load(...)");
        this.b = i2;
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public pt5 b(Uri uri) {
        q j = this.a.j(uri);
        zq3.g(j, "load(...)");
        this.b = j;
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public pt5 o(String str) {
        q k = this.a.k(str);
        zq3.g(k, "load(...)");
        this.b = k;
        return this;
    }

    @Override // defpackage.fy6
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public pt5 l(int i) {
        q qVar = this.b;
        if (qVar == null) {
            zq3.z("requestCreator");
            qVar = null;
        }
        qVar.m(i);
        return this;
    }
}
