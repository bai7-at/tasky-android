package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.s11;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class f21 {
    private static final Charset d = Charset.forName(Constants.DEFAULT_ENCODING);
    private static final int e = 15;
    private static final a21 f = new a21();
    private static final Comparator g = new Comparator() { // from class: b21
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u;
            u = f21.u((File) obj, (File) obj2);
            return u;
        }
    };
    private static final FilenameFilter h = new FilenameFilter() { // from class: c21
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v;
            v = f21.v(file, str);
            return v;
        }
    };
    private final AtomicInteger a = new AtomicInteger(0);
    private final ue2 b;
    private final pn7 c;

    public f21(ue2 ue2Var, pn7 pn7Var) {
        this.b = ue2Var;
        this.c = pn7Var;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, s11.d dVar, String str) {
        try {
            a21 a21Var = f;
            F(this.b.f(str), a21Var.E(a21Var.D(A(file)).m(dVar)));
        } catch (IOException e2) {
            m94.f().l("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void C(String str, long j) {
        boolean z;
        List<File> o = this.b.o(str, h);
        if (o.isEmpty()) {
            m94.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : o) {
                try {
                    arrayList.add(f.g(A(file)));
                } catch (IOException e2) {
                    m94.f().l("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.b.n(str, "report"), arrayList, j, z, p09.j(str, this.b));
            return;
        }
        m94.f().k("Could not parse event files for session " + str);
    }

    private void D(File file, List list, long j, boolean z, String str) {
        try {
            a21 a21Var = f;
            s11 l = a21Var.D(A(file)).n(j, z, str).l(nh3.a(list));
            s11.e j2 = l.j();
            if (j2 == null) {
                return;
            }
            F(z ? this.b.i(j2.h()) : this.b.k(j2.h()), a21Var.E(l));
        } catch (IOException e2) {
            m94.f().l("Could not synthesize final report file for " + file, e2);
        }
    }

    private int E(String str, int i) {
        List o = this.b.o(str, new FilenameFilter() { // from class: d21
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t;
                t = f21.t(file, str2);
                return t;
            }
        });
        Collections.sort(o, new Comparator() { // from class: e21
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x;
                x = f21.x((File) obj, (File) obj2);
                return x;
            }
        });
        return f(o, i);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet e(String str) {
        this.b.a();
        SortedSet p = p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String str2 = (String) p.last();
            m94.f().b("Removing session over cap: " + str2);
            this.b.b(str2);
            p.remove(str2);
        }
        return p;
    }

    private static int f(List list, int i) {
        int size = list.size();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            if (size <= i) {
                return size;
            }
            ue2.r(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i = this.c.b().a.b;
        List n = n();
        int size = n.size();
        if (size <= i) {
            return;
        }
        Iterator it2 = n.subList(i, size).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    private static long h(long j) {
        return j * 1000;
    }

    private void j(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    private static String m(int i, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i)) + (z ? QueryKeys.END_MARKER : "");
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.j());
        arrayList.addAll(this.b.g());
        Comparator comparator = g;
        Collections.sort(arrayList, comparator);
        List l = this.b.l();
        Collections.sort(l, comparator);
        arrayList.addAll(l);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, e);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith(QueryKeys.END_MARKER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith(QueryKeys.END_MARKER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.b.l());
        j(this.b.j());
        j(this.b.g());
    }

    public void k(String str, long j) {
        for (String str2 : e(str)) {
            m94.f().i("Finalizing report for session " + str2);
            C(str2, j);
            this.b.b(str2);
        }
        g();
    }

    public void l(String str, s11.d dVar) {
        File n = this.b.n(str, "report");
        m94.f().b("Writing native session report for " + str + " to file: " + n);
        B(n, dVar, str);
    }

    public SortedSet p() {
        return new TreeSet(this.b.c()).descendingSet();
    }

    public long q(String str) {
        return this.b.n(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.b.l().isEmpty() && this.b.j().isEmpty() && this.b.g().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> n = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n) {
            try {
                arrayList.add(g21.a(f.D(A(file)), file.getName(), file));
            } catch (IOException e2) {
                m94.f().l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(s11.e.d dVar, String str, boolean z) {
        int i = this.c.b().a.a;
        try {
            F(this.b.n(str, m(this.a.getAndIncrement(), z)), f.h(dVar));
        } catch (IOException e2) {
            m94.f().l("Could not persist event for session " + str, e2);
        }
        E(str, i);
    }

    public void z(s11 s11Var) {
        s11.e j = s11Var.j();
        if (j == null) {
            m94.f().b("Could not get session for report");
            return;
        }
        String h2 = j.h();
        try {
            F(this.b.n(h2, "report"), f.E(s11Var));
            G(this.b.n(h2, "start-time"), "", j.k());
        } catch (IOException e2) {
            m94.f().c("Could not persist report for session " + h2, e2);
        }
    }
}
