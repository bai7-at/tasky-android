package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class kv {
    public static final a f = new a(null);
    private static final String g = kv.class.getCanonicalName();
    public static kv h;
    private String a;
    private long b;
    private String c;
    private String d;
    private boolean e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final kv a(kv kvVar) {
            kvVar.b = System.currentTimeMillis();
            kv.h = kvVar;
            return kvVar;
        }

        private final kv b(Context context) {
            kv c = c(context);
            if (c != null) {
                return c;
            }
            kv d = d(context);
            return d == null ? new kv() : d;
        }

        private final kv c(Context context) {
            Method H;
            Object P;
            try {
                if (!g(context) || (H = g29.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (P = g29.P(null, H, context)) == null) {
                    return null;
                }
                boolean z = false;
                Method G = g29.G(P.getClass(), "getId", new Class[0]);
                Method G2 = g29.G(P.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (G != null && G2 != null) {
                    kv kvVar = new kv();
                    kvVar.a = (String) g29.P(P, G, new Object[0]);
                    Boolean bool = (Boolean) g29.P(P, G2, new Object[0]);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    kvVar.e = z;
                    return kvVar;
                }
                return null;
            } catch (Exception e) {
                g29.e0("android_id", e);
                return null;
            }
        }

        private final kv d(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        b bVar = new b(cVar.a());
                        kv kvVar = new kv();
                        kvVar.a = bVar.O();
                        kvVar.e = bVar.Q1();
                        return kvVar;
                    } catch (Exception e) {
                        g29.e0("android_id", e);
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        private final boolean g(Context context) {
            Method H = g29.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (H == null) {
                return false;
            }
            Object P = g29.P(null, H, context);
            return (P instanceof Integer) && zq3.c(P, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:47:0x006e, B:49:0x007d, B:51:0x00f1, B:52:0x00f8), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:47:0x006e, B:49:0x007d, B:51:0x00f1, B:52:0x00f8), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[Catch: all -> 0x0033, Exception -> 0x0036, TRY_LEAVE, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:47:0x006e, B:49:0x007d, B:51:0x00f1, B:52:0x00f8), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.kv e(android.content.Context r12) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kv.a.e(android.content.Context):kv");
        }

        public final boolean h(Context context) {
            zq3.h(context, "context");
            kv e = e(context);
            return e != null && e.l();
        }

        private a() {
        }
    }

    private static final class b implements IInterface {
        public static final a b = new a(null);
        private final IBinder a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(IBinder iBinder) {
            zq3.h(iBinder, "binder");
            this.a = iBinder;
        }

        public final String O() {
            Parcel obtain = Parcel.obtain();
            zq3.g(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            zq3.g(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean Q1() {
            Parcel obtain = Parcel.obtain();
            zq3.g(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            zq3.g(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }
    }

    private static final class c implements ServiceConnection {
        private final AtomicBoolean a = new AtomicBoolean(false);
        private final BlockingQueue b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (this.a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object take = this.b.take();
            zq3.g(take, "queue.take()");
            return (IBinder) take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final kv k(Context context) {
        return f.e(context);
    }

    public final String h() {
        if (w92.E() && w92.k()) {
            return this.a;
        }
        return null;
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.c;
    }

    public final boolean l() {
        return this.e;
    }
}
