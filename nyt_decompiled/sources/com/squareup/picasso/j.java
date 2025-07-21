package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import defpackage.yg0;

/* loaded from: classes4.dex */
class j extends a {
    yg0 m;

    j(Picasso picasso, ImageView imageView, p pVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, yg0 yg0Var, boolean z) {
        super(picasso, imageView, pVar, i, i2, i3, drawable, str, obj, z);
        this.m = yg0Var;
    }

    @Override // com.squareup.picasso.a
    void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.a;
        n.c(imageView, picasso.d, bitmap, loadedFrom, this.d, picasso.l);
        yg0 yg0Var = this.m;
        if (yg0Var != null) {
            yg0Var.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        yg0 yg0Var = this.m;
        if (yg0Var != null) {
            yg0Var.onError(exc);
        }
    }
}
