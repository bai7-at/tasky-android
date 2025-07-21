package com.comscore;

import com.comscore.ClientConfiguration;

/* loaded from: classes2.dex */
public class PublisherConfiguration extends ClientConfiguration {
    private PublisherUniqueDeviceIdListener d;

    public static class Builder extends ClientConfiguration.Builder<Builder, PublisherConfiguration> {
        private PublisherUniqueDeviceIdListener a;

        public Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.comscore.ClientConfiguration.Builder
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder a() {
            return new Builder(this);
        }

        public Builder publisherId(String str) {
            setClientId(str);
            return this;
        }

        public Builder publisherUniqueDeviceIdListener(PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
            this.a = publisherUniqueDeviceIdListener;
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PublisherConfiguration build() {
            return new PublisherConfiguration(this, this.a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }
    }

    PublisherConfiguration(long j) {
        this.b = j;
    }

    private static native void destroyCppInstanceNative(long j, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    private static native String getPublisherIdNative(long j);

    private static native long newCppInstanceNative(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(this.b, this.d);
    }

    public String getPublisherId() {
        try {
            return getPublisherIdNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return null;
        }
    }

    private PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
        super(builder);
        this.d = publisherUniqueDeviceIdListener;
        try {
            this.b = newCppInstanceNative(builder, publisherUniqueDeviceIdListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
