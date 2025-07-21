package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ml8 implements k91 {
    private final Uri a;
    private final pl8 b;
    private InputStream c;

    static class a implements ol8 {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ol8
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements ol8 {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ol8
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    ml8(Uri uri, pl8 pl8Var) {
        this.a = uri;
        this.b = pl8Var;
    }

    private static ml8 c(Context context, Uri uri, ol8 ol8Var) {
        return new ml8(uri, new pl8(com.bumptech.glide.a.c(context).j().g(), ol8Var, com.bumptech.glide.a.c(context).e(), context.getContentResolver()));
    }

    public static ml8 f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static ml8 g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d = this.b.d(this.a);
        int a2 = d != null ? this.b.a(this.a) : -1;
        return a2 != -1 ? new z62(d, a2) : d;
    }

    @Override // defpackage.k91
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.k91
    public void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.k91
    public void cancel() {
    }

    @Override // defpackage.k91
    public void d(Priority priority, k91.a aVar) {
        try {
            InputStream h = h();
            this.c = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.k91
    public DataSource e() {
        return DataSource.LOCAL;
    }
}
