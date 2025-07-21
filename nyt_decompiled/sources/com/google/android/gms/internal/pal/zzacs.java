package com.google.android.gms.internal.pal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzacs {
    public static final zzacs zzA;
    public static final zzacs zzB;
    public static final zzacs zzC;
    public static final zzacs zzD;
    public static final zzacs zzE;
    public static final zzacs zzF;
    public static final zzacs zzG;
    public static final zzacs zzH;
    public static final zzacs zzI;
    public static final zzacs zzJ;
    public static final zzacs zzK;
    public static final zzacs zzL;
    public static final zzacs zzM;
    public static final zzacs zzN;
    public static final zzacs zzO;
    public static final zzacs zzP;
    public static final zzacs zzQ;
    public static final zzacs zzR;
    public static final zzacs zzS;
    public static final zzacs zzT;
    public static final zzacs zzU;
    public static final zzacs zzV;
    public static final zzacs zzW;
    public static final zzacs zzX;
    public static final zzacs zzY;
    private static final zzacs[] zzZ;
    public static final zzacs zza;
    private static final /* synthetic */ zzacs[] zzaa;
    public static final zzacs zzb;
    public static final zzacs zzc;
    public static final zzacs zzd;
    public static final zzacs zze;
    public static final zzacs zzf;
    public static final zzacs zzg;
    public static final zzacs zzh;
    public static final zzacs zzi;
    public static final zzacs zzj;
    public static final zzacs zzk;
    public static final zzacs zzl;
    public static final zzacs zzm;
    public static final zzacs zzn;
    public static final zzacs zzo;
    public static final zzacs zzp;
    public static final zzacs zzq;
    public static final zzacs zzr;
    public static final zzacs zzs;
    public static final zzacs zzt;
    public static final zzacs zzu;
    public static final zzacs zzv;
    public static final zzacs zzw;
    public static final zzacs zzx;
    public static final zzacs zzy;
    public static final zzacs zzz;
    private final zzadj zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzadj zzadjVar = zzadj.zze;
        zzacs zzacsVar = new zzacs("DOUBLE", 0, 0, 1, zzadjVar);
        zza = zzacsVar;
        zzadj zzadjVar2 = zzadj.zzd;
        zzacs zzacsVar2 = new zzacs("FLOAT", 1, 1, 1, zzadjVar2);
        zzb = zzacsVar2;
        zzadj zzadjVar3 = zzadj.zzc;
        zzacs zzacsVar3 = new zzacs("INT64", 2, 2, 1, zzadjVar3);
        zzc = zzacsVar3;
        zzacs zzacsVar4 = new zzacs("UINT64", 3, 3, 1, zzadjVar3);
        zzd = zzacsVar4;
        zzadj zzadjVar4 = zzadj.zzb;
        zzacs zzacsVar5 = new zzacs("INT32", 4, 4, 1, zzadjVar4);
        zze = zzacsVar5;
        zzacs zzacsVar6 = new zzacs("FIXED64", 5, 5, 1, zzadjVar3);
        zzf = zzacsVar6;
        zzacs zzacsVar7 = new zzacs("FIXED32", 6, 6, 1, zzadjVar4);
        zzg = zzacsVar7;
        zzadj zzadjVar5 = zzadj.zzf;
        zzacs zzacsVar8 = new zzacs("BOOL", 7, 7, 1, zzadjVar5);
        zzh = zzacsVar8;
        zzadj zzadjVar6 = zzadj.zzg;
        zzacs zzacsVar9 = new zzacs("STRING", 8, 8, 1, zzadjVar6);
        zzi = zzacsVar9;
        zzadj zzadjVar7 = zzadj.zzj;
        zzacs zzacsVar10 = new zzacs("MESSAGE", 9, 9, 1, zzadjVar7);
        zzj = zzacsVar10;
        zzadj zzadjVar8 = zzadj.zzh;
        zzacs zzacsVar11 = new zzacs("BYTES", 10, 10, 1, zzadjVar8);
        zzk = zzacsVar11;
        zzacs zzacsVar12 = new zzacs("UINT32", 11, 11, 1, zzadjVar4);
        zzl = zzacsVar12;
        zzadj zzadjVar9 = zzadj.zzi;
        zzacs zzacsVar13 = new zzacs("ENUM", 12, 12, 1, zzadjVar9);
        zzm = zzacsVar13;
        zzacs zzacsVar14 = new zzacs("SFIXED32", 13, 13, 1, zzadjVar4);
        zzn = zzacsVar14;
        zzacs zzacsVar15 = new zzacs("SFIXED64", 14, 14, 1, zzadjVar3);
        zzo = zzacsVar15;
        zzacs zzacsVar16 = new zzacs("SINT32", 15, 15, 1, zzadjVar4);
        zzp = zzacsVar16;
        zzacs zzacsVar17 = new zzacs("SINT64", 16, 16, 1, zzadjVar3);
        zzq = zzacsVar17;
        zzacs zzacsVar18 = new zzacs("GROUP", 17, 17, 1, zzadjVar7);
        zzr = zzacsVar18;
        zzacs zzacsVar19 = new zzacs("DOUBLE_LIST", 18, 18, 2, zzadjVar);
        zzs = zzacsVar19;
        zzacs zzacsVar20 = new zzacs("FLOAT_LIST", 19, 19, 2, zzadjVar2);
        zzt = zzacsVar20;
        zzacs zzacsVar21 = new zzacs("INT64_LIST", 20, 20, 2, zzadjVar3);
        zzu = zzacsVar21;
        zzacs zzacsVar22 = new zzacs("UINT64_LIST", 21, 21, 2, zzadjVar3);
        zzv = zzacsVar22;
        zzacs zzacsVar23 = new zzacs("INT32_LIST", 22, 22, 2, zzadjVar4);
        zzw = zzacsVar23;
        zzacs zzacsVar24 = new zzacs("FIXED64_LIST", 23, 23, 2, zzadjVar3);
        zzx = zzacsVar24;
        zzacs zzacsVar25 = new zzacs("FIXED32_LIST", 24, 24, 2, zzadjVar4);
        zzy = zzacsVar25;
        zzacs zzacsVar26 = new zzacs("BOOL_LIST", 25, 25, 2, zzadjVar5);
        zzz = zzacsVar26;
        zzacs zzacsVar27 = new zzacs("STRING_LIST", 26, 26, 2, zzadjVar6);
        zzA = zzacsVar27;
        zzacs zzacsVar28 = new zzacs("MESSAGE_LIST", 27, 27, 2, zzadjVar7);
        zzB = zzacsVar28;
        zzacs zzacsVar29 = new zzacs("BYTES_LIST", 28, 28, 2, zzadjVar8);
        zzC = zzacsVar29;
        zzacs zzacsVar30 = new zzacs("UINT32_LIST", 29, 29, 2, zzadjVar4);
        zzD = zzacsVar30;
        zzacs zzacsVar31 = new zzacs("ENUM_LIST", 30, 30, 2, zzadjVar9);
        zzE = zzacsVar31;
        zzacs zzacsVar32 = new zzacs("SFIXED32_LIST", 31, 31, 2, zzadjVar4);
        zzF = zzacsVar32;
        zzacs zzacsVar33 = new zzacs("SFIXED64_LIST", 32, 32, 2, zzadjVar3);
        zzG = zzacsVar33;
        zzacs zzacsVar34 = new zzacs("SINT32_LIST", 33, 33, 2, zzadjVar4);
        zzH = zzacsVar34;
        zzacs zzacsVar35 = new zzacs("SINT64_LIST", 34, 34, 2, zzadjVar3);
        zzI = zzacsVar35;
        zzacs zzacsVar36 = new zzacs("DOUBLE_LIST_PACKED", 35, 35, 3, zzadjVar);
        zzJ = zzacsVar36;
        zzacs zzacsVar37 = new zzacs("FLOAT_LIST_PACKED", 36, 36, 3, zzadjVar2);
        zzK = zzacsVar37;
        zzacs zzacsVar38 = new zzacs("INT64_LIST_PACKED", 37, 37, 3, zzadjVar3);
        zzL = zzacsVar38;
        zzacs zzacsVar39 = new zzacs("UINT64_LIST_PACKED", 38, 38, 3, zzadjVar3);
        zzM = zzacsVar39;
        zzacs zzacsVar40 = new zzacs("INT32_LIST_PACKED", 39, 39, 3, zzadjVar4);
        zzN = zzacsVar40;
        zzacs zzacsVar41 = new zzacs("FIXED64_LIST_PACKED", 40, 40, 3, zzadjVar3);
        zzO = zzacsVar41;
        zzacs zzacsVar42 = new zzacs("FIXED32_LIST_PACKED", 41, 41, 3, zzadjVar4);
        zzP = zzacsVar42;
        zzacs zzacsVar43 = new zzacs("BOOL_LIST_PACKED", 42, 42, 3, zzadjVar5);
        zzQ = zzacsVar43;
        zzacs zzacsVar44 = new zzacs("UINT32_LIST_PACKED", 43, 43, 3, zzadjVar4);
        zzR = zzacsVar44;
        zzacs zzacsVar45 = new zzacs("ENUM_LIST_PACKED", 44, 44, 3, zzadjVar9);
        zzS = zzacsVar45;
        zzacs zzacsVar46 = new zzacs("SFIXED32_LIST_PACKED", 45, 45, 3, zzadjVar4);
        zzT = zzacsVar46;
        zzacs zzacsVar47 = new zzacs("SFIXED64_LIST_PACKED", 46, 46, 3, zzadjVar3);
        zzU = zzacsVar47;
        zzacs zzacsVar48 = new zzacs("SINT32_LIST_PACKED", 47, 47, 3, zzadjVar4);
        zzV = zzacsVar48;
        zzacs zzacsVar49 = new zzacs("SINT64_LIST_PACKED", 48, 48, 3, zzadjVar3);
        zzW = zzacsVar49;
        zzacs zzacsVar50 = new zzacs("GROUP_LIST", 49, 49, 2, zzadjVar7);
        zzX = zzacsVar50;
        zzacs zzacsVar51 = new zzacs("MAP", 50, 50, 4, zzadj.zza);
        zzY = zzacsVar51;
        zzaa = new zzacs[]{zzacsVar, zzacsVar2, zzacsVar3, zzacsVar4, zzacsVar5, zzacsVar6, zzacsVar7, zzacsVar8, zzacsVar9, zzacsVar10, zzacsVar11, zzacsVar12, zzacsVar13, zzacsVar14, zzacsVar15, zzacsVar16, zzacsVar17, zzacsVar18, zzacsVar19, zzacsVar20, zzacsVar21, zzacsVar22, zzacsVar23, zzacsVar24, zzacsVar25, zzacsVar26, zzacsVar27, zzacsVar28, zzacsVar29, zzacsVar30, zzacsVar31, zzacsVar32, zzacsVar33, zzacsVar34, zzacsVar35, zzacsVar36, zzacsVar37, zzacsVar38, zzacsVar39, zzacsVar40, zzacsVar41, zzacsVar42, zzacsVar43, zzacsVar44, zzacsVar45, zzacsVar46, zzacsVar47, zzacsVar48, zzacsVar49, zzacsVar50, zzacsVar51};
        zzacs[] values = values();
        zzZ = new zzacs[values.length];
        for (zzacs zzacsVar52 : values) {
            zzZ[zzacsVar52.zzac] = zzacsVar52;
        }
    }

    private zzacs(String str, int i, int i2, int i3, zzadj zzadjVar) {
        this.zzac = i2;
        this.zzab = zzadjVar;
        zzadj zzadjVar2 = zzadj.zza;
        int i4 = i3 - 1;
        if (i4 == 1) {
            this.zzad = zzadjVar.zza();
        } else if (i4 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzadjVar.zza();
        }
        if (i3 == 1) {
            zzadjVar.ordinal();
        }
    }

    public static zzacs[] values() {
        return (zzacs[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
