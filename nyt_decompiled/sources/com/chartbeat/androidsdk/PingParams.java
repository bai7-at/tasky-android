package com.chartbeat.androidsdk;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class PingParams {
    private static final String TAG = "PingParams";
    Set<String> oneTimeKeys = new LinkedHashSet();
    PingMode pingMode = PingMode.FIRST_PING;

    PingParams() {
    }

    void addOneTimeParameter(String str) {
        this.oneTimeKeys.add(str);
    }

    boolean includeParameter(String str) {
        return this.oneTimeKeys.contains(str) || this.pingMode.includeParameter(str);
    }

    void newView() {
        this.pingMode = PingMode.FULL_PING;
    }

    void pingComplete(int i) {
        if (i == 500) {
            this.pingMode = PingMode.REPEAT_PING_AFTER_CODE_500;
        } else if (i == 400) {
            this.pingMode = PingMode.FULL_PING;
        } else {
            this.pingMode = this.pingMode.next();
            this.oneTimeKeys.clear();
        }
    }

    void pingError() {
        this.pingMode = PingMode.FULL_PING;
    }

    void pingReset() {
        this.oneTimeKeys.clear();
        this.pingMode = PingMode.FULL_PING;
    }
}
