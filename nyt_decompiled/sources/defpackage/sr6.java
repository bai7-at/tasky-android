package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* loaded from: classes.dex */
public final class sr6 implements y48 {
    private final dd9 a;
    private final b b;

    private static final class a {
        private final Bitmap a;
        private final Map b;
        private final int c;

        public a(Bitmap bitmap, Map map, int i) {
            this.a = bitmap;
            this.b = map;
            this.c = i;
        }

        public final Bitmap a() {
            return this.a;
        }

        public final Map b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }
    }

    public static final class b extends hd4 {
        final /* synthetic */ sr6 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, sr6 sr6Var) {
            super(i);
            this.j = sr6Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.hd4
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(boolean z, MemoryCache.Key key, a aVar, a aVar2) {
            this.j.a.c(key, aVar.a(), aVar.b(), aVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.hd4
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int j(MemoryCache.Key key, a aVar) {
            return aVar.c();
        }
    }

    public sr6(int i, dd9 dd9Var) {
        this.a = dd9Var;
        this.b = new b(i, this);
    }

    @Override // defpackage.y48
    public void a(int i) {
        if (i >= 40) {
            e();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            this.b.l(g() / 2);
        }
    }

    @Override // defpackage.y48
    public MemoryCache.b b(MemoryCache.Key key) {
        a aVar = (a) this.b.d(key);
        if (aVar != null) {
            return new MemoryCache.b(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // defpackage.y48
    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int a2 = defpackage.a.a(bitmap);
        if (a2 <= f()) {
            this.b.f(key, new a(bitmap, map, a2));
        } else {
            this.b.g(key);
            this.a.c(key, bitmap, map, a2);
        }
    }

    public void e() {
        this.b.c();
    }

    public int f() {
        return this.b.e();
    }

    public int g() {
        return this.b.i();
    }
}
