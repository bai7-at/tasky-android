package androidx.room;

import android.content.Context;
import android.util.Log;
import defpackage.jf2;
import defpackage.p51;
import defpackage.sc8;
import defpackage.t36;
import defpackage.tc8;
import defpackage.vl1;
import defpackage.zq3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h implements tc8, vl1 {
    private final Context a;
    private final String b;
    private final File c;
    private final Callable d;
    private final int e;
    private final tc8 f;
    private a g;
    private boolean h;

    public h(Context context, String str, File file, Callable callable, int i, tc8 tc8Var) {
        zq3.h(context, "context");
        zq3.h(tc8Var, "delegate");
        this.a = context;
        this.b = str;
        this.c = file;
        this.d = callable;
        this.e = i;
        this.f = tc8Var;
    }

    private final void a(File file, boolean z) {
        ReadableByteChannel newChannel;
        if (this.b != null) {
            newChannel = Channels.newChannel(this.a.getAssets().open(this.b));
            zq3.g(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.c != null) {
            newChannel = new FileInputStream(this.c).getChannel();
            zq3.g(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel((InputStream) callable.call());
                zq3.g(newChannel, "newChannel(inputStream)");
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        zq3.g(channel, "output");
        jf2.a(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        zq3.g(createTempFile, "intermediateFile");
        b(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void b(File file, boolean z) {
        a aVar = this.g;
        if (aVar == null) {
            zq3.z("databaseConfiguration");
            aVar = null;
        }
        aVar.getClass();
    }

    private final void h(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.a.getDatabasePath(databaseName);
        a aVar = this.g;
        a aVar2 = null;
        if (aVar == null) {
            zq3.z("databaseConfiguration");
            aVar = null;
        }
        t36 t36Var = new t36(databaseName, this.a.getFilesDir(), aVar.s);
        try {
            t36.c(t36Var, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    zq3.g(databasePath, "databaseFile");
                    a(databasePath, z);
                    t36Var.d();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                zq3.g(databasePath, "databaseFile");
                int d = p51.d(databasePath);
                if (d == this.e) {
                    t36Var.d();
                    return;
                }
                a aVar3 = this.g;
                if (aVar3 == null) {
                    zq3.z("databaseConfiguration");
                } else {
                    aVar2 = aVar3;
                }
                if (aVar2.a(d, this.e)) {
                    t36Var.d();
                    return;
                }
                if (this.a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath, z);
                    } catch (IOException e2) {
                        Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                t36Var.d();
                return;
            } catch (IOException e3) {
                Log.w("ROOM", "Unable to read database version.", e3);
                t36Var.d();
                return;
            }
        } catch (Throwable th) {
            t36Var.d();
            throw th;
        }
        t36Var.d();
        throw th;
    }

    @Override // defpackage.tc8, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.h = false;
    }

    public final void d(a aVar) {
        zq3.h(aVar, "databaseConfiguration");
        this.g = aVar;
    }

    @Override // defpackage.tc8
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // defpackage.vl1
    public tc8 getDelegate() {
        return this.f;
    }

    @Override // defpackage.tc8
    public sc8 o() {
        if (!this.h) {
            h(true);
            this.h = true;
        }
        return getDelegate().o();
    }

    @Override // defpackage.tc8
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
