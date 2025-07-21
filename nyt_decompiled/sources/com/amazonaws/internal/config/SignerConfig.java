package com.amazonaws.internal.config;

/* loaded from: classes.dex */
public class SignerConfig {
    private final String signerType;

    SignerConfig(String str) {
        this.signerType = str;
    }

    public String getSignerType() {
        return this.signerType;
    }

    public String toString() {
        return this.signerType;
    }

    SignerConfig(SignerConfig signerConfig) {
        this.signerType = signerConfig.getSignerType();
    }
}
