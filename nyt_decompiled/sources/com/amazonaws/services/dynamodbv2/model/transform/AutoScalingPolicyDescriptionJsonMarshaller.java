package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingPolicyDescription;
import com.amazonaws.services.dynamodbv2.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes2.dex */
class AutoScalingPolicyDescriptionJsonMarshaller {
    private static AutoScalingPolicyDescriptionJsonMarshaller instance;

    AutoScalingPolicyDescriptionJsonMarshaller() {
    }

    public static AutoScalingPolicyDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AutoScalingPolicyDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AutoScalingPolicyDescription autoScalingPolicyDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (autoScalingPolicyDescription.getPolicyName() != null) {
            String policyName = autoScalingPolicyDescription.getPolicyName();
            awsJsonWriter.name("PolicyName");
            awsJsonWriter.value(policyName);
        }
        if (autoScalingPolicyDescription.getTargetTrackingScalingPolicyConfiguration() != null) {
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration = autoScalingPolicyDescription.getTargetTrackingScalingPolicyConfiguration();
            awsJsonWriter.name("TargetTrackingScalingPolicyConfiguration");
            AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller.getInstance().marshall(targetTrackingScalingPolicyConfiguration, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
