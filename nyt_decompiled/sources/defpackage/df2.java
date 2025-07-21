package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.external.cache3.CacheBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class df2 implements xe2 {
    private final File a;
    private final dg0 b;

    public df2(File file) {
        zq3.h(file, "root");
        this.a = file;
        dg0 a = CacheBuilder.x().v(20L).a();
        zq3.g(a, "newBuilder()\n        .ma…Size(20)\n        .build()");
        this.b = a;
        y19.a.a(file);
    }

    private final String g(String str) {
        return y19.a.d(str);
    }

    private final Collection h(String str) {
        File file = new File(this.a, y19.a.d(str));
        if (file.exists() && file.isFile()) {
            throw new FileNotFoundException("expecting a directory at " + str + ", instead found a file");
        }
        ArrayList arrayList = new ArrayList();
        jc0 jc0Var = new jc0(file);
        while (jc0Var.hasNext()) {
            File file2 = (File) jc0Var.next();
            y19 y19Var = y19.a;
            zq3.e(file2);
            String path = file2.getPath();
            zq3.g(path, "file!!.path");
            String path2 = this.a.getPath();
            zq3.g(path2, "root.path");
            final String d = y19Var.d(new Regex(path2).f(path, ""));
            Object b = this.b.b(d, new Callable() { // from class: bf2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    w82 i;
                    i = df2.i(df2.this, d);
                    return i;
                }
            });
            zq3.e(b);
            arrayList.add(b);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w82 i(df2 df2Var, String str) {
        zq3.h(df2Var, "this$0");
        zq3.h(str, "$simplifiedPath");
        return new w82(df2Var.a, str);
    }

    private final w82 j(String str) {
        final String g = g(str);
        return (w82) this.b.b(g, new Callable() { // from class: af2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w82 k;
                k = df2.k(df2.this, g);
                return k;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w82 k(df2 df2Var, String str) {
        zq3.h(df2Var, "this$0");
        zq3.h(str, "$cleanedPath");
        return new w82(df2Var.a, str);
    }

    @Override // defpackage.xe2
    public void a(String str) {
        zq3.h(str, "path");
        w82 j = j(str);
        zq3.e(j);
        j.a();
    }

    @Override // defpackage.xe2
    public void b(String str) {
        zq3.h(str, "path");
        Iterator it2 = h(str).iterator();
        while (it2.hasNext()) {
            ((w82) it2.next()).a();
        }
    }

    @Override // defpackage.xe2
    public sd0 c(String str) {
        zq3.h(str, "path");
        w82 j = j(str);
        zq3.e(j);
        return j.c();
    }

    @Override // defpackage.xe2
    public boolean d(String str) {
        zq3.h(str, TransferTable.COLUMN_FILE);
        w82 j = j(str);
        zq3.e(j);
        return j.b();
    }
}
