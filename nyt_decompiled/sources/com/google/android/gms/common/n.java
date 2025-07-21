package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.fc5;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
abstract class n {
    private static volatile zzag e;
    private static Context g;
    static final l a = new f(j.O("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final l b = new g(j.O("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final l c = new h(j.O("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final l d = new i(j.O("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object f = new Object();

    static p a(String str, j jVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, jVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static p b(String str, boolean z, boolean z2, boolean z3) {
        return i(str, z, false, false, true);
    }

    static p c(String str, boolean z, boolean z2, boolean z3) {
        return i(str, z, false, false, false);
    }

    static /* synthetic */ String d(boolean z, String str, j jVar) {
        String str2 = (z || !h(str, jVar, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest zza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(zza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(zza.digest(jVar.Q1())), Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void e(Context context) {
        synchronized (n.class) {
            if (g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                g = context.getApplicationContext();
            }
        }
    }

    static boolean f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return e.zzg();
            } catch (RemoteException | DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static boolean g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return e.zzi();
            } catch (RemoteException | DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static p h(final String str, final j jVar, final boolean z, boolean z2) {
        try {
            j();
            Preconditions.checkNotNull(g);
            try {
                return e.zzh(new zzs(str, jVar, z, z2), fc5.l3(g.getPackageManager())) ? p.b() : new o(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return n.d(z, str, jVar);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return p.d("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return p.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, ee3] */
    private static p i(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        p d2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(g);
            try {
                j();
                zzo zzoVar = new zzo(str, z, false, fc5.l3(g), false, true);
                try {
                    zzq zze = z4 ? e.zze(zzoVar) : e.zzf(zzoVar);
                    if (zze.zzb()) {
                        d2 = p.f(zze.zzc());
                    } else {
                        String zza = zze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (zza == null) {
                            zza = "error checking package certificate";
                        }
                        d2 = p.g(zze.zzc(), zze.zzd(), zza, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    d2 = p.d("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                d2 = p.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void j() {
        if (e != null) {
            return;
        }
        Preconditions.checkNotNull(g);
        synchronized (f) {
            try {
                if (e == null) {
                    e = zzaf.zzb(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
