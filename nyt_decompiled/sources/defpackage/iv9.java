package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes3.dex */
public final class iv9 implements fw9 {
    private static final int[] d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final hv9 e = new hv9(new gv9() { // from class: dv9
        @Override // defpackage.gv9
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(nv9.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final hv9 f = new hv9(new gv9() { // from class: fv9
        @Override // defpackage.gv9
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(nv9.class).getConstructor(null);
        }
    });
    private zzgaa b;
    private final r4a c = new n4a();

    private final void b(int i, List list) {
        switch (i) {
            case 0:
                list.add(new b7a());
                break;
            case 1:
                list.add(new e7a());
                break;
            case 2:
                list.add(new h7a(0));
                break;
            case 3:
                list.add(new ey9(0));
                break;
            case 4:
                nv9 a = e.a(0);
                if (a == null) {
                    list.add(new ez9(0));
                    break;
                } else {
                    list.add(a);
                    break;
                }
            case 5:
                list.add(new hz9());
                break;
            case 6:
                list.add(new f1a(0));
                break;
            case 7:
                list.add(new u1a(0));
                break;
            case 8:
                list.add(new x2a(this.c, 32, null, null, zzgaa.t(), null));
                list.add(new c3a(this.c, 16));
                break;
            case 9:
                list.add(new r3a());
                break;
            case 10:
                list.add(new q8a());
                break;
            case 11:
                if (this.b == null) {
                    this.b = zzgaa.t();
                }
                list.add(new i9a(1, 1, this.c, new pfe(0L), new j7a(0, this.b), 112800));
                break;
            case 12:
                list.add(new u9a());
                break;
            case 14:
                list.add(new mz9(0));
                break;
            case 15:
                nv9 a2 = f.a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    break;
                }
                break;
            case 16:
                list.add(new jy9());
                break;
            case 17:
                list.add(new k4a());
                break;
            case 18:
                list.add(new z9a());
                break;
            case 19:
                list.add(new qy9());
                break;
            case 20:
                list.add(new lz9());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01e1 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x038c A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a5 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ed A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    @Override // defpackage.fw9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.nv9[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv9.a(android.net.Uri, java.util.Map):nv9[]");
    }
}
