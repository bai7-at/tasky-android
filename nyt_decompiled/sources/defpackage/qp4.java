package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import coil.size.Scale;
import defpackage.oq1;
import defpackage.yo3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class qp4 {
    public static final a c = new a(null);
    private final ImageLoader a;
    private final sy6 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public qp4(ImageLoader imageLoader, sy6 sy6Var, i94 i94Var) {
        this.a = imageLoader;
        this.b = sy6Var;
    }

    private final String b(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(vg3 vg3Var, MemoryCache.Key key, MemoryCache.b bVar, au7 au7Var, Scale scale) {
        boolean d = d(bVar);
        if (q.a(au7Var)) {
            return !d;
        }
        String str = (String) key.c().get("coil#transformation_size");
        if (str != null) {
            return zq3.c(str, au7Var.toString());
        }
        int width = bVar.a().getWidth();
        int height = bVar.a().getHeight();
        oq1 d2 = au7Var.d();
        int i = d2 instanceof oq1.a ? ((oq1.a) d2).a : Integer.MAX_VALUE;
        oq1 c2 = au7Var.c();
        int i2 = c2 instanceof oq1.a ? ((oq1.a) c2).a : Integer.MAX_VALUE;
        double c3 = tc1.c(width, height, i, i2, scale);
        boolean a2 = n.a(vg3Var);
        if (a2) {
            double g = uo6.g(c3, 1.0d);
            if (Math.abs(i - (width * g)) <= 1.0d || Math.abs(i2 - (g * height)) <= 1.0d) {
                return true;
            }
        } else if ((s.s(i) || Math.abs(i - width) <= 1) && (s.s(i2) || Math.abs(i2 - height) <= 1)) {
            return true;
        }
        if (c3 == 1.0d || a2) {
            return c3 <= 1.0d || !d;
        }
        return false;
    }

    public final MemoryCache.b a(vg3 vg3Var, MemoryCache.Key key, au7 au7Var, Scale scale) {
        if (!vg3Var.C().getReadEnabled()) {
            return null;
        }
        MemoryCache d = this.a.d();
        MemoryCache.b b = d != null ? d.b(key) : null;
        if (b == null || !c(vg3Var, key, b, au7Var, scale)) {
            return null;
        }
        return b;
    }

    public final boolean c(vg3 vg3Var, MemoryCache.Key key, MemoryCache.b bVar, au7 au7Var, Scale scale) {
        if (this.b.c(vg3Var, defpackage.a.c(bVar.a()))) {
            return e(vg3Var, key, bVar, au7Var, scale);
        }
        return false;
    }

    public final MemoryCache.Key f(vg3 vg3Var, Object obj, uk5 uk5Var, d42 d42Var) {
        MemoryCache.Key B = vg3Var.B();
        if (B != null) {
            return B;
        }
        d42Var.p(vg3Var, obj);
        String f = this.a.getComponents().f(obj, uk5Var);
        d42Var.j(vg3Var, f);
        if (f == null) {
            return null;
        }
        List O = vg3Var.O();
        Map c2 = vg3Var.E().c();
        if (O.isEmpty() && c2.isEmpty()) {
            return new MemoryCache.Key(f, null, 2, null);
        }
        Map x = t.x(c2);
        if (!O.isEmpty()) {
            List O2 = vg3Var.O();
            if (O2.size() > 0) {
                lh4.a(O2.get(0));
                StringBuilder sb = new StringBuilder();
                sb.append("coil#transformation_");
                sb.append(0);
                throw null;
            }
            x.put("coil#transformation_size", uk5Var.o().toString());
        }
        return new MemoryCache.Key(f, x);
    }

    public final cc8 g(yo3.a aVar, vg3 vg3Var, MemoryCache.Key key, MemoryCache.b bVar) {
        return new cc8(new BitmapDrawable(vg3Var.l().getResources(), bVar.a()), vg3Var, DataSource.MEMORY_CACHE, key, b(bVar), d(bVar), s.t(aVar));
    }

    public final boolean h(MemoryCache.Key key, vg3 vg3Var, EngineInterceptor.b bVar) {
        MemoryCache d;
        Bitmap bitmap;
        if (vg3Var.C().getWriteEnabled() && (d = this.a.d()) != null && key != null) {
            Drawable e = bVar.e();
            BitmapDrawable bitmapDrawable = e instanceof BitmapDrawable ? (BitmapDrawable) e : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.f()));
                String d2 = bVar.d();
                if (d2 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d2);
                }
                d.c(key, new MemoryCache.b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
