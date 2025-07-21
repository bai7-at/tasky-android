package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes2.dex */
public final class e04 implements cz6, rj3 {
    private final Resources a;
    private final cz6 b;

    private e04(Resources resources, cz6 cz6Var) {
        this.a = (Resources) z06.d(resources);
        this.b = (cz6) z06.d(cz6Var);
    }

    public static cz6 f(Resources resources, cz6 cz6Var) {
        if (cz6Var == null) {
            return null;
        }
        return new e04(resources, cz6Var);
    }

    @Override // defpackage.cz6
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.rj3
    public void b() {
        cz6 cz6Var = this.b;
        if (cz6Var instanceof rj3) {
            ((rj3) cz6Var).b();
        }
    }

    @Override // defpackage.cz6
    public void c() {
        this.b.c();
    }

    @Override // defpackage.cz6
    public Class d() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.cz6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.get());
    }
}
