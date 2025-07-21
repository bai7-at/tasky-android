package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzqi {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzpr zze;
    private boolean zzf;

    public zzqi(Context context, int i, zzpr zzprVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzprVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzmm zzmmVar) {
        zzmo zzd = zzmp.zzd();
        zzd.zze(zzmmVar.zzc().zzk());
        zzd.zza(zzmmVar.zzc().zzi());
        zzd.zzb(zzmmVar.zzc().zza());
        zzd.zzd(zzmmVar.zzc().zzc());
        zzd.zzc(zzmmVar.zzc().zzb());
        return Hex.bytesToStringLowercase(((zzmp) zzd.zzak()).zzav());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        zzpr zzprVar = this.zze;
        if (zzprVar != null) {
            zzprVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzpr zzprVar = this.zze;
        if (zzprVar != null) {
            zzprVar.zzb(i, j, str);
        }
    }

    private final zzmp zzk(int i) {
        String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzadr zzadrVar = zzadr.zzb;
            return zzmp.zzh(zzadr.zzs(stringToBytes, 0, stringToBytes.length), this.zzf ? zzaef.zza() : zzaef.zzb());
        } catch (zzafc unused) {
            return null;
        } catch (NullPointerException unused2) {
            this.zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            this.zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzmm zzmmVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzqc.zze(new File(zze(zzmmVar.zzc().zzk()), "pcbc"), zzmmVar.zzd().zzx())) {
                    zzi(4020, currentTimeMillis);
                    return false;
                }
                String zzf = zzf(zzmmVar);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                boolean commit = edit.commit();
                if (commit) {
                    zzi(5015, currentTimeMillis);
                } else {
                    zzi(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzmm zzmmVar, zzqh zzqhVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzmp zzk = zzk(1);
                String zzk2 = zzmmVar.zzc().zzk();
                if (zzk != null && zzk.zzk().equals(zzk2)) {
                    zzi(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zzk2);
                if (zze.exists()) {
                    boolean isDirectory = zze.isDirectory();
                    String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isDirectory) {
                        str = "0";
                    }
                    boolean isFile = zze.isFile();
                    String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != isFile) {
                        str2 = "0";
                    }
                    zzj(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    boolean canWrite = zze.canWrite();
                    String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (true != canWrite) {
                        str3 = "0";
                    }
                    zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zzk2);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzqc.zze(file, zzmmVar.zze().zzx())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                }
                if (!zzqc.zze(file2, zzmmVar.zzd().zzx())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                }
                if (zzqhVar != null && !zzqhVar.zza(file)) {
                    zzi(4018, currentTimeMillis);
                    zzqc.zzd(zze2);
                    return false;
                }
                String zzf = zzf(zzmmVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzmp zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzmp zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzqc.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzqa zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzmp zzk = zzk(1);
                if (zzk == null) {
                    zzi(4022, currentTimeMillis);
                    return null;
                }
                File zze = zze(zzk.zzk());
                File file = new File(zze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(zze, "pcam");
                }
                File file2 = new File(zze, "pcbc");
                File file3 = new File(zze, "pcopt");
                zzi(5016, currentTimeMillis);
                return new zzqa(zzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzmp zzk = zzk(1);
                if (zzk == null) {
                    zzi(4025, currentTimeMillis);
                    return false;
                }
                File zze = zze(zzk.zzk());
                if (!new File(zze, "pcam.jar").exists()) {
                    zzi(4026, currentTimeMillis);
                    return false;
                }
                if (new File(zze, "pcbc").exists()) {
                    zzi(5019, currentTimeMillis);
                    return true;
                }
                zzi(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
