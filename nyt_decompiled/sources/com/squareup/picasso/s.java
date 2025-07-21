package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;

/* loaded from: classes4.dex */
class s extends r {
    private final Context a;

    s(Context context) {
        this.a = context;
    }

    private static Bitmap j(Resources resources, int i, p pVar) {
        BitmapFactory.Options d = r.d(pVar);
        if (r.g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            r.b(pVar.h, pVar.i, d, pVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    @Override // com.squareup.picasso.r
    public boolean c(p pVar) {
        if (pVar.e != 0) {
            return true;
        }
        return "android.resource".equals(pVar.d.getScheme());
    }

    @Override // com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        Resources n = w.n(this.a, pVar);
        return new r.a(j(n, w.m(n, pVar), pVar), Picasso.LoadedFrom.DISK);
    }
}
