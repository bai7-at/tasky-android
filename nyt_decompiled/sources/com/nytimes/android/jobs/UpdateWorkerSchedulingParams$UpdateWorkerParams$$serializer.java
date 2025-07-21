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
public final class UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer updateWorkerSchedulingParams$UpdateWorkerParams$$serializer = new UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer();
        INSTANCE = updateWorkerSchedulingParams$UpdateWorkerParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.jobs.UpdateWorkerSchedulingParams.UpdateWorkerParams", updateWorkerSchedulingParams$UpdateWorkerParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("morningJobTime", false);
        pluginGeneratedSerialDescriptor.l("eveningJobTime", false);
        pluginGeneratedSerialDescriptor.l("executionWindowMinutes", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateWorkerSchedulingParams$UpdateWorkerParams$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer = UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE;
        return new KSerializer[]{updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, en3.a};
    }

    @Override // defpackage.ym1
    public UpdateWorkerSchedulingParams.UpdateWorkerParams deserialize(Decoder decoder) {
        int i;
        int i2;
        UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime;
        UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer = UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE;
            UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime3 = (UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime) b.y(descriptor2, 0, updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, null);
            jobTime2 = (UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime) b.y(descriptor2, 1, updateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer, null);
            i = b.j(descriptor2, 2);
            i2 = 7;
            jobTime = jobTime3;
        } else {
            boolean z = true;
            int i3 = 0;
            UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime4 = null;
            UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime jobTime5 = null;
            int i4 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    jobTime4 = (UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime) b.y(descriptor2, 0, UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE, jobTime4);
                    i4 |= 1;
                } else if (o == 1) {
                    jobTime5 = (UpdateWorkerSchedulingParams.UpdateWorkerParams.JobTime) b.y(descriptor2, 1, UpdateWorkerSchedulingParams$UpdateWorkerParams$JobTime$$serializer.INSTANCE, jobTime5);
                    i4 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    i3 = b.j(descriptor2, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            jobTime = jobTime4;
            jobTime2 = jobTime5;
        }
        b.c(descriptor2);
        return new UpdateWorkerSchedulingParams.UpdateWorkerParams(i2, jobTime, jobTime2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, UpdateWorkerSchedulingParams.UpdateWorkerParams updateWorkerParams) {
        zq3.h(encoder, "encoder");
        zq3.h(updateWorkerParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        UpdateWorkerSchedulingParams.UpdateWorkerParams.d(updateWorkerParams, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}
