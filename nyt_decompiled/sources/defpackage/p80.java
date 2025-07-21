package defpackage;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* loaded from: classes2.dex */
public class p80 implements wz6 {
    private final w80 a;
    private final wz6 b;

    public p80(w80 w80Var, wz6 wz6Var) {
        this.a = w80Var;
        this.b = wz6Var;
    }

    @Override // defpackage.wz6
    public EncodeStrategy a(sk5 sk5Var) {
        return this.b.a(sk5Var);
    }

    @Override // defpackage.b12
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(cz6 cz6Var, File file, sk5 sk5Var) {
        return this.b.b(new y80(((BitmapDrawable) cz6Var.get()).getBitmap(), this.a), file, sk5Var);
    }
}
