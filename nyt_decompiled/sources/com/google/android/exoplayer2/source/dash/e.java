package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.t0;
import defpackage.ep2;
import defpackage.i42;
import defpackage.ob;
import defpackage.ok0;
import defpackage.s91;
import defpackage.t81;
import defpackage.ts4;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.z19;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class e implements Handler.Callback {
    private final ob a;
    private final b b;
    private t81 f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final TreeMap e = new TreeMap();
    private final Handler d = z19.x(this);
    private final i42 c = new i42();

    private static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public interface b {
        void a(long j);

        void b();
    }

    public final class c implements yp8 {
        private final b0 a;
        private final ep2 b = new ep2();
        private final ts4 c = new ts4();
        private long d = -9223372036854775807L;

        c(ob obVar) {
            this.a = b0.l(obVar);
        }

        private ts4 g() {
            this.c.f();
            if (this.a.S(this.b, this.c, 0, false) != -4) {
                return null;
            }
            this.c.u();
            return this.c;
        }

        private void k(long j, long j2) {
            e.this.d.sendMessage(e.this.d.obtainMessage(1, new a(j, j2)));
        }

        private void l() {
            while (this.a.K(false)) {
                ts4 g = g();
                if (g != null) {
                    long j = g.e;
                    Metadata a = e.this.c.a(g);
                    if (a != null) {
                        EventMessage eventMessage = (EventMessage) a.d(0);
                        if (e.h(eventMessage.schemeIdUri, eventMessage.value)) {
                            m(j, eventMessage);
                        }
                    }
                }
            }
            this.a.s();
        }

        private void m(long j, EventMessage eventMessage) {
            long f = e.f(eventMessage);
            if (f == -9223372036854775807L) {
                return;
            }
            k(j, f);
        }

        @Override // defpackage.yp8
        public void b(long j, int i, int i2, int i3, yp8.a aVar) {
            this.a.b(j, i, i2, i3, aVar);
            l();
        }

        @Override // defpackage.yp8
        public void c(yo5 yo5Var, int i, int i2) {
            this.a.a(yo5Var, i);
        }

        @Override // defpackage.yp8
        public void d(t0 t0Var) {
            this.a.d(t0Var);
        }

        @Override // defpackage.yp8
        public int f(s91 s91Var, int i, boolean z, int i2) {
            return this.a.e(s91Var, i, z);
        }

        public boolean h(long j) {
            return e.this.j(j);
        }

        public void i(ok0 ok0Var) {
            long j = this.d;
            if (j == -9223372036854775807L || ok0Var.h > j) {
                this.d = ok0Var.h;
            }
            e.this.m(ok0Var);
        }

        public boolean j(ok0 ok0Var) {
            long j = this.d;
            return e.this.n(j != -9223372036854775807L && j < ok0Var.g);
        }

        public void n() {
            this.a.T();
        }
    }

    public e(t81 t81Var, b bVar, ob obVar) {
        this.f = t81Var;
        this.b = bVar;
        this.a = obVar;
    }

    private Map.Entry e(long j) {
        return this.e.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(EventMessage eventMessage) {
        try {
            return z19.K0(z19.E(eventMessage.messageData));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j, long j2) {
        Long l = (Long) this.e.get(Long.valueOf(j2));
        if (l == null) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.h) {
            this.i = true;
            this.h = false;
            this.b.b();
        }
    }

    private void l() {
        this.b.a(this.g);
    }

    private void p() {
        Iterator it2 = this.e.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Long) ((Map.Entry) it2.next()).getKey()).longValue() < this.f.h) {
                it2.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.a, aVar.b);
        return true;
    }

    boolean j(long j) {
        t81 t81Var = this.f;
        boolean z = false;
        if (!t81Var.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry e = e(t81Var.h);
        if (e != null && ((Long) e.getValue()).longValue() < j) {
            this.g = ((Long) e.getKey()).longValue();
            l();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public c k() {
        return new c(this.a);
    }

    void m(ok0 ok0Var) {
        this.h = true;
    }

    boolean n(boolean z) {
        if (!this.f.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.j = true;
        this.d.removeCallbacksAndMessages(null);
    }

    public void q(t81 t81Var) {
        this.i = false;
        this.g = -9223372036854775807L;
        this.f = t81Var;
        p();
    }
}
