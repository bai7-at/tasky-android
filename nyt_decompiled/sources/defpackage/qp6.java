package defpackage;

import com.nytimes.android.deeplink.types.SectionDeepLinkManager;

/* loaded from: classes4.dex */
public interface qp6 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final dd1 a(ms msVar) {
            zq3.h(msVar, "wrapper");
            return new SectionDeepLinkManager(msVar, "recent");
        }

        public final dd1 b(ms msVar) {
            zq3.h(msVar, "wrapper");
            return new SectionDeepLinkManager(msVar, "saved");
        }
    }
}
