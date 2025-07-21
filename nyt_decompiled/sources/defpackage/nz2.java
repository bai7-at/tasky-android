package defpackage;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class nz2 implements wz6 {
    @Override // defpackage.wz6
    public EncodeStrategy a(sk5 sk5Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // defpackage.b12
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(cz6 cz6Var, File file, sk5 sk5Var) {
        try {
            lf0.e(((lz2) cz6Var.get()).c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
