package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.internal.measurement.zzid;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class d6f {
    private static volatile x5f h;
    public static final /* synthetic */ int l = 0;
    final w5f a;
    final String b;
    private final Object c;
    private volatile int d = -1;
    private volatile Object e;
    private final boolean f;
    private static final Object g = new Object();
    private static final AtomicReference i = new AtomicReference();
    private static final y6f j = new y6f(new Object() { // from class: j5f
    }, null);
    private static final AtomicInteger k = new AtomicInteger();

    /* synthetic */ d6f(w5f w5fVar, String str, Object obj, boolean z, a6f a6fVar) {
        if (w5fVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = w5fVar;
        this.b = str;
        this.c = obj;
        this.f = true;
    }

    static void d() {
        k.incrementAndGet();
    }

    public static void e(final Context context) {
        if (h == null) {
            Object obj = g;
            synchronized (obj) {
                try {
                    if (h == null) {
                        synchronized (obj) {
                            x5f x5fVar = h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (x5fVar != null) {
                                if (x5fVar.a() != context) {
                                }
                            }
                            o2f.d();
                            h6f.b();
                            z4f.d();
                            h = new s1f(context, o1.a(new k7f() { // from class: h5f
                                @Override // defpackage.k7f
                                public final Object zza() {
                                    zzid c;
                                    zzid c2;
                                    Context context2 = context;
                                    int i2 = d6f.l;
                                    String str = Build.TYPE;
                                    String str2 = Build.TAGS;
                                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                        return zzid.c();
                                    }
                                    if (h1f.a() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        StrictMode.allowThreadDiskWrites();
                                        try {
                                            File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            c = file.exists() ? zzid.d(file) : zzid.c();
                                        } catch (RuntimeException e) {
                                            Log.e("HermeticFileOverrides", "no data dir", e);
                                            c = zzid.c();
                                        }
                                        if (c.b()) {
                                            File file2 = (File) c.a();
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
                                                    HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    while (true) {
                                                        String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                                        } else {
                                                            String str3 = new String(split[0]);
                                                            String decode = Uri.decode(new String(split[1]));
                                                            String str4 = (String) hashMap2.get(split[2]);
                                                            if (str4 == null) {
                                                                String str5 = new String(split[2]);
                                                                str4 = Uri.decode(str5);
                                                                if (str4.length() < 1024 || str4 == str5) {
                                                                    hashMap2.put(str5, str4);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str3)) {
                                                                hashMap.put(str3, new HashMap());
                                                            }
                                                            ((Map) hashMap.get(str3)).put(decode, str4);
                                                        }
                                                    }
                                                    Log.i("HermeticFileOverrides", "Parsed " + file2.toString());
                                                    v2f v2fVar = new v2f(hashMap);
                                                    bufferedReader.close();
                                                    c2 = zzid.d(v2fVar);
                                                } catch (Throwable th) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th2) {
                                                        try {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e2) {
                                                throw new RuntimeException(e2);
                                            }
                                        } else {
                                            c2 = zzid.c();
                                        }
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        return c2;
                                    } catch (Throwable th3) {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        throw th3;
                                    }
                                }
                            }));
                            k.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0065, B:24:0x006f, B:27:0x00a0, B:29:0x00b0, B:31:0x00c4, B:32:0x00c7, B:33:0x00cb, B:34:0x0078, B:36:0x007e, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:44:0x008e, B:48:0x0057, B:49:0x00d0, B:50:0x00d5, B:51:0x00d6), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0065, B:24:0x006f, B:27:0x00a0, B:29:0x00b0, B:31:0x00c4, B:32:0x00c7, B:33:0x00cb, B:34:0x0078, B:36:0x007e, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:44:0x008e, B:48:0x0057, B:49:0x00d0, B:50:0x00d5, B:51:0x00d6), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0065, B:24:0x006f, B:27:0x00a0, B:29:0x00b0, B:31:0x00c4, B:32:0x00c7, B:33:0x00cb, B:34:0x0078, B:36:0x007e, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:44:0x008e, B:48:0x0057, B:49:0x00d0, B:50:0x00d5, B:51:0x00d6), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6f.b():java.lang.Object");
    }

    public final String c() {
        String str = this.a.d;
        return this.b;
    }
}
