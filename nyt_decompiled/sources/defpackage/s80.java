package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.vd2;

/* loaded from: classes.dex */
public final class s80 implements vd2 {
    private final Bitmap a;
    private final uk5 b;

    public static final class a implements vd2.a {
        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Bitmap bitmap, uk5 uk5Var, ImageLoader imageLoader) {
            return new s80(bitmap, uk5Var);
        }
    }

    public s80(Bitmap bitmap, uk5 uk5Var) {
        this.a = bitmap;
        this.b = uk5Var;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        return new pv1(new BitmapDrawable(this.b.g().getResources(), this.a), false, DataSource.MEMORY);
    }
}
