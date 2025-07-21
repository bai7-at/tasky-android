package com.google.android.gms.internal.pal;

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
/* loaded from: classes3.dex */
public final class zzadj {
    public static final zzadj zza;
    public static final zzadj zzb;
    public static final zzadj zzc;
    public static final zzadj zzd;
    public static final zzadj zze;
    public static final zzadj zzf;
    public static final zzadj zzg;
    public static final zzadj zzh;
    public static final zzadj zzi;
    public static final zzadj zzj;
    private static final /* synthetic */ zzadj[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzadj zzadjVar = new zzadj("VOID", 0, Void.class, Void.class, null);
        zza = zzadjVar;
        Class cls = Integer.TYPE;
        zzadj zzadjVar2 = new zzadj("INT", 1, cls, Integer.class, 0);
        zzb = zzadjVar2;
        zzadj zzadjVar3 = new zzadj("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzadjVar3;
        zzadj zzadjVar4 = new zzadj("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzadjVar4;
        zzadj zzadjVar5 = new zzadj("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzadjVar5;
        zzadj zzadjVar6 = new zzadj("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzadjVar6;
        zzadj zzadjVar7 = new zzadj("STRING", 6, String.class, String.class, "");
        zzg = zzadjVar7;
        zzadj zzadjVar8 = new zzadj("BYTE_STRING", 7, zzaby.class, zzaby.class, zzaby.a);
        zzh = zzadjVar8;
        zzadj zzadjVar9 = new zzadj("ENUM", 8, cls, Integer.class, null);
        zzi = zzadjVar9;
        zzadj zzadjVar10 = new zzadj("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzadjVar10;
        zzk = new zzadj[]{zzadjVar, zzadjVar2, zzadjVar3, zzadjVar4, zzadjVar5, zzadjVar6, zzadjVar7, zzadjVar8, zzadjVar9, zzadjVar10};
    }

    private zzadj(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzadj[] values() {
        return (zzadj[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
