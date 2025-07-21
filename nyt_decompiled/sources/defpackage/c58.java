package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.ribbon.et2.Key;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c58 {

    public static final class a extends e {
        public static final a a = new a();
        private static final String b = "https://www.nytimes.com/spotlight/podcasts";
        private static final String c = AssetConstants.AUDIO_TYPE;

        private a() {
            super(null);
        }

        @Override // defpackage.c58
        public String a() {
            return c;
        }

        @Override // c58.e
        public String c() {
            return b;
        }
    }

    public static final class b extends d {
        public static final b a = new b();
        private static final String b = "com.nytimes.cooking";
        private static final String c = "cooking";

        private b() {
            super(null);
        }

        @Override // defpackage.c58
        public String a() {
            return c;
        }

        @Override // c58.d
        public String c() {
            return b;
        }
    }

    public static final class c extends d {
        public static final c a = new c();
        private static final String b = "com.nytimes.crossword";
        private static final String c = "games";

        private c() {
            super(null);
        }

        @Override // defpackage.c58
        public String a() {
            return c;
        }

        @Override // c58.d
        public String c() {
            return b;
        }
    }

    public static abstract class d extends c58 {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String c();

        private d() {
            super(null);
        }
    }

    public static abstract class e extends c58 {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String c();

        private e() {
            super(null);
        }
    }

    public static final class f extends d {
        public static final f a = new f();
        private static final String b = "com.theathletic";
        private static final String c = "the athletic";

        private f() {
            super(null);
        }

        @Override // defpackage.c58
        public String a() {
            return c;
        }

        @Override // c58.d
        public String c() {
            return b;
        }
    }

    public static final class g extends e {
        public static final g a = new g();
        private static final String b = "https://www.nytimes.com/wirecutter/";
        private static final String c = "wirecutter";

        private g() {
            super(null);
        }

        @Override // defpackage.c58
        public String a() {
            return c;
        }

        @Override // c58.e
        public String c() {
            return b;
        }
    }

    public /* synthetic */ c58(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final Key b() {
        return new Key(a() + "-handoff");
    }

    private c58() {
    }
}
