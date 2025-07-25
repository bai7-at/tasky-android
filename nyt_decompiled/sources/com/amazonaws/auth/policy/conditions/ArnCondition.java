package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ArnCondition extends Condition {

    public enum ArnComparisonType {
        ArnEquals,
        ArnLike,
        ArnNotEquals,
        ArnNotLike
    }

    public ArnCondition(ArnComparisonType arnComparisonType, String str, String str2) {
        this.f35type = arnComparisonType.toString();
        this.conditionKey = str;
        this.values = Arrays.asList(str2);
    }
}
