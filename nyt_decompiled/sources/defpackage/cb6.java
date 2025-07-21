package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class cb6 implements yu4 {
    private final Context a;
    private final yu4 b;
    private final yu4 c;
    private final Class d;

    private static abstract class a implements zu4 {
        private final Context a;
        private final Class b;

        a(Context context, Class cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.zu4
        public final yu4 b(lx4 lx4Var) {
            return new cb6(this.a, lx4Var.d(File.class, this.b), lx4Var.d(Uri.class, this.b), this.b);
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    private static final class d implements k91 {
        private static final String[] k = {"_data"};
        private final Context a;
        private final yu4 b;
        private final yu4 c;
        private final Uri d;
        private final int e;
        private final int f;
        private final sk5 g;
        private final Class h;
        private volatile boolean i;
        private volatile k91 j;

        d(Context context, yu4 yu4Var, yu4 yu4Var2, Uri uri, int i, int i2, sk5 sk5Var, Class cls) {
            this.a = context.getApplicationContext();
            this.b = yu4Var;
            this.c = yu4Var2;
            this.d = uri;
            this.e = i;
            this.f = i2;
            this.g = sk5Var;
            this.h = cls;
        }

        private yu4.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.b.a(h(this.d), this.e, this.f, this.g);
            }
            return this.c.a(g() ? MediaStore.setRequireOriginal(this.d) : this.d, this.e, this.f, this.g);
        }

        private k91 f() {
            yu4.a c = c();
            if (c != null) {
                return c.c;
            }
            return null;
        }

        private boolean g() {
            return this.a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.a.getContentResolver().query(uri, k, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // defpackage.k91
        public Class a() {
            return this.h;
        }

        @Override // defpackage.k91
        public void b() {
            k91 k91Var = this.j;
            if (k91Var != null) {
                k91Var.b();
            }
        }

        @Override // defpackage.k91
        public void cancel() {
            this.i = true;
            k91 k91Var = this.j;
            if (k91Var != null) {
                k91Var.cancel();
            }
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            try {
                k91 f = f();
                if (f == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                    return;
                }
                this.j = f;
                if (this.i) {
                    cancel();
                } else {
                    f.d(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    cb6(Context context, yu4 yu4Var, yu4 yu4Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = yu4Var;
        this.c = yu4Var2;
        this.d = cls;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(uri), new d(this.a, this.b, this.c, uri, i, i2, sk5Var, this.d));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return uo4.b(uri);
    }
}
