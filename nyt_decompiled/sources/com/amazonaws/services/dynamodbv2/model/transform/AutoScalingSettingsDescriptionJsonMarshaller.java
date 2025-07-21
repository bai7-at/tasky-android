package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.AutoScalingPolicyDescription;
import com.amazonaws.services.dynamodbv2.model.AutoScalingSettingsDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes2.dex */
class AutoScalingSettingsDescriptionJsonMarshaller {
    private static AutoScalingSettingsDescriptionJsonMarshaller instance;

    AutoScalingSettingsDescriptionJsonMarshaller() {
    }

    public static AutoScalingSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AutoScalingSettingsDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AutoScalingSettingsDescription autoScalingSettingsDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (autoScalingSettingsDescription.getMinimumUnits() != null) {
            Long minimumUnits = autoScalingSettingsDescription.getMinimumUnits();
            awsJsonWriter.name("MinimumUnits");
            awsJsonWriter.value(minimumUnits);
        }
        if (autoScalingSettingsDescription.getMaximumUnits() != null) {
            Long maximumUnits = autoScalingSettingsDescription.getMaximumUnits();
            awsJsonWriter.name("MaximumUnits");
            awsJsonWriter.value(maximumUnits);
        }
        if (autoScalingSettingsDescription.getAutoScalingDisabled() != null) {
            Boolean autoScalingDisabled = autoScalingSettingsDescription.getAutoScalingDisabled();
            awsJsonWriter.name("AutoScalingDisabled");
            awsJsonWriter.value(autoScalingDisabled.booleanValue());
        }
        if (autoScalingSettingsDescription.getAutoScalingRoleArn() != null) {
            String autoScalingRoleArn = autoScalingSettingsDescription.getAutoScalingRoleArn();
            awsJsonWriter.name("AutoScalingRoleArn");
            awsJsonWriter.value(autoScalingRoleArn);
        }
        if (autoScalingSettingsDescription.getScalingPolicies() != null) {
            List<AutoScalingPolicyDescription> scalingPolicies = autoScalingSettingsDescription.getScalingPolicies();
            awsJsonWriter.name("ScalingPolicies");
            awsJsonWriter.beginArray();
            for (AutoScalingPolicyDescription autoScalingPolicyDescription : scalingPolicies) {
                if (autoScalingPolicyDescription != null) {
                    AutoScalingPolicyDescriptionJsonMarshaller.getInstance().marshall(autoScalingPolicyDescription, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
