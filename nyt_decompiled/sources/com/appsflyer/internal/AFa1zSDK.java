package com.appsflyer.internal;

/* loaded from: classes2.dex */
public class AFa1zSDK {
    public static byte[] AFVersionDeclaration = null;
    public static byte[] AppsFlyer2dXConversionCallback = null;
    private static int onAppOpenAttributionNative = 0;
    private static Object onAttributionFailureNative = null;
    private static int onConversionDataFail = 1;
    private static int onConversionDataSuccess;
    public static final byte[] onDeepLinkingNative = null;
    private static int onInstallConversionDataLoadedNative;
    private static Object onInstallConversionFailureNative;
    public static final int onResponseErrorNative = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:7:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r9, int r10, byte r11) {
        /*
            int r0 = com.appsflyer.internal.AFa1zSDK.onConversionDataFail
            r1 = r0 & 27
            r2 = r0 | 27
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1zSDK.onConversionDataSuccess = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            r1 = r10 & 124(0x7c, float:1.74E-43)
            r10 = r10 | 124(0x7c, float:1.74E-43)
            int r1 = r1 + r10
            int r1 = r1 + (-40)
            byte[] r10 = com.appsflyer.internal.AFa1zSDK.onDeepLinkingNative
            int r11 = r11 + 116
            byte[] r4 = new byte[r9]
            if (r10 != 0) goto L22
            r11 = r3
            goto L3d
        L22:
            r0 = r3
            goto L4e
        L24:
            r1 = r10 & 4
            r10 = r10 | 4
            int r1 = r1 + r10
            byte[] r10 = com.appsflyer.internal.AFa1zSDK.onDeepLinkingNative
            r4 = r11 & (-14)
            r11 = r11 | (-14)
            int r4 = r4 + r11
            r11 = r4 | 55
            int r11 = r11 << r3
            r4 = r4 ^ 55
            int r11 = r11 - r4
            int r9 = r9 + 1
            byte[] r4 = new byte[r9]
            if (r10 != 0) goto L4d
            r11 = r2
        L3d:
            r5 = r0 ^ 93
            r0 = r0 & 93
            int r0 = r0 << r3
            int r5 = r5 + r0
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1zSDK.onConversionDataSuccess = r5
            r0 = r11
            r5 = r4
            r11 = r10
            r4 = r1
            r10 = r9
            goto L66
        L4d:
            r0 = r2
        L4e:
            int r5 = r0 + 1
            byte r6 = (byte) r11
            r4[r0] = r6
            if (r5 != r9) goto L5b
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4, r2)
            return r9
        L5b:
            r0 = r10[r1]
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
            r8 = r1
            r1 = r0
            r0 = r5
            r5 = r4
            r4 = r8
        L66:
            int r1 = -r1
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r9 = r9 - r1
            int r9 = r9 - r3
            r1 = r4 & 1
            r4 = r4 | r3
            int r1 = r1 + r4
            r4 = r9 & (-3)
            r9 = r9 | (-3)
            int r9 = r9 + r4
            r4 = r5
            r7 = r11
            r11 = r9
            r9 = r10
            r10 = r7
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.$$c(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:(34:1087|1088|(0)|17|(0)|19|20|(0)|(0)|(0)|66|67|68|69|70|71|(0)(0)|74|75|(0)(0)|78|(0)(0)|81|82|(0)|1065|87|(0)(0)|90|91|92|(0)|1061|1062)|15|(0)|17|(0)|19|20|(0)|(0)|(0)|66|67|68|69|70|71|(0)(0)|74|75|(0)(0)|78|(0)(0)|81|82|(0)|1065|87|(0)(0)|90|91|92|(0)|1061|1062) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03bf, code lost:
    
        if (r2 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:1067:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1082:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1087:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x137a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x189f A[Catch: Exception -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #110 {Exception -> 0x0054, blocks: (B:3:0x001b, B:9:0x0044, B:24:0x0144, B:29:0x1984, B:31:0x198b, B:33:0x198c, B:35:0x0186, B:43:0x1970, B:45:0x1977, B:46:0x1978, B:49:0x197a, B:51:0x1981, B:52:0x1982, B:55:0x01fd, B:62:0x0247, B:64:0x024d, B:65:0x024e, B:68:0x0280, B:71:0x02e4, B:75:0x0320, B:78:0x032d, B:81:0x0336, B:87:0x0351, B:91:0x035d, B:96:0x0367, B:258:0x189f, B:266:0x18b1, B:101:0x1943, B:261:0x18be, B:269:0x18ce, B:277:0x1918, B:279:0x191e, B:280:0x191f, B:1074:0x1966, B:1076:0x196d, B:1077:0x196e, B:1098:0x0058, B:58:0x0211, B:67:0x024f, B:40:0x01d8, B:37:0x0197, B:26:0x0162, B:272:0x18ea, B:273:0x1915), top: B:2:0x001b, inners: #14, #31, #37, #45, #49, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x18ce A[EDGE_INSN: B:281:0x18ce->B:269:0x18ce BREAK  A[LOOP:4: B:257:0x189d->B:261:0x18be, LOOP_LABEL: LOOP:0: B:93:0x0361->B:101:0x1943], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x13b3 A[Catch: all -> 0x1112, TRY_ENTER, TRY_LEAVE, TryCatch #116 {all -> 0x1112, blocks: (B:192:0x10ff, B:291:0x13b3, B:434:0x1230, B:436:0x1236, B:437:0x1237, B:443:0x11f5, B:445:0x11fb, B:446:0x11fc, B:201:0x1183, B:203:0x1189, B:204:0x118a, B:196:0x112e), top: B:191:0x10ff, inners: #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1468  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x14b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0186 A[Catch: Exception -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #110 {Exception -> 0x0054, blocks: (B:3:0x001b, B:9:0x0044, B:24:0x0144, B:29:0x1984, B:31:0x198b, B:33:0x198c, B:35:0x0186, B:43:0x1970, B:45:0x1977, B:46:0x1978, B:49:0x197a, B:51:0x1981, B:52:0x1982, B:55:0x01fd, B:62:0x0247, B:64:0x024d, B:65:0x024e, B:68:0x0280, B:71:0x02e4, B:75:0x0320, B:78:0x032d, B:81:0x0336, B:87:0x0351, B:91:0x035d, B:96:0x0367, B:258:0x189f, B:266:0x18b1, B:101:0x1943, B:261:0x18be, B:269:0x18ce, B:277:0x1918, B:279:0x191e, B:280:0x191f, B:1074:0x1966, B:1076:0x196d, B:1077:0x196e, B:1098:0x0058, B:58:0x0211, B:67:0x024f, B:40:0x01d8, B:37:0x0197, B:26:0x0162, B:272:0x18ea, B:273:0x1915), top: B:2:0x001b, inners: #14, #31, #37, #45, #49, #118 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x13b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1729 A[Catch: all -> 0x16b7, TryCatch #69 {all -> 0x16b7, blocks: (B:239:0x1672, B:248:0x16b0, B:250:0x16b6, B:251:0x16bc, B:417:0x16cd, B:419:0x16dd, B:420:0x16de, B:427:0x16e0, B:429:0x16f0, B:430:0x16f1, B:450:0x16f3, B:452:0x1703, B:453:0x1704, B:471:0x1723, B:473:0x1729, B:474:0x172a, B:486:0x1731, B:488:0x1742, B:489:0x1743, B:492:0x1745, B:494:0x1756, B:495:0x1757, B:751:0x1759, B:753:0x176b, B:754:0x176c, B:798:0x178f, B:800:0x1795, B:801:0x1796, B:810:0x1798, B:812:0x17aa, B:813:0x17ab, B:818:0x17d1, B:820:0x17d7, B:821:0x17d8, B:834:0x17f7, B:836:0x180d, B:837:0x180e, B:842:0x182e, B:844:0x1834, B:845:0x1835, B:853:0x1857, B:855:0x185d, B:856:0x185e, B:862:0x1860, B:864:0x1876, B:865:0x1877, B:172:0x107d, B:169:0x1044, B:162:0x0af5, B:127:0x0800, B:782:0x0a2b, B:242:0x167e, B:243:0x16ad, B:222:0x129f, B:216:0x1238, B:208:0x1195, B:149:0x08dc), top: B:238:0x1672, inners: #4, #13, #24, #26, #57, #66, #85, #90, #96, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x172a A[Catch: all -> 0x16b7, TryCatch #69 {all -> 0x16b7, blocks: (B:239:0x1672, B:248:0x16b0, B:250:0x16b6, B:251:0x16bc, B:417:0x16cd, B:419:0x16dd, B:420:0x16de, B:427:0x16e0, B:429:0x16f0, B:430:0x16f1, B:450:0x16f3, B:452:0x1703, B:453:0x1704, B:471:0x1723, B:473:0x1729, B:474:0x172a, B:486:0x1731, B:488:0x1742, B:489:0x1743, B:492:0x1745, B:494:0x1756, B:495:0x1757, B:751:0x1759, B:753:0x176b, B:754:0x176c, B:798:0x178f, B:800:0x1795, B:801:0x1796, B:810:0x1798, B:812:0x17aa, B:813:0x17ab, B:818:0x17d1, B:820:0x17d7, B:821:0x17d8, B:834:0x17f7, B:836:0x180d, B:837:0x180e, B:842:0x182e, B:844:0x1834, B:845:0x1835, B:853:0x1857, B:855:0x185d, B:856:0x185e, B:862:0x1860, B:864:0x1876, B:865:0x1877, B:172:0x107d, B:169:0x1044, B:162:0x0af5, B:127:0x0800, B:782:0x0a2b, B:242:0x167e, B:243:0x16ad, B:222:0x129f, B:216:0x1238, B:208:0x1195, B:149:0x08dc), top: B:238:0x1672, inners: #4, #13, #24, #26, #57, #66, #85, #90, #96, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0c65 A[Catch: all -> 0x0c41, TryCatch #12 {all -> 0x0c41, blocks: (B:535:0x0c3a, B:537:0x0c40, B:538:0x0c4f, B:698:0x0c5f, B:700:0x0c65, B:701:0x0c66, B:530:0x0be8), top: B:529:0x0be8, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0c66 A[Catch: all -> 0x0c41, TRY_LEAVE, TryCatch #12 {all -> 0x0c41, blocks: (B:535:0x0c3a, B:537:0x0c40, B:538:0x0c4f, B:698:0x0c5f, B:700:0x0c65, B:701:0x0c66, B:530:0x0be8), top: B:529:0x0be8, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x17d7 A[Catch: all -> 0x16b7, TryCatch #69 {all -> 0x16b7, blocks: (B:239:0x1672, B:248:0x16b0, B:250:0x16b6, B:251:0x16bc, B:417:0x16cd, B:419:0x16dd, B:420:0x16de, B:427:0x16e0, B:429:0x16f0, B:430:0x16f1, B:450:0x16f3, B:452:0x1703, B:453:0x1704, B:471:0x1723, B:473:0x1729, B:474:0x172a, B:486:0x1731, B:488:0x1742, B:489:0x1743, B:492:0x1745, B:494:0x1756, B:495:0x1757, B:751:0x1759, B:753:0x176b, B:754:0x176c, B:798:0x178f, B:800:0x1795, B:801:0x1796, B:810:0x1798, B:812:0x17aa, B:813:0x17ab, B:818:0x17d1, B:820:0x17d7, B:821:0x17d8, B:834:0x17f7, B:836:0x180d, B:837:0x180e, B:842:0x182e, B:844:0x1834, B:845:0x1835, B:853:0x1857, B:855:0x185d, B:856:0x185e, B:862:0x1860, B:864:0x1876, B:865:0x1877, B:172:0x107d, B:169:0x1044, B:162:0x0af5, B:127:0x0800, B:782:0x0a2b, B:242:0x167e, B:243:0x16ad, B:222:0x129f, B:216:0x1238, B:208:0x1195, B:149:0x08dc), top: B:238:0x1672, inners: #4, #13, #24, #26, #57, #66, #85, #90, #96, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:821:0x17d8 A[Catch: all -> 0x16b7, TryCatch #69 {all -> 0x16b7, blocks: (B:239:0x1672, B:248:0x16b0, B:250:0x16b6, B:251:0x16bc, B:417:0x16cd, B:419:0x16dd, B:420:0x16de, B:427:0x16e0, B:429:0x16f0, B:430:0x16f1, B:450:0x16f3, B:452:0x1703, B:453:0x1704, B:471:0x1723, B:473:0x1729, B:474:0x172a, B:486:0x1731, B:488:0x1742, B:489:0x1743, B:492:0x1745, B:494:0x1756, B:495:0x1757, B:751:0x1759, B:753:0x176b, B:754:0x176c, B:798:0x178f, B:800:0x1795, B:801:0x1796, B:810:0x1798, B:812:0x17aa, B:813:0x17ab, B:818:0x17d1, B:820:0x17d7, B:821:0x17d8, B:834:0x17f7, B:836:0x180d, B:837:0x180e, B:842:0x182e, B:844:0x1834, B:845:0x1835, B:853:0x1857, B:855:0x185d, B:856:0x185e, B:862:0x1860, B:864:0x1876, B:865:0x1877, B:172:0x107d, B:169:0x1044, B:162:0x0af5, B:127:0x0800, B:782:0x0a2b, B:242:0x167e, B:243:0x16ad, B:222:0x129f, B:216:0x1238, B:208:0x1195, B:149:0x08dc), top: B:238:0x1672, inners: #4, #13, #24, #26, #57, #66, #85, #90, #96, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x1920  */
    /* JADX WARN: Type inference failed for: r11v155, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v62, types: [int, short] */
    /* JADX WARN: Type inference failed for: r15v73, types: [int] */
    /* JADX WARN: Type inference failed for: r15v79, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r1v133, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v119, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v130, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v168, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v112, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v131, types: [int] */
    /* JADX WARN: Type inference failed for: r3v136, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v142 */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v147, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r3v150, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v158, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v160 */
    /* JADX WARN: Type inference failed for: r3v166, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v194 */
    /* JADX WARN: Type inference failed for: r3v201, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v202 */
    /* JADX WARN: Type inference failed for: r3v209, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v210 */
    /* JADX WARN: Type inference failed for: r3v214, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v217 */
    /* JADX WARN: Type inference failed for: r3v218 */
    /* JADX WARN: Type inference failed for: r3v220 */
    /* JADX WARN: Type inference failed for: r3v221 */
    /* JADX WARN: Type inference failed for: r3v222, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v223 */
    /* JADX WARN: Type inference failed for: r3v225, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v244 */
    /* JADX WARN: Type inference failed for: r3v246 */
    /* JADX WARN: Type inference failed for: r3v247 */
    /* JADX WARN: Type inference failed for: r3v248 */
    /* JADX WARN: Type inference failed for: r3v249 */
    /* JADX WARN: Type inference failed for: r3v250 */
    /* JADX WARN: Type inference failed for: r3v254 */
    /* JADX WARN: Type inference failed for: r3v255 */
    /* JADX WARN: Type inference failed for: r3v256 */
    /* JADX WARN: Type inference failed for: r3v257 */
    /* JADX WARN: Type inference failed for: r3v262 */
    /* JADX WARN: Type inference failed for: r3v263 */
    /* JADX WARN: Type inference failed for: r3v264 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95, types: [int] */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r4v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v223 */
    /* JADX WARN: Type inference failed for: r4v224 */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v90, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v96, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v80, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v125, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v141, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v178, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v84, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v90, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v114, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v138 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v155, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v156 */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v163, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v164 */
    /* JADX WARN: Type inference failed for: r7v165 */
    /* JADX WARN: Type inference failed for: r7v166 */
    /* JADX WARN: Type inference failed for: r7v167 */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v181, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v187, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v188 */
    /* JADX WARN: Type inference failed for: r7v190, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v199 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v211, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v217, types: [int] */
    /* JADX WARN: Type inference failed for: r7v262 */
    /* JADX WARN: Type inference failed for: r7v263 */
    /* JADX WARN: Type inference failed for: r7v272 */
    /* JADX WARN: Type inference failed for: r7v273 */
    /* JADX WARN: Type inference failed for: r7v286 */
    /* JADX WARN: Type inference failed for: r7v287 */
    /* JADX WARN: Type inference failed for: r7v288 */
    /* JADX WARN: Type inference failed for: r7v65, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v70, types: [int, short] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v98, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        /*
            Method dump skipped, instructions count: 6580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.<clinit>():void");
    }

    private AFa1zSDK() {
    }

    public static Object AFInAppEventParameterName(char c, int i, int i2) {
        int i3 = onConversionDataFail + 53;
        int i4 = i3 % 128;
        onConversionDataSuccess = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = onInstallConversionFailureNative;
        onConversionDataFail = ((i4 & 7) + (i4 | 7)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = onDeepLinkingNative;
            byte b = bArr[143];
            Class<?> cls = Class.forName($$c(b, (short) ((b ^ 223) | (b & 223)), bArr[204]), true, (ClassLoader) onAttributionFailureNative);
            byte b2 = bArr[88];
            String $$c = $$c(b2, (short) (b2 | 676), bArr[19]);
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
            onConversionDataSuccess = (onConversionDataFail + 41) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        onConversionDataSuccess = (onConversionDataFail + 25) % 128;
        byte[] bArr = new byte[1070];
        System.arraycopy("\u0001Y°Æ\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òø\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þÿî$Û\bø\u0000ú\u0001ð\"åî\u0010\u000bÜ\u0010ê\f\u0015éë\u0005ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðüú\u0002\tò\u0000ì\u0012\u0015åî\u0010\u000bÜ\u0010ê\fñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-·!\fö$ýÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-·!\fö$ýÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\bøúØ*Îý(Ì\u000eô÷\u001dØ\u0006\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úöÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê2\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFàãé1Ì\u000eô÷\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\føøãé\u0003ü\u0002ú\n\u000bâ\u000eîý\bðÿî+ÿ\föé\u0013ø÷ñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-´$\fö$±\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë1\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þ\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1070);
        onDeepLinkingNative = bArr;
        onResponseErrorNative = 244;
        int i = onConversionDataSuccess + 3;
        onConversionDataFail = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    public static int valueOf(int i) {
        Object obj;
        int i2 = onConversionDataFail;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        int i4 = i3 % 128;
        onConversionDataSuccess = i4;
        if (i3 % 2 != 0) {
            obj = onInstallConversionFailureNative;
            int i5 = 56 / 0;
        } else {
            obj = onInstallConversionFailureNative;
        }
        onConversionDataFail = (i4 + 19) % 128;
        onConversionDataFail = (i4 + 13) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = onDeepLinkingNative;
            byte b = bArr[143];
            Class<?> cls = Class.forName($$c(b, (short) (b | 223), bArr[204]), true, (ClassLoader) onAttributionFailureNative);
            byte b2 = bArr[88];
            int intValue = ((Integer) cls.getMethod($$c(b2, (short) ((b2 ^ 676) | (b2 & 676)), bArr[19]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i6 = onConversionDataSuccess + 105;
            onConversionDataFail = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 71 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int valueOf(Object obj) {
        int i = onConversionDataSuccess;
        int i2 = (((i | 25) << 1) - (i ^ 25)) % 128;
        Object obj2 = onInstallConversionFailureNative;
        int i3 = (((i2 | 79) << 1) - (i2 ^ 79)) % 128;
        onConversionDataSuccess = i3;
        onConversionDataFail = (i3 + 103) % 128;
        try {
            byte[] bArr = onDeepLinkingNative;
            byte b = bArr[143];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 223) | (b & 223)), bArr[204]), true, (ClassLoader) onAttributionFailureNative).getMethod($$c((byte) (-bArr[29]), (short) 423, bArr[19]), Object.class).invoke(obj2, obj)).intValue();
            int i4 = onConversionDataFail;
            onConversionDataSuccess = ((i4 & 99) + (i4 | 99)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
