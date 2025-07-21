package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzkt {
    private static final String zzd = "zzkt";
    protected final Context zza;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzjy zzg;
    private byte[] zzh;
    private final boolean zzl;
    private zzjk zzo;
    private final Map zzp;
    private zzkm zzr;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj = false;
    private Future zzk = null;
    private volatile zzbc zzm = null;
    private Future zzn = null;
    protected boolean zzb = false;
    protected boolean zzc = false;
    private boolean zzq = false;

    private zzkt(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr != null) {
            return;
        }
        this.zzr = new zzkm(context);
    }

    public static zzkt zzg(Context context, String str, String str2, boolean z) {
        zzjy zzjyVar;
        byte[] zzb;
        zzkt zzktVar = new zzkt(context);
        try {
            zzktVar.zze = Executors.newCachedThreadPool(new zzkp());
            zzktVar.zzj = z;
            if (z) {
                zzktVar.zzk = zzktVar.zze.submit(new zzkq(zzktVar));
            }
            zzktVar.zze.execute(new zzks(zzktVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzktVar.zzb = googleApiAvailabilityLight.getApkVersion(zzktVar.zza) > 0;
                zzktVar.zzc = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzktVar.zza) == 0;
            } catch (Throwable unused) {
            }
            zzktVar.zzo(0, true);
            if (zzkw.zzc()) {
                if (((Boolean) zznc.zzc().zzb(zznr.zzcS)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            zzjyVar = new zzjy(null);
            zzktVar.zzg = zzjyVar;
            try {
                try {
                    zzb = zzia.zzb("lDvao6SwgKNthUqzuuToCGalSafTc2rxCMGIUZkEwkc=", false);
                } catch (IllegalArgumentException e) {
                    throw new zzjx(zzjyVar, e);
                }
            } catch (zzjx e2) {
                throw new zzkj(e2);
            }
        } catch (zzkj unused2) {
        }
        if (zzb.length != 32) {
            throw new zzjx(zzjyVar);
        }
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(zzb, 4, 16).get(bArr);
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
        zzktVar.zzh = bArr;
        try {
            try {
                try {
                    try {
                        File cacheDir = zzktVar.zza.getCacheDir();
                        if (cacheDir == null && (cacheDir = zzktVar.zza.getDir("dex", 0)) == null) {
                            throw new zzkj();
                        }
                        File file = new File(String.format("%s/%s.jar", cacheDir, "1678981529375"));
                        if (!file.exists()) {
                            byte[] zzb2 = zzktVar.zzg.zzb(zzktVar.zzh, "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");
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            if (Build.VERSION.SDK_INT >= 33) {
                                file.setReadOnly();
                            }
                            fileOutputStream.write(zzb2, 0, zzb2.length);
                            fileOutputStream.close();
                        }
                        zzktVar.zzx(cacheDir, "1678981529375");
                        try {
                            zzktVar.zzf = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzktVar.zza.getClassLoader());
                            zzktVar.zzo = new zzjk(zzktVar);
                            zzktVar.zzq = true;
                            return zzktVar;
                        } finally {
                            zzy(file);
                            zzktVar.zzw(cacheDir, "1678981529375");
                            zzz(String.format("%s/%s.dex", cacheDir, "1678981529375"));
                        }
                    } catch (IOException e3) {
                        throw new zzkj(e3);
                    }
                } catch (zzjx e4) {
                    throw new zzkj(e4);
                }
            } catch (NullPointerException e5) {
                throw new zzkj(e5);
            }
        } catch (FileNotFoundException e6) {
            throw new zzkj(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    private final void zzw(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1678981529375"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1678981529375"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        zzy(file3);
                        return;
                    }
                    PrintStream printStream = System.out;
                    printStream.print("test");
                    printStream.print("test");
                    printStream.print("test");
                    zzbf zza = zzbg.zza();
                    byte[] bytes = Build.VERSION.SDK.getBytes();
                    zzadr zzadrVar = zzadr.zzb;
                    zza.zzc(zzadr.zzs(bytes, 0, bytes.length));
                    byte[] bytes2 = "1678981529375".getBytes();
                    zza.zzd(zzadr.zzs(bytes2, 0, bytes2.length));
                    byte[] bytes3 = this.zzg.zza(this.zzh, bArr).getBytes();
                    zza.zza(zzadr.zzs(bytes3, 0, bytes3.length));
                    byte[] zze = zzie.zze(bytes3);
                    zza.zzb(zzadr.zzs(zze, 0, zze.length));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] zzav = ((zzbg) zza.zzak()).zzav();
                        fileOutputStream.write(zzav, 0, zzav.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        zzy(file3);
                    } catch (zzjx | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        zzy(file3);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        zzy(file3);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (zzjx | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            }
        } catch (zzjx | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean zzx(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1678981529375"));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1678981529375"));
        if (!file3.exists()) {
            FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    zzy(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            Log.d(zzd, "Cannot read the cache data.");
                            zzy(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                zzbg zzc = zzbg.zzc(bArr, zzaef.zza());
                                if ("1678981529375".equals(new String(zzc.zzg().zzx())) && Arrays.equals(zzc.zze().zzx(), zzie.zze(zzc.zzd().zzx())) && Arrays.equals(zzc.zzf().zzx(), Build.VERSION.SDK.getBytes())) {
                                    byte[] zzb = this.zzg.zzb(this.zzh, new String(zzc.zzd().zzx()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(zzb, 0, zzb.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return true;
                                        } catch (IOException unused3) {
                                            return true;
                                        }
                                    } catch (zzjx | IOException | NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused8) {
                                            throw th;
                                        }
                                    }
                                }
                                zzy(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused9) {
                                }
                                return false;
                            } catch (NullPointerException unused10) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (IOException unused11) {
                            return false;
                        }
                    } catch (zzjx | IOException | NoSuchAlgorithmException unused12) {
                        fileOutputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (zzjx | IOException | NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
        return false;
    }

    private static final void zzy(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(zzd, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        return this.zzo != null ? zzjk.zzd() : RecyclerView.UNDEFINED_DURATION;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzbc zzc() {
        return this.zzm;
    }

    public final zzjk zzd() {
        return this.zzo;
    }

    public final zzjy zze() {
        return this.zzg;
    }

    final zzkm zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (!this.zzj) {
            return null;
        }
        if (this.zzi != null) {
            return this.zzi;
        }
        Future future = this.zzk;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.zzk = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzk.cancel(true);
            }
        }
        return this.zzi;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzmg zzmgVar = (zzmg) this.zzp.get(new Pair(str, str2));
        if (zzmgVar == null) {
            return null;
        }
        return zzmgVar.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    final void zzo(int i, boolean z) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzkr(this, i, true));
            if (i == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.zzp.containsKey(pair)) {
            return false;
        }
        this.zzp.put(pair, new zzmg(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}
