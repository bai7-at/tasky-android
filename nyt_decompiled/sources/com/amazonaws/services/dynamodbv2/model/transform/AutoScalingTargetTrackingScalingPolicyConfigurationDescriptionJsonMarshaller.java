package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller {
    private static AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller instance;

    AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller() {
    }

    public static AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AutoScalingTargetTrackingScalingPolicyConfigurationDescription autoScalingTargetTrackingScalingPolicyConfigurationDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn() != null) {
            Boolean disableScaleIn = autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn();
            awsJsonWriter.name("DisableScaleIn");
            awsJsonWriter.value(disableScaleIn.booleanValue());
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown() != null) {
            Integer scaleInCooldown = autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown();
            awsJsonWriter.name("ScaleInCooldown");
            awsJsonWriter.value(scaleInCooldown);
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown() != null) {
            Integer scaleOutCooldown = autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown();
            awsJsonWriter.name("ScaleOutCooldown");
            awsJsonWriter.value(scaleOutCooldown);
        }
        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue() != null) {
            Double targetValue = autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue();
            awsJsonWriter.name("TargetValue");
            awsJsonWriter.value(targetValue);
        }
        awsJsonWriter.endObject();
    }
}
