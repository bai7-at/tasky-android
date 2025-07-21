package com.nytimes.android.jobs;

import com.nytimes.android.logging.NYTLogger;
import defpackage.at3;
import defpackage.b04;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qv6;
import defpackage.us3;
import defpackage.wv5;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

/* loaded from: classes4.dex */
public final class UpdateWorkerSchedulingParams {
    private final b04 a;

    @lk7
    public static final class UpdateWorkerParams {
        public static final Companion Companion = new Companion(null);
        private final JobTime a;
        private final JobTime b;
        private final int c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ UpdateWorkerParams(int i, JobTime jobTime, JobTime jobTime2, int i2, mk7 mk7Var) {
            if (7 != (i & 7)) {
                wv5.a(i, 7, UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer.INSTANCE.getDescriptor());
            }
            this.a = jobTime;
            this.b = jobTime2;
            this.c = i2;
        }

        public static final /* synthetic */ void d(UpdateWorkerParams updateWorkerParams, d dVar, SerialDescriptor serialDescriptor) {
            UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer = UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE;
            dVar.z(serialDescriptor, 0, updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, updateWorkerParams.a);
            dVar.z(serialDescriptor, 1, updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, updateWorkerParams.b);
            dVar.w(serialDescriptor, 2, updateWorkerParams.c);
        }

        public final JobTime a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final JobTime c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateWorkerParams)) {
                return false;
            }
            UpdateWorkerParams updateWorkerParams = (UpdateWorkerParams) obj;
            return zq3.c(this.a, updateWorkerParams.a) && zq3.c(this.b, updateWorkerParams.b) && this.c == updateWorkerParams.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            return "UpdateWorkerParams(morningJobTime=" + this.a + ", eveningJobTime=" + this.b + ", executionWindowMinutes=" + this.c + ")";
        }

        public UpdateWorkerParams(JobTime jobTime, JobTime jobTime2, int i) {
            zq3.h(jobTime, "morningJobTime");
            zq3.h(jobTime2, "eveningJobTime");
            this.a = jobTime;
            this.b = jobTime2;
            this.c = i;
        }

        @lk7
        public static final class JobTime {
            public static final Companion Companion = new Companion(null);
            private final int a;
            private final int b;

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer serializer() {
                    return UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public JobTime(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public static final /* synthetic */ void c(JobTime jobTime, d dVar, SerialDescriptor serialDescriptor) {
                dVar.w(serialDescriptor, 0, jobTime.a);
                dVar.w(serialDescriptor, 1, jobTime.b);
            }

            public final int a() {
                return this.a;
            }

            public final int b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JobTime)) {
                    return false;
                }
                JobTime jobTime = (JobTime) obj;
                return this.a == jobTime.a && this.b == jobTime.b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                return "JobTime(hour=" + this.a + ", minute=" + this.b + ")";
            }

            public /* synthetic */ JobTime(int i, int i2, int i3, mk7 mk7Var) {
                if (3 != (i & 3)) {
                    wv5.a(i, 3, UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE.getDescriptor());
                }
                this.a = i2;
                this.b = i3;
            }
        }
    }

    public UpdateWorkerSchedulingParams(b04 b04Var) {
        zq3.h(b04Var, "remoteConfig");
        this.a = b04Var;
    }

    private final long a(UpdateWorkerParams updateWorkerParams) {
        return Math.min(us3.b(updateWorkerParams.c().a(), updateWorkerParams.c().b(), 0L, 4, null), us3.b(updateWorkerParams.a().a(), updateWorkerParams.a().b(), 0L, 4, null)) + Random.a.h(0L, TimeUnit.MINUTES.toMillis(updateWorkerParams.b()));
    }

    public final long b() {
        UpdateWorkerParams updateWorkerParams;
        try {
            at3.a aVar = at3.d;
            String F = ((qv6) this.a.get()).F();
            aVar.a();
            updateWorkerParams = (UpdateWorkerParams) aVar.c(UpdateWorkerParams.Companion.serializer(), F);
        } catch (Exception e) {
            NYTLogger.n(e, "Failed to retrieve remote config update params, falling back on defaults.", new Object[0]);
            updateWorkerParams = new UpdateWorkerParams(new UpdateWorkerParams.JobTime(7, 1), new UpdateWorkerParams.JobTime(16, 3), 15);
        }
        return a(updateWorkerParams);
    }
}
