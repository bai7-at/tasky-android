package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.b;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class w14 implements b {
    private final long a;
    private final TreeSet b = new TreeSet(new Comparator() { // from class: v14
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h;
            h = w14.h((lg0) obj, (lg0) obj2);
            return h;
        }
    });
    private long c;

    public w14(long j) {
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(lg0 lg0Var, lg0 lg0Var2) {
        long j = lg0Var.f;
        long j2 = lg0Var2.f;
        return j - j2 == 0 ? lg0Var.compareTo(lg0Var2) : j < j2 ? -1 : 1;
    }

    private void i(Cache cache, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            cache.e((lg0) this.b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void a(Cache cache, lg0 lg0Var, lg0 lg0Var2) {
        c(cache, lg0Var);
        f(cache, lg0Var2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public boolean b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void c(Cache cache, lg0 lg0Var) {
        this.b.remove(lg0Var);
        this.c -= lg0Var.c;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void d(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            i(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void e() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void f(Cache cache, lg0 lg0Var) {
        this.b.add(lg0Var);
        this.c += lg0Var.c;
        i(cache, 0L);
    }
}
