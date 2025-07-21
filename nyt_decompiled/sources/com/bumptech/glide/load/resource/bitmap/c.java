package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.gl3;
import defpackage.so5;
import defpackage.to;
import defpackage.z06;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
interface c {

    public static final class a implements c {
        private final gl3 a;
        private final to b;
        private final List c;

        a(InputStream inputStream, List list, to toVar) {
            this.b = (to) z06.d(toVar);
            this.c = (List) z06.d(list);
            this.a = new gl3(inputStream, toVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public void b() {
            this.a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public int c() {
            return com.bumptech.glide.load.a.b(this.c, this.a.a(), this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.c, this.a.a(), this.b);
        }
    }

    public static final class b implements c {
        private final to a;
        private final List b;
        private final so5 c;

        b(ParcelFileDescriptor parcelFileDescriptor, List list, to toVar) {
            this.a = (to) z06.d(toVar);
            this.b = (List) z06.d(list);
            this.c = new so5(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public int c() {
            return com.bumptech.glide.load.a.a(this.b, this.c, this.a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.d(this.b, this.c, this.a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
