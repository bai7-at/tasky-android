package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzaht {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzahs zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzaht.<clinit>():void");
    }

    private zzaht() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzadd.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b) {
        zzahs zzahsVar = zzf;
        long j2 = (-4) & j;
        int i = zzahsVar.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzahsVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b) {
        zzahs zzahsVar = zzf;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzahsVar.zza.putInt(obj, j2, ((255 & b) << i) | (zzahsVar.zza.getInt(obj, j2) & (~(255 << i))));
    }

    static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static long zzd(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static Object zzf(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzahp());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzaht.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzm(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzn(byte[] bArr, long j, byte b) {
        zzf.zzd(bArr, zza + j, b);
    }

    static void zzo(Object obj, long j, double d) {
        zzf.zze(obj, j, d);
    }

    static void zzp(Object obj, long j, float f) {
        zzf.zzf(obj, j, f);
    }

    static void zzq(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static void zzr(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static void zzs(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class cls) {
        int i = zzadd.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzw(Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
