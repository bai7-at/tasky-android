package defpackage;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* loaded from: classes.dex */
public abstract class se8 {
    public static final void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        zq3.h(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
