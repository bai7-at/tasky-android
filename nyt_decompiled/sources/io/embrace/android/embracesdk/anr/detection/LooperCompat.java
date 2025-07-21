package io.embrace.android.embracesdk.anr.detection;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.MessageQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class LooperCompat {
    LooperCompat() {
    }

    @SuppressLint({"PrivateApi"})
    static MessageQueue getMessageQueue(Looper looper) {
        return looper.getQueue();
    }
}
