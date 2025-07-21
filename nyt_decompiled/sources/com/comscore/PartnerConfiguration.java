package com.comscore;

import com.comscore.ClientConfiguration;

/* loaded from: classes2.dex */
public class PartnerConfiguration extends ClientConfiguration {

    public static class Builder extends ClientConfiguration.Builder<Builder, PartnerConfiguration> {
        protected String externalClientId;

        public Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.comscore.ClientConfiguration.Builder
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder a() {
            return new Builder(this);
        }

        public Builder externalClientId(String str) {
            this.externalClientId = str;
            return this;
        }

        public Builder partnerId(String str) {
            setClientId(str);
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
            this.externalClientId = builder.externalClientId;
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PartnerConfiguration build() {
            return new PartnerConfiguration(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }
    }

    PartnerConfiguration(long j) {
        this.b = j;
    }

    private static native void destroyCppInstanceNative(long j);

    private static native String getExternalClientIdNative(long j);

    private static native String getPartnerIdNative(long j);

    private static native long newCppInstanceNative(Builder builder);

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(this.b);
    }

    public String getExternalClientId() {
        try {
            return getExternalClientIdNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return null;
        }
    }

    public String getPartnerId() {
        try {
            return getPartnerIdNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return null;
        }
    }

    private PartnerConfiguration(Builder builder) {
        super(builder);
        try {
            this.b = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
