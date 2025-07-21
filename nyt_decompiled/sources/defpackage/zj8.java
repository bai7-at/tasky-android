package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Iterator;
import kotlin.sequences.d;

/* loaded from: classes5.dex */
public abstract class zj8 {
    public static final long a(Reader reader, Writer writer, int i) {
        zq3.h(reader, "<this>");
        zq3.h(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(reader, writer, i);
    }

    public static final void c(Reader reader, ss2 ss2Var) {
        zq3.h(reader, "<this>");
        zq3.h(ss2Var, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it2 = d(bufferedReader).iterator();
            while (it2.hasNext()) {
                ss2Var.invoke(it2.next());
            }
            ww8 ww8Var = ww8.a;
            gm0.a(bufferedReader, null);
        } finally {
        }
    }

    public static final ak7 d(BufferedReader bufferedReader) {
        zq3.h(bufferedReader, "<this>");
        return d.d(new b54(bufferedReader));
    }

    public static final byte[] e(URL url) {
        zq3.h(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            zq3.e(openStream);
            byte[] c = tf0.c(openStream);
            gm0.a(openStream, null);
            return c;
        } finally {
        }
    }

    public static final String f(Reader reader) {
        zq3.h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        zq3.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
