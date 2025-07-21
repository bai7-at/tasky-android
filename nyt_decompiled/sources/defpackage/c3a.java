package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c3a implements nv9, gx9 {
    public static final fw9 A = new fw9() { // from class: a3a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new c3a()};
        }
    };
    private final r4a a;
    private final int b;
    private final b9e c;
    private final b9e d;
    private final b9e e;
    private final b9e f;
    private final ArrayDeque g;
    private final f3a h;
    private final List i;
    private int j;
    private int k;
    private long l;
    private int m;
    private b9e n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private sv9 t;
    private b3a[] u;
    private long[][] v;
    private int w;
    private long x;
    private int y;
    private zzahe z;

    public c3a() {
        this(r4a.a, 16);
    }

    private static int c(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int d(k3a k3aVar, long j) {
        int a = k3aVar.a(j);
        return a == -1 ? k3aVar.b(j) : a;
    }

    private static long e(k3a k3aVar, long j, long j2) {
        int d = d(k3aVar, j);
        return d == -1 ? j2 : Math.min(k3aVar.c[d], j2);
    }

    private final void f() {
        this.j = 0;
        this.m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g(long j) {
        int i;
        int i2;
        zzby zzbyVar;
        long j2;
        List list;
        int i3;
        zzby zzbyVar2;
        zzby zzbyVar3;
        zzby zzbyVar4;
        sw9 sw9Var;
        zzby zzbyVar5;
        zzby zzbyVar6;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        while (!this.g.isEmpty() && ((a2a) this.g.peek()).b == j) {
            a2a a2aVar = (a2a) this.g.pop();
            if (a2aVar.a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i8 = this.y;
                sw9 sw9Var2 = new sw9();
                b2a d = a2aVar.d(1969517665);
                if (d != null) {
                    zzby b = k2a.b(d);
                    sw9Var2.b(b);
                    zzbyVar = b;
                } else {
                    zzbyVar = null;
                }
                a2a c = a2aVar.c(1835365473);
                zzby a = c != null ? k2a.a(c) : null;
                b2a d2 = a2aVar.d(1836476516);
                d2.getClass();
                int i9 = i8 == i7 ? i7 : i6;
                zzgi c2 = k2a.c(d2.b);
                zzbx[] zzbxVarArr = new zzbx[i7];
                zzbxVarArr[i6] = c2;
                zzby zzbyVar7 = new zzby(-9223372036854775807L, zzbxVarArr);
                int i10 = i7 != (this.b & i7) ? i6 : i7;
                zzby zzbyVar8 = zzbyVar;
                long j3 = -9223372036854775807L;
                zzby zzbyVar9 = zzbyVar7;
                zzby zzbyVar10 = a;
                List d3 = k2a.d(a2aVar, sw9Var2, -9223372036854775807L, null, i10, i9, new gge() { // from class: z2a
                    @Override // defpackage.gge
                    public final Object apply(Object obj) {
                        h3a h3aVar = (h3a) obj;
                        fw9 fw9Var = c3a.A;
                        return h3aVar;
                    }
                });
                int size = d3.size();
                long j4 = -9223372036854775807L;
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    j2 = 0;
                    if (i11 >= size) {
                        break;
                    }
                    k3a k3aVar = (k3a) d3.get(i11);
                    if (k3aVar.b == 0) {
                        list = d3;
                        i3 = size;
                        sw9Var = sw9Var2;
                        zzbyVar5 = zzbyVar8;
                        zzbyVar4 = zzbyVar9;
                    } else {
                        h3a h3aVar = k3aVar.a;
                        list = d3;
                        long j5 = h3aVar.e;
                        if (j5 == j3) {
                            j5 = k3aVar.h;
                        }
                        j4 = Math.max(j4, j5);
                        b3a b3aVar = new b3a(h3aVar, k3aVar, this.t.zzw(i11, h3aVar.b));
                        int i13 = "audio/true-hd".equals(h3aVar.f.l) ? k3aVar.e * 16 : k3aVar.e + 30;
                        x3a b2 = h3aVar.f.b();
                        b2.o(i13);
                        i3 = size;
                        if (h3aVar.b == 2) {
                            if ((this.b & 8) != 0) {
                                b2.u(h3aVar.f.e | (i12 == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i5 = k3aVar.b) > 1) {
                                b2.h(i5 / (j5 / 1000000.0f));
                            }
                        }
                        int i14 = h3aVar.b;
                        String[] strArr = y2a.a;
                        if (i14 == 1 && sw9Var2.a()) {
                            b2.f(sw9Var2.a);
                            b2.g(sw9Var2.b);
                        }
                        int i15 = h3aVar.b;
                        if (this.i.isEmpty()) {
                            zzbyVar3 = zzbyVar8;
                            zzbyVar2 = null;
                        } else {
                            zzbyVar2 = new zzby(this.i);
                            zzbyVar3 = zzbyVar8;
                        }
                        zzby[] zzbyVarArr = {zzbyVar2, zzbyVar3, zzbyVar9};
                        zzbyVar4 = zzbyVar9;
                        sw9Var = sw9Var2;
                        zzby zzbyVar11 = new zzby(-9223372036854775807L, new zzbx[0]);
                        zzby zzbyVar12 = zzbyVar10;
                        if (zzbyVar12 != null) {
                            int i16 = 0;
                            while (i16 < zzbyVar12.a()) {
                                zzbx b3 = zzbyVar12.b(i16);
                                zzby zzbyVar13 = zzbyVar12;
                                if (b3 instanceof zzgc) {
                                    zzgc zzgcVar = (zzgc) b3;
                                    zzbyVar6 = zzbyVar3;
                                    if (!zzgcVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        i4 = 1;
                                        zzbyVar11 = zzbyVar11.c(zzgcVar);
                                    } else if (i15 == 2) {
                                        i4 = 1;
                                        zzbyVar11 = zzbyVar11.c(zzgcVar);
                                    }
                                    i16 += i4;
                                    zzbyVar12 = zzbyVar13;
                                    zzbyVar3 = zzbyVar6;
                                } else {
                                    zzbyVar6 = zzbyVar3;
                                }
                                i4 = 1;
                                i16 += i4;
                                zzbyVar12 = zzbyVar13;
                                zzbyVar3 = zzbyVar6;
                            }
                        }
                        zzbyVar10 = zzbyVar12;
                        zzbyVar5 = zzbyVar3;
                        for (int i17 = 0; i17 < 3; i17++) {
                            zzbyVar11 = zzbyVar11.d(zzbyVarArr[i17]);
                        }
                        if (zzbyVar11.a() > 0) {
                            b2.p(zzbyVar11);
                        }
                        b3aVar.c.f(b2.D());
                        if (h3aVar.b == 2 && i12 == -1) {
                            i12 = arrayList.size();
                        }
                        arrayList.add(b3aVar);
                    }
                    i11++;
                    zzbyVar9 = zzbyVar4;
                    d3 = list;
                    size = i3;
                    sw9Var2 = sw9Var;
                    zzbyVar8 = zzbyVar5;
                    j3 = -9223372036854775807L;
                }
                this.w = i12;
                this.x = j4;
                b3a[] b3aVarArr = (b3a[]) arrayList.toArray(new b3a[0]);
                this.u = b3aVarArr;
                int length = b3aVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i18 = 0; i18 < b3aVarArr.length; i18++) {
                    jArr[i18] = new long[b3aVarArr[i18].b.b];
                    jArr2[i18] = b3aVarArr[i18].b.f[0];
                }
                i = 0;
                int i19 = 0;
                while (i19 < b3aVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i20 = -1;
                    for (int i21 = 0; i21 < b3aVarArr.length; i21++) {
                        if (!zArr[i21]) {
                            long j7 = jArr2[i21];
                            if (j7 <= j6) {
                                i20 = i21;
                                j6 = j7;
                            }
                        }
                    }
                    int i22 = iArr[i20];
                    long[] jArr3 = jArr[i20];
                    jArr3[i22] = j2;
                    k3a k3aVar2 = b3aVarArr[i20].b;
                    j2 += k3aVar2.d[i22];
                    int i23 = i22 + 1;
                    iArr[i20] = i23;
                    if (i23 < jArr3.length) {
                        jArr2[i20] = k3aVar2.f[i23];
                    } else {
                        zArr[i20] = true;
                        i19++;
                    }
                }
                i2 = 1;
                this.v = jArr;
                this.t.b();
                this.t.m(this);
                this.g.clear();
                this.j = 2;
            } else {
                i = i6;
                i2 = i7;
                if (!this.g.isEmpty()) {
                    ((a2a) this.g.peek()).e(a2aVar);
                }
            }
            i6 = i;
            i7 = i2;
        }
        if (this.j != 2) {
            f();
        }
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        long j2;
        long j3;
        int b;
        b3a[] b3aVarArr = this.u;
        if (b3aVarArr.length == 0) {
            hx9 hx9Var = hx9.c;
            return new ex9(hx9Var, hx9Var);
        }
        int i = this.w;
        long j4 = -1;
        if (i != -1) {
            k3a k3aVar = b3aVarArr[i].b;
            int d = d(k3aVar, j);
            if (d == -1) {
                hx9 hx9Var2 = hx9.c;
                return new ex9(hx9Var2, hx9Var2);
            }
            long j5 = k3aVar.f[d];
            j2 = k3aVar.c[d];
            if (j5 >= j || d >= k3aVar.b - 1 || (b = k3aVar.b(j)) == -1 || b == d) {
                j3 = -9223372036854775807L;
            } else {
                j3 = k3aVar.f[b];
                j4 = k3aVar.c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            b3a[] b3aVarArr2 = this.u;
            if (i2 >= b3aVarArr2.length) {
                break;
            }
            if (i2 != this.w) {
                k3a k3aVar2 = b3aVarArr2[i2].b;
                long e = e(k3aVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = e(k3aVar2, j3, j4);
                }
                j2 = e;
            }
            i2++;
        }
        hx9 hx9Var3 = new hx9(j, j2);
        return j3 == -9223372036854775807L ? new ex9(hx9Var3, hx9Var3) : new ex9(hx9Var3, new hx9(j3, j4));
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.g.clear();
        this.m = 0;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        if (j == 0) {
            if (this.j != 3) {
                f();
                return;
            } else {
                this.h.b();
                this.i.clear();
                return;
            }
        }
        for (b3a b3aVar : this.u) {
            k3a k3aVar = b3aVar.b;
            int a = k3aVar.a(j2);
            if (a == -1) {
                a = k3aVar.b(j2);
            }
            b3aVar.e = a;
            ux9 ux9Var = b3aVar.d;
            if (ux9Var != null) {
                ux9Var.b();
            }
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return g3a.b(ov9Var, (this.b & 2) != 0);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        if ((this.b & 16) == 0) {
            sv9Var = new u4a(sv9Var, this.a);
        }
        this.t = sv9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0017, code lost:
    
        if (r7 == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e3, code lost:
    
        r3 = r33.l - r33.m;
        r9 = r34.zzf() + r3;
        r5 = r33.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f1, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
    
        r34.i(r5.m(), r33.m, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ff, code lost:
    
        if (r33.k != 1718909296) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0201, code lost:
    
        r33.s = true;
        r5.k(8);
        r3 = c(r5.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020f, code lost:
    
        if (r3 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0212, code lost:
    
        r5.l(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        if (r5.q() <= 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021c, code lost:
    
        r3 = c(r5.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0224, code lost:
    
        if (r3 == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0227, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0228, code lost:
    
        r33.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0266, code lost:
    
        g(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0269, code lost:
    
        if (r3 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026e, code lost:
    
        if (r33.j == 2) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0270, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0232, code lost:
    
        if (r33.g.isEmpty() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
    
        ((defpackage.a2a) r33.g.peek()).f(new defpackage.b2a(r33.k, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0249, code lost:
    
        if (r33.s != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0250, code lost:
    
        if (r33.k != 1835295092) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0252, code lost:
    
        r33.y = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0257, code lost:
    
        if (r3 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0259, code lost:
    
        r34.f((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025e, code lost:
    
        r35.a = r34.zzf() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0019, code lost:
    
        if (r7 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x001b, code lost:
    
        r33.h.a(r34, r35, r33.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0026, code lost:
    
        if (r35.a != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0028, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x002b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x002c, code lost:
    
        r7 = r34.zzf();
        r14 = r33.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0032, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0034, code lost:
    
        r21 = r6;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0048, code lost:
    
        r3 = r33.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x004b, code lost:
    
        if (r14 >= r3.length) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x004d, code lost:
    
        r3 = r3[r14];
        r9 = r3.e;
        r3 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0055, code lost:
    
        if (r9 != r3.b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0058, code lost:
    
        r29 = r3.c[r9];
        r3 = r33.v;
        r5 = defpackage.khe.a;
        r31 = r3[r14][r9];
        r29 = r29 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0068, code lost:
    
        if (r29 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x006c, code lost:
    
        if (r29 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0070, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0071, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0073, code lost:
    
        if (r28 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0075, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0079, code lost:
    
        if (r3 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x007d, code lost:
    
        if (r29 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0088, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x008c, code lost:
    
        if (r31 >= r19) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x008e, code lost:
    
        r21 = r3;
        r26 = r14;
        r19 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0094, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x007f, code lost:
    
        r28 = r3;
        r27 = r14;
        r24 = r29;
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0077, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x006e, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0098, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x009a, code lost:
    
        if (r21 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00a3, code lost:
    
        if (r22 < (r19 + 10485760)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00a5, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00aa, code lost:
    
        r33.o = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00ac, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00a8, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00b1, code lost:
    
        r3 = r33.u[r14];
        r5 = r3.c;
        r9 = r3.e;
        r14 = r3.b;
        r12 = r14.c[r9];
        r14 = r14.d[r9];
        r4 = r3.d;
        r7 = (r12 - r7) + r33.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00cf, code lost:
    
        if (r7 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00d3, code lost:
    
        if (r7 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00de, code lost:
    
        if (r3.a.g != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00e0, code lost:
    
        r7 = r7 + 8;
        r14 = r14 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00e5, code lost:
    
        r34.f((int) r7);
        r2 = r3.a;
        r6 = r2.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00ed, code lost:
    
        if (r6 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00ef, code lost:
    
        r2 = r33.d.m();
        r2[0] = 0;
        r2[1] = 0;
        r2[2] = 0;
        r8 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0103, code lost:
    
        if (r33.q >= r14) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0105, code lost:
    
        r7 = r33.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0107, code lost:
    
        if (r7 != 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x013b, code lost:
    
        r7 = r5.a(r34, r7, false);
        r33.p += r7;
        r33.q += r7;
        r33.r -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0109, code lost:
    
        r34.i(r2, r8, r6);
        r33.p += r6;
        r33.d.k(0);
        r7 = r33.d.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x011d, code lost:
    
        if (r7 < 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x011f, code lost:
    
        r33.r = r7;
        r33.c.k(0);
        r5.b(r33.c, 4);
        r33.q += 4;
        r14 = r14 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x013a, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0194, code lost:
    
        r1 = r3.b;
        r6 = r1.f[r9];
        r1 = r1.g[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x019e, code lost:
    
        if (r4 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01a0, code lost:
    
        r4.c(r5, r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01b7, code lost:
    
        if ((r9 + 1) != r3.b.b) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01b9, code lost:
    
        r4.a(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01cd, code lost:
    
        r3.e++;
        r33.o = -1;
        r33.p = 0;
        r33.q = 0;
        r33.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01be, code lost:
    
        r5.c(r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x015a, code lost:
    
        if ("audio/ac4".equals(r2.f.l) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x015e, code lost:
    
        if (r33.q != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0160, code lost:
    
        defpackage.fu9.b(r14, r33.e);
        r6 = 7;
        r5.b(r33.e, 7);
        r33.q += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0172, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0179, code lost:
    
        r2 = r33.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x017b, code lost:
    
        if (r2 >= r14) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x017d, code lost:
    
        r2 = r5.a(r34, r14 - r2, false);
        r33.p += r2;
        r33.q += r2;
        r33.r -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0171, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0174, code lost:
    
        if (r4 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0176, code lost:
    
        r4.d(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01df, code lost:
    
        r35.a = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01e2, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r34, defpackage.cx9 r35) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3a.n(ov9, cx9):int");
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.x;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }

    public c3a(r4a r4aVar, int i) {
        this.a = r4aVar;
        this.b = i;
        this.j = (i & 4) != 0 ? 3 : 0;
        this.h = new f3a();
        this.i = new ArrayList();
        this.f = new b9e(16);
        this.g = new ArrayDeque();
        this.c = new b9e(kre.a);
        this.d = new b9e(4);
        this.e = new b9e();
        this.o = -1;
        this.t = sv9.R;
        this.u = new b3a[0];
    }
}
