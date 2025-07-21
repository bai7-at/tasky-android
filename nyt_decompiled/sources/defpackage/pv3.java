package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class pv3 {
    public static final a Companion = new a(null);
    private static final pv3 b = new pv3(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    private static final pv3 c = new pv3("mockTestKey");
    private final String a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pv3 a() {
            return pv3.b;
        }

        private a() {
        }
    }

    public pv3(String str) {
        zq3.h(str, "label");
        this.a = str;
    }

    public final String b() {
        return this.a;
    }
}
