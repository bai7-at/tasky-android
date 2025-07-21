package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.yu4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class xy8 implements yu4 {
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(TransferTable.COLUMN_FILE, "android.resource", "content")));
    private final c a;

    public static final class a implements zu4, c {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xy8.c
        public k91 a(Uri uri) {
            return new js(this.a, uri);
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new xy8(this);
        }
    }

    public static class b implements zu4, c {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xy8.c
        public k91 a(Uri uri) {
            return new ce2(this.a, uri);
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new xy8(this);
        }
    }

    public interface c {
        k91 a(Uri uri);
    }

    public static class d implements zu4, c {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xy8.c
        public k91 a(Uri uri) {
            return new p38(this.a, uri);
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new xy8(this);
        }
    }

    public xy8(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(Uri uri, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(uri), this.a.a(uri));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
