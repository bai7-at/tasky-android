package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.wd5;
import java.io.InputStream;

/* loaded from: classes4.dex */
class e extends r {
    final Context a;

    e(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.r
    public boolean c(p pVar) {
        return "content".equals(pVar.d.getScheme());
    }

    @Override // com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        return new r.a(wd5.l(j(pVar)), Picasso.LoadedFrom.DISK);
    }

    InputStream j(p pVar) {
        return this.a.getContentResolver().openInputStream(pVar.d);
    }
}
