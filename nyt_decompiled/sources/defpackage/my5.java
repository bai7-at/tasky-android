package defpackage;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.poisonpill.model.ClassifierType;
import com.nytimes.android.poisonpill.model.Pill;
import com.nytimes.android.poisonpill.model.PoisonPillFirebaseRemoteConfig;
import com.squareup.moshi.JsonAdapter;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class my5 implements ly5 {
    private final qv6 a;
    private final JsonAdapter b;
    private final rp0 c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ClassifierType.values().length];
            try {
                iArr[ClassifierType.APP_VERSION_BELOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassifierType.MATCH_APP_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((Pill) obj2).b().a().getPriority()), Integer.valueOf(((Pill) obj).b().a().getPriority()));
        }
    }

    public my5(qv6 qv6Var, JsonAdapter jsonAdapter, rp0 rp0Var) {
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(jsonAdapter, "adapter");
        zq3.h(rp0Var, "appVersion");
        this.a = qv6Var;
        this.b = jsonAdapter;
        this.c = rp0Var;
    }

    private final Pill b() {
        Pill[] a2;
        boolean z;
        String z2 = this.a.z();
        if (h.d0(z2)) {
            return null;
        }
        try {
            PoisonPillFirebaseRemoteConfig poisonPillFirebaseRemoteConfig = (PoisonPillFirebaseRemoteConfig) this.b.fromJson(z2);
            if (poisonPillFirebaseRemoteConfig == null || (a2 = poisonPillFirebaseRemoteConfig.a()) == null) {
                return null;
            }
            if (a2.length > 1) {
                d.G(a2, new b());
            }
            for (Pill pill : a2) {
                int i = a.a[pill.b().a().ordinal()];
                if (i == 1) {
                    z = this.c.compareTo(new rp0(pill.b().b())) < 0;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = zq3.c(this.c, new rp0(pill.b().b()));
                }
                if (z) {
                    return pill;
                }
            }
            return null;
        } catch (Exception e) {
            NYTLogger.s(e);
            return null;
        }
    }

    @Override // defpackage.ly5
    public Pill a() {
        return b();
    }
}
