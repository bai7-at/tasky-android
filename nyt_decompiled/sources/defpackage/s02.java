package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* loaded from: classes.dex */
public final class s02 implements y48 {
    private final dd9 a;

    public s02(dd9 dd9Var) {
        this.a = dd9Var;
    }

    @Override // defpackage.y48
    public void a(int i) {
    }

    @Override // defpackage.y48
    public MemoryCache.b b(MemoryCache.Key key) {
        return null;
    }

    @Override // defpackage.y48
    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.a.c(key, bitmap, map, a.a(bitmap));
    }
}
