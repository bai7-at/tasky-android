package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class JsException {
    private String message;
    private String name;
    private String stacktrace;

    /* renamed from: type, reason: collision with root package name */
    private String f84type;

    public JsException(@bt3(name = "n") String str, @bt3(name = "m") String str2, @bt3(name = "t") String str3, @bt3(name = "st") String str4) {
        this.name = str;
        this.message = str2;
        this.f84type = str3;
        this.stacktrace = str4;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStacktrace() {
        return this.stacktrace;
    }

    public final String getType() {
        return this.f84type;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStacktrace(String str) {
        this.stacktrace = str;
    }

    public final void setType(String str) {
        this.f84type = str;
    }
}
