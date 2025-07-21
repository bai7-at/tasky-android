package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.vd2;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class wt implements vd2 {
    private final Uri a;
    private final uk5 b;

    public static final class a implements vd2.a {
        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Uri uri, uk5 uk5Var, ImageLoader imageLoader) {
            if (s.q(uri)) {
                return new wt(uri, uk5Var);
            }
            return null;
        }
    }

    public wt(Uri uri, uk5 uk5Var) {
        this.a = uri;
        this.b = uk5Var;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        String u0 = i.u0(i.e0(this.a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new sx7(zg3.b(wd5.d(wd5.l(this.b.g().getAssets().open(u0))), this.b.g(), new os(u0)), s.j(MimeTypeMap.getSingleton(), u0), DataSource.DISK);
    }
}
