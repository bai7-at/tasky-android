package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class xw8 implements iz6 {

    private static final class a implements cz6 {
        private final Bitmap a;

        a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // defpackage.cz6
        public int a() {
            return x19.g(this.a);
        }

        @Override // defpackage.cz6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.a;
        }

        @Override // defpackage.cz6
        public void c() {
        }

        @Override // defpackage.cz6
        public Class d() {
            return Bitmap.class;
        }
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(Bitmap bitmap, int i, int i2, sk5 sk5Var) {
        return new a(bitmap);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, sk5 sk5Var) {
        return true;
    }
}
