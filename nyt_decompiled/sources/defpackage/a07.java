package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.yu4;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class a07 implements yu4 {
    private final yu4 a;
    private final Resources b;

    public static final class a implements zu4 {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new a07(this.a, lx4Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements zu4 {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new a07(this.a, lx4Var.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements zu4 {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new a07(this.a, lx4Var.d(Uri.class, InputStream.class));
        }
    }

    public static class d implements zu4 {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new a07(this.a, zw8.c());
        }
    }

    public a07(Resources resources, yu4 yu4Var) {
        this.b = resources;
        this.a = yu4Var;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Integer num, int i, int i2, sk5 sk5Var) {
        Uri d2 = d(num);
        if (d2 == null) {
            return null;
        }
        return this.a.a(d2, i, i2, sk5Var);
    }

    @Override // defpackage.yu4
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
