package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.l40;
import defpackage.l55;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pg1 implements l40, sq8 {
    public static final ImmutableList p = ImmutableList.B(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final ImmutableList q = ImmutableList.B(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final ImmutableList r = ImmutableList.B(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final ImmutableList s = ImmutableList.B(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final ImmutableList t = ImmutableList.B(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final ImmutableList u = ImmutableList.B(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    private static pg1 v;
    private final ImmutableMap a;
    private final l40.a.C0502a b;
    private final lv7 c;
    private final vl0 d;
    private final boolean e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private int o;

    public static final class b {
        private final Context a;
        private Map b;
        private int c;
        private vl0 d;
        private boolean e;

        public b(Context context) {
            this.a = context == null ? null : context.getApplicationContext();
            this.b = b(z19.O(context));
            this.c = 2000;
            this.d = vl0.a;
            this.e = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static Map b(String str) {
            int[] l = pg1.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            ImmutableList immutableList = pg1.p;
            hashMap.put(2, (Long) immutableList.get(l[0]));
            hashMap.put(3, (Long) pg1.q.get(l[1]));
            hashMap.put(4, (Long) pg1.r.get(l[2]));
            hashMap.put(5, (Long) pg1.s.get(l[3]));
            hashMap.put(10, (Long) pg1.t.get(l[4]));
            hashMap.put(9, (Long) pg1.u.get(l[5]));
            hashMap.put(7, (Long) immutableList.get(l[0]));
            return hashMap;
        }

        public pg1 a() {
            return new pg1(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1052:0x0cf9, code lost:
    
        if (r8.equals("AD") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg1.l(java.lang.String):int[]");
    }

    private long m(int i) {
        Long l = (Long) this.a.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public static synchronized pg1 n(Context context) {
        pg1 pg1Var;
        synchronized (pg1.class) {
            try {
                if (v == null) {
                    v = new b(context).a();
                }
                pg1Var = v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pg1Var;
    }

    private static boolean o(com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        return z && !bVar.d(8);
    }

    private void p(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        this.b.c(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i) {
        int i2 = this.i;
        if (i2 == 0 || this.e) {
            if (this.n) {
                i = this.o;
            }
            if (i2 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.l = m(i);
                long elapsedRealtime = this.d.elapsedRealtime();
                p(this.f > 0 ? (int) (elapsedRealtime - this.g) : 0, this.h, this.l);
                this.g = elapsedRealtime;
                this.h = 0L;
                this.k = 0L;
                this.j = 0L;
                this.c.i();
            }
        }
    }

    @Override // defpackage.sq8
    public synchronized void b(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        try {
            if (o(bVar, z)) {
                ur.g(this.f > 0);
                long elapsedRealtime = this.d.elapsedRealtime();
                int i = (int) (elapsedRealtime - this.g);
                this.j += i;
                long j = this.k;
                long j2 = this.h;
                this.k = j + j2;
                if (i > 0) {
                    this.c.c((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.j < 2000) {
                        if (this.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        }
                        p(i, this.h, this.l);
                        this.g = elapsedRealtime;
                        this.h = 0L;
                    }
                    this.l = (long) this.c.f(0.5f);
                    p(i, this.h, this.l);
                    this.g = elapsedRealtime;
                    this.h = 0L;
                }
                this.f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.l40
    public sq8 c() {
        return this;
    }

    @Override // defpackage.l40
    public synchronized long d() {
        return this.l;
    }

    @Override // defpackage.sq8
    public synchronized void e(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z, int i) {
        if (o(bVar, z)) {
            this.h += i;
        }
    }

    @Override // defpackage.l40
    public void f(Handler handler, l40.a aVar) {
        ur.e(handler);
        ur.e(aVar);
        this.b.b(handler, aVar);
    }

    @Override // defpackage.sq8
    public synchronized void g(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        try {
            if (o(bVar, z)) {
                if (this.f == 0) {
                    this.g = this.d.elapsedRealtime();
                }
                this.f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.l40
    public void h(l40.a aVar) {
        this.b.e(aVar);
    }

    @Override // defpackage.sq8
    public void i(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z) {
    }

    private pg1(Context context, Map map, int i, vl0 vl0Var, boolean z) {
        this.a = ImmutableMap.f(map);
        this.b = new l40.a.C0502a();
        this.c = new lv7(i);
        this.d = vl0Var;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = m(0);
            return;
        }
        l55 d = l55.d(context);
        int f = d.f();
        this.i = f;
        this.l = m(f);
        d.i(new l55.c() { // from class: og1
            @Override // l55.c
            public final void a(int i2) {
                pg1.this.q(i2);
            }
        });
    }
}
