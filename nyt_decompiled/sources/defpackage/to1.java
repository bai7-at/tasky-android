package defpackage;

import android.app.Application;
import com.nytimes.android.utils.AnalyticsTrackingIdRetrieverKt;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.TimeStampUtil;
import io.reactivex.Single;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public interface to1 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final Single a(Application application) {
            zq3.h(application, "context");
            return AnalyticsTrackingIdRetrieverKt.a(application);
        }

        public final String b(Application application) {
            zq3.h(application, "context");
            return DeviceUtils.u(application, false, false, 3, null);
        }

        public final String c(Application application) {
            zq3.h(application, "context");
            return DeviceUtils.v(application);
        }

        public final BehaviorSubject d() {
            BehaviorSubject create = BehaviorSubject.create();
            zq3.g(create, "create(...)");
            return create;
        }

        public final File e(Application application) {
            zq3.h(application, "context");
            File filesDir = application.getFilesDir();
            zq3.g(filesDir, "getFilesDir(...)");
            return filesDir;
        }

        public final boolean f(Application application) {
            zq3.h(application, "context");
            return application.getResources().getBoolean(sc6.is_debug);
        }

        public final boolean g(Application application) {
            zq3.h(application, "context");
            return DeviceUtils.C(application);
        }

        public final PublishSubject h() {
            PublishSubject create = PublishSubject.create();
            zq3.g(create, "create(...)");
            return create;
        }

        public final s74 i(Application application, PublishSubject publishSubject, TimeStampUtil timeStampUtil) {
            zq3.h(application, "context");
            zq3.h(publishSubject, "localeChangeListener");
            zq3.h(timeStampUtil, "timeStampUtil");
            return new t74(application, publishSubject, timeStampUtil);
        }

        public final ve2 j(File file) {
            zq3.h(file, "rootDir");
            ve2 a2 = ye2.a(file);
            zq3.g(a2, "create(...)");
            return a2;
        }

        public final a19 k(Application application) {
            zq3.h(application, "context");
            return new a19(t.m(du8.a("build_info", DeviceUtils.d(application)), du8.a("build_number", String.valueOf(DeviceUtils.w(application))), du8.a("edition", application.getString(kk6.us_edition_value))));
        }
    }
}
