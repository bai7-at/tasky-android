package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateJsonMarshaller {
    private static AutoScalingTargetTrackingScalingPolicyConfigurationUpdateJsonMarshaller instance;

    AutoScalingTargetTrackingScalingPolicyConfigurationUpdateJsonMarshaller() {
    }

    public static AutoScalingTargetTrackingScalingPolicyConfigurationUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AutoScalingTargetTrackingScalingPolicyConfigurationUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AutoScalingTargetTrackingScalingPolicyConfigurationUpdate autoScalingTargetTrackingScalingPolicyConfigurationUpdate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getDisableScaleIn() != null) {
            Boolean disableScaleIn = autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getDisableScaleIn();
            awsJsonWriter.name("DisableScaleIn");
            awsJsonWriter.value(disableScaleIn.booleanValue());
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleInCooldown() != null) {
            Integer scaleInCooldown = autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleInCooldown();
            awsJsonWriter.name("ScaleInCooldown");
            awsJsonWriter.value(scaleInCooldown);
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleOutCooldown() != null) {
            Integer scaleOutCooldown = autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getScaleOutCooldown();
            awsJsonWriter.name("ScaleOutCooldown");
            awsJsonWriter.value(scaleOutCooldown);
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getTargetValue() != null) {
            Double targetValue = autoScalingTargetTrackingScalingPolicyConfigurationUpdate.getTargetValue();
            awsJsonWriter.name("TargetValue");
            awsJsonWriter.value(targetValue);
        }
        awsJsonWriter.endObject();
    }
}
