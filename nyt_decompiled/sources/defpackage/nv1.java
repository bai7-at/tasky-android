package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.vd2;

/* loaded from: classes.dex */
public final class nv1 implements vd2 {
    private final Drawable a;
    private final uk5 b;

    public static final class a implements vd2.a {
        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Drawable drawable, uk5 uk5Var, ImageLoader imageLoader) {
            return new nv1(drawable, uk5Var);
        }
    }

    public nv1(Drawable drawable, uk5 uk5Var) {
        this.a = drawable;
        this.b = uk5Var;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        Drawable drawable;
        boolean u = s.u(this.a);
        if (u) {
            drawable = new BitmapDrawable(this.b.g().getResources(), uv1.a.a(this.a, this.b.f(), this.b.o(), this.b.n(), this.b.c()));
        } else {
            drawable = this.a;
        }
        return new pv1(drawable, u, DataSource.MEMORY);
    }
}
