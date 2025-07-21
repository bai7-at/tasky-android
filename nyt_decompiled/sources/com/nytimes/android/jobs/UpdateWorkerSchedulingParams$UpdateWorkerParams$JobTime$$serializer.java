package com.nytimes.android.jobs;

import com.nytimes.android.jobs.UpdateWorkerSchedulingParams;
import defpackage.en3;
import defpackage.jx2;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer = new UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer();
        INSTANCE = updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.jobs.UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime", updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("hour", false);
        pluginGeneratedSerialDescriptor.l("minute", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, en3Var};
    }

    @Override // defpackage.ym1
    public UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            i = b.j(descriptor2, 0);
            i2 = b.j(descriptor2, 1);
            i3 = 3;
        } else {
            boolean z = true;
            i = 0;
            int i4 = 0;
            int i5 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i = b.j(descriptor2, 0);
                    i5 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    i4 = b.j(descriptor2, 1);
                    i5 |= 2;
                }
            }
            i2 = i4;
            i3 = i5;
        }
        b.c(descriptor2);
        return new UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime(i3, i, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime) {
        zq3.h(encoder, "encoder");
        zq3.h(jobTime, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime.c(jobTime, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
