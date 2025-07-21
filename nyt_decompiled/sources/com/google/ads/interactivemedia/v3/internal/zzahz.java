package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzahz {
    public static final zzahz zza;
    public static final zzahz zzb;
    public static final zzahz zzc;
    public static final zzahz zzd;
    public static final zzahz zze;
    public static final zzahz zzf;
    public static final zzahz zzg;
    public static final zzahz zzh;
    public static final zzahz zzi;
    public static final zzahz zzj;
    public static final zzahz zzk;
    public static final zzahz zzl;
    public static final zzahz zzm;
    public static final zzahz zzn;
    public static final zzahz zzo;
    public static final zzahz zzp;
    public static final zzahz zzq;
    public static final zzahz zzr;
    private static final /* synthetic */ zzahz[] zzs;
    private final zzaia zzt;

    static {
        zzahz zzahzVar = new zzahz("DOUBLE", 0, zzaia.DOUBLE, 1);
        zza = zzahzVar;
        zzahz zzahzVar2 = new zzahz("FLOAT", 1, zzaia.FLOAT, 5);
        zzb = zzahzVar2;
        zzaia zzaiaVar = zzaia.LONG;
        zzahz zzahzVar3 = new zzahz("INT64", 2, zzaiaVar, 0);
        zzc = zzahzVar3;
        zzahz zzahzVar4 = new zzahz("UINT64", 3, zzaiaVar, 0);
        zzd = zzahzVar4;
        zzaia zzaiaVar2 = zzaia.INT;
        zzahz zzahzVar5 = new zzahz("INT32", 4, zzaiaVar2, 0);
        zze = zzahzVar5;
        zzahz zzahzVar6 = new zzahz("FIXED64", 5, zzaiaVar, 1);
        zzf = zzahzVar6;
        zzahz zzahzVar7 = new zzahz("FIXED32", 6, zzaiaVar2, 5);
        zzg = zzahzVar7;
        zzahz zzahzVar8 = new zzahz("BOOL", 7, zzaia.BOOLEAN, 0);
        zzh = zzahzVar8;
        zzahz zzahzVar9 = new zzahz("STRING", 8, zzaia.STRING, 2);
        zzi = zzahzVar9;
        zzaia zzaiaVar3 = zzaia.MESSAGE;
        zzahz zzahzVar10 = new zzahz("GROUP", 9, zzaiaVar3, 3);
        zzj = zzahzVar10;
        zzahz zzahzVar11 = new zzahz("MESSAGE", 10, zzaiaVar3, 2);
        zzk = zzahzVar11;
        zzahz zzahzVar12 = new zzahz("BYTES", 11, zzaia.BYTE_STRING, 2);
        zzl = zzahzVar12;
        zzahz zzahzVar13 = new zzahz("UINT32", 12, zzaiaVar2, 0);
        zzm = zzahzVar13;
        zzahz zzahzVar14 = new zzahz("ENUM", 13, zzaia.ENUM, 0);
        zzn = zzahzVar14;
        zzahz zzahzVar15 = new zzahz("SFIXED32", 14, zzaiaVar2, 5);
        zzo = zzahzVar15;
        zzahz zzahzVar16 = new zzahz("SFIXED64", 15, zzaiaVar, 1);
        zzp = zzahzVar16;
        zzahz zzahzVar17 = new zzahz("SINT32", 16, zzaiaVar2, 0);
        zzq = zzahzVar17;
        zzahz zzahzVar18 = new zzahz("SINT64", 17, zzaiaVar, 0);
        zzr = zzahzVar18;
        zzs = new zzahz[]{zzahzVar, zzahzVar2, zzahzVar3, zzahzVar4, zzahzVar5, zzahzVar6, zzahzVar7, zzahzVar8, zzahzVar9, zzahzVar10, zzahzVar11, zzahzVar12, zzahzVar13, zzahzVar14, zzahzVar15, zzahzVar16, zzahzVar17, zzahzVar18};
    }

    private zzahz(String str, int i, zzaia zzaiaVar, int i2) {
        this.zzt = zzaiaVar;
    }

    public static zzahz[] values() {
        return (zzahz[]) zzs.clone();
    }

    public final zzaia zza() {
        return this.zzt;
    }
}
