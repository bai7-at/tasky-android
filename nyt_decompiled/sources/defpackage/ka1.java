package defpackage;

import com.datadog.android.core.configuration.UploadFrequency;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ka1 {
    public static final a f = new a(null);
    private final UploadFrequency a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ka1(UploadFrequency uploadFrequency, int i) {
        zq3.h(uploadFrequency, "frequency");
        this.a = uploadFrequency;
        this.b = i;
        this.c = uploadFrequency.getBaseStepMs$dd_sdk_android_core_release();
        this.d = 10 * uploadFrequency.getBaseStepMs$dd_sdk_android_core_release();
        this.e = 5 * uploadFrequency.getBaseStepMs$dd_sdk_android_core_release();
    }

    public final long a() {
        return this.e;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        return this.a == ka1Var.a && this.b == ka1Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "DataUploadConfiguration(frequency=" + this.a + ", maxBatchesPerUploadJob=" + this.b + ")";
    }
}
