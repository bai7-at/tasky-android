package defpackage;

import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.jp5;
import defpackage.vd2;
import java.io.File;

/* loaded from: classes.dex */
public final class ee2 implements vd2 {
    private final File a;

    public static final class a implements vd2.a {
        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(File file, uk5 uk5Var, ImageLoader imageLoader) {
            return new ee2(file);
        }
    }

    public ee2(File file) {
        this.a = file;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        return new sx7(zg3.d(jp5.a.d(jp5.b, this.a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(lf2.n(this.a)), DataSource.DISK);
    }
}
