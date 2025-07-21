package defpackage;

import com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public interface ed1 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final kd1 a() {
            return new kd1(i.o("adv-preview.nytimes.com", "paidpost.nytimes.com", "notifications"));
        }

        public final dd1 b(ms msVar) {
            zq3.h(msVar, "wrapper");
            return new SectionFrontDeepLinkManager(msVar, "/section/");
        }

        public final dd1 c(ms msVar) {
            zq3.h(msVar, "wrapper");
            return new SectionFrontDeepLinkManager(msVar, "/sf/");
        }
    }
}
