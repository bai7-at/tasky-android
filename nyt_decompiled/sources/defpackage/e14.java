package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class e14 {
    private q04 b;
    private int c;
    private final Map a = new LinkedHashMap();
    private final LinkedHashSet d = new LinkedHashSet();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List h = new ArrayList();

    private static final class a {
        private LazyLayoutAnimation[] a;

        public a() {
            LazyLayoutAnimation[] lazyLayoutAnimationArr;
            lazyLayoutAnimationArr = f14.a;
            this.a = lazyLayoutAnimationArr;
        }

        public final LazyLayoutAnimation[] a() {
            return this.a;
        }

        public final void b(l14 l14Var, CoroutineScope coroutineScope) {
            j04 c;
            int length = this.a.length;
            for (int j = l14Var.j(); j < length; j++) {
                LazyLayoutAnimation lazyLayoutAnimation = this.a[j];
                if (lazyLayoutAnimation != null) {
                    lazyLayoutAnimation.z();
                }
            }
            if (this.a.length != l14Var.j()) {
                Object[] copyOf = Arrays.copyOf(this.a, l14Var.j());
                zq3.g(copyOf, "copyOf(this, newSize)");
                this.a = (LazyLayoutAnimation[]) copyOf;
            }
            int j2 = l14Var.j();
            for (int i = 0; i < j2; i++) {
                c = f14.c(l14Var.i(i));
                if (c == null) {
                    LazyLayoutAnimation lazyLayoutAnimation2 = this.a[i];
                    if (lazyLayoutAnimation2 != null) {
                        lazyLayoutAnimation2.z();
                    }
                    this.a[i] = null;
                } else {
                    LazyLayoutAnimation lazyLayoutAnimation3 = this.a[i];
                    if (lazyLayoutAnimation3 == null) {
                        lazyLayoutAnimation3 = new LazyLayoutAnimation(coroutineScope);
                        this.a[i] = lazyLayoutAnimation3;
                    }
                    lazyLayoutAnimation3.s(c.e2());
                    lazyLayoutAnimation3.w(c.f2());
                }
            }
        }
    }

    public static final class b implements Comparator {
        final /* synthetic */ q04 a;

        public b(q04 q04Var) {
            this.a = q04Var;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(this.a.b(((l14) obj).getKey())), Integer.valueOf(this.a.b(((l14) obj2).getKey())));
        }
    }

    public static final class c implements Comparator {
        final /* synthetic */ q04 a;

        public c(q04 q04Var) {
            this.a = q04Var;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(this.a.b(((l14) obj).getKey())), Integer.valueOf(this.a.b(((l14) obj2).getKey())));
        }
    }

    public static final class d implements Comparator {
        final /* synthetic */ q04 a;

        public d(q04 q04Var) {
            this.a = q04Var;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(this.a.b(((l14) obj2).getKey())), Integer.valueOf(this.a.b(((l14) obj).getKey())));
        }
    }

    public static final class e implements Comparator {
        final /* synthetic */ q04 a;

        public e(q04 q04Var) {
            this.a = q04Var;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(this.a.b(((l14) obj2).getKey())), Integer.valueOf(this.a.b(((l14) obj).getKey())));
        }
    }

    private final boolean b(l14 l14Var) {
        j04 c2;
        int j = l14Var.j();
        for (int i = 0; i < j; i++) {
            c2 = f14.c(l14Var.i(i));
            if (c2 != null) {
                return true;
            }
        }
        return false;
    }

    private final void c(l14 l14Var, int i, a aVar) {
        int i2 = 0;
        long h = l14Var.h(0);
        long g = l14Var.l() ? vm3.g(h, 0, i, 1, null) : vm3.g(h, i, 0, 2, null);
        LazyLayoutAnimation[] a2 = aVar.a();
        int length = a2.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutAnimation lazyLayoutAnimation = a2[i2];
            int i4 = i3 + 1;
            if (lazyLayoutAnimation != null) {
                long h2 = l14Var.h(i3);
                long a3 = wm3.a(vm3.j(h2) - vm3.j(h), vm3.k(h2) - vm3.k(h));
                lazyLayoutAnimation.x(wm3.a(vm3.j(g) + vm3.j(a3), vm3.k(g) + vm3.k(a3)));
            }
            i2++;
            i3 = i4;
        }
    }

    static /* synthetic */ void d(e14 e14Var, l14 l14Var, int i, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            aVar = (a) t.j(e14Var.a, l14Var.getKey());
        }
        e14Var.c(l14Var, i, aVar);
    }

    private final void g(l14 l14Var) {
        LazyLayoutAnimation[] a2 = ((a) t.j(this.a, l14Var.getKey())).a();
        int length = a2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutAnimation lazyLayoutAnimation = a2[i];
            int i3 = i2 + 1;
            if (lazyLayoutAnimation != null) {
                long h = l14Var.h(i2);
                long n = lazyLayoutAnimation.n();
                if (!vm3.i(n, LazyLayoutAnimation.m.a()) && !vm3.i(n, h)) {
                    lazyLayoutAnimation.i(wm3.a(vm3.j(h) - vm3.j(n), vm3.k(h) - vm3.k(n)));
                }
                lazyLayoutAnimation.x(h);
            }
            i++;
            i2 = i3;
        }
    }

    public final LazyLayoutAnimation a(Object obj, int i) {
        LazyLayoutAnimation[] a2;
        a aVar = (a) this.a.get(obj);
        if (aVar == null || (a2 = aVar.a()) == null) {
            return null;
        }
        return a2[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x024a, code lost:
    
        if (r13.q() != true) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025f, code lost:
    
        if (r3 >= r19.c) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0261, code lost:
    
        r19.g.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0267, code lost:
    
        r19.h.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r19.c = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024d, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0255, code lost:
    
        if (r3 != r7.b(r1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0257, code lost:
    
        r19.a.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026f, code lost:
    
        r2 = r18;
        r0 = r19.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r25 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0278, code lost:
    
        if (r0.size() <= 1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027a, code lost:
    
        kotlin.collections.i.A(r0, new e14.e(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0282, code lost:
    
        r0 = r19.g;
        r1 = r0.size();
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028a, code lost:
    
        if (r10 >= r1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028c, code lost:
    
        r4 = (defpackage.l14) r0.get(r10);
        r3 = r3 + r4.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0297, code lost:
    
        if (r26 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0299, code lost:
    
        r5 = ((defpackage.l14) kotlin.collections.i.k0(r23)).b() - r3;
        r7 = r21;
        r8 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b1, code lost:
    
        r4.n(r5, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b4, code lost:
    
        if (r15 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b6, code lost:
    
        g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b9, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a9, code lost:
    
        r8 = r22;
        r5 = 0 - r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02bc, code lost:
    
        r0 = r19.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c7, code lost:
    
        if (r0.size() <= 1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c9, code lost:
    
        kotlin.collections.i.A(r0, new e14.c(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d1, code lost:
    
        r0 = r19.h;
        r1 = r0.size();
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d9, code lost:
    
        if (r10 >= r1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r25 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02db, code lost:
    
        r3 = (defpackage.l14) r0.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e1, code lost:
    
        if (r26 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e3, code lost:
    
        r4 = (defpackage.l14) kotlin.collections.i.w0(r23);
        r5 = (r4.b() + r4.k()) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f6, code lost:
    
        r2 = r2 + r3.k();
        r3.n(r5, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fe, code lost:
    
        if (r15 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0300, code lost:
    
        g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0303, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f4, code lost:
    
        r5 = r14 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r3 = defpackage.wm3.a(0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0306, code lost:
    
        r0 = r19.g;
        kotlin.collections.i.Y(r0);
        r1 = defpackage.ww8.a;
        r23.addAll(0, r0);
        r23.addAll(r19.h);
        r19.e.clear();
        r19.f.clear();
        r19.g.clear();
        r19.h.clear();
        r19.d.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0335, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x019f, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0205, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0061, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0056, code lost:
    
        r3 = defpackage.wm3.a(r20, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x004e, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0047, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r26 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r27 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r19.d.addAll(r19.a.keySet());
        r0 = r23.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r5 >= r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r13 = (defpackage.l14) r9.get(r5);
        r25 = r0;
        r19.d.remove(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (b(r13) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r0 = (e14.a) r19.a.get(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r0 = new e14.a();
        r0.b(r13, r1);
        r19.a.put(r13.getKey(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r9 = r11.b(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r13.getIndex() == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r9 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r9 >= r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r19.e.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        r17 = r11;
        r18 = r12;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        r5 = r5 + r1;
        r9 = r23;
        r0 = r25;
        r1 = r28;
        r11 = r17;
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r19.f.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        r17 = r13.h(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (r13.l() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        r10 = defpackage.vm3.k(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        c(r13, r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r9 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        r0 = r0.a();
        r9 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (r10 >= r9) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        r13 = r0[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r13 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r13.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        r10 = defpackage.vm3.j(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r0.b(r13, r1);
        r0 = r0.a();
        r9 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r10 >= r9) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        r1 = r0[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0114, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        r17 = r11;
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        if (defpackage.vm3.i(r1.n(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.m.a()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        r7 = r1.n();
        r1.x(defpackage.wm3.a(defpackage.vm3.j(r7) + defpackage.vm3.j(r3), defpackage.vm3.k(r7) + defpackage.vm3.k(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r10 = r10 + 1;
        r11 = r17;
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        r17 = r11;
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        r17 = r11;
        r18 = r12;
        r1 = 1;
        g(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0163, code lost:
    
        r17 = r11;
        r18 = r12;
        r1 = 1;
        r19.a.remove(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0183, code lost:
    
        r17 = r11;
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        if (r15 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018a, code lost:
    
        if (r17 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        r0 = r19.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0192, code lost:
    
        if (r0.size() <= 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r7 = r17;
        kotlin.collections.i.A(r0, new e14.d(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
    
        r8 = r19.e;
        r9 = r8.size();
        r0 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        if (r10 >= r9) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ab, code lost:
    
        r11 = (defpackage.l14) r8.get(r10);
        r12 = r0 + r11.k();
        d(r19, r11, 0 - r12, null, 4, null);
        g(r11);
        r10 = r10 + 1;
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r2 = r19.c;
        r3 = (defpackage.l14) kotlin.collections.i.m0(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cb, code lost:
    
        r1 = r19.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d2, code lost:
    
        if (r1.size() <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d4, code lost:
    
        kotlin.collections.i.A(r1, new e14.b(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01dc, code lost:
    
        r8 = r19.f;
        r9 = r8.size();
        r0 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e4, code lost:
    
        if (r10 >= r9) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e6, code lost:
    
        r11 = (defpackage.l14) r8.get(r10);
        r12 = r0 + r11.k();
        d(r19, r11, r14 + r0, null, 4, null);
        g(r11);
        r10 = r10 + 1;
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0207, code lost:
    
        r0 = r19.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0211, code lost:
    
        if (r0.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0213, code lost:
    
        r1 = r0.next();
        r2 = r18;
        r3 = r2.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021e, code lost:
    
        if (r3 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0220, code lost:
    
        r19.a.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026c, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0228, code lost:
    
        r8 = r24.b(r3);
        r8.o(true);
        r10 = ((e14.a) kotlin.collections.t.j(r19.a, r1)).a();
        r11 = r10.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0240, code lost:
    
        if (r12 >= r11) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0242, code lost:
    
        r13 = r10[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0244, code lost:
    
        if (r13 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r3 = r3.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r20, int r21, int r22, java.util.List r23, defpackage.m14 r24, boolean r25, boolean r26, boolean r27, kotlinx.coroutines.CoroutineScope r28) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e14.e(int, int, int, java.util.List, m14, boolean, boolean, boolean, kotlinx.coroutines.CoroutineScope):void");
    }

    public final void f() {
        this.a.clear();
        this.b = q04.a;
        this.c = -1;
    }
}
