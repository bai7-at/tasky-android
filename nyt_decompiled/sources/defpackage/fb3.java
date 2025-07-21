package defpackage;

import android.net.Uri;
import defpackage.yu4;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class fb3 implements yu4 {
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final yu4 a;

    public static class a implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new fb3(lx4Var.d(z03.class, InputStream.class));
        }
    }

    public fb3(yu4 yu4Var) {
        this.a = yu4Var;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        return this.a.a(new z03(uri.toString()), i, i2, sk5Var);
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
