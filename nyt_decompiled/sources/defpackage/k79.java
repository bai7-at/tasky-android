package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import defpackage.mk5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class k79 implements iz6 {
    public static final mk5 d = mk5.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final mk5 e = mk5.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    private static final e f = new e();
    private final f a;
    private final w80 b;
    private final e c;

    class a implements mk5.b {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // mk5.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    class b implements mk5.b {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // mk5.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements f {
        private c() {
        }

        @Override // k79.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements f {

        class a extends MediaDataSource {
            final /* synthetic */ ByteBuffer a;

            a(ByteBuffer byteBuffer) {
                this.a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.a.limit()) {
                    return -1;
                }
                this.a.position((int) j);
                int min = Math.min(i2, this.a.remaining());
                this.a.get(bArr, i, min);
                return min;
            }
        }

        d() {
        }

        @Override // k79.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    interface f {
        void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static final class g implements f {
        g() {
        }

        @Override // k79.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    k79(w80 w80Var, f fVar) {
        this(w80Var, fVar, f);
    }

    public static iz6 c(w80 w80Var) {
        return new k79(w80Var, new c(null));
    }

    public static iz6 d(w80 w80Var) {
        return new k79(w80Var, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap g2 = (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f) ? null : g(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return g2 == null ? f(mediaMetadataRetriever, j, i) : g2;
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b2 = downsampleStrategy.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b2), Math.round(b2 * parseInt2));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    public static iz6 h(w80 w80Var) {
        return new k79(w80Var, new g());
    }

    @Override // defpackage.iz6
    public boolean a(Object obj, sk5 sk5Var) {
        return true;
    }

    @Override // defpackage.iz6
    public cz6 b(Object obj, int i, int i2, sk5 sk5Var) {
        long longValue = ((Long) sk5Var.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) sk5Var.c(e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) sk5Var.c(DownsampleStrategy.h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever a2 = this.c.a();
        try {
            try {
                this.a.a(a2, obj);
                Bitmap e2 = e(a2, longValue, num.intValue(), i, i2, downsampleStrategy2);
                a2.release();
                return y80.f(e2, this.b);
            } catch (RuntimeException e3) {
                throw new IOException(e3);
            }
        } catch (Throwable th) {
            a2.release();
            throw th;
        }
    }

    k79(w80 w80Var, f fVar, e eVar) {
        this.b = w80Var;
        this.a = fVar;
        this.c = eVar;
    }
}
