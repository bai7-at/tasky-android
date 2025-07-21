package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x2a implements nv9 {
    public static final fw9 F = new fw9() { // from class: m2a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new x2a()};
        }
    };
    private static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final l6a H;
    private boolean A;
    private sv9 B;
    private tx9[] C;
    private tx9[] D;
    private boolean E;
    private final r4a a;
    private final List b;
    private final SparseArray c;
    private final b9e d;
    private final b9e e;
    private final b9e f;
    private final byte[] g;
    private final b9e h;
    private final yz9 i;
    private final b9e j;
    private final ArrayDeque k;
    private final ArrayDeque l;
    private int m;
    private int n;
    private long o;
    private int p;
    private b9e q;
    private long r;
    private int s;
    private long t;
    private long u;
    private long v;
    private w2a w;
    private int x;
    private int y;
    private int z;

    static {
        x3a x3aVar = new x3a();
        x3aVar.w("application/x-emsg");
        H = x3aVar.D();
    }

    public x2a() {
        this(r4a.a, 32, null, null, zzgaa.t(), null);
    }

    private static int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw zzcc.a("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzae b(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            b2a r5 = (defpackage.b2a) r5
            int r6 = r5.a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            b9e r5 = r5.b
            byte[] r5 = r5.m()
            b9e r6 = new b9e
            r6.<init>(r5)
            int r8 = r6.t()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.k(r1)
            int r8 = r6.v()
            int r9 = r6.q()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.v()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.v()
            int r7 = defpackage.c2a.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            defpackage.ezd.f(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.I()
            long r12 = r6.I()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.E()
            int r8 = r8 * 16
            r6.l(r8)
        L84:
            int r8 = r6.E()
            int r10 = r6.q()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.g(r10, r1, r8)
            d3a r6 = new d3a
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = defpackage.d3a.a(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            defpackage.ezd.f(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzae r14 = new com.google.android.gms.internal.ads.zzae
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2a.b(java.util.List):com.google.android.gms.internal.ads.zzae");
    }

    private final void c() {
        this.m = 0;
        this.p = 0;
    }

    private static void d(b9e b9eVar, int i, j3a j3aVar) {
        b9eVar.k(i + 8);
        int v = b9eVar.v();
        if ((v & 1) != 0) {
            throw zzcc.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (v & 2) != 0;
        int E = b9eVar.E();
        if (E == 0) {
            Arrays.fill(j3aVar.l, 0, j3aVar.e, false);
            return;
        }
        int i2 = j3aVar.e;
        if (E != i2) {
            throw zzcc.a("Senc sample count " + E + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(j3aVar.l, 0, E, z);
        j3aVar.a(b9eVar.q());
        b9e b9eVar2 = j3aVar.n;
        b9eVar.g(b9eVar2.m(), 0, b9eVar2.t());
        j3aVar.n.k(0);
        j3aVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x032f, code lost:
    
        if (r1 < r6.e) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(long r47) {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2a.e(long):void");
    }

    private static final l2a f(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (l2a) sparseArray.valueAt(0);
        }
        l2a l2aVar = (l2a) sparseArray.get(i);
        l2aVar.getClass();
        return l2aVar;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((w2a) this.c.valueAt(i)).i();
        }
        this.l.clear();
        this.s = 0;
        this.t = j2;
        this.k.clear();
        c();
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return g3a.a(ov9Var);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.B = sv9Var;
        c();
        tx9[] tx9VarArr = new tx9[2];
        this.C = tx9VarArr;
        int i = 0;
        tx9[] tx9VarArr2 = (tx9[]) khe.l(tx9VarArr, 0);
        this.C = tx9VarArr2;
        for (tx9 tx9Var : tx9VarArr2) {
            tx9Var.f(H);
        }
        this.D = new tx9[this.b.size()];
        int i2 = 100;
        while (i < this.D.length) {
            int i3 = i2 + 1;
            tx9 zzw = this.B.zzw(i2, 3);
            zzw.f((l6a) this.b.get(i));
            this.D[i] = zzw;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x009a, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x009d, code lost:
    
        if (r26.m != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x009f, code lost:
    
        r2 = r4.b();
        r26.x = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x00a9, code lost:
    
        if (r4.f >= r4.i) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x00ab, code lost:
    
        ((defpackage.bv9) r1).l(r2, false);
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00b4, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x00b7, code lost:
    
        r2 = r4.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x00bd, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x00bf, code lost:
    
        r2.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00ca, code lost:
    
        if (r4.b.b(r4.f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x00cc, code lost:
    
        r2.l(r2.F() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x00d8, code lost:
    
        if (r4.k() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x00da, code lost:
    
        r26.w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x00dc, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x029f, code lost:
    
        r26.m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00e5, code lost:
    
        if (r4.d.a.g != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x00e7, code lost:
    
        r26.x = r2 - 8;
        ((defpackage.bv9) r1).l(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00ff, code lost:
    
        if ("audio/ac4".equals(r4.d.a.f.l) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0101, code lost:
    
        r26.y = r4.c(r26.x, 7);
        defpackage.fu9.b(r26.x, r26.h);
        r4.a.b(r26.h, 7);
        r2 = r26.y + 7;
        r26.y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0126, code lost:
    
        r26.x += r2;
        r26.m = 4;
        r26.z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x011e, code lost:
    
        r2 = r4.c(r26.x, 0);
        r26.y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0130, code lost:
    
        r2 = r4.d.a;
        r6 = r4.a;
        r7 = r4.e();
        r11 = r2.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x013c, code lost:
    
        if (r11 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x013e, code lost:
    
        r2 = r26.y;
        r5 = r26.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0142, code lost:
    
        if (r2 >= r5) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0144, code lost:
    
        r26.y += r6.a(r1, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0234, code lost:
    
        r22 = r4.a();
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x023c, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x023e, code lost:
    
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0245, code lost:
    
        r6.c(r7, r22, r26.x, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0258, code lost:
    
        if (r26.l.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x025a, code lost:
    
        r1 = (defpackage.v2a) r26.l.removeFirst();
        r26.s -= r1.c;
        r5 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x026d, code lost:
    
        if (r1.b == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x026f, code lost:
    
        r5 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0270, code lost:
    
        r2 = r26.C;
        r15 = r2.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0274, code lost:
    
        if (r14 >= r15) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0276, code lost:
    
        r2[r14].c(r5, 1, r1.c, r26.s, null);
        r14 = r14 + 1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0299, code lost:
    
        if (r4.k() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x029b, code lost:
    
        r26.w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x029e, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0243, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x014f, code lost:
    
        r12 = r26.e.m();
        r12[0] = 0;
        r12[r3] = 0;
        r12[2] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0165, code lost:
    
        if (r26.y >= r26.x) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0167, code lost:
    
        r13 = r26.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x016b, code lost:
    
        if (r13 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x016d, code lost:
    
        ((defpackage.bv9) r1).c(r12, r11, r14, r10);
        r26.e.k(r10);
        r13 = r26.e.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x017e, code lost:
    
        if (r13 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0180, code lost:
    
        r26.z = r13 - 1;
        r26.d.k(r10);
        r6.b(r26.d, 4);
        r6.b(r26.e, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0199, code lost:
    
        if (r26.D.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x019b, code lost:
    
        r13 = r2.f.l;
        r17 = r12[4];
        r10 = defpackage.kre.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01a9, code lost:
    
        if ("video/avc".equals(r13) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01ad, code lost:
    
        if ((r17 & 31) == r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x01b0, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x01c1, code lost:
    
        r26.A = r10;
        r26.y += 5;
        r26.x += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x01ce, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x01b6, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x01bd, code lost:
    
        if (((r17 & 126) >> r3) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x01c0, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x01d7, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.a("Invalid NAL length", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01da, code lost:
    
        if (r26.A == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x01dc, code lost:
    
        r26.f.h(r13);
        ((defpackage.bv9) r1).c(r26.f.m(), 0, r26.z, false);
        r6.b(r26.f, r26.z);
        r5 = r26.z;
        r9 = r26.f;
        r9 = defpackage.kre.b(r9.m(), r9.t());
        r26.f.k("video/hevc".equals(r2.f.l) ? 1 : 0);
        r26.f.j(r9);
        defpackage.xu9.a(r7, r26.f, r26.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0227, code lost:
    
        r26.y += r5;
        r26.z -= r5;
        r5 = 6;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0221, code lost:
    
        r5 = r6.a(r1, r13, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r27, defpackage.cx9 r28) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2a.n(ov9, cx9):int");
    }

    public x2a(r4a r4aVar, int i, pfe pfeVar, h3a h3aVar, List list, tx9 tx9Var) {
        this.a = r4aVar;
        this.b = Collections.unmodifiableList(list);
        this.i = new yz9();
        this.j = new b9e(16);
        this.d = new b9e(kre.a);
        this.e = new b9e(5);
        this.f = new b9e();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new b9e(bArr);
        this.k = new ArrayDeque();
        this.l = new ArrayDeque();
        this.c = new SparseArray();
        this.u = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = sv9.R;
        this.C = new tx9[0];
        this.D = new tx9[0];
    }
}
