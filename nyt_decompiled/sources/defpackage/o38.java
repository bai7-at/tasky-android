package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public class o38 implements iz6 {
    private final List a;
    private final iz6 b;
    private final to c;

    public o38(List list, iz6 iz6Var, to toVar) {
        this.a = list;
        this.b = iz6Var;
        this.c = toVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(InputStream inputStream, int i, int i2, sk5 sk5Var) {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), i, i2, sk5Var);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, sk5 sk5Var) {
        return !((Boolean) sk5Var.c(vz2.b)).booleanValue() && a.e(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
