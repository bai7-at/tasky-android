package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Envelope<T> {
    private final T data;
    private final EnvelopeMetadata metadata;
    private final EnvelopeResource resource;

    /* renamed from: type, reason: collision with root package name */
    private final String f80type;
    private final String version;

    public Envelope(@bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str, @bt3(name = "type") String str2, @bt3(name = "data") T t) {
        this.resource = envelopeResource;
        this.metadata = envelopeMetadata;
        this.version = str;
        this.f80type = str2;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Envelope copy$default(Envelope envelope, EnvelopeResource envelopeResource, EnvelopeMetadata envelopeMetadata, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            envelopeResource = envelope.resource;
        }
        if ((i & 2) != 0) {
            envelopeMetadata = envelope.metadata;
        }
        EnvelopeMetadata envelopeMetadata2 = envelopeMetadata;
        if ((i & 4) != 0) {
            str = envelope.version;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = envelope.f80type;
        }
        String str4 = str2;
        T t = obj;
        if ((i & 16) != 0) {
            t = envelope.data;
        }
        return envelope.copy(envelopeResource, envelopeMetadata2, str3, str4, t);
    }

    public final EnvelopeResource component1() {
        return this.resource;
    }

    public final EnvelopeMetadata component2() {
        return this.metadata;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.f80type;
    }

    public final T component5() {
        return this.data;
    }

    public final Envelope<T> copy(@bt3(name = "resource") EnvelopeResource envelopeResource, @bt3(name = "metadata") EnvelopeMetadata envelopeMetadata, @bt3(name = "version") String str, @bt3(name = "type") String str2, @bt3(name = "data") T t) {
        return new Envelope<>(envelopeResource, envelopeMetadata, str, str2, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Envelope)) {
            return false;
        }
        Envelope envelope = (Envelope) obj;
        return zq3.c(this.resource, envelope.resource) && zq3.c(this.metadata, envelope.metadata) && zq3.c(this.version, envelope.version) && zq3.c(this.f80type, envelope.f80type) && zq3.c(this.data, envelope.data);
    }

    public final T getData() {
        return this.data;
    }

    public final EnvelopeMetadata getMetadata() {
        return this.metadata;
    }

    public final EnvelopeResource getResource() {
        return this.resource;
    }

    public final String getType() {
        return this.f80type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        EnvelopeResource envelopeResource = this.resource;
        int hashCode = (envelopeResource != null ? envelopeResource.hashCode() : 0) * 31;
        EnvelopeMetadata envelopeMetadata = this.metadata;
        int hashCode2 = (hashCode + (envelopeMetadata != null ? envelopeMetadata.hashCode() : 0)) * 31;
        String str = this.version;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f80type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        T t = this.data;
        return hashCode4 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "Envelope(resource=" + this.resource + ", metadata=" + this.metadata + ", version=" + this.version + ", type=" + this.f80type + ", data=" + this.data + ")";
    }

    public /* synthetic */ Envelope(EnvelopeResource envelopeResource, EnvelopeMetadata envelopeMetadata, String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : envelopeResource, (i & 2) != 0 ? null : envelopeMetadata, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, obj);
    }
}
