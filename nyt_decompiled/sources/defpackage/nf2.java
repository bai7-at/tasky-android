package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.collections.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class nf2 extends mf2 {
    public static final ByteBuffer c(int i, CharsetEncoder charsetEncoder) {
        zq3.h(charsetEncoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        zq3.g(allocate, "allocate(...)");
        return allocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        zq3.h(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] e(File file) {
        zq3.h(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
                zq3.g(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    u72 u72Var = new u72(8193);
                    u72Var.write(read2);
                    tf0.b(fileInputStream, u72Var, 0, 2, null);
                    int size = u72Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a = u72Var.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    zq3.g(copyOf, "copyOf(...)");
                    bArr = d.f(a, copyOf, i, 0, u72Var.size());
                }
            }
            gm0.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gm0.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String f(File file, Charset charset) {
        zq3.h(file, "<this>");
        zq3.h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String f = zj8.f(inputStreamReader);
            gm0.a(inputStreamReader, null);
            return f;
        } finally {
        }
    }

    public static /* synthetic */ String g(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = yj0.b;
        }
        return lf2.f(file, charset);
    }

    public static final void h(File file, String str, Charset charset) {
        zq3.h(file, "<this>");
        zq3.h(str, "text");
        zq3.h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            j(fileOutputStream, str, charset);
            ww8 ww8Var = ww8.a;
            gm0.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = yj0.b;
        }
        h(file, str, charset);
    }

    public static final void j(OutputStream outputStream, String str, Charset charset) {
        zq3.h(outputStream, "<this>");
        zq3.h(str, "text");
        zq3.h(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            zq3.g(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder d = d(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        zq3.e(d);
        ByteBuffer c = c(8192, d);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            zq3.g(array, "array(...)");
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!d.encode(allocate, c, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(c.array(), 0, c.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            c.clear();
            i = i3;
        }
    }
}
