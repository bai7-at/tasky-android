package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.mn0;
import defpackage.mq1;
import defpackage.px7;
import defpackage.qd0;
import defpackage.r48;
import defpackage.sd0;
import defpackage.wd5;
import defpackage.wr1;
import defpackage.yt7;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
class ZendeskDiskLruCache implements BaseStorage {
    private static final int CACHE_INDEX = 0;
    private static final int ITEMS_PER_KEY = 1;
    private static final String LOG_TAG = "DiskLruStorage";
    private static final int VERSION_ONE = 1;
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private wr1 storage;

    ZendeskDiskLruCache(File file, Serializer serializer, int i) {
        this.directory = file;
        long j = i;
        this.maxSize = j;
        this.storage = openCache(file, j);
        this.serializer = serializer;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [zendesk.core.ZendeskDiskLruCache] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [px7] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    private String getString(String str, int i) {
        Throwable th;
        sd0 sd0Var;
        String str2;
        Closeable closeable = null;
        try {
            try {
                wr1.e c0 = this.storage.c0(key(str));
                if (c0 != null) {
                    str = wd5.l(c0.a(i));
                    try {
                        sd0Var = wd5.d(str);
                        try {
                            closeable = str;
                            str2 = sd0Var.i1();
                        } catch (IOException e) {
                            e = e;
                            Logger.h(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                            close(str);
                            close(sd0Var);
                            return null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        sd0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        close(str);
                        close(i);
                        throw th;
                    }
                } else {
                    str2 = null;
                    sd0Var = null;
                }
                close(closeable);
                close(sd0Var);
                return str2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            str = 0;
            sd0Var = null;
        } catch (Throwable th4) {
            i = 0;
            th = th4;
            str = 0;
        }
    }

    private String key(String str) {
        return mq1.c(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", str));
    }

    private wr1 openCache(File file, long j) {
        try {
            return wr1.m0(file, 1, 1, j);
        } catch (IOException unused) {
            Logger.i(LOG_TAG, "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, wd5.l(new ByteArrayInputStream(str2.getBytes(com.amazonaws.services.s3.internal.Constants.DEFAULT_ENCODING))));
        } catch (UnsupportedEncodingException e) {
            Logger.h(LOG_TAG, "Unable to encode string", e, new Object[0]);
        }
    }

    private void write(String str, int i, px7 px7Var) {
        yt7 yt7Var;
        wr1.c P;
        qd0 qd0Var = null;
        try {
            synchronized (this.directory) {
                P = this.storage.P(key(str));
            }
            if (P != null) {
                yt7Var = wd5.h(P.f(i));
                try {
                    try {
                        qd0Var = wd5.c(yt7Var);
                        qd0Var.I0(px7Var);
                        qd0Var.flush();
                        P.e();
                    } catch (IOException e) {
                        e = e;
                        Logger.h(LOG_TAG, "Unable to cache data", e, new Object[0]);
                        close(qd0Var);
                        close(yt7Var);
                        close(px7Var);
                    }
                } catch (Throwable th) {
                    th = th;
                    close(qd0Var);
                    close(yt7Var);
                    close(px7Var);
                    throw th;
                }
            } else {
                yt7Var = null;
            }
        } catch (IOException e2) {
            e = e2;
            yt7Var = null;
        } catch (Throwable th2) {
            th = th2;
            yt7Var = null;
            close(qd0Var);
            close(yt7Var);
            close(px7Var);
            throw th;
        }
        close(qd0Var);
        close(yt7Var);
        close(px7Var);
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        wr1 wr1Var = this.storage;
        if (wr1Var == null) {
            return;
        }
        try {
            try {
                if (wr1Var.e0() != null && this.storage.e0().exists() && mn0.i(this.storage.e0().listFiles())) {
                    this.storage.G();
                } else {
                    this.storage.close();
                }
            } catch (IOException e) {
                Logger.b(LOG_TAG, "Error clearing cache. Error: %s", e.getMessage());
            }
            this.storage = openCache(this.directory, this.maxSize);
        } catch (Throwable th) {
            this.storage = openCache(this.directory, this.maxSize);
            throw th;
        }
    }

    @Override // zendesk.core.BaseStorage
    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, String str2) {
        if (this.storage == null || r48.d(str2)) {
            return;
        }
        putString(str, 0, str2);
    }

    @Override // zendesk.core.BaseStorage
    public void remove(String str) {
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(String str, Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(ResponseBody.class)) {
            try {
                wr1.e c0 = this.storage.c0(key(str));
                if (c0 == null) {
                    return null;
                }
                px7 l = wd5.l(c0.a(0));
                long b = c0.b(0);
                String string = getString(keyMediaType(str), 0);
                return (E) ResponseBody.create(r48.b(string) ? MediaType.parse(string) : null, b, wd5.d(l));
            } catch (IOException e) {
                Logger.h(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                return null;
            }
        }
        return (E) this.serializer.deserialize(getString(str, 0), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, Object obj) {
        if (this.storage == null) {
            return;
        }
        if (obj instanceof ResponseBody) {
            ResponseBody responseBody = (ResponseBody) obj;
            write(str, 0, responseBody.source());
            putString(keyMediaType(str), 0, responseBody.contentType().toString());
            return;
        }
        put(str, obj != null ? this.serializer.serialize(obj) : null);
    }

    ZendeskDiskLruCache(File file, long j, wr1 wr1Var, Serializer serializer) {
        this.directory = file;
        this.maxSize = j;
        this.storage = wr1Var;
        this.serializer = serializer;
    }
}
