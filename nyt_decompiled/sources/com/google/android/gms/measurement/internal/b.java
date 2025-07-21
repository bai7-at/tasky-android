package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class b extends g9 {
    private String d;
    private Set e;
    private Map f;
    private Long g;
    private Long h;

    b(r9 r9Var) {
        super(r9Var);
    }

    private final ea j(Integer num) {
        if (this.f.containsKey(num)) {
            return (ea) this.f.get(num);
        }
        ea eaVar = new ea(this, this.d, null);
        this.f.put(num, eaVar);
        return eaVar;
    }

    private final boolean k(int i, int i2) {
        BitSet bitSet;
        ea eaVar = (ea) this.f.get(Integer.valueOf(i));
        if (eaVar == null) {
            return false;
        }
        bitSet = eaVar.d;
        return bitSet.get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(2:2|(2:4|(2:6|7)(1:540))(2:541|542))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:515|(1:517)(1:519)|518)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:474|(6:475|476|477|478|479|(1:482)(1:481))|483)|44|(1:46)(6:280|(11:282|283|284|285|286|(1:(4:288|(1:290)|291|292))(1:458)|295|296|(3:391|(6:394|(2:453|454)(2:398|(4:404|405|(7:407|(4:410|(2:412|413)(1:415)|414|408)|416|417|(4:420|(3:422|423|424)(1:426)|425|418)|427|428)(6:432|(4:435|(2:437|438)(1:440)|439|433)|441|442|(4:445|(2:447|448)(1:450)|449|443)|451)|429)(4:400|401|402|403))|430|431|403|392)|456)|298|299)(1:473)|300|(10:303|(3:307|(4:310|(5:312|313|(1:315)(1:319)|316|317)(1:320)|318|308)|321)|322|(3:326|(4:329|(3:334|335|336)|337|327)|340)|341|(3:343|(6:346|(2:348|(3:350|351|352))(1:355)|353|354|352|344)|356)|357|(3:366|(8:369|(1:371)|372|(1:374)|375|(3:377|378|379)(1:381)|380|367)|382)|383|301)|389|390)|47|(3:177|(4:180|(10:182|183|(1:185)(1:277)|186|(9:188|189|190|191|192|193|194|195|(4:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:250)|209|210|(1:213)(1:212))|214|215)(4:257|258|249|215))(1:276)|216|(4:219|(3:237|238|239)(6:221|222|(2:223|(2:225|(1:227)(2:228|229))(2:235|236))|(1:231)|232|233)|234|217)|240|241|242)(1:278)|243|178)|279)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:175)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|176)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:523|524))|539|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0a70, code lost:
    
        if (r13 != false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0950, code lost:
    
        if (r13 == null) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x07ab, code lost:
    
        if (r5 != null) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02f0, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x01be, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x022b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x022c, code lost:
    
        r18 = "audience_id";
        r19 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0234, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0231, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0172, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #14 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:474:0x01c4, B:475:0x01c9, B:477:0x01d3, B:478:0x01e3, B:479:0x020f, B:492:0x01f2, B:495:0x0202, B:498:0x0208, B:486:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01c4 A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #14 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:474:0x01c4, B:475:0x01c9, B:477:0x01d3, B:478:0x01e3, B:479:0x020f, B:492:0x01f2, B:495:0x0202, B:498:0x0208, B:486:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0864  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List i(java.lang.String r63, java.util.List r64, java.util.List r65, java.lang.Long r66, java.lang.Long r67) {
        /*
            Method dump skipped, instructions count: 2854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b.i(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
