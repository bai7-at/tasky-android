package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/* loaded from: classes.dex */
public enum DynamoDBv2Actions implements Action {
    AllDynamoDBv2Actions("dynamodb:*"),
    BatchGetItem("dynamodb:BatchGetItem"),
    BatchWriteItem("dynamodb:BatchWriteItem"),
    CreateBackup("dynamodb:CreateBackup"),
    CreateGlobalTable("dynamodb:CreateGlobalTable"),
    CreateTable("dynamodb:CreateTable"),
    DeleteBackup("dynamodb:DeleteBackup"),
    DeleteItem("dynamodb:DeleteItem"),
    DeleteTable("dynamodb:DeleteTable"),
    DescribeBackup("dynamodb:DescribeBackup"),
    DescribeContinuousBackups("dynamodb:DescribeContinuousBackups"),
    DescribeEndpoints("dynamodb:DescribeEndpoints"),
    DescribeGlobalTable("dynamodb:DescribeGlobalTable"),
    DescribeGlobalTableSettings("dynamodb:DescribeGlobalTableSettings"),
    DescribeLimits("dynamodb:DescribeLimits"),
    DescribeTable("dynamodb:DescribeTable"),
    DescribeTimeToLive("dynamodb:DescribeTimeToLive"),
    GetItem("dynamodb:GetItem"),
    ListBackups("dynamodb:ListBackups"),
    ListGlobalTables("dynamodb:ListGlobalTables"),
    ListTables("dynamodb:ListTables"),
    ListTagsOfResource("dynamodb:ListTagsOfResource"),
    PutItem("dynamodb:PutItem"),
    Query("dynamodb:Query"),
    RestoreTableFromBackup("dynamodb:RestoreTableFromBackup"),
    RestoreTableToPointInTime("dynamodb:RestoreTableToPointInTime"),
    Scan("dynamodb:Scan"),
    TagResource("dynamodb:TagResource"),
    UntagResource("dynamodb:UntagResource"),
    UpdateContinuousBackups("dynamodb:UpdateContinuousBackups"),
    UpdateGlobalTable("dynamodb:UpdateGlobalTable"),
    UpdateGlobalTableSettings("dynamodb:UpdateGlobalTableSettings"),
    UpdateItem("dynamodb:UpdateItem"),
    UpdateTable("dynamodb:UpdateTable"),
    UpdateTimeToLive("dynamodb:UpdateTimeToLive");

    private final String action;

    DynamoDBv2Actions(String str) {
        this.action = str;
    }

    @Override // com.amazonaws.auth.policy.Action
    public String getActionName() {
        return this.action;
    }
}
