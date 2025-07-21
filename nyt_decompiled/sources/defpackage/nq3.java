package defpackage;

import android.content.Context;
import defpackage.xr1;
import java.io.File;

/* loaded from: classes2.dex */
public final class nq3 extends xr1 {

    class a implements xr1.a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // xr1.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public nq3(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public nq3(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
