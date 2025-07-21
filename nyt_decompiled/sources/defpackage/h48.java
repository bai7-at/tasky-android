package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.yu4;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class h48 implements yu4 {
    private final yu4 a;

    public static final class a implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new h48(lx4Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new h48(lx4Var.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new h48(lx4Var.d(Uri.class, InputStream.class));
        }
    }

    public h48(yu4 yu4Var) {
        this.a = yu4Var;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(String str, int i, int i2, sk5 sk5Var) {
        Uri e = e(str);
        if (e == null || !this.a.b(e)) {
            return null;
        }
        return this.a.a(e, i, i2, sk5Var);
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
