package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.v62;
import defpackage.wd5;

/* loaded from: classes4.dex */
class h extends e {
    h(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new v62(uri.getPath()).c("Orientation", 1);
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.r
    public boolean c(p pVar) {
        return TransferTable.COLUMN_FILE.equals(pVar.d.getScheme());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        return new r.a(null, wd5.l(j(pVar)), Picasso.LoadedFrom.DISK, k(pVar.d));
    }
}
