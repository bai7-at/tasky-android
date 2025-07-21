package com.nytimes.android.messaging.regibundle.models;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class RegistrationData {
    public static final int $stable = 0;
    private final String buttonText;
    private final String header;
    private final String text;

    public RegistrationData(String str, String str2, String str3) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        this.header = str;
        this.text = str2;
        this.buttonText = str3;
    }

    public static /* synthetic */ RegistrationData copy$default(RegistrationData registrationData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationData.header;
        }
        if ((i & 2) != 0) {
            str2 = registrationData.text;
        }
        if ((i & 4) != 0) {
            str3 = registrationData.buttonText;
        }
        return registrationData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.buttonText;
    }

    public final RegistrationData copy(String str, String str2, String str3) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        return new RegistrationData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationData)) {
            return false;
        }
        RegistrationData registrationData = (RegistrationData) obj;
        return zq3.c(this.header, registrationData.header) && zq3.c(this.text, registrationData.text) && zq3.c(this.buttonText, registrationData.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.text.hashCode()) * 31) + this.buttonText.hashCode();
    }

    public String toString() {
        return "RegistrationData(header=" + this.header + ", text=" + this.text + ", buttonText=" + this.buttonText + ")";
    }
}
