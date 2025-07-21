package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.yu4;

/* loaded from: classes2.dex */
public class vo4 implements yu4 {
    private final Context a;

    public static class a implements zu4 {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new vo4(this.a);
        }
    }

    public vo4(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(sk5 sk5Var) {
        Long l = (Long) sk5Var.c(k79.d);
        return l != null && l.longValue() == -1;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        if (uo4.d(i, i2) && e(sk5Var)) {
            return new yu4.a(new ac5(uri), ml8.g(this.a, uri));
        }
        return null;
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return uo4.c(uri);
    }
}
