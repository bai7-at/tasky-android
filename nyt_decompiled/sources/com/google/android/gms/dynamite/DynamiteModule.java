package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.oka;
import defpackage.yof;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class DynamiteModule {
    private static Boolean h = null;
    private static String i = null;
    private static boolean j = false;
    private static int k = -1;
    private static Boolean l;
    private static l q;
    private static m r;
    private final Context a;
    private static final ThreadLocal m = new ThreadLocal();
    private static final ThreadLocal n = new com.google.android.gms.dynamite.a();
    private static final a.InterfaceC0200a o = new b();
    public static final a b = new c();
    public static final a c = new d();
    public static final a d = new e();
    public static final a e = new f();
    public static final a f = new g();
    public static final a g = new h();
    public static final a p = new i();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, yof yofVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, yof yofVar) {
            super(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        public interface InterfaceC0200a {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, InterfaceC0200a interfaceC0200a);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, a aVar, String str) {
        int i2;
        ee3 l3;
        DynamiteModule dynamiteModule;
        m mVar;
        boolean z;
        ee3 O;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = m;
        j jVar = (j) threadLocal.get();
        j jVar2 = new j(null);
        threadLocal.set(jVar2);
        ThreadLocal threadLocal2 = n;
        Long l2 = (Long) threadLocal2.get();
        long longValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a2 = aVar.a(context, str, o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a2.a + " and remote module " + str + ":" + a2.b);
            int i3 = a2.c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (a2.a != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || a2.b != 0) {
                    if (i3 == -1) {
                        DynamiteModule h2 = h(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        Cursor cursor = jVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(jVar);
                        return h2;
                    }
                    if (i3 != 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                    }
                    try {
                        try {
                            int i4 = a2.b;
                            try {
                                try {
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                if (!k(context)) {
                                                    throw new LoadingException("Remote loading disabled", null);
                                                }
                                                Boolean bool = h;
                                                if (bool == null) {
                                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                    synchronized (DynamiteModule.class) {
                                                        try {
                                                            mVar = r;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            while (true) {
                                                                try {
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (mVar == null) {
                                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                                    }
                                                    j jVar3 = (j) threadLocal.get();
                                                    if (jVar3 == null || jVar3.a == null) {
                                                        throw new LoadingException("No result cursor", null);
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = jVar3.a;
                                                    fc5.l3(null);
                                                    synchronized (DynamiteModule.class) {
                                                        z = k >= 2;
                                                    }
                                                    if (z) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        O = mVar.Q1(fc5.l3(applicationContext2), str, i4, fc5.l3(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        O = mVar.O(fc5.l3(applicationContext2), str, i4, fc5.l3(cursor2));
                                                    }
                                                    Context context2 = (Context) fc5.Q1(O);
                                                    if (context2 == null) {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                    l l4 = l(context);
                                                    if (l4 == null) {
                                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                                    }
                                                    int zze = l4.zze();
                                                    if (zze >= 3) {
                                                        j jVar4 = (j) threadLocal.get();
                                                        if (jVar4 == null) {
                                                            throw new LoadingException("No cached result cursor holder", null);
                                                        }
                                                        l3 = l4.n4(fc5.l3(context), str, i4, fc5.l3(jVar4.a));
                                                    } else if (zze == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        l3 = l4.s4(fc5.l3(context), str, i4);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        l3 = l4.l3(fc5.l3(context), str, i4);
                                                    }
                                                    Object Q1 = fc5.Q1(l3);
                                                    if (Q1 == null) {
                                                        throw new LoadingException("Failed to load remote module.", null);
                                                    }
                                                    dynamiteModule = new DynamiteModule((Context) Q1);
                                                }
                                                if (longValue == 0) {
                                                    threadLocal2.remove();
                                                } else {
                                                    threadLocal2.set(l2);
                                                }
                                                Cursor cursor3 = jVar2.a;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                threadLocal.set(jVar);
                                                return dynamiteModule;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (RemoteException e2) {
                                    e = e2;
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e3) {
                                    throw e3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                                throw new LoadingException("Failed to load remote module.", e, null);
                            } catch (LoadingException e5) {
                                throw e5;
                            } catch (Throwable th6) {
                                th = th6;
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e6) {
                            e = e6;
                            Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                            i2 = a2.a;
                            if (i2 != 0 || aVar.a(context, str, new k(i2, 0)).c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                            }
                            DynamiteModule h3 = h(applicationContext, str);
                            if (longValue == 0) {
                                n.remove();
                            } else {
                                n.set(l2);
                            }
                            Cursor cursor4 = jVar2.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            m.set(jVar);
                            return h3;
                        }
                    } catch (LoadingException e7) {
                        e = e7;
                        Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                        i2 = a2.a;
                        if (i2 != 0) {
                        }
                        throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + InstructionFileId.DOT, null);
        } catch (Throwable th7) {
            if (longValue == 0) {
                n.remove();
            } else {
                n.set(l2);
            }
            Cursor cursor5 = jVar2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            m.set(jVar);
            throw th7;
        }
    }

    public static int f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = h;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!k(context)) {
                                return 0;
                            }
                            if (!j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g2 = g(context, str, z, true);
                                        String str2 = i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = oka.a();
                                            if (a2 == null) {
                                                String str3 = i;
                                                Preconditions.checkNotNull(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            }
                                            i(a2);
                                            declaredField.set(null, a2);
                                            h = bool2;
                                            return g2;
                                        }
                                        return g2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z, false);
                    } catch (LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                l l2 = l(context);
                if (l2 != null) {
                    try {
                        try {
                            int zze = l2.zze();
                            if (zze >= 3) {
                                j jVar = (j) m.get();
                                if (jVar == null || (cursor = jVar.a) == null) {
                                    Cursor cursor2 = (Cursor) fc5.Q1(l2.x4(fc5.l3(context), str, z, ((Long) n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i3 = cursor2.getInt(0);
                                                r2 = (i3 <= 0 || !j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = l2.Q1(fc5.l3(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = l2.O(fc5.l3(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i2;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        m mVar;
        yof yofVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
            }
            r = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, yofVar);
        }
    }

    private static boolean j(Cursor cursor) {
        j jVar = (j) m.get();
        if (jVar == null || jVar.a != null) {
            return false;
        }
        jVar.a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            l = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static l l(Context context) {
        l lVar;
        synchronized (DynamiteModule.class) {
            l lVar2 = q;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(iBinder);
                }
                if (lVar != null) {
                    q = lVar;
                    return lVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
