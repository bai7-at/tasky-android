package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public final class so4 implements yu4 {
    private final Context a;

    public static final class a implements zu4 {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new so4(this.a);
        }
    }

    private static class b implements k91 {
        private static final String[] c = {"_data"};
        private final Context a;
        private final Uri b;

        b(Context context, Uri uri) {
            this.a = context;
            this.b = uri;
        }

        @Override // defpackage.k91
        public Class a() {
            return File.class;
        }

        @Override // defpackage.k91
        public void b() {
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            Cursor query = this.a.getContentResolver().query(this.b, c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.b));
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public so4(Context context) {
        this.a = context;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(uri), new b(this.a, uri));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return uo4.b(uri);
    }
}
