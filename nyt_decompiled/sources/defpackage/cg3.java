package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.b;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
public abstract class cg3 implements iz6 {
    final b a = b.a();

    class a implements ImageDecoder.OnHeaderDecodedListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ DecodeFormat d;
        final /* synthetic */ DownsampleStrategy e;
        final /* synthetic */ PreferredColorSpace f;

        /* renamed from: cg3$a$a, reason: collision with other inner class name */
        class C0132a implements ImageDecoder.OnPartialImageListener {
            C0132a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        a(int i, int i2, boolean z, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = decodeFormat;
            this.e = downsampleStrategy;
            this.f = preferredColorSpace;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            if (cg3.this.a.c(this.a, this.b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0132a());
            Size size = imageInfo.getSize();
            int i = this.a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(size.getWidth() * b);
            int round2 = Math.round(size.getHeight() * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + QueryKeys.SCROLL_POSITION_TOP + size.getHeight() + "] to [" + round + QueryKeys.SCROLL_POSITION_TOP + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            imageDecoder.setTargetColorSpace(ColorSpace.get((this.f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cz6 b(ImageDecoder.Source source, int i, int i2, sk5 sk5Var) {
        DecodeFormat decodeFormat = (DecodeFormat) sk5Var.c(com.bumptech.glide.load.resource.bitmap.a.f);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) sk5Var.c(DownsampleStrategy.h);
        mk5 mk5Var = com.bumptech.glide.load.resource.bitmap.a.j;
        return d(source, i, i2, new a(i, i2, sk5Var.c(mk5Var) != null && ((Boolean) sk5Var.c(mk5Var)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) sk5Var.c(com.bumptech.glide.load.resource.bitmap.a.g)));
    }

    protected abstract cz6 d(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Override // defpackage.iz6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean a(ImageDecoder.Source source, sk5 sk5Var) {
        return true;
    }
}
