package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import coil.ImageLoader;
import coil.decode.DataSource;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.oq1;
import defpackage.vd2;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class fx0 implements vd2 {
    private final Uri a;
    private final uk5 b;

    public static final class a implements vd2.a {
        private final boolean c(Uri uri) {
            return zq3.c(uri.getScheme(), "content");
        }

        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(Uri uri, uk5 uk5Var, ImageLoader imageLoader) {
            if (c(uri)) {
                return new fx0(uri, uk5Var);
            }
            return null;
        }
    }

    public fx0(Uri uri, uk5 uk5Var) {
        this.a = uri;
        this.b = uk5Var;
    }

    private final Bundle d() {
        oq1 d = this.b.o().d();
        oq1.a aVar = d instanceof oq1.a ? (oq1.a) d : null;
        if (aVar != null) {
            int i = aVar.a;
            oq1 c = this.b.o().c();
            oq1.a aVar2 = c instanceof oq1.a ? (oq1.a) c : null;
            if (aVar2 != null) {
                int i2 = aVar2.a;
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                return bundle;
            }
        }
        return null;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        InputStream openInputStream;
        ContentResolver contentResolver = this.b.g().getContentResolver();
        if (b(this.a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.a, QueryKeys.EXTERNAL_REFERRER);
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.a + "'.").toString());
            }
        } else if (c(this.a)) {
            AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(this.a, "image/*", d(), null);
            openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.a + "'.").toString());
            }
        } else {
            openInputStream = contentResolver.openInputStream(this.a);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.a + "'.").toString());
            }
        }
        return new sx7(zg3.b(wd5.d(wd5.l(openInputStream)), this.b.g(), new nw0(this.a)), contentResolver.getType(this.a), DataSource.DISK);
    }

    public final boolean b(Uri uri) {
        return zq3.c(uri.getAuthority(), "com.android.contacts") && zq3.c(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        return zq3.c(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && zq3.c(pathSegments.get(size + (-3)), AssetConstants.AUDIO_TYPE) && zq3.c(pathSegments.get(size + (-2)), "albums");
    }
}
