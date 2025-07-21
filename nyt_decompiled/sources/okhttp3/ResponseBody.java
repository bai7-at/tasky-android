package okhttp3;

import defpackage.ad0;
import defpackage.bk3;
import defpackage.gm0;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final sd0 source;

        public BomAwareReader(sd0 sd0Var, Charset charset) {
            zq3.h(sd0Var, "source");
            zq3.h(charset, "charset");
            this.source = sd0Var;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ww8 ww8Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                ww8Var = ww8.a;
            } else {
                ww8Var = null;
            }
            if (ww8Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            zq3.h(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.t1(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            zq3.h(str, "<this>");
            Charset charset = yj0.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            ad0 J1 = new ad0().J1(str, charset);
            return create(J1, mediaType, J1.h1());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, sd0 sd0Var, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(sd0Var, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            zq3.h(bArr, "<this>");
            return create(new ad0().j0(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            zq3.h(byteString, "<this>");
            return create(new ad0().m1(byteString), mediaType, byteString.E());
        }

        public final ResponseBody create(final sd0 sd0Var, final MediaType mediaType, final long j) {
            zq3.h(sd0Var, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public sd0 source() {
                    return sd0Var;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            zq3.h(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            zq3.h(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            zq3.h(byteString, "content");
            return create(byteString, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, sd0 sd0Var) {
            zq3.h(sd0Var, "content");
            return create(sd0Var, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(yj0.b)) == null) ? yj0.b : charset;
    }

    private final <T> T consumeSource(ss2 ss2Var, ss2 ss2Var2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        sd0 source = source();
        try {
            T t = (T) ss2Var.invoke(source);
            bk3.b(1);
            gm0.a(source, null);
            bk3.a(1);
            int intValue = ((Number) ss2Var2.invoke(t)).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return t;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    public static final ResponseBody create(sd0 sd0Var, MediaType mediaType, long j) {
        return Companion.create(sd0Var, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().t1();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        sd0 source = source();
        try {
            ByteString a1 = source.a1();
            gm0.a(source, null);
            int E = a1.E();
            if (contentLength == -1 || contentLength == E) {
                return a1;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + E + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        sd0 source = source();
        try {
            byte[] B0 = source.B0();
            gm0.a(source, null);
            int length = B0.length;
            if (contentLength == -1 || contentLength == length) {
                return B0;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract sd0 source();

    public final String string() throws IOException {
        sd0 source = source();
        try {
            String V0 = source.V0(Util.readBomAsCharset(source, charset()));
            gm0.a(source, null);
            return V0;
        } finally {
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, sd0 sd0Var) {
        return Companion.create(mediaType, j, sd0Var);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
