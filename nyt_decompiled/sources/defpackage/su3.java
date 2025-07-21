package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public class su3 extends we2 {
    private final List r(jp5 jp5Var, boolean z) {
        File o = jp5Var.o();
        String[] list = o.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                zq3.e(str);
                arrayList.add(jp5Var.l(str));
            }
            i.z(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (o.exists()) {
            throw new IOException("failed to list " + jp5Var);
        }
        throw new FileNotFoundException("no such file: " + jp5Var);
    }

    private final void s(jp5 jp5Var) {
        if (j(jp5Var)) {
            throw new IOException(jp5Var + " already exists.");
        }
    }

    private final void t(jp5 jp5Var) {
        if (j(jp5Var)) {
            return;
        }
        throw new IOException(jp5Var + " doesn't exist.");
    }

    @Override // defpackage.we2
    public yt7 b(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        if (z) {
            t(jp5Var);
        }
        return wd5.g(jp5Var.o(), true);
    }

    @Override // defpackage.we2
    public void c(jp5 jp5Var, jp5 jp5Var2) {
        zq3.h(jp5Var, "source");
        zq3.h(jp5Var2, "target");
        if (jp5Var.o().renameTo(jp5Var2.o())) {
            return;
        }
        throw new IOException("failed to move " + jp5Var + " to " + jp5Var2);
    }

    @Override // defpackage.we2
    public void g(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "dir");
        if (jp5Var.o().mkdir()) {
            return;
        }
        ne2 m = m(jp5Var);
        if (m == null || !m.e()) {
            throw new IOException("failed to create directory: " + jp5Var);
        }
        if (z) {
            throw new IOException(jp5Var + " already exists.");
        }
    }

    @Override // defpackage.we2
    public void i(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File o = jp5Var.o();
        if (o.delete()) {
            return;
        }
        if (o.exists()) {
            throw new IOException("failed to delete " + jp5Var);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + jp5Var);
        }
    }

    @Override // defpackage.we2
    public List k(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        List r = r(jp5Var, true);
        zq3.e(r);
        return r;
    }

    @Override // defpackage.we2
    public ne2 m(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        File o = jp5Var.o();
        boolean isFile = o.isFile();
        boolean isDirectory = o.isDirectory();
        long lastModified = o.lastModified();
        long length = o.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || o.exists()) {
            return new ne2(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // defpackage.we2
    public fe2 n(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return new qu3(false, new RandomAccessFile(jp5Var.o(), QueryKeys.EXTERNAL_REFERRER));
    }

    @Override // defpackage.we2
    public yt7 p(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        if (z) {
            s(jp5Var);
        }
        return xd5.h(jp5Var.o(), false, 1, null);
    }

    @Override // defpackage.we2
    public px7 q(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return wd5.k(jp5Var.o());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
