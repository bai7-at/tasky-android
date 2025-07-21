package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bw0 {
    private final f a;

    public static final class a {
        private final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public bw0 a() {
            return this.a.build();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.a(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.b(uri);
            return this;
        }
    }

    private static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int i) {
            this.a = ew0.a(clipData, i);
        }

        @Override // bw0.c
        public void a(int i) {
            this.a.setFlags(i);
        }

        @Override // bw0.c
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // bw0.c
        public bw0 build() {
            ContentInfo build;
            build = this.a.build();
            return new bw0(new e(build));
        }

        @Override // bw0.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    private interface c {
        void a(int i);

        void b(Uri uri);

        bw0 build();

        void setExtras(Bundle bundle);
    }

    private static final class d implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // bw0.c
        public void a(int i) {
            this.c = i;
        }

        @Override // bw0.c
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // bw0.c
        public bw0 build() {
            return new bw0(new g(this));
        }

        @Override // bw0.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    private static final class e implements f {
        private final ContentInfo a;

        e(ContentInfo contentInfo) {
            this.a = aw0.a(h16.g(contentInfo));
        }

        @Override // bw0.f
        public int a() {
            int source;
            source = this.a.getSource();
            return source;
        }

        @Override // bw0.f
        public ClipData b() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // bw0.f
        public int p0() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        @Override // bw0.f
        public ContentInfo q0() {
            return this.a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    private interface f {
        int a();

        ClipData b();

        int p0();

        ContentInfo q0();
    }

    private static final class g implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(d dVar) {
            this.a = (ClipData) h16.g(dVar.a);
            this.b = h16.c(dVar.b, 0, 5, "source");
            this.c = h16.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // bw0.f
        public int a() {
            return this.b;
        }

        @Override // bw0.f
        public ClipData b() {
            return this.a;
        }

        @Override // bw0.f
        public int p0() {
            return this.c;
        }

        @Override // bw0.f
        public ContentInfo q0() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(bw0.e(this.b));
            sb.append(", flags=");
            sb.append(bw0.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    bw0(f fVar) {
        this.a = fVar;
    }

    static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static bw0 g(ContentInfo contentInfo) {
        return new bw0(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.p0();
    }

    public int d() {
        return this.a.a();
    }

    public ContentInfo f() {
        ContentInfo q0 = this.a.q0();
        Objects.requireNonNull(q0);
        return aw0.a(q0);
    }

    public String toString() {
        return this.a.toString();
    }
}
