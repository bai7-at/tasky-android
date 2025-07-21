package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

/* loaded from: classes5.dex */
public class b63 implements MessageBodyReader, MessageBodyWriter {
    private static final Set e;
    private static final b f;
    private final Gson a;
    private final Set b;
    private final g c;
    private final b d;

    static class a implements b {
        a() {
        }
    }

    public interface b {
    }

    static final class c {
        final boolean a;
        final boolean b;
        final boolean c;
        final boolean d;

        c(Gson gson, boolean z) {
            this.a = z;
            this.c = gson.htmlSafe();
            this.b = gson.serializeNulls();
            this.d = a(gson, "prettyPrinting", false);
        }

        private static boolean a(Gson gson, String str, boolean z) {
            try {
                Field declaredField = Gson.class.getDeclaredField(str);
                declaredField.setAccessible(true);
                return ((Boolean) declaredField.get(gson)).booleanValue();
            } catch (Exception unused) {
                return z;
            }
        }
    }

    public static abstract class d {
        public boolean a() {
            return true;
        }

        public b b() {
            return b63.f;
        }

        public Gson c() {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Iterator it2 = ServiceLoader.load(TypeAdapterFactory.class).iterator();
            while (it2.hasNext()) {
                gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory) it2.next());
            }
            return gsonBuilder.create();
        }

        public boolean d() {
            return false;
        }

        public abstract List e();
    }

    private static class e implements g {
        private final c a;

        e(c cVar) {
            this.a = cVar;
        }
    }

    private static class f implements g {
        private static final JsonFactory b = new JsonFactory().disable(JsonParser.Feature.AUTO_CLOSE_SOURCE).disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        private final c a;

        f(c cVar) {
            this.a = cVar;
        }
    }

    private interface g {
    }

    static {
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add(InputStream.class);
        hashSet.add(Reader.class);
        hashSet.add(OutputStream.class);
        hashSet.add(Writer.class);
        hashSet.add(byte[].class);
        hashSet.add(char[].class);
        hashSet.add(String.class);
        hashSet.add(StreamingOutput.class);
        hashSet.add(Response.class);
        f = new a();
    }

    public b63() {
        this(new c63().j());
    }

    private static g b(boolean z, c cVar) {
        if (z) {
            try {
                return new f(cVar);
            } catch (Throwable unused) {
            }
        }
        return new e(cVar);
    }

    private static Set c(List list) {
        return list.isEmpty() ? Collections.singleton(MediaType.APPLICATION_JSON_TYPE) : new HashSet(list);
    }

    public b63(d dVar) {
        this.a = dVar.c();
        this.b = c(dVar.e());
        this.c = b(dVar.a(), new c(dVar.c(), dVar.d()));
        this.d = dVar.b();
    }
}
