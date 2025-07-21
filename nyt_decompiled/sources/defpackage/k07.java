package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.vd2;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class k07 implements vd2 {
    public static final a c = new a(null);
    private final Uri a;
    private final uk5 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements vd2.a {
        private final boolean c(Uri uri) {
            return zq3.c(uri.getScheme(), "android.resource");
        }

        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Uri uri, uk5 uk5Var, ImageLoader imageLoader) {
            if (c(uri)) {
                return new k07(uri, uk5Var);
            }
            return null;
        }
    }

    public k07(Uri uri, uk5 uk5Var) {
        this.a = uri;
        this.b = uk5Var;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        Integer l;
        String authority = this.a.getAuthority();
        if (authority != null) {
            if (h.d0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) i.y0(this.a.getPathSegments());
                if (str == null || (l = h.l(str)) == null) {
                    b(this.a);
                    throw new KotlinNothingValueException();
                }
                int intValue = l.intValue();
                Context g = this.b.g();
                Resources resources = zq3.c(authority, g.getPackageName()) ? g.getResources() : g.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j = s.j(MimeTypeMap.getSingleton(), charSequence.subSequence(h.g0(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!zq3.c(j, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new sx7(zg3.b(wd5.d(wd5.l(resources.openRawResource(intValue, typedValue2))), g, new b07(authority, intValue, typedValue2.density)), j, DataSource.DISK);
                }
                Drawable a2 = zq3.c(authority, g.getPackageName()) ? f.a(g, intValue) : f.d(g, resources, intValue);
                boolean u = s.u(a2);
                if (u) {
                    a2 = new BitmapDrawable(g.getResources(), uv1.a.a(a2, this.b.f(), this.b.o(), this.b.n(), this.b.c()));
                }
                return new pv1(a2, u, DataSource.DISK);
            }
        }
        b(this.a);
        throw new KotlinNothingValueException();
    }
}
