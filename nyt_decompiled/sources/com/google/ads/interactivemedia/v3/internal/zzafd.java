package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzafd {
    public static final zzafd zza;
    public static final zzafd zzb;
    public static final zzafd zzc;
    public static final zzafd zzd;
    public static final zzafd zze;
    public static final zzafd zzf;
    public static final zzafd zzg;
    public static final zzafd zzh;
    public static final zzafd zzi;
    public static final zzafd zzj;
    private static final /* synthetic */ zzafd[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzafd zzafdVar = new zzafd("VOID", 0, Void.class, Void.class, null);
        zza = zzafdVar;
        Class cls = Integer.TYPE;
        zzafd zzafdVar2 = new zzafd("INT", 1, cls, Integer.class, 0);
        zzb = zzafdVar2;
        zzafd zzafdVar3 = new zzafd("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzafdVar3;
        zzafd zzafdVar4 = new zzafd("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzafdVar4;
        zzafd zzafdVar5 = new zzafd("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzafdVar5;
        zzafd zzafdVar6 = new zzafd("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzafdVar6;
        zzafd zzafdVar7 = new zzafd("STRING", 6, String.class, String.class, "");
        zzg = zzafdVar7;
        zzafd zzafdVar8 = new zzafd("BYTE_STRING", 7, zzadr.class, zzadr.class, zzadr.zzb);
        zzh = zzafdVar8;
        zzafd zzafdVar9 = new zzafd("ENUM", 8, cls, Integer.class, null);
        zzi = zzafdVar9;
        zzafd zzafdVar10 = new zzafd("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzafdVar10;
        zzk = new zzafd[]{zzafdVar, zzafdVar2, zzafdVar3, zzafdVar4, zzafdVar5, zzafdVar6, zzafdVar7, zzafdVar8, zzafdVar9, zzafdVar10};
    }

    private zzafd(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzafd[] values() {
        return (zzafd[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
