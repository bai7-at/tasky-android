package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class qba implements gaa {
    private final pba c;
    private final Map a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0;
    private final int d = 20971520;

    public qba(pba pbaVar, int i) {
        this.c = pbaVar;
    }

    static int c(InputStream inputStream) {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    static long d(InputStream inputStream) {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((l(inputStream) & 255) << 56);
    }

    static String f(oba obaVar) {
        return new String(k(obaVar, d(obaVar)), Constants.DEFAULT_ENCODING);
    }

    static void h(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void i(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void j(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(Constants.DEFAULT_ENCODING);
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] k(oba obaVar, long j) {
        long a = obaVar.a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(obaVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    private static int l(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void m(String str, nba nbaVar) {
        if (this.a.containsKey(str)) {
            this.b += nbaVar.a - ((nba) this.a.get(str)).a;
        } else {
            this.b += nbaVar.a;
        }
        this.a.put(str, nbaVar);
    }

    private final void n(String str) {
        nba nbaVar = (nba) this.a.remove(str);
        if (nbaVar != null) {
            this.b -= nbaVar.a;
        }
    }

    private static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // defpackage.gaa
    public final synchronized faa a(String str) {
        nba nbaVar = (nba) this.a.get(str);
        if (nbaVar == null) {
            return null;
        }
        File e = e(str);
        try {
            oba obaVar = new oba(new BufferedInputStream(new FileInputStream(e)), e.length());
            try {
                nba a = nba.a(obaVar);
                if (!TextUtils.equals(str, a.b)) {
                    gba.a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.b);
                    n(str);
                    return null;
                }
                byte[] k = k(obaVar, obaVar.a());
                faa faaVar = new faa();
                faaVar.a = k;
                faaVar.b = nbaVar.c;
                faaVar.c = nbaVar.d;
                faaVar.d = nbaVar.e;
                faaVar.e = nbaVar.f;
                faaVar.f = nbaVar.g;
                List<naa> list = nbaVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (naa naaVar : list) {
                    treeMap.put(naaVar.a(), naaVar.b());
                }
                faaVar.g = treeMap;
                faaVar.h = Collections.unmodifiableList(nbaVar.h);
                return faaVar;
            } finally {
                obaVar.close();
            }
        } catch (IOException e2) {
            gba.a("%s: %s", e.getAbsolutePath(), e2.toString());
            g(str);
            return null;
        }
    }

    @Override // defpackage.gaa
    public final synchronized void b(String str, faa faaVar) {
        try {
            long j = this.b;
            int length = faaVar.a.length;
            long j2 = j + length;
            int i = this.d;
            if (j2 <= i || length <= i * 0.9f) {
                File e = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                    nba nbaVar = new nba(str, faaVar);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, nbaVar.b);
                        String str2 = nbaVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, nbaVar.d);
                        i(bufferedOutputStream, nbaVar.e);
                        i(bufferedOutputStream, nbaVar.f);
                        i(bufferedOutputStream, nbaVar.g);
                        List<naa> list = nbaVar.h;
                        if (list != null) {
                            h(bufferedOutputStream, list.size());
                            for (naa naaVar : list) {
                                j(bufferedOutputStream, naaVar.a());
                                j(bufferedOutputStream, naaVar.b());
                            }
                        } else {
                            h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(faaVar.a);
                        bufferedOutputStream.close();
                        nbaVar.a = e.length();
                        m(str, nbaVar);
                        if (this.b >= this.d) {
                            if (gba.b) {
                                gba.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.b;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it2 = this.a.entrySet().iterator();
                            int i2 = 0;
                            while (it2.hasNext()) {
                                nba nbaVar2 = (nba) ((Map.Entry) it2.next()).getValue();
                                if (e(nbaVar2.b).delete()) {
                                    this.b -= nbaVar2.a;
                                } else {
                                    String str3 = nbaVar2.b;
                                    gba.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it2.remove();
                                i2++;
                                if (this.b < this.d * 0.9f) {
                                    break;
                                }
                            }
                            if (gba.b) {
                                gba.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e2) {
                        gba.a("%s", e2.toString());
                        bufferedOutputStream.close();
                        gba.a("Failed to write header for %s", e.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!e.delete()) {
                        gba.a("Could not clean up file %s", e.getAbsolutePath());
                    }
                    if (!this.c.zza().exists()) {
                        gba.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.a.clear();
                        this.b = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File e(String str) {
        return new File(this.c.zza(), o(str));
    }

    public final synchronized void g(String str) {
        boolean delete = e(str).delete();
        n(str);
        if (delete) {
            return;
        }
        gba.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    @Override // defpackage.gaa
    public final synchronized void zzb() {
        File zza = this.c.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        oba obaVar = new oba(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            nba a = nba.a(obaVar);
                            a.a = length;
                            m(a.b, a);
                            obaVar.close();
                        } catch (Throwable th) {
                            obaVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            gba.b("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // defpackage.gaa
    public final synchronized void zzc(String str, boolean z) {
        faa a = a(str);
        if (a != null) {
            a.f = 0L;
            a.e = 0L;
            b(str, a);
        }
    }

    public qba(File file, int i) {
        this.c = new mba(this, file);
    }
}
