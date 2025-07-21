package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class h74 implements k91 {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public h74(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.k91
    public void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // defpackage.k91
    public void cancel() {
    }

    @Override // defpackage.k91
    public final void d(Priority priority, k91.a aVar) {
        try {
            Object f = f(this.a, this.b);
            this.c = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.k91
    public DataSource e() {
        return DataSource.LOCAL;
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);
}
