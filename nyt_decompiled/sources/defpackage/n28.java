package defpackage;

import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;

/* loaded from: classes2.dex */
public interface n28 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final n28 a(Fetcher fetcher, SourceOfTruth sourceOfTruth) {
            zq3.h(fetcher, "fetcher");
            zq3.h(sourceOfTruth, "sourceOfTruth");
            return new rr6(fetcher, sourceOfTruth);
        }
    }

    n28 a(rp4 rp4Var);

    m28 build();
}
