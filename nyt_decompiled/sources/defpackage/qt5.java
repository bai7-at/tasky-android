package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.u;

/* loaded from: classes4.dex */
public final class qt5 implements u {
    private final uy6 a;

    public qt5(uy6 uy6Var) {
        zq3.h(uy6Var, "target");
        this.a = uy6Var;
    }

    @Override // com.squareup.picasso.u
    public void a(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.a.b(bitmap, st5.a(loadedFrom));
    }

    @Override // com.squareup.picasso.u
    public void b(Exception exc, Drawable drawable) {
        this.a.c(exc, drawable);
    }

    @Override // com.squareup.picasso.u
    public void c(Drawable drawable) {
        this.a.a(drawable);
    }
}
