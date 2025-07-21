package defpackage;

import android.app.Application;
import com.nytimes.android.utils.DeviceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ml0 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ml0(Application application) {
        zq3.h(application, "app");
        this.a = "us";
        this.b = DeviceUtils.D(application);
        this.c = DeviceUtils.a(application);
        this.d = "android";
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }
}
