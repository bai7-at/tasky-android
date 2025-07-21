package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ss implements k91 {
    private final String a;
    private final AssetManager b;
    private Object c;

    public ss(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.k91
    public void b() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // defpackage.k91
    public void cancel() {
    }

    @Override // defpackage.k91
    public void d(Priority priority, k91.a aVar) {
        try {
            Object f = f(this.b, this.a);
            this.c = f;
            aVar.f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.k91
    public DataSource e() {
        return DataSource.LOCAL;
    }

    protected abstract Object f(AssetManager assetManager, String str);
}
