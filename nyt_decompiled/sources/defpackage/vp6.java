package defpackage;

import android.app.Application;
import androidx.preference.g;
import com.nytimes.android.embracephoenix.NewsEmbraceTimberTree;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.ul8;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class vp6 extends vl8 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ul8.c {
        private final String w(int i) {
            switch (i) {
                case 2:
                    return "V/";
                case 3:
                    return "D/";
                case 4:
                    return "I/";
                case 5:
                    return "W/";
                case 6:
                    return "E/";
                case 7:
                    return "A/";
                case 8:
                    return "REPORT/";
                default:
                    return "?/";
            }
        }

        @Override // ul8.c
        protected void p(int i, String str, String str2, Throwable th) {
            zq3.h(str2, "message");
            if (i == 8) {
                if (th != null) {
                    com.google.firebase.crashlytics.a.a().d(th);
                    return;
                }
                return;
            }
            com.google.firebase.crashlytics.a a = com.google.firebase.crashlytics.a.a();
            StringBuilder sb = new StringBuilder(w(i));
            if (str != null) {
                sb.append(str);
            }
            sb.append(": ");
            sb.append(str2);
            if (th != null) {
                sb.append(" ");
                sb.append(th.toString());
            }
            a.c(sb.toString());
        }
    }

    static {
        ul8.b bVar = ul8.a;
        bVar.x(new NewsEmbraceTimberTree());
        bVar.x(new b());
    }

    public vp6(Application application) {
        Object obj;
        zq3.h(application, "application");
        if (DeviceUtils.z(application)) {
            Iterator it2 = ul8.a.w().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((ul8.c) obj) instanceof xz0) {
                        break;
                    }
                }
            }
            if (obj == null) {
                HashSet hashSet = new HashSet();
                if (!g.b(application).getBoolean("com.nytimes.android.phoenix.beta.ET2_LOGCAT", false)) {
                    hashSet.add("ET2");
                }
                ul8.a.x(new xz0(hashSet));
            }
        }
    }
}
