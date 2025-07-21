package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public interface nk7 {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj);
}
