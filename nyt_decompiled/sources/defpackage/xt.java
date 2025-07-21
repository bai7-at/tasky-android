package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.yu4;

/* loaded from: classes2.dex */
public class xt implements yu4 {
    private static final int c = 22;
    private final AssetManager a;
    private final a b;

    public interface a {
        k91 a(AssetManager assetManager, String str);
    }

    public static class b implements zu4, a {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // xt.a
        public k91 a(AssetManager assetManager, String str) {
            return new be2(assetManager, str);
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new xt(this.a, this);
        }
    }

    public static class c implements zu4, a {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // xt.a
        public k91 a(AssetManager assetManager, String str) {
            return new l38(assetManager, str);
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new xt(this.a, this);
        }
    }

    public xt(AssetManager assetManager, a aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(uri), this.b.a(this.a, uri.toString().substring(c)));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return TransferTable.COLUMN_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
