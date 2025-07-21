package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.g;
import defpackage.z37;
import java.util.Comparator;
import java.util.TreeSet;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class g {
    private final TreeSet a = new TreeSet(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int d;
            d = g.d((g.a) obj, (g.a) obj2);
            return d;
        }
    });
    private int b;
    private int c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public final z37 a;
        public final long b;

        public a(z37 z37Var, long j) {
            this.a = z37Var;
            this.b = j;
        }
    }

    public g() {
        g();
    }

    private synchronized void b(a aVar) {
        this.b = aVar.a.g;
        this.a.add(aVar);
    }

    private static int c(int i, int i2) {
        int min;
        int i3 = i - i2;
        return (Math.abs(i3) <= 1000 || (min = (Math.min(i, i2) - Math.max(i, i2)) + Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 1000) ? i3 : i < i2 ? min : -min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.a.g, aVar2.a.g);
    }

    public synchronized boolean e(z37 z37Var, long j) {
        if (this.a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = z37Var.g;
        if (!this.d) {
            g();
            this.c = z37.c(i);
            this.d = true;
            b(new a(z37Var, j));
            return true;
        }
        if (Math.abs(c(i, z37.b(this.b))) < 1000) {
            if (c(i, this.c) <= 0) {
                return false;
            }
            b(new a(z37Var, j));
            return true;
        }
        this.c = z37.c(i);
        this.a.clear();
        b(new a(z37Var, j));
        return true;
    }

    public synchronized z37 f(long j) {
        if (this.a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.a.first();
        int i = aVar.a.g;
        if (i != z37.b(this.c) && j < aVar.b) {
            return null;
        }
        this.a.pollFirst();
        this.c = i;
        return aVar.a;
    }

    public synchronized void g() {
        this.a.clear();
        this.d = false;
        this.c = -1;
        this.b = -1;
    }
}
