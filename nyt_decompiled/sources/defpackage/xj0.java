package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes5.dex */
public final class xj0 {
    private final InputStream a;
    private final Charset b;
    private final CharsetDecoder c;
    private final ByteBuffer d;
    private boolean e;
    private char f;

    public xj0(InputStream inputStream, Charset charset) {
        zq3.h(inputStream, "inputStream");
        zq3.h(charset, "charset");
        this.a = inputStream;
        this.b = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        zq3.g(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.c = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(cf0.c.d());
        zq3.g(wrap, "wrap(...)");
        this.d = wrap;
        wrap.flip();
    }

    private final int a(char[] cArr, int i, int i2) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult decode = this.c.decode(this.d, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining()) {
                    break;
                }
                if (b() < 0) {
                    if (wrap.position() == 0 && !this.d.hasRemaining()) {
                        z = true;
                        break;
                    }
                    this.c.reset();
                    z = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    wrap.position();
                    break;
                }
                decode.throwException();
            }
        }
        if (z) {
            this.c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    private final int b() {
        this.d.compact();
        try {
            int limit = this.d.limit();
            int position = this.d.position();
            int read = this.a.read(this.d.array(), this.d.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.d;
            zq3.f(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.d.flip();
            return this.d.remaining();
        } finally {
            this.d.flip();
        }
    }

    private final int c() {
        if (this.e) {
            this.e = false;
            return this.f;
        }
        char[] cArr = new char[2];
        int d = d(cArr, 0, 2);
        if (d == -1) {
            return -1;
        }
        if (d == 1) {
            return cArr[0];
        }
        if (d == 2) {
            this.f = cArr[1];
            this.e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + d).toString());
    }

    public final int d(char[] cArr, int i, int i2) {
        zq3.h(cArr, "array");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + cArr.length).toString());
        }
        if (this.e) {
            cArr[i] = this.f;
            i++;
            i2--;
            this.e = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        }
        if (i2 != 1) {
            return a(cArr, i, i2) + i3;
        }
        int c = c();
        if (c != -1) {
            cArr[i] = (char) c;
            return i3 + 1;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    public final void e() {
        cf0 cf0Var = cf0.c;
        byte[] array = this.d.array();
        zq3.g(array, "array(...)");
        cf0Var.c(array);
    }
}
