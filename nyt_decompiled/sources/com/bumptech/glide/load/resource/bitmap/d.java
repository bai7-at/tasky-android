package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import defpackage.af4;
import defpackage.c62;
import defpackage.cz6;
import defpackage.iz6;
import defpackage.sk5;
import defpackage.to;
import defpackage.w80;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class d implements iz6 {
    private final com.bumptech.glide.load.resource.bitmap.a a;
    private final to b;

    static class a implements a.b {
        private final RecyclableBufferedInputStream a;
        private final c62 b;

        a(RecyclableBufferedInputStream recyclableBufferedInputStream, c62 c62Var) {
            this.a = recyclableBufferedInputStream;
            this.b = c62Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
            this.a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(w80 w80Var, Bitmap bitmap) {
            IOException a = this.b.a();
            if (a != null) {
                if (bitmap == null) {
                    throw a;
                }
                w80Var.b(bitmap);
                throw a;
            }
        }
    }

    public d(com.bumptech.glide.load.resource.bitmap.a aVar, to toVar) {
        this.a = aVar;
        this.b = toVar;
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(InputStream inputStream, int i, int i2, sk5 sk5Var) {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.b);
        }
        c62 b = c62.b(recyclableBufferedInputStream);
        try {
            return this.a.g(new af4(b), i, i2, sk5Var, new a(recyclableBufferedInputStream, b));
        } finally {
            b.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, sk5 sk5Var) {
        return this.a.p(inputStream);
    }
}
