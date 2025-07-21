package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.wd5;

/* loaded from: classes4.dex */
class b extends r {
    private static final int d = 22;
    private final Context a;
    private final Object b = new Object();
    private AssetManager c;

    b(Context context) {
        this.a = context;
    }

    static String j(p pVar) {
        return pVar.d.toString().substring(d);
    }

    @Override // com.squareup.picasso.r
    public boolean c(p pVar) {
        Uri uri = pVar.d;
        return TransferTable.COLUMN_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        if (this.c == null) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        this.c = this.a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new r.a(wd5.l(this.c.open(j(pVar))), Picasso.LoadedFrom.DISK);
    }
}
