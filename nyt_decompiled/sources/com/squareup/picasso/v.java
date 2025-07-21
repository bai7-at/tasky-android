package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
final class v extends a {
    v(Picasso picasso, u uVar, p pVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, uVar, pVar, i, i2, i3, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.a
    void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        u uVar = (u) k();
        if (uVar != null) {
            uVar.a(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.a
    void c(Exception exc) {
        u uVar = (u) k();
        if (uVar != null) {
            if (this.g != 0) {
                uVar.b(exc, this.a.d.getResources().getDrawable(this.g));
            } else {
                uVar.b(exc, this.h);
            }
        }
    }
}
