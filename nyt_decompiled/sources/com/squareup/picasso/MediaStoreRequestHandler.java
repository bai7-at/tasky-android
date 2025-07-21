package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.wd5;

/* loaded from: classes4.dex */
class MediaStoreRequestHandler extends e {
    private static final String[] b = {"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.MediaStoreRequestHandler.b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            r1.close()
            return r8
        L1e:
            r8 = move-exception
            goto L26
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()
        L2b:
            throw r8
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static PicassoKind l(int i, int i2) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i <= picassoKind.width && i2 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        return (i > picassoKind2.width || i2 > picassoKind2.height) ? PicassoKind.FULL : picassoKind2;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.r
    public boolean c(p pVar) {
        Uri uri = pVar.d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.r
    public r.a f(p pVar, int i) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.a.getContentResolver();
        int k = k(contentResolver, pVar.d);
        String type2 = contentResolver.getType(pVar.d);
        boolean z = type2 != null && type2.startsWith("video/");
        if (pVar.c()) {
            PicassoKind l = l(pVar.h, pVar.i);
            if (!z && l == PicassoKind.FULL) {
                return new r.a(null, wd5.l(j(pVar)), Picasso.LoadedFrom.DISK, k);
            }
            long parseId = ContentUris.parseId(pVar.d);
            BitmapFactory.Options d = r.d(pVar);
            d.inJustDecodeBounds = true;
            r.a(pVar.h, pVar.i, l.width, l.height, d, pVar);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l == PicassoKind.FULL ? 1 : l.androidKind, d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.androidKind, d);
            }
            if (thumbnail != null) {
                return new r.a(thumbnail, null, Picasso.LoadedFrom.DISK, k);
            }
        }
        return new r.a(null, wd5.l(j(pVar)), Picasso.LoadedFrom.DISK, k);
    }
}
