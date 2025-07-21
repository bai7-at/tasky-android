package okio.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c04;
import defpackage.du8;
import defpackage.fe2;
import defpackage.jp5;
import defpackage.ne2;
import defpackage.px7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.wd5;
import defpackage.we2;
import defpackage.wm9;
import defpackage.yt7;
import defpackage.zq3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okio.internal.ResourceFileSystem;

/* loaded from: classes5.dex */
public final class ResourceFileSystem extends we2 {
    private static final a h = new a(null);
    private static final jp5 i = jp5.a.e(jp5.b, "/", false, 1, null);
    private final ClassLoader e;
    private final we2 f;
    private final c04 g;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(jp5 jp5Var) {
            return !h.u(jp5Var.f(), ".class", true);
        }

        public final jp5 b() {
            return ResourceFileSystem.i;
        }

        public final jp5 d(jp5 jp5Var, jp5 jp5Var2) {
            zq3.h(jp5Var, "<this>");
            zq3.h(jp5Var2, "base");
            return b().l(h.E(h.v0(jp5Var.toString(), jp5Var2.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, we2 we2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i2 & 4) != 0 ? we2.b : we2Var);
    }

    private final String A(jp5 jp5Var) {
        return v(jp5Var).j(i).toString();
    }

    private final jp5 v(jp5 jp5Var) {
        return i.k(jp5Var, true);
    }

    private final List w() {
        return (List) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List x(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        zq3.g(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        zq3.g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            zq3.e(url);
            Pair y = y(url);
            if (y != null) {
                arrayList.add(y);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        zq3.g(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        zq3.g(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            zq3.e(url2);
            Pair z = z(url2);
            if (z != null) {
                arrayList2.add(z);
            }
        }
        return i.F0(arrayList, arrayList2);
    }

    private final Pair y(URL url) {
        if (zq3.c(url.getProtocol(), TransferTable.COLUMN_FILE)) {
            return du8.a(this.f, jp5.a.d(jp5.b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair z(URL url) {
        int h0;
        String url2 = url.toString();
        zq3.g(url2, "toString(...)");
        if (!h.K(url2, "jar:file:", false, 2, null) || (h0 = h.h0(url2, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        jp5.a aVar = jp5.b;
        String substring = url2.substring(4, h0);
        zq3.g(substring, "substring(...)");
        return du8.a(ZipFilesKt.f(jp5.a.d(aVar, new File(URI.create(substring)), false, 1, null), this.f, new ss2() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(wm9 wm9Var) {
                ResourceFileSystem.a aVar2;
                zq3.h(wm9Var, "entry");
                aVar2 = ResourceFileSystem.h;
                return Boolean.valueOf(aVar2.c(wm9Var.b()));
            }
        }), i);
    }

    @Override // defpackage.we2
    public yt7 b(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.we2
    public void c(jp5 jp5Var, jp5 jp5Var2) {
        zq3.h(jp5Var, "source");
        zq3.h(jp5Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.we2
    public void g(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.we2
    public void i(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.we2
    public List k(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        String A = A(jp5Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : w()) {
            we2 we2Var = (we2) pair.a();
            jp5 jp5Var2 = (jp5) pair.b();
            try {
                List k = we2Var.k(jp5Var2.l(A));
                ArrayList arrayList = new ArrayList();
                for (Object obj : k) {
                    if (h.c((jp5) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(h.d((jp5) it2.next(), jp5Var2));
                }
                i.B(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return i.X0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + jp5Var);
    }

    @Override // defpackage.we2
    public ne2 m(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        if (!h.c(jp5Var)) {
            return null;
        }
        String A = A(jp5Var);
        for (Pair pair : w()) {
            ne2 m = ((we2) pair.a()).m(((jp5) pair.b()).l(A));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    @Override // defpackage.we2
    public fe2 n(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        if (!h.c(jp5Var)) {
            throw new FileNotFoundException("file not found: " + jp5Var);
        }
        String A = A(jp5Var);
        Iterator it2 = w().iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            try {
                return ((we2) pair.a()).n(((jp5) pair.b()).l(A));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + jp5Var);
    }

    @Override // defpackage.we2
    public yt7 p(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.we2
    public px7 q(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        if (!h.c(jp5Var)) {
            throw new FileNotFoundException("file not found: " + jp5Var);
        }
        jp5 jp5Var2 = i;
        URL resource = this.e.getResource(jp5.n(jp5Var2, jp5Var, false, 2, null).j(jp5Var2).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + jp5Var);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        zq3.g(inputStream, "getInputStream(...)");
        return wd5.l(inputStream);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z, we2 we2Var) {
        zq3.h(classLoader, "classLoader");
        zq3.h(we2Var, "systemFileSystem");
        this.e = classLoader;
        this.f = we2Var;
        this.g = c.a(new qs2() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List mo865invoke() {
                ClassLoader classLoader2;
                List x;
                ResourceFileSystem resourceFileSystem = ResourceFileSystem.this;
                classLoader2 = resourceFileSystem.e;
                x = resourceFileSystem.x(classLoader2);
                return x;
            }
        });
        if (z) {
            w().size();
        }
    }
}
